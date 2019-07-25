package com.ctrip.framework.apollo.configservice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * .
 *
 * @author linzhiqiang
 * @version Revision 1.0.0
 * @版权： 版权所有 (c) 2011
 * @see:
 * @创建日期： 2019-07-25
 * @功能说明：
 */
@Configuration
@EnableEurekaClient
@ConditionalOnProperty(name = "apollo.eureka.client.enabled", havingValue = "true", matchIfMissing = false)
public class ConfigServerEurekaClientConfigure {
}
