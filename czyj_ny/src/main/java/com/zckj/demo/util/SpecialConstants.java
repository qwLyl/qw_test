package com.zckj.demo.util;

import org.apache.http.client.protocol.HttpClientContext;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */

public class SpecialConstants {

    /**
     * 台区出口电压详细统计表
     */
    public  static  final  String OUT_URL="http://10.232.208.68/management/deploy/invoke/tmrDeployManager/findTgOutputVols/ConditionMonitor";

    /**
     * 线路运行历史故障详情表
     */
    public  static  final  String ERROR_URL="http://10.232.208.68/management/deploy/invoke/emsDeployManager/findLineAfterFaultByFilter/ConditionMonitor";

    /**
     * 两率一损系统登陆网址
     */
    public  static  final String TWO_URL="http://10.223.5.230/lms/main/login!login.do?";
    /**
     * 月度线损率地址
     */
    public  static  final String YDXSL_URL="http://10.223.5.230/lms/ReportServer?_=1591849298905&__boxModel__=true&op=page_content&sessionID=17124&pn=1";

    /**
     * 门户登陆网址
     */
    public  static  final String URL="http://ids-d.hn.sgcc.com.cn:8080/nidp/idff/sso?sid=0";
    /**
     * 配电网登陆网址
     */
    public  static  final  String PDW_URL="http://upmsso-a.hn.sgcc.com.cn/isc_sso/login?service=http://10.232.208.68/isc/login.jsp";
    /**
     * 专变用户数据爬取网址
     */
//    public static final String SPECIAL_URL = "http://10.223.60.220/eicmsWeb/document/cpHiQuery";
    public static final String SPECIAL_URL = "http://10.223.60.220/eicmsWeb/rtuCollect/getFileStaticsList";

    /**
     * 公变用户取数地址
     */
     public static final String GBZDS_URL="http://10.223.60.87/kded/tgllAnalyse.do?query";

    /**
     * 智能表数取数地址
     */
    public static final String ZNBS_URL="http://10.223.60.220/eicmsWeb/rtuCollect/getFileStaticsList";

    /**
     * 台区线损波动取数地址
     */
    public static final String TQXSBD_URL="http://10.223.5.230/lms/sametimelineloss/assessmLineLoss!queryLineLoss.do?";

    /**
     * 用户采集系统登录网址
     */
    public static final String COLLECTION_LOGIN_URL="http://10.223.60.220/eicmsWeb/login/userLogin";

    /**
     * 配电网应用平台三相不平衡取数地址
     */
    public static final String SXBPH_URL="http://10.232.208.68/management/deploy/invoke/tmrDeployManager/findThreeImbalanceDetail/ConditionMonitor";

    /**
     * 配电网线路负载详情取数地址
     */
    public static final String  XLFZXQ_URL="http://10.232.208.68/management/deploy/invoke/emsDeployManager/findLoadRateDetail/ConditionMonitor";

    /**
     * 配电网台区负载详情取数地址
     */
    public static final String  TQFZXQ_URL="http://10.232.208.68/management/deploy/invoke/tmrDeployManager/findLoadRateDetail/ConditionMonitor";

    /**
     * 业扩全流程系统登陆首页地址,取key对象
     */
    public static final String  YCQLC_URL="http://10.223.1.127:8098/isc_sso/login?service=http://10.223.3.80/sgykyy/login";

    /**
     * 业扩全流程系统登陆地址
     */
    //public static final String  YCQLC_URL="http://10.223.1.127:8098/isc_sso/login?service=http://10.223.3.80/sgykyy/login";
    public  static  final  String  YCQLC_LOGIN_URL="http://10.223.1.127:8098/isc_sso/login;jsessionid=kOiZKD1cpI_bzUO3OWrhGZn60foFoqDHn5CzO7ldCyHeTfn548-d!8384688?service=http://10.223.3.80/sgykyy/login";

    /**
     * 数据核查系统登陆网址
     */
    public static final String  SJHCXT_LOGIN_URL="http://10.223.1.127:8098/isc_sso/login?service=http://10.223.52.238/sgimsWeb/";

    /**
     * 基础数据正确率地址
     */
    public static final String  SJZQL_URL="http://10.223.52.238/sgims/api/polytechnics/lmsYxJcSjWzx/list";
    /**
     * 表码复合查询数据网址
     */
    public static final String TABLE_CODE_URL="http://10.223.60.220/eicmsWeb/comQuery/findMeterDataComplex";

    /**
     * 费控从未成功用户数据网址
     */
    public static final String CHARGE_CONTROL_USER="http://10.223.5.230/lms/remotechargecontrol/chargemeterstatisticDdetailAction!queryUserDetail.do?";
    /**
     * 采集系统专变用户启动时间
     */
    public static final String SpecialCRON="0 20 05 * * ? *";
    /**
     * 采集系统公变终端数启动时间
     */
    public static final String GBZDCRON="0 22 05 * * ? *";

    /**
     * 轻载台区、重载台区任务启动时间
     */
    public static final String TQFZCRON="0 24 05 * * ? *";

    /**
     * 采集系统取智能表数
     */
    public static final String ZNBSCRON="0 27 05 * * ? *";

    /**
     * 智能监控平台启动时间
     */
    public static final String ZNCRON="0 28 05 * * ? *";

    /**
     * 台区三相不平衡启动时间
     */
    public static final String SXBPHCRON="0 22 05 * * ? *";

    /**
     * 用户侧低压占比时间
     */
    public static final String YHCDYCRON="0 13 04 * * ? *";

    /**
     * 两率一损台区线损波动
     */
    public static final String LYYS_XSBD_CRON="0 42 06 * * ? *";

    /**
     * 营销系统全流程应用率
     */
    public static final String YXXT_QLC_CRON="0 42 05 * * ? *";

    /**
     * 营销系统配电台区取数
     */
    public static final String YXXT_PDTQ_CRON="0 43 05 * * ? *";

    /**
     * 两率一损系统综合系统统计分析 按月统计
     */
    public static final String LYYSZH_MONTH_CRON="0 47 15 * * ? *";

    /**
     * 两率一损系统综合系统统计分析 按日统计
     */
    public static final String LYYSZH_DAY_CRON="0 42 15 * * ? *";

    /**
     * 配电网线路故障详情
     */
    public static final String PDW_XL_CRON="0 55 15 * * ? *";

    /**
     * 台区电压合格率
     */
    public static final String PDW_DY_CRON="0 41 22 * * ? *";

    /**
     *同期线损
     */
    public static final String TQXS_CRON="0 42 15 * * ? *";

    public static final String CRON="0 42 15 * * ? *";

    public static final String CRON1="*/50 * * * * ?";

    public static final String CRON2="0 46 10 * * ?";

    public static final String[] ORGNOS=new String[]{"4340803","4340804","4340805","4340806","4340807","4340808","4340840",
                                                    "4340841","4340842","4340843","4340844","4340845","4340852","4340884"};

    public static HttpClientContext httpClientContext=new HttpClientContext();

    public static String getJESSIONID() {
        return JESSIONID;
    }

    public static void setJESSIONID(String JESSIONID) {
        SpecialConstants.JESSIONID = JESSIONID;
    }

    public static String JESSIONID="3gVa_Eha68eMr98ob6SUv2jgPl4vWVpsPqUd1UQc8NCiM2B2Zuf_!-1367820837";

    /**
     * 终端类型
     */
    public static final Map<String,String> TMNLTYPE=new HashMap<>();

    /**
     * 用户大类号常量集合
     */
    public static final Map<String,String> USERFLAGNAMEMAP=new HashMap<>();

    /**
     * 接线方式常量集合
     */
    public static final Map<String,String>  WIRINGMODEMAP=new HashMap<>();

    /**
     * 计量方式常量集合
     */
    public static final Map<String,String> METERUSERCODEMAP=new HashMap<>();

    /**
     * 标定电流常量集合
     */
    public static final Map<String,String> RATEDCURRENTMAP=new HashMap<>();
    static {
        /**
         * 终端类型常量集合
         */
        TMNLTYPE.put("01","负荷管理终端");
        TMNLTYPE.put("02","负荷监测终端");
        TMNLTYPE.put("03","配变终端");
        TMNLTYPE.put("04","配变监控终端");
        TMNLTYPE.put("05","低压集中器");
        TMNLTYPE.put("06","低压采集终端");
        TMNLTYPE.put("07","采集模块");
        TMNLTYPE.put("08","关口电能量采集终端");
        TMNLTYPE.put("09","光网络单元（ONU）");
        TMNLTYPE.put("11","一体化终端");
        TMNLTYPE.put("12","配变监测终端（TTU）");
        TMNLTYPE.put("14","营销融合终端");
        TMNLTYPE.put("601","二次回路状态巡检仪");
        /**
         * 用户大类号常量集合
         */
        USERFLAGNAMEMAP.put("01","大型专变用户（A类）");
        USERFLAGNAMEMAP.put("02","中小型专变用户（B类）");
        USERFLAGNAMEMAP.put("03","三相一般工商业用户（C类）");
        USERFLAGNAMEMAP.put("04","单相一般工商业用户（D类）");
        USERFLAGNAMEMAP.put("05","居民用户（E类）");
        USERFLAGNAMEMAP.put("06","公用配变考核计量点（F类）");
        USERFLAGNAMEMAP.put("10","水表类");
        USERFLAGNAMEMAP.put("12","热表类");
        USERFLAGNAMEMAP.put("13","感知器");
        /**
         * 接线方式常量集合
         */
        WIRINGMODEMAP.put("1","单相表");
        WIRINGMODEMAP.put("2","三相三线");
        WIRINGMODEMAP.put("3","三相四线");
        /**
         * 计量方式常量集合
         */
        METERUSERCODEMAP.put("01","高供高计");
        METERUSERCODEMAP.put("02","高供低计");
        METERUSERCODEMAP.put("03","低供低计");
        /**
         * 标定常量集合
         */
        RATEDCURRENTMAP.put("001","1.5(6)A");
        RATEDCURRENTMAP.put("002","2.5(10)A");
        RATEDCURRENTMAP.put("003","2.5(20)A");
        RATEDCURRENTMAP.put("004","3(6)A");
        RATEDCURRENTMAP.put("005","3(10)A");
        RATEDCURRENTMAP.put("006","3(15)A");
        RATEDCURRENTMAP.put("007","5(10)A");
        RATEDCURRENTMAP.put("008","5(20)A");
        RATEDCURRENTMAP.put("009","5(30)A");
        RATEDCURRENTMAP.put("010","5(40)A");
        RATEDCURRENTMAP.put("011","5(60)A");
        RATEDCURRENTMAP.put("012","10(20)A");
        RATEDCURRENTMAP.put("013","10(40)A");
        RATEDCURRENTMAP.put("031","10(50)A");
        RATEDCURRENTMAP.put("014","10(60)A");
        RATEDCURRENTMAP.put("032","15(60)A");
        RATEDCURRENTMAP.put("015","20(60)A");
        RATEDCURRENTMAP.put("033","20(80)A");
        RATEDCURRENTMAP.put("016","3×0.3(1.2)A");
        RATEDCURRENTMAP.put("017","3×1(2)A");
        RATEDCURRENTMAP.put("018","3×1(6)A");
        RATEDCURRENTMAP.put("019","3×1(10)A");
        RATEDCURRENTMAP.put("020","3×1.5(6)A");
        RATEDCURRENTMAP.put("021","3×1.5(12)A");
        RATEDCURRENTMAP.put("022","3×3(6)A");
        RATEDCURRENTMAP.put("023","3×5A");
        RATEDCURRENTMAP.put("024","3×5(6)A");
        RATEDCURRENTMAP.put("025","3×2.5(10)A");
        RATEDCURRENTMAP.put("026","3×5(20)A");
        RATEDCURRENTMAP.put("027","3×10(40)A");
        RATEDCURRENTMAP.put("028","3×15(60)A");
        RATEDCURRENTMAP.put("029","3×20(80)A");
        RATEDCURRENTMAP.put("034","3×20(100)A");
        RATEDCURRENTMAP.put("030","3×30(100)A");
        RATEDCURRENTMAP.put("035","3×/1A");
        RATEDCURRENTMAP.put("036","3×1(4)A");
        RATEDCURRENTMAP.put("037","10(100)A");
        RATEDCURRENTMAP.put("038","20(120)A");
        RATEDCURRENTMAP.put("039","3X5(40)A");
        RATEDCURRENTMAP.put("040","3×10(60)A");
        RATEDCURRENTMAP.put("041","3×5(60)A");
        RATEDCURRENTMAP.put("042","10(100)A");
        RATEDCURRENTMAP.put("043","3×10(100)A");
    }

}
