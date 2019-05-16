package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //标识是一个SpringBoot，它会先创建spring环境，servlet环境
@MapperScan(basePackages="cn.tedu.mapper")  //mybatis接口文件扫描
public class AppRun {

	public static void main(String[] args) {
		SpringApplication.run(AppRun.class, args);
	}
}
