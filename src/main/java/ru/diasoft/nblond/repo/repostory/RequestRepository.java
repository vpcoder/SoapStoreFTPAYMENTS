package ru.diasoft.nblond.repo.repostory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.diasoft.nblond.repo.dto.Request;
import ru.diasoft.nblond.repo.dto.User;

import java.util.List;

@Repository
public interface RequestRepository extends PagingAndSortingRepository<Request, Long> {

    @Query(value = "SELECT r FROM Request r WHERE r.method = :method AND r.user = :user")
    List<Request> findRequests(@Param("user") User user, @Param("method") String method);

}
