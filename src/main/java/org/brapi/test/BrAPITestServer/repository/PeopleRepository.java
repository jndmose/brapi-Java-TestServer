package org.brapi.test.BrAPITestServer.repository;

import org.brapi.test.BrAPITestServer.model.entity.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PeopleRepository extends PagingAndSortingRepository<PersonEntity, String>{

	@Query("select p from PersonEntity p "
			+ "where ('' = :firstName OR p.firstName LIKE :firstName) "
			+ "AND ('' = :lastName OR p.lastName LIKE :lastName) "
			+ "AND ('' = :personDbId OR p.id = :personDbId) "
			+ "AND ('' = :userID OR p.userID = :userID) ")
	public Page<PersonEntity> findBySearch(
			@Param("firstName") String firstName, 
			@Param("lastName") String lastName, 
			@Param("personDbId") String personDbId,
			@Param("userID") String userID, Pageable pageReq);

}
