package com.zz.model_two.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author sunhao
 * @date 2021/3/2 19:42
 */

@ApiModel(
        value = "ApiResult",
        description = "统一返回对象"
)
public class ApiResult<T> {
    public static final int SUCCESS = 200;
    @ApiModelProperty(
            value = "表示Response信息成功",
            dataType = "int"
    )
    private int status;
    @ApiModelProperty(
            value = "返回码",
            dataType = "string"
    )
    private String errorMsg;
    @ApiModelProperty("返回数值")
    private T data;

    public ApiResult() {
    }

    private ApiResult(int status, T data, String errorMsg) {
        this.status = status;
        this.data = data;
        this.errorMsg = errorMsg;
    }

    public static <T> ApiResult<T> ok() {
        return new ApiResult(200, (Object)null, (String)null);
    }

    public static <T> ApiResult<T> ok(T data) {
        return new ApiResult(200, data, (String)null);
    }

    public static <T> ApiResult<T> error(int status, String errorMsg) {
        return new ApiResult(status, (Object)null, errorMsg);
    }

    public static <T> ApiResult<T> error(int status, String errorMsg, T data) {
        return new ApiResult(status, data, errorMsg);
    }


    public <U> ApiResult<U> map(Function<? super T, ? extends U> mapper) {
        Objects.requireNonNull(mapper);
        return this.isFailure() ? error(this.status, this.errorMsg) : ok(mapper.apply(this.data));
    }

    public void ifSuccess(Consumer<ApiResult<T>> consumer) {
        Objects.requireNonNull(consumer);
        if (this.isSuccess()) {
            consumer.accept(this);
        }

    }

    public void ifPresent(Consumer<ApiResult<T>> consumer) {
        Objects.requireNonNull(consumer);
        if (this.isPresent()) {
            consumer.accept(this);
        }

    }

    public boolean isSuccess() {
        return 200 == this.status;
    }

    public boolean isFailure() {
        return !this.isSuccess();
    }

    public boolean isPresent() {
        return this.isSuccess() && this.data != null && this.isNotEmpty();
    }

    private boolean isNotEmpty() {
        if (this.data instanceof Collection) {
            return ((Collection)this.data).size() > 0;
        } else {
            return true;
        }
    }

    public int getStatus() {
        return this.status;
    }

    public ApiResult<T> setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ApiResult<T> setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public ApiResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public String toString() {
        return "ApiResult{status=" + this.status + ", errorMsg='" + this.errorMsg + '\'' + ", data=" + this.data + '}';
    }
}
