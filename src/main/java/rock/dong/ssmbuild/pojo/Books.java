package rock.dong.ssmbuild.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Books {
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookCounts() {
		return bookCounts;
	}
	public void setBookCounts(int bookCounts) {
		this.bookCounts = bookCounts;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetails(String detail) {
		this.detail = detail;
	}
	int bookID;
	String bookName;
	int bookCounts;
	String detail;
}
