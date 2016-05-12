package openapi.logic;

import java.io.IOException;
import java.util.ArrayList;

import openapi.dto.ParseDTO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseLogicImpl implements ParseLogic{

	@Override
	public ArrayList<ParseDTO> weatherData() throws IOException {
		
		ArrayList<ParseDTO> list = new ArrayList<ParseDTO>();
		ParseDTO dto = null;
		
		Document doc = Jsoup.connect("http://www.kma.go.kr/weather/main-now-weather.jsp").timeout(10000).get();

		if(doc!=null) {
			Elements elmts = doc.select("div#weather dl");
			Element clock = doc.select("p.clock").first();

			for (int i = 0; i < elmts.size(); i++) {
				Element elmt = elmts.get(i);
				dto = new ParseDTO(elmt.attr("class"),
								   elmt.select("dt:not(.blind)").text(),
								   elmt.select("img").attr("src"),
								   elmt.select("img").attr("alt"),
								   elmt.select("dd.temp").text(),
								   clock.text());
				list.add(dto);
			}
		}
		return list;
	}
}
