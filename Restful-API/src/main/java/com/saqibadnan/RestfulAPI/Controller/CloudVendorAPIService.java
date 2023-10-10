package com.saqibadnan.RestfulAPI.Controller;

import com.saqibadnan.RestfulAPI.Class.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud vendor")
public class CloudVendorAPIService {
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return new CloudVendor("C1", "vendor 1",
                "Address one", "xxx");
    }
}
