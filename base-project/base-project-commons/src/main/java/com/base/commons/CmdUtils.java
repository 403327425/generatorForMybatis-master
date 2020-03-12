package com.base.commons;
//
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//
//import com.gzwl.jjm.entity.MessageChannel;
//import com.gzwl.jjm.entity.Person;
//
//public class CmdUtils {
//
//    public static final String CMDPREFIX = "DATA UPDATE ";
//
//    public static final String USER = "user ";
//
//    public static final String USERPIC = "userpic ";
//
//    public static final String BIOPHOTO = "biophoto ";
//
//    public static final String AUTHRORIZE = "userauthorize ";
//
//    public static int index = 1;
//
//    public static final String USERCMD = "CardNo=%s\tPin=%s\tPassword=\tGroup=0\tStartTime=%s\tEndTime=%s\tName=%s\tSuperAuthorize=0\tDisable=0";
//
//    public static final String USERPICCMD = "pin=%s\tsize=%s\tcontent=%s";
//
//    public static final String BIOPHOTOCMD = "PIN=%s\tType=%s\tSize=%s\tContent=%s\tFormat=%s\tUrl=%s";
//
//    public static final String AUTHRORIZECMD = "Pin=%s\tAuthorizeTimezoneId=1\tAuthorizeDoorId=1";
//
//    private static List<String> createPersonCmd(Person person){
//
//        List<String> cmds = new ArrayList<>();
//
//        StringBuffer sb = new StringBuffer();
//        sb.append("C:").append(index++).append(":").append(CMDPREFIX).append(USER).append(String.format(USERCMD,person.getCardNo(),person.getPin(),encodeTime(person.getStartDate()),encodeTime(person.getEndDate()),person.getName()));
//        // "C:2(命令ID):DATA UPDATE user(表名) CardNo=%s\tPin=%s\tPassword=\tGroup=0\tStartTime=%s\tEndTime=%s\tName=%s\tSuperAuthorize=0\tDisable=0(字段名中文需要使用GB2312)"
//        cmds.add(sb.toString());
//
//        //下发门禁权限组
//        StringBuffer authorizeSb = new StringBuffer();
//        authorizeSb.append("C:").append(index++).append(":").append(CMDPREFIX).append(AUTHRORIZE).append(String.format(AUTHRORIZECMD,person.getPin()));
//        // "C:3(命令ID):DATA UPDATE userauthorize(表名) Pin=%s(用户工号)\tAuthorizeTimezoneId=1(时间组ID)\tAuthorizeDoorId=1(门禁ID)"
//        cmds.add(authorizeSb.toString());
//        if(StringUtils.isNotBlank(person.getPhotoPath())){
//            //用户照片不为空的时候，下发用户头像和比对照片。
//            //拼接用户头像的命令
//            StringBuffer userpic = new StringBuffer();
//            String photoPath = person.getSavePhotoPath();
//            String content = CommonUtils.base64(photoPath);//
//            userpic.append("C:").append(index++).append(":").append(CMDPREFIX).append(USERPIC).append(String.format(USERPICCMD,person.getPin(),content.length()+"",content));
//            // "C:4(命令ID):DATA UPDATE userpic(表名) pin=%s\tsize=%s\tcontent=%s"
//            System.out.println(userpic);
//            cmds.add(userpic.toString());
//
//
//            //拼接比对照片的命令
//            StringBuffer biophoto = new StringBuffer();
//            String fileName  = new File(person.getPhotoPath()).getName();
////            String contextPath = WebUtils.getContextPath();
//            String url = "/test/"+fileName;
//            biophoto.append("D:").append(index++).append(":").append(CMDPREFIX).append(BIOPHOTO).append(String.format(BIOPHOTOCMD,person.getPin(),9+"","","",1+"",url));
//            // "C:5(命令ID):DATA UPDATE biophoto(表名) PIN=%s\tType=%s\tSize=%s\tContent=%s\tFormat=%s\tUrl=%s"	
//            System.out.println(biophoto);
//            cmds.add(biophoto.toString());
//        }
//
//        return cmds;
//    }
//
//    public static void addPersonToDev(Person person){
//        List<String> cmds = createPersonCmd(person);
//        for(String cmd : cmds){
//			/*
//			 * // List<String> sns = DeviceDB.getSNs(); for(String sn: sns){
//			 * System.out.println(sn+"---"+cmd); MessageChannel.add(sn,cmd); }
//			 */
//        }
//    }
//
//
//    @SuppressWarnings("deprecation")
//    public static int encodeTime(Date date)
//    {
//        date = date == null ? new Date() : date;
//        int time = ((date.getYear() - 100) * 12 * 31 + date.getMonth() * 31
//                + (date.getDate() - 1)) * (24 * 60 * 60) + date.getHours() * 60
//                * 60 + date.getMinutes() * 60 + date.getSeconds();
//        return time;
//    }
//
//}
