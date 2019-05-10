package cn.kgc.amp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.kgc.amp.beans.entity.Dev;
/**
 * <b>APP开发人员工具类</b>
 * @author Administrator
 * @version 1.0
 * @since 2019/05/10
 */
public class DevUtil {
	/**
	 * <b>用户注册信息验证是否为空</b>
	 * @param dev
	 * @return boolean
	 */
	public static boolean registryDev(Dev dev) {
		boolean flag = dev.getCellphone() != null && !"".equals(dev.getCellphone().trim()) &&
				dev.getPassword() != null && !"".equals(dev.getPassword().trim()) &&
				dev.getDevName() != null && !"".equals(dev.getDevName().trim()) &&
				dev.getEmail() != null && !"".equals(dev.getEmail().trim());
		return flag;
	}
	/**
	 * <b>获取开发者编码</b>
	 * @return String devNo
	 */
	public static String getDevNo() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");
		String devNo = "DEV" + sdf.format(date);
		return devNo;
	}
	
	public static void main(String[] args) {
		System.out.println(getDevNo());
	}
}
