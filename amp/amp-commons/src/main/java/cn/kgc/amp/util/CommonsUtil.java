package cn.kgc.amp.util;

import java.util.Properties;

public class CommonsUtil {
	private static Properties prop = new Properties();
	
	static {
		try {
			prop.load(CommonsUtil.class.getClassLoader().getResourceAsStream("systemConfiguration.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <b>分页页面当前页面数</b>
	 */
	public static Integer PAGE_NUM = Integer.parseInt(prop.getProperty("page.num"));
	
	/**
	 * <b>分页页面当前页面显示数</b>
	 */
	public static Integer PAGE_SIZE = Integer.parseInt(prop.getProperty("page.size"));
}
