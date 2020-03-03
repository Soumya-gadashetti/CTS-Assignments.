package com.cts.sags.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.sags.model.GroupModel;
//@FeignClient(name=""
@FeignClient(name="group-service")
@RibbonClient(name="group-service")

//@Service
public interface GroupProxyService {
		
	@GetMapping("/groups/{id}")
	public GroupModel getGroupModel(@PathVariable(name="id") String id);
}
