package packclass.Enum;


public enum DataResult {
    SUCCESS(1000,"成功"), ERR(404,"路径错误"), ERR2(500,"出现错误");    //必须和下面构造的函数括号里面的参数对应
    final Integer code ;
    final String  msg ;

    DataResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
