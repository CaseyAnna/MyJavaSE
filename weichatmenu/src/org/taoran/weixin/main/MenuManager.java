package org.taoran.weixin.main;

import org.taoran.weixin.pojo.AccessToken;
import org.taoran.weixin.pojo.Button;
import org.taoran.weixin.pojo.ClickButton;
import org.taoran.weixin.pojo.ComplexButton;
import org.taoran.weixin.pojo.Menu;
import org.taoran.weixin.pojo.ViewButton;
import org.taoran.weixin.util.WeixinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 菜单管理器类
 * 
 * @author 哓哓
 * @date 2015-4-6
 */
public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	public static void main(String[] args) {
		// 第三方用户唯一凭证
		String appId = "wx98b288f09ed9525f";
		// 第三方用户唯一凭证密钥
		String appSecret = "c32f6edcdd34b8973e679e7184acf894";

		// 调用接口获取access_token
		AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);

		if (null != at) {
			// 调用接口创建菜单
			int result = WeixinUtil.createMenu(getMenu(), at.getToken());

			// 判断菜单创建结果
			if (0 == result)
				log.info("菜单创建成功！");
			else
				log.info("菜单创建失败，错误码：" + result);
		}
	}

	/**
	 * 组装菜单数据
	 * 
	 * @return
	 */
	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("智能翻译");
		btn11.setType("click");
		btn11.setKey("11");

		ClickButton btn12 = new ClickButton();
		btn12.setName("点歌分享");
		btn12.setType("click");
		btn12.setKey("12");

		ClickButton btn13 = new ClickButton();
		btn13.setName("周边搜索");
		btn13.setType("click");
		btn13.setKey("13");
		
		ClickButton btn14 = new ClickButton();
		btn14.setName("人脸检测");
		btn14.setType("click");
		btn14.setKey("14");

		ClickButton btn21 = new ClickButton();
		btn21.setName("本周推荐");
		btn21.setType("click");
		btn21.setKey("21");

		ClickButton btn22 = new ClickButton();
		btn22.setName("经典语录");
		btn22.setType("click");
		btn22.setKey("22");
		
		ClickButton btn23 = new ClickButton();
		btn23.setName("历史推送");
		btn23.setType("click");
		btn23.setKey("23");

		ClickButton btn31 = new ClickButton();
		btn31.setName("智能柠檬");
		btn31.setType("click");
		btn31.setKey("31");

		ClickButton btn32 = new ClickButton();
		btn32.setName("讲个笑话");
		btn32.setType("click");
		btn32.setKey("32");

		ClickButton btn33 = new ClickButton();
		btn33.setName("联系建议");
		btn33.setType("click");
		btn33.setKey("33");

		ViewButton btn34 = new ViewButton();
		btn34.setName("关于我们");
		btn34.setType("view");
		btn34.setUrl("http://1.lemontime.sinaapp.com/about.jsp");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("生活娱乐");
		mainBtn1.setSub_button(new ClickButton[] { btn11, btn12 , btn13, btn14 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("推荐");
		mainBtn2.setSub_button(new ClickButton[] { btn21, btn22, btn23});

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("更多");
		mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34});

		/**
		 * 这是公众号xiaoqrobot目前的菜单结构，每个一级菜单都有二级菜单项<br>
		 * 
		 * 在某个一级菜单下没有二级菜单的情况，menu该如何定义呢？<br>
		 * 比如，第三个一级菜单项不是“更多体验”，而直接是“幽默笑话”，那么menu应该这样定义：<br>
		 * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 });
		 */
		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}
}