package com.xworkz.bird.tester;

import com.xworkz.bird.DAO.BirdsDAO;
import com.xworkz.bird.DAO.BirdsDAOImpl;
import com.xworkz.bird.DTO.BirdsDTO;
import com.xworkz.bird.DTO.Type;

public class BirdsTester {
	public static void main(String[] args) {

		BirdsDTO dto = new BirdsDTO(1, "parrot", "green", "india", "fruits", "5 years", "300 grms", "30 miles per day",
				Type.PET);
		BirdsDAO dao = new BirdsDAOImpl();
		dao.save(dto);
		dto = dao.readById(1);
		System.out.println(dto);
	}

}
