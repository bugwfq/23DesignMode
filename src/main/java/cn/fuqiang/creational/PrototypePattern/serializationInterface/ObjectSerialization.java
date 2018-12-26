package cn.fuqiang.creational.PrototypePattern.serializationInterface;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化工具类  
 * @author 王福强
 * @Title: ObjectSerialization.java 
 * @Package cn.fuqiang.creational.BuilderPattern
 * @Description 
 * @date 2018年9月10日 下午5:34:18
 */
public class ObjectSerialization {
	/**
	 * 对象序列化
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月11日 上午9:20:40
	 * @param t
	 * @return
	 */
	public static <T>byte[] serialization(T t){
		
		byte[] objects = null ;
		ByteArrayOutputStream bis = null;
		ObjectOutputStream ois = null;
		try {
			/*
			 * 缓存读入流
			 */
			bis = new ByteArrayOutputStream();
			/*
			 *对象序列化流 
			 */
			ois = new ObjectOutputStream(bis);
			ois.writeObject(t);
			objects = bis.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			close(bis);
			close(ois);
		}
		
		return objects;
	}
	/**
	 * 对象得反序列化
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月11日 上午9:20:56
	 * @param object
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T deserialization(byte[] object) {
		/*
		 * 缓存写出流
		 */
		T t = null;
		 ByteArrayInputStream bis = null;
		 ObjectInputStream ois = null;
		 try {
			 bis = new ByteArrayInputStream(object);
			 ois = new ObjectInputStream(bis);
			 t = (T) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			close(bis);
			close(ois);
		}
		 return t;
	}
	/**
	 * 深度克隆
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月11日 上午9:21:14
	 * @param t
	 * @return
	 */
	public static <T> T clone(T t) {
		byte[] serialization = serialization(t);
		T deserialization = null;
		if(serialization!=null) {
			deserialization = deserialization(serialization);
		}
		return deserialization;
	}
	
	/**
	 * 关闭流得方法
	 * @author 王福强
	 * @Description 
	 * @date 2018年9月11日 上午9:21:31
	 * @param close
	 */
	public static void close (Closeable close) {
		if(close!=null) {
			try {
				close.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
