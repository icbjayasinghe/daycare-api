package com.skyhigh.daycareapi.controller.impl;


import com.skyhigh.daycareapi.controller.EnrollmentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-23T18:39:30.912736-03:00[America/Halifax]")
@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/skyhigh-00b/DaycareAPI/1.0.0}")
public class EnrollmentApiController implements EnrollmentApi {

    private final NativeWebRequest request;

    @Autowired
    public EnrollmentApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
