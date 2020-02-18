package com.example.week9day1.Repository;

import com.example.week9day1.Domain.Log;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface MainRepoInt extends CrudRepository<Log, String> {

}
