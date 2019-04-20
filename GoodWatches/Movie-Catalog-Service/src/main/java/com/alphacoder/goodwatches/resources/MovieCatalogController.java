package com.alphacoder.goodwatches.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alphacoder.goodwatches.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@RequestMapping(method= RequestMethod.GET, value="/{userID}")
	public List<CatalogItem> getCatalog(@PathVariable String userID) {
		return Collections.singletonList(
				new CatalogItem("Dragon Ball", "description of dragon", 4));
	}

}
