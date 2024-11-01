package org.sesac.market.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequiredArgsConstructor
public class GatewayController {

    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> services() {
        return discoveryClient.getServices();
    }
}
