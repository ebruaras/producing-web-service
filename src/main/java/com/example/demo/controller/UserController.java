package com.example.demo.controller;

import com.example.demo.service.UserService;
import io.spring.guides.gs_producing_web_service.GetUserRequest;
import io.spring.guides.gs_producing_web_service.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserController {
    @Autowired
    private UserService userService;
    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service",localPart = "GetUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse getUserResponse=new GetUserResponse();
        getUserResponse.setUser(userService.getUser(request.getName()));
        return getUserResponse;
    }
}
