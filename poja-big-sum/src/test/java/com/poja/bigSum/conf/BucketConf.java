package com.poja.nig-sum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.nig-sum.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
