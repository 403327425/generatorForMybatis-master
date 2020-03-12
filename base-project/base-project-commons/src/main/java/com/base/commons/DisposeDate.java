package com.base.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName:  DisposeDate   
 * @Description:TODO 处理时间
 * @author: 李云飞
 * @date:   2019年12月11日 上午11:22:44   
 *   
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DisposeDate {
	
	/**
     * 判断时间是否在时间段内
     * @param startingTime
     * @param beginTime
     * @param endTime
     * @return
     */
    public static boolean belongCalendar(Date startingTime, Date beginTime, Date endTime) {
    	//设置起始时间
        Calendar date = Calendar.getInstance();
        date.setTime(startingTime);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        //设置结束时间
        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //处于开始时间之后，和结束时间之前的判断
        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * 判断时间是否包含在在该月份
     * @param startingTime
     * @param beginTime
     * @return
     */
    public static boolean belongMonth(Date startingTime,Date beginTime) {
    	//设置起始时间
        Calendar date = Calendar.getInstance();
        date.setTime(startingTime);
        int year1 = date.get(Calendar.YEAR);
        int month1 = date.get(Calendar.MONTH) + 1;
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        int year2 = begin.get(Calendar.YEAR);
        int month2 = begin.get(Calendar.MONTH) + 1;
        if (year1 == year2 && month1 == month2) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * 计算离起始时间还有多少天
     * @param startingTime
     * @param beginTime
     * @return
     */
    public static Integer numberDifference(Date startingTime,Date beginTime) {
    	//设置起始时间
        Calendar date = Calendar.getInstance();
        date.setTime(startingTime);
        int day1 = date.get(Calendar.DAY_OF_MONTH);
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        int day2 = begin.get(Calendar.DAY_OF_MONTH);
        return day1 - day2;
    }
    
    /**
     * 当天是否是本月第一天
     * @param beginTime
     * @return
     */
    public static boolean whetherFirstDay(Date beginTime) {
        //设置开始时间
        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);
        int day = begin.get(Calendar.DAY_OF_MONTH);
        if (day == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * 比较两个时间是否相等
     * @param startingTime
     * @param beginTime
     * @return
     */
    public static boolean compareSize(Date startingTime,Date beginTime) {
    	if (startingTime.getTime() == beginTime.getTime()) {
    		return true;
        } else {
            return false;
        }
    }
    
    /**
     * 判断时间是否是星期一
     * @param beginTime
     * @return
     */
    public static boolean belongOnMonday(Date beginTime) {
    	Calendar cal=Calendar.getInstance();
    	cal.setTime(beginTime); 
    	int week = cal.get(Calendar.DAY_OF_WEEK)-1;
    	//星期一时week=1,week=0是星期天
    	if (week == 1) {
    		return true;
        } else {
            return false;
        }
    }
    
    /**
     * 判断开始时间和结束时间是否和时段一致
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getDayDiffer(Date startDate, Date endDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		long startDateTime;
		int i = 0;
		try {
			startDateTime = dateFormat.parse(dateFormat.format(startDate)).getTime();
			long endDateTime = dateFormat.parse(dateFormat.format(endDate)).getTime();
			i = (int) ((endDateTime - startDateTime) / (1000 * 3600 * 24));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

}
