package com.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by Nir.
 */
@Getter
@Component
@RefreshScope
public class AppConfig {

    @Value("${config.client.message_value:my default}")
    private String refreshedMessage;


}
