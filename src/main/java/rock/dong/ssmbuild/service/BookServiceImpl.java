package rock.dong.ssmbuild.service;

import java.util.List;

import rock.dong.ssmbuild.dao.BookMapper;
import rock.dong.ssmbuild.pojo.Books;

public class BookServiceImpl implements BookMapper {
	private BookMapper bookmapper;

	public void setBookmapper(BookMapper bookmapper) {
		this.bookmapper = bookmapper;
	}

	@Override
	public int addBook(Books book) {
		// TODO Auto-generated method stub
		return bookmapper.addBook(book);
	}

	@Override
	public int deleteBookById(int id) {
		// TODO Auto-generated method stub
		return bookmapper.deleteBookById(id);
	}

	@Override
	public int updateBook(Books books) {
		// TODO Auto-generated method stub
		return bookmapper.updateBook(books);
	}

	@Override
	public Books queryBookById(int id) {
		// TODO Auto-generated method stub
		return bookmapper.queryBookById(id);
	}

	@Override
	public List<Books> queryAllBook() {
		// TODO Auto-generated method stub
		return bookmapper.queryAllBook();
	}

}
