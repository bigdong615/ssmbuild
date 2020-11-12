package rock.dong.ssmbuild.dao;

import java.util.List;

import rock.dong.ssmbuild.pojo.Books;

public interface BookMapper {

	// ����һ��Book
	int addBook(Books book);

	// ����idɾ��һ��Book
	int deleteBookById(int id);

	// ����Book
	int updateBook(Books book);

	// ����id��ѯ,����һ��Book
	Books queryBookById(int id);

	// ��ѯȫ��Book,����list����
	List<Books> queryAllBook();

}
