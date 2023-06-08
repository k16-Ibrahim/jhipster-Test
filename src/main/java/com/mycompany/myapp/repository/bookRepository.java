package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Authority;
import com.mycompany.myapp.domain.Books;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.beanutils.BeanComparator;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.convert.R2dbcConverter;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface bookRepository extends R2dbcRepository<Books, Long> {
    //        List<Books> getList();

}
