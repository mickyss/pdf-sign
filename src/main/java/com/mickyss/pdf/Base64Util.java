package com.mickyss.pdf;

import jodd.util.Base64;

/**
 * <p>
 *    类说明：base64编码、解码工具类
 * </p>
 * 
 */
public class Base64Util {


	/**
	 * 对base64编码的字符串进行解码，返回字节数据
	 * 
	 * @param str
	 * @return
	 */
	static public byte[] decodeToByte(String str) {
		return Base64.decode(str);
	}


}
