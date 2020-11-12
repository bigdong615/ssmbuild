package rock.dong.ssmbuild.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import rock.dong.ssmbuild.pojo.Books;
import rock.dong.ssmbuild.service.BookServiceImpl;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	@Qualifier(value = "BookServiceImpl")
	BookServiceImpl bookServiceImpl;

	@RequestMapping(value = "/allBook")
	public String list(Model model) {
		List<Books> list = bookServiceImpl.queryAllBook();
		model.addAttribute("list", list);
		return "allBook";

	}
	@RequestMapping("/del/{bookId}")
	public String deleteBook(@PathVariable("bookId") int id) {
	   
	   bookServiceImpl.deleteBookById(id);
	   return "redirect:/book/allBook";
	}
	
	@RequestMapping("/toAddBook")
	public String toAddPaper() {
	   return "addBook";
	}

	@RequestMapping("/addBook")
	public String addPaper(Books books) {
	   System.out.println(books);
	   bookServiceImpl.addBook(books);
	   return "redirect:/book/allBook";
	}
	@RequestMapping("/toUpdateBook")
	public String toUpdateBook(Model model, int id) {
	   Books books = bookServiceImpl.queryBookById(id);
	   System.out.println(books);
	   model.addAttribute("book",books );
	   return "updateBook";
	}

	@RequestMapping("/updateBook")
	public String updateBook(Model model, Books book) {
	   System.out.println(book);
	   bookServiceImpl.updateBook(book);
	   Books books = bookServiceImpl.queryBookById(book.getBookID());
	   model.addAttribute("books", books);
	   return "redirect:/book/allBook";
	}

}
