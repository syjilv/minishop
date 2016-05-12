package openapi.service;

import java.io.IOException;
import java.util.ArrayList;

import openapi.dto.ParseDTO;
import openapi.logic.ParseLogic;
import openapi.logic.ParseLogicImpl;


public class ParseServiceImpl implements ParseService {

	@Override
	public ArrayList<ParseDTO> weatherData() {
		ArrayList<ParseDTO> list = new ArrayList<ParseDTO>();
		ParseLogic logic = new ParseLogicImpl();
		try {
			list = logic.weatherData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
