package com.base.commons;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 
 * <p>
 * Title: ConfigConsts
 * </p>
 * 
 * <p>
 * Description:系统资源路径
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年4月26日
 */
public final class ConfigConsts {
	/** 网络访问网站服务路径 外网域名+项目名 */
	public static final String API_URL = "http://ytct_wx_ge_test.com/ytct-project-web";
	/** 网站图片保存路径 本地物理磁盘绝对路径*/
	public static File PICTURE_IMAGE_DIR;
	public static String LOG_PATH;
	/** 图片资源的网络访问路径 外网域名+项目名+映射资源名*/
	public static final String PICTURE_IMAGE_URL = "http://ytct_wx_ge_test.com/picture_image/";
	static {
		File imagefile = new File("/www/wwwroot/ytct.wx.ge-test.com");
		if (!imagefile.exists()) {
			imagefile.mkdirs();
		}
		String rootUrl = imagefile.getAbsolutePath();
		PICTURE_IMAGE_DIR = new File(rootUrl, "picture_image");
		if (!PICTURE_IMAGE_DIR.exists()) {
			PICTURE_IMAGE_DIR.mkdirs();
        }
		File logfile = new File("/www/wwwroot/ytct.wx.ge-test.com", "ytctLog");
		if (!logfile.exists()) {
			logfile.mkdirs();
		}
		LOG_PATH = logfile.getAbsolutePath();
	}
	
	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 *
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(final String sWord) {
		new Thread() {

			@Override
			public void run() {
				FileOutputStream out = null;
				try {
					out = new FileOutputStream(LOG_PATH + "/wx_pay_log_" + System.currentTimeMillis() + ".txt");
					out.write(sWord.getBytes("UTF-8"));
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (out != null) {
						try {
							out.flush();
							out.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}

		}.start();

	}
}
