package com.am.bp.alf.innovations;

import java.io.Serializable;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Message<P> implements Serializable {

    private static final long serialVersionUID = 4545422833269408050L;
    private Map<String, String> header;
    private P body;

}
