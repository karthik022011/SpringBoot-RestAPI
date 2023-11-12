package com.kartheek.restapi.demo.controller;


import com.kartheek.restapi.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController//spring boot will know that this is controller
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    //Spring boot will know that this get method by using @GetMapping annotation
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        /*return new CloudVendor("C1", "Vendor1", "Address One",
                "123456789");*/

        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
