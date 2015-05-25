package org.taoran.weixin.pojo;

/**
 * 普通按钮（子按钮）
 * 
 * @author 哓哓
 * @date 2015-4-9
 */
public class ClickButton extends Button {
	private String type;
	private String key;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}