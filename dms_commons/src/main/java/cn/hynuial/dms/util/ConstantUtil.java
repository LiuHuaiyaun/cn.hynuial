package cn.hynuial.dms.util;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 * @author Administrator
 * @since 2019-04-30
 */
public class ConstantUtil {
	private static Properties props = new Properties();
	
	static {
		try {
			// 加收配置文件，进行解析
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("dms.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 默认当前页码
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	
	/**
	 * 默认每页显示数量
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}
