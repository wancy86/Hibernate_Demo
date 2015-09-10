package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ORM.Students;

public class StudentsTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void init() {
		// 创建配置对象
		Configuration config = new Configuration().configure();
		// 创建服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		// 创建会话 工厂对象
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		// 会话对象
		session = sessionFactory.openSession();
		// 事务
		transaction = session.beginTransaction();

	}

	@After
	public void destroy() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void testSaveStudents() {
		// new student object
		Students s = new Students(2, "mark", "male", new Date(), "100 main st");

		// System.out.println(s);
		session.save(s);
	}

}
