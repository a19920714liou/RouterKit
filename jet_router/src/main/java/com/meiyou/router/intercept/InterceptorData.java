package com.meiyou.router.intercept;

import android.net.Uri;

import java.util.HashMap;

/**
 * 拦截器
 *
 * @author zhengxiaobin
 * @since 17/7/21
 */

public class InterceptorData {
    /**
     * 执行的URI
     */
    public Uri mUri;
    /**
     * 可以带额外的信息
     */
    public String mExtra;
    /**
     * 额外的参数信息
     */
    public HashMap<String, String> hashMap = new HashMap<>();
}
