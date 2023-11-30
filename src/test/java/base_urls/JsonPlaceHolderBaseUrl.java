package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {
    protected RequestSpecification spec;

    @Before
    public  void Setup(){
        spec=new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .setContentType(ContentType.JSON)
                .build();
    }
}
//Her sorguda tekrar eden dataları buraya gireceğiz
