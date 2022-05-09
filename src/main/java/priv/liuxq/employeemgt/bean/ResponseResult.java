package priv.liuxq.employeemgt.bean;

/**
 * @Desc: 响应结果
 * @Author: Administrator
 * @Date: 2022/5/8-23:36
 */
public class ResponseResult {
    private int code;
    private String msg;
    private Object result;

    public ResponseResult() {
        super();
    }

    public ResponseResult(int code, String msg, Object result) {
        super();
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
