package com.nivo1.email.poller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/email-polling-request")
public class EmailPollerController {


    @RequestMapping(method = RequestMethod.POST)
    public void makeRequest(@RequestBody EmailPollingRequest request) {

    }


}
