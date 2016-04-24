package com.dream.like.uk.domain.response;

import java.util.List;
import java.util.Map;

/**
 * Created by Stacy on 4/24/16.
 */
public class AjaxResponseBody<T> {

    String msg;
    String code;
    List<T> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AjaxResponseResult [msg=" + msg + ", code=" + code + ", result=" + result + "]";
    }

}