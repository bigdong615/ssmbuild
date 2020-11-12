package rock.dong.ssmbuild.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
