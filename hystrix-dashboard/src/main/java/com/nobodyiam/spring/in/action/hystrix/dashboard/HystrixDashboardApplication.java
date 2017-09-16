package com.nobodyiam.spring.in.action.hystrix.dashboard;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Jason on 5/10/16.
 */
@EnableHystrixDashboard
@EnableApolloConfig({"application","TEST1.spring-cloud-in-action"})
@SpringBootApplication
public class HystrixDashboardApplication {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardApplication.class, args);
  }
}
