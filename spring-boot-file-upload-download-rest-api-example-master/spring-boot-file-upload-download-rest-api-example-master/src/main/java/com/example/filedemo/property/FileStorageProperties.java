package com.example.filedemo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties
public class FileStorageProperties {

	@Value("${file.upload-dir}")
	private String uploadDir;

	@Value("${file.product.upload-dir}")
	private String productFileUploadUrl;
}
