package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.health.TemplateHealthCheck;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
	public static void main(String[] args) throws Exception {
		new HelloWorldApplication().run(args);
	}
	
	@Override
	public String getName() {
		return "hello-world";
	}
	
	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
		// Nothing to do yet
	}
	
	@Override
	public void run(HelloWorldConfiguration arg0, Environment arg1)
			throws Exception {
		// Nothing to do yet
	}

}
