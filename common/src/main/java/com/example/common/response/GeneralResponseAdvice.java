package com.example.common.response;

import com.example.common.domain.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Date;

@RestControllerAdvice
public class GeneralResponseAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public GeneralResponse beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        GeneralResponse response = new GeneralResponse();
        if (o instanceof ResponseEntity) {
            ResponseEntity<?> res = (ResponseEntity) o;
            response.setCode(res.getStatusCode().value());

        } else {
            response.setCode(200);
            response.setData(o);
            response.setTimestamp(new Date());
        }

        return response;
    }
}
