package books;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.SqlOperation;

@Path("/books")
public class BookResource {
	
	SqlOperation sqlOperation = new SqlOperation();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Book> getBooks()
	{
		return sqlOperation.getBooks();
	}

	@GET
	@Path("/{title}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Book> getBook(@PathParam("title") String title)
	{  
		return sqlOperation.getBooks(title);
	}

	@POST
	public Book createBook(Book book)
	{
		if(sqlOperation.getBookById(book.getId())!=null){
			return null;
		}
		sqlOperation.create(book);
		return book;
	}
	
	@PUT
	public Book updateBook(Book book)
	{
		if(sqlOperation.getBookById(book.getId())== null){
			return null;
		}
		sqlOperation.update(book);
		return book;
	}
	
	@DELETE
	public void deleteBooks()
	{
		sqlOperation.deleteAll();
	}
	
	@DELETE
	@Path("/{id}")
	public Book deleteOneBook(@PathParam("id") int id)
	{
		if(sqlOperation.getBookById(id)==null){
			return null;
		}
		Book book=sqlOperation.getBookById(id);
		sqlOperation.deleteOne(id);
		return book;
	}
	


}