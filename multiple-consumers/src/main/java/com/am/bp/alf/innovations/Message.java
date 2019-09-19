package com.am.bp.alf.innovations;

import java.io.Serializable;
import java.util.Map;

//@Getter
//@Setter
//@Builder
//@ToString
public class Message<P> implements Serializable {

    private static final long serialVersionUID = 4545422833269408050L;
    private Map<String, String> header;
    private P body;

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public P getBody() {
        return body;
    }

    public void setBody(P body) {
        this.body = body;
    }

}
