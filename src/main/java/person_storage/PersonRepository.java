package person_storage;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String>{
	
	
}
