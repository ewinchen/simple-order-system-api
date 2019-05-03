package com.ewin.sos.util;

import java.util.HashMap;
import java.util.Map;

public class JsonWrapper {

  public static Map<String, Object> wrap(Object data) {
    Map<String, Object> res = new HashMap<>();
    res.put("success", true);
    res.put("data", data);
    return res;

  }


}

