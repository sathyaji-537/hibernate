package com.xworkz.bird.DAO;

import com.xworkz.bird.DTO.BirdsDTO;

public interface BirdsDAO {
	int save(BirdsDTO entity);
	BirdsDTO readById(int pk);

}
