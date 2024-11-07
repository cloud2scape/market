package org.sesac.market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> services() {
        return discoveryClient.getServices();
    }

    @GetMapping("/login")
    public RedirectView login() {
        return new RedirectView("/oauth2/authorization/okta");
    }
}
