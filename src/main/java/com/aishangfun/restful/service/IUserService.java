package com.aishangfun.restful.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aishangfun.restful.vo.UserVO;

/**
 * Created by wesley on 17-6-11.
 */
@Path(value = "/user")
public interface IUserService {
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public UserVO getUser(@PathParam("id") int id);
}
