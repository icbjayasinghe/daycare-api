package com.skyhigh.daycareapi.controller.impl;

import com.skyhigh.daycareapi.controller.DayCareController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${openapi.swaggerDaycare.base-path:/api}")
public class DayCareControllerImpl implements DayCareController {
}
