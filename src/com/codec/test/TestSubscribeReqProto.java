package com.codec.test;

import com.codec.proto.SubscribeReqProto;

/**
 * Created by sunxuechao on 2017/2/25.
 */
public class TestSubscribeReqProto {
    private static byte[] encode(SubscribeReqProto.SubscribeReq req){
        return req.toByteArray();
    }


}
