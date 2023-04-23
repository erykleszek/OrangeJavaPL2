package com.sda.OrangeJavaPL2.repository;

import com.sda.OrangeJavaPL2.entity.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IBreadRepository extends JpaRepository<Bread,Long> {
// Long => long
// Integer => int

    Bread findByName(String name);

//    Custom query to more sophisticated queries
//    @Query(value = "SELECT f FROM fruits f WHERE f.name = :name", nativeQuery = false)
//    List[Fruit] selectAllFruitsByProvidedName(@Param("name") String name);
}
