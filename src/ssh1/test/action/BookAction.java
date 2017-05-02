package ssh1.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ssh1.test.service.BookService;
import ssh1.test.vo.Book;

public class BookAction extends ActionSupport implements ModelDriven<Book> {
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	// 模型驱动类
	private Book book=new Book();

	public Book getModel() {
		return book;
	}

	// 请求处理的方法
	public String add() {
		System.out.println("web层的方法添加执行了......");
		bookService.add(book);
		return NONE;
	}

}
