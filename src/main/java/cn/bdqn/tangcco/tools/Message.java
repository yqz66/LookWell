package cn.bdqn.tangcco.tools;

/**
 * Created by 马保生 on 2017/7/3.
 */
public class Message {
    private String msg;

    public static String success() {
        return "操作成功！";
    }
    public static String failed() {
        return "操作成功！";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Message(String msg) {
        this.msg = msg;
    }

    public Message() {
    }
}
