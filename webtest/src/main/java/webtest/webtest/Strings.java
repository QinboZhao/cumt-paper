package webtest.webtest;

public class Strings {
	/**
	    * 
	    * TEST WITH BASIC
	    * 
	    */
   public static final String CASE_1="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,,18311111111,成人,true,完成注册";
   public static final String CASE_2="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,完成注册";
   public static final String CASE_3="ks,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,用户名长度不能少于6个字符！";
   public static final String CASE_4="123456;aaa123;aaa123;fla;二代身份证;440901197502108337;1-1@cn.com;18311111111;成人;true;用户名只能由字母、数字和_组成,须以字母开头！";
   public static final String CASE_5="ks#23343;aaa123;aaa123;fla;二代身份证;440901197502108337;1-1@cn.com;18311111111;成人;true;用户名只能由字母、数字和_组成,须以字母开头！";
   public static final String CASE_6="mysouldream;aaa123;aaa123;fla;二代身份证;440901197502108337;1-1@cn.com;18311111111;成人;true;该用户名已经占用，请重新选择用户名！";
   public static final String CASE_7=";aaa123;aaa123;fla;二代身份证;440901197502108337;1-1@cn.com;18311111111;成人;true;请输入用户名！";

   public static final String CASE_8="ks_22222,s1234,s1234,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,密码长度不能少于6个字符！";
   public static final String CASE_9="ks_22222,s12345678901234567890,s12345678901234567890,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,密码长度大于20个字符";
   public static final String CASE_10="ks_22222,aaa@123,aaa@123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,格式错误，必须且只能包含字母，数字，下划线中的两种或两种以上！";
   public static final String CASE_11="ks_22222,aaaaaa,aaaaaa,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,格式错误，必须且只能包含字母，数字，下划线中的两种或两种以上！";
   public static final String CASE_12="ks_22222,111111,111111,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,格式错误，必须且只能包含字母，数字，下划线中的两种或两种以上！";
   public static final String CASE_13="ks_22222,______,______,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,格式错误，必须且只能包含字母，数字，下划线中的两种或两种以上！";
   public static final String CASE_14="ks_22222,,______,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,请输入密码！";
   
   public static final String CASE_15="ks_22222,aaa123,aaa1234,fla,二代身份证,440901197502108337,,18311111111,成人,true,确认密码与密码不同！";
   public static final String CASE_16="ks_22222,aaa123,,fla,二代身份证,440901197502108337,,18311111111,成人,true,请输入确认密码！";
   
   public static final String CASE_17="ks_22222,aaa123,aaa123,jf,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,允许输入的字符串在3-30个字符之间";
   public static final String CASE_18="ks_22222,aaa123,aaa123,j.flaj.flaj.flaj啊啊啊啊啊啊啊啊啊啊啊,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,允许输入的字符串在3-30个字符之间";
   public static final String CASE_19="ks_22222;aaa123;aaa123;j#fla;二代身份证;440901197502108337;1-1@cn.com;18311111111;成人;true;姓名只能包含中文或者英文，如有生僻字或繁体字参见姓名填写规则进行填写！";
   public static final String CASE_20="ks_22222,aaa123,aaa123,,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,请输入您的姓名！";
   
   public static final String CASE_21="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,52@.com,18311111111,成人,true,请输入有效的电子邮件地址！";
   public static final String CASE_22="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,583053544@qq.com,18311111111,成人,true,该邮箱已被注册，请更换邮箱。";

   public static final String CASE_23="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18361221565,成人,true,您输入的手机号码已被其他注册用户";
   public static final String CASE_24="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,1836122156,成人,true,您输入的手机号码不是有效的格式！";
   public static final String CASE_25="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,183612215655,成人,true,您输入的手机号码不是有效的格式！";
   public static final String CASE_26="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,039-61221565,成人,true,您输入的手机号码不是有效的格式！";
   public static final String CASE_27="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,,成人,true,请输入手机号码！";
   
   public static final String CASE_28="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,,完成注册";
  
   /**
    * 
    * TEST WITH STUDENTS
    * 
    */
   
   public static final String CASE_29="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院,计科3班,08143427,4,2014,,徐州,兰州,true,完成注册";
   public static final String CASE_30="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,,计算机学院,计科3班,08143427,4,2014,,徐州,兰州,true,请选择学校名称！";
   public static final String CASE_31="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院#,计科3班,08143427,4,2014,,徐州,兰州,true,院系只能包含中文、英文、数字！";
   public static final String CASE_32="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院,计科%班,08143427,4,2014,,徐州,兰州,true,班级只能包含中文、英文、数字！";
   public static final String CASE_33="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院,计科3班,,4,2014,,徐州,兰州,true,请输入学号";
   public static final String CASE_34="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院,计科3班,081434&,4,2014,,徐州,兰州,true,学号只能包含中文、英文、数字！";
   public static final String CASE_35="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,学生,江苏,中国矿业大学,计算机学院,计科3班,08143427,4,2014,1#,徐州,兰州,true,优惠卡号只能包含中文、英文、数字！";
   
   /**
    * 
    * TEST WITH CARD
    * 
    */
   public static final String CASE_36="ks_22222,aaa123,aaa123,fla,二代身份证,410112111326561255,1-1@cn.com,18311111111,成人,true,请正确输入18位的身份证号！";
   public static final String CASE_37="ks_22222,aaa123,aaa123,fla,二代身份证,440901197502108337,1-1@cn.com,18311111111,成人,true,包含 该证件号码已被注册";
   public static final String CASE_38="ks_22222,aaa123,aaa123,fla,二代身份证,,1-1@cn.com,18311111111,成人,true,请输入证件号码！";
   public static final String CASE_39="ks_22222,aaa123,aaa123,fla,港澳通行证 ,H123456789,1-1@cn.com,18311111111,成人,true,请输入有效的港澳居民通行证号码！";
   public static final String CASE_40="ks_22222,aaa123,aaa123,fla,港澳通行证 ,12345678,1-1@cn.com,18311111111,成人,true,请输入有效的港澳居民通行证号码！";
   public static final String CASE_41="ks_22222,aaa123,aaa123,fla,港澳通行证 ,1234567x,1-1@cn.com,18311111111,成人,true,请输入有效的港澳居民通行证号码！";
   public static final String CASE_42="ks_22222,aaa123,aaa123,fla,港澳通行证 ,,1-1@cn.com,18311111111,成人,true,请输入证件号码！";
   public static final String CASE_43="ks_22222,aaa123,aaa123,fla,台湾通行证 ,123456789,1-1@cn.com,18311111111,成人,true,请输入有效的台湾居民通行证号码！";
   public static final String CASE_44="ks_22222,aaa123,aaa123,fla,台湾通行证 ,3433456#,1-1@cn.com,18311111111,成人,true,输入的证件编号中包含中文信息或特殊字符！";
   public static final String CASE_45="ks_22222,aaa123,aaa123,fla,台湾通行证 ,,1-1@cn.com,18311111111,成人,true,请输入证件号码！";
   public static final String CASE_46="ks_22222,aaa123,aaa123,fla,护照 ,1234,1-1@cn.com,18311111111,成人,true,请输入有效的护照号码！";
   public static final String CASE_47="ks_22222,aaa123,aaa123,fla,护照 ,12345678901234567890,1-1@cn.com,18311111111,成人,true,请输入有效的护照号码！";
   public static final String CASE_48="ks_22222,aaa123,aaa123,fla,护照 ,12345#,1-1@cn.com,18311111111,成人,true,输入的证件编号中包含中文信息或特殊字符！";
   public static final String CASE_49="ks_22222,aaa123,aaa123,fla,护照,,1-1@cn.com,18311111111,成人,true,请输入证件号码！";
   public static final String CASE_50="ks_22222,aaa123,aaa123,fla,港澳通行证,h12345678,1-1@cn.com,18311111111,成人,true,请选择性别";
   public static final String CASE_51="ks_22222,aaa123,aaa123,fla,台湾通行证,12345678,1-1@cn.com,18311111111,成人,true,请选择性别";
   public static final String CASE_52="ks_22222,aaa123,aaa123,fla,护照,1234567,1-1@cn.com,18311111111,成人,true,请选择性别";
   
   
}
