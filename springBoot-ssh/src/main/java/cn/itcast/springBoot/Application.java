package cn.itcast.springBoot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
	SpringApplication springApplication = new SpringApplication(Application.class);
	
	/** 设置关闭横幅 */
	springApplication.setBannerMode(Mode.OFF);
	springApplication.run(args);
	}
}
