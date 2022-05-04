import com.wts.spring.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description: AppTest
 * @Author: WangTianShun
 * @Date: 2021/2/20 14:02
 * @Version 1.0
 */
public class AppTest {
	@Test
	public void MyTestBeanTest() {
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring-config.xml"));
		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(myTestBean.getName());
	}
}
