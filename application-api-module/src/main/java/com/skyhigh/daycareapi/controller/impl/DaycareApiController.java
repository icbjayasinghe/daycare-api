package com.skyhigh.daycareapi.controller.impl;

import com.skyhigh.daycareapi.controller.DaycareApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Controller
@RequestMapping({"${openapi.swaggerDaycare.base-path:/api}"})
public class DaycareApiController implements DaycareApi {
    private final NativeWebRequest request;

    @Autowired
    public DaycareApiController(NativeWebRequest request) {
        this.request = request;
    }

    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(this.request);
    }
}
