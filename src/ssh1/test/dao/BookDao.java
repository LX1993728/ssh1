package ssh1.test.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ssh1.test.vo.Book;

public class BookDao extends HibernateDaoSupport {
	public void save(Book book) {
		System.out.println("DAO层保存图书");
		this.getHibernateTemplate().save(book);
	}
}
