package webshop.categories.resources;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;

import io.dropwizard.jersey.params.IntParam;
import io.dropwizard.jersey.params.LongParam;
import webshop.categories.api.BaseResponse;
import webshop.categories.api.ProductCategory;
import webshop.categories.db.ProductCategoryRepository;

@Path("/categories")
@Produces(MediaType.APPLICATION_JSON)
public class ProductCategoryResource {
	// TODO Ex2, Task1: Replace this class with category resource class from the ProductSrv

	private ProductCategoryRepository categoryRepository;
	private Logger log;

	public ProductCategoryResource(ProductCategoryRepository repository) {
		this.categoryRepository = repository;
		this.log = LoggerFactory.getLogger(ProductCategoryResource.class);
		log.info("ProductCategoryResource instantiated...");
	}

}