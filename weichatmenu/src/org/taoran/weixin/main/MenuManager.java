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
 * �˵���������
 * 
 * @author ����
 * @date 2015-4-6
 */
public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	public static void main(String[] args) {
		// �������û�Ψһƾ֤
		String appId = "wx98b288f09ed9525f";
		// �������û�Ψһƾ֤��Կ
		String appSecret = "c32f6edcdd34b8973e679e7184acf894";

		// ���ýӿڻ�ȡaccess_token
		AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);

		if (null != at) {
			// ���ýӿڴ����˵�
			int result = WeixinUtil.createMenu(getMenu(), at.getToken());

			// �жϲ˵��������
			if (0 == result)
				log.info("�˵������ɹ���");
			else
				log.info("�˵�����ʧ�ܣ������룺" + result);
		}
	}

	/**
	 * ��װ�˵�����
	 * 
	 * @return
	 */
	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("���ܷ���");
		btn11.setType("click");
		btn11.setKey("11");

		ClickButton btn12 = new ClickButton();
		btn12.setName("������");
		btn12.setType("click");
		btn12.setKey("12");

		ClickButton btn13 = new ClickButton();
		btn13.setName("�ܱ�����");
		btn13.setType("click");
		btn13.setKey("13");
		
		ClickButton btn14 = new ClickButton();
		btn14.setName("�������");
		btn14.setType("click");
		btn14.setKey("14");

		ClickButton btn21 = new ClickButton();
		btn21.setName("�����Ƽ�");
		btn21.setType("click");
		btn21.setKey("21");

		ClickButton btn22 = new ClickButton();
		btn22.setName("������¼");
		btn22.setType("click");
		btn22.setKey("22");
		
		ClickButton btn23 = new ClickButton();
		btn23.setName("��ʷ����");
		btn23.setType("click");
		btn23.setKey("23");

		ClickButton btn31 = new ClickButton();
		btn31.setName("��������");
		btn31.setType("click");
		btn31.setKey("31");

		ClickButton btn32 = new ClickButton();
		btn32.setName("����Ц��");
		btn32.setType("click");
		btn32.setKey("32");

		ClickButton btn33 = new ClickButton();
		btn33.setName("��ϵ����");
		btn33.setType("click");
		btn33.setKey("33");

		ViewButton btn34 = new ViewButton();
		btn34.setName("��������");
		btn34.setType("view");
		btn34.setUrl("http://1.lemontime.sinaapp.com/about.jsp");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("��������");
		mainBtn1.setSub_button(new ClickButton[] { btn11, btn12 , btn13, btn14 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("�Ƽ�");
		mainBtn2.setSub_button(new ClickButton[] { btn21, btn22, btn23});

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("����");
		mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34});

		/**
		 * ���ǹ��ں�xiaoqrobotĿǰ�Ĳ˵��ṹ��ÿ��һ���˵����ж����˵���<br>
		 * 
		 * ��ĳ��һ���˵���û�ж����˵��������menu����ζ����أ�<br>
		 * ���磬������һ���˵���ǡ��������顱����ֱ���ǡ���ĬЦ��������ômenuӦ���������壺<br>
		 * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 });
		 */
		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}
}