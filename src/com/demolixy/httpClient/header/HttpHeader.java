/**
 * 
 */
package com.demolixy.httpClient.header;

import java.util.Date;

/**
 * @author lixy
 *  通用首部
 *
 */
public class HttpHeader {

    /** 允许客户端和服务器执行与请求/响应连接有关的选项 */
    protected Object connection;
    
    /** 提供日期和时间标志，说明保温是什么时候创建的 */
    protected Date date;
    
    /** 给出发送端使用的MIME的版本 */
    protected String mimeVersion;
    
    /** 显示报文经过的中间节点（代理 网关） */
    protected Object via;
    
    /** 用于随报文传输缓存的指示 */
    protected boolean cacheControl;
    
}
