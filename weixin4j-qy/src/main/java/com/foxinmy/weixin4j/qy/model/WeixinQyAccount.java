package com.foxinmy.weixin4j.qy.model;

import com.foxinmy.weixin4j.model.WeixinAccount;

/**
 * 微信企业号信息
 * 
 * @className WeixinQyAccount
 * @author jy
 * @date 2014年11月18日
 * @since JDK 1.7
 * @see <a href=
 *      "https://qy.weixin.qq.com/cgi-bin/home?lang=zh_CN&token=685923034#setting"
 *      >企业号设置</a>
 */
public class WeixinQyAccount extends WeixinAccount {
	
	private static final long serialVersionUID = 3689999353867189585L;

	public WeixinQyAccount(){
		
	}
	
	/**
	 * 
	 * @param corpid
	 *            企业ID
	 * @param corpsecret
	 *            管理组的凭证密钥
	 */
	public WeixinQyAccount(String corpid, String corpsecret) {
		super(corpid, corpsecret);
	}

	/**
	 * 应用套件id
	 */
	private String suiteId;
	/**
	 * 应用套件secret
	 */
	private String suiteSecret;
	/**
	 * 应用套件token,用于生成签名,校验回调请求的合法性。后续所有托管的企业产生的回调消息都使用该值来解密。
	 */
	private String suiteToken;
	/**
	 * 应用套件encodingAesKey,回调消息加解密参数，是AES密钥的Base64编码，用于解密回调消息内容对应的密文。
	 * 后续所有托管的企业产生的回调消息都使用该值来解密。
	 */
	private String suiteEncodingAesKey;

	/**
	 * 提供商的secret
	 */
	private String providerSecret;

	public String getSuiteId() {
		return suiteId;
	}

	public void setSuiteId(String suiteId) {
		this.suiteId = suiteId;
	}

	public String getSuiteSecret() {
		return suiteSecret;
	}

	public void setSuiteSecret(String suiteSecret) {
		this.suiteSecret = suiteSecret;
	}

	public String getSuiteToken() {
		return suiteToken;
	}

	public void setSuiteToken(String suiteToken) {
		this.suiteToken = suiteToken;
	}

	public String getSuiteEncodingAesKey() {
		return suiteEncodingAesKey;
	}

	public void setSuiteEncodingAesKey(String suiteEncodingAesKey) {
		this.suiteEncodingAesKey = suiteEncodingAesKey;
	}

	public String getProviderSecret() {
		return providerSecret;
	}

	public void setProviderSecret(String providerSecret) {
		this.providerSecret = providerSecret;
	}

	@Override
	public String toString() {
		return "WeixinQyAccount [" + super.toString() + ", suiteId=" + suiteId
				+ ", suiteSecret=" + suiteSecret + ", suiteToken=" + suiteToken
				+ ", suiteEncodingAesKey=" + suiteEncodingAesKey
				+ ", providerSecret=" + providerSecret + "]";
	}
}
