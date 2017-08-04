package com.devopsbuddy.exceptions;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Claude on 8/4/17.
 */

public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e) {
        super(e);
    }
}
