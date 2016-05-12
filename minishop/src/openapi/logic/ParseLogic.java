package openapi.logic;

import java.io.IOException;
import java.util.ArrayList;

import openapi.dto.ParseDTO;

public interface ParseLogic {
	ArrayList<ParseDTO> weatherData() throws IOException;
}