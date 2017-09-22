package QQ2016;

public interface Cmd {
	//在线
	public static final int CMD_ONLINE=1000;
	//离线
	public static final int CMD_OFFLINE=1001;
	//离开
	public static final int CMD_LEVEL=1002;
	//忙碌
	public static final int CMD_BUYS=1003;
	//发送信息
	public static final int CMD_SEND=1004;
	//发送文件
	public static final int CMD_FILE=1005;
	//抖动
	public static final int CMD_SHAKE=1006;
	//加好友
	public static final int CMD_ADDFRI=1007;
	//同意添加好友
	public static final int CMD_AGREE=1008;
	//拒绝添加好友
	public static final int CMD_REFUSE=1009;
	public static final int CMD_CHANGESTATUS=1010;
	public static final int CMD_DELETEFRI=1011;
	public static final int CMD_ALLLSEND=1013;
	//在线状态
	public static final String[]STATUS={"在线","离线","忙碌","隐身"};
	//分组名
	public static final String[] GROUPNAME={"同学","好友","家人","黑名单"};
}
