package cn.insectmk.macrozhengmall.common.api;

/**
 * @Description API返回码接口
 * @Author makun
 * @Date 2023/6/30 17:34
 * @Version 1.0
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
