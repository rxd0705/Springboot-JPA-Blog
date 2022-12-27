package com.cos.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class KakaoProfile {

	public Long id;
	public KakaoAccount kakao_account;

	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public static class KakaoAccount {

		public String email;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public static class Profile {

		public String thumnail_img_url;

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public static class Properties {

	}
}