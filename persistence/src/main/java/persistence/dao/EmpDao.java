package persistence.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.Result;

import persistence.ConfigAutowireable;
import persistence.entity.Emp;

@Dao
@ConfigAutowireable
public interface EmpDao {

	@Insert
	public Result<Emp> save(Emp emp);
	
	@Select
	public List<Emp> find();
	
}
