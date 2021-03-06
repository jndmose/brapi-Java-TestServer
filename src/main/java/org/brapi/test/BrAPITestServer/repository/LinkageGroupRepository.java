package org.brapi.test.BrAPITestServer.repository;

import org.brapi.test.BrAPITestServer.model.entity.LinkageGroupEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LinkageGroupRepository extends PagingAndSortingRepository<LinkageGroupEntity, String>{

	public Page<LinkageGroupEntity> findAllByGenomeMapDbId(String mapDbId, Pageable pageRequest);

}
