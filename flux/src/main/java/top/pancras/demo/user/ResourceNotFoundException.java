package top.pancras.demo.user;

/**
 * Created by pancras on 2018/5/8 0008.
 */
public class ResourceNotFoundException extends RuntimeException{
    private int code;
    private String msg;

    public ResourceNotFoundException(int code, String msg) {
        super(msg);
        this.code = code;
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
}
