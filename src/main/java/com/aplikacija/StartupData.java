package com.aplikacija;

import com.aplikacija.product.Product;
import com.aplikacija.product.ProductService;
import com.aplikacija.user.User;
import com.aplikacija.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class StartupData implements CommandLineRunner {
    private final UserService userService;
    private final ProductService productService;

    @Autowired
    public StartupData(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }

    @Override
    public void run(String... args) {
        adminAccount();
        userAccount();
        exampleProducts();
    }

    private void userAccount(){
        User user = new User();

        user.setUsername("user");
        user.setPassword("user");
        user.setPasswordConfirm("user");
        user.setGender("Musko");
        user.setEmail("user@example.com");
        user.setAge(21);
        user.setFirstName("Aleksa");
        user.setCity("Beograd");
        user.setLastName("Knezevic");

        userService.save(user);
    }

    private void adminAccount(){
        User admin = new User();

        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setPasswordConfirm("admin");
        admin.setGender("Musko");
        admin.setEmail("admin@example.com");
        admin.setCity("Brus");
        admin.setAge(21);
        admin.setFirstName("Aleksa");
        admin.setLastName("Knezevic");

        userService.save(admin);
    }

    private void exampleProducts(){
    	final String NAME = "Leblebije";
        final String IMAGE_URL = "https://stil.kurir.rs/data/images/2017/10/26/11/130851_profimedia0295992205_ff.jpg";
        final String DESCRIPTION = "Sveze pakovane super leblebije za svaki dan. Pakovanje od 500 grama.";
        final BigDecimal PRICE = BigDecimal.valueOf(220);

        
        final String NAME2 = "Kikiriki";
        final String IMAGE_URL2 = "https://www.alo.rs/resources/images/0000/001/549/Kikiriki%20shutterstock_1000x0.jpg";
        final String DESCRIPTION2 = "Svezi pravi organski kikiriki samo za vas! Pakovanje sadrzi 100 grama.";
        final BigDecimal PRICE2 = BigDecimal.valueOf(122);
        
        final String NAME3 = "Lesnik";
        final String IMAGE_URL3 = "https://cdn.britannica.com/75/174375-050-BC6968AE/Hazelnuts-fruit-compound-ovary-seed.jpg";
        final String DESCRIPTION3 = "Svezi pravi organski lesnik samo za vas! Pakovanje sadrzi 200 grama.";
        final BigDecimal PRICE3 = BigDecimal.valueOf(252);
        
        final String NAME4 = "Crne semenke";
        final String IMAGE_URL4 = "https://ddl.rs/wp-content/uploads/2018/07/suncokret-seme-pixabay.jpg";
        final String DESCRIPTION4 = "Crne semenke. Organska proizvodnja. Pakovanje sadrzi 250 grama.";
        final BigDecimal PRICE4 = BigDecimal.valueOf(102);
        
        final String NAME5 = "Bele semenke";
        final String IMAGE_URL5 = "https://www.espreso.rs/data/images/2019/01/20/17/498773_semenke01-stock-shutterstock_ls.jpg";
        final String DESCRIPTION5 = "Bele semenke. Organska proizvodnja. Pakovanje sadrzi 250 grama.";
        final BigDecimal PRICE5 = BigDecimal.valueOf(162);
        
        final String NAME6 = "Amarant";
        final String IMAGE_URL6 = "https://www.zdravahrana.com/images/stories/zh4/stajeto/amarant.jpg";
        final String DESCRIPTION6 = "Ili stir. Najkompletnija zitarica, sa prostora Juzne Amerike. Pakovanje sadrzi 100 grama.";
        final BigDecimal PRICE6 = BigDecimal.valueOf(159);
        
        final String NAME7 = "Šitake";
        final String IMAGE_URL7 = "https://www.zdravahrana.com/images/stories/zh4/stajeto/sitake.jpg";
        final String DESCRIPTION7 = "Pečurka šitake je poreklom iz Japana, Kine i Koreje. Pakovanje sadrzi 500 grama.";
        final BigDecimal PRICE7 = BigDecimal.valueOf(341);
        
        
        final String NAME8 = "Bele semenke";
        final String IMAGE_URL8 = "https://www.zdravahrana.com/images/stories/zh4/stajeto/reisi.jpg";
        final String DESCRIPTION8 = "Reiši gljiva sa pprostora severoistocne Azije, sadrzi mnoštvo sastojaka i lekovitih svojstava. Pakovanje sadrzi 250 grama.";
        final BigDecimal PRICE8 = BigDecimal.valueOf(557);
        
        
        
       Product product1 = new Product();
       Product product2 = new Product();
       Product product3 = new Product();
       Product product4 = new Product();
       Product product5 = new Product();
       Product product6 = new Product();
       Product product7 = new Product();
       Product product8 = new Product();

        product1.setName(NAME);
        product1.setImageUrl(IMAGE_URL);
        product1.setDescription(DESCRIPTION);
        product1.setPrice(PRICE);

        product2.setName(NAME2);
        product2.setImageUrl(IMAGE_URL2);
        product2.setDescription(DESCRIPTION2);
        product2.setPrice(PRICE2);

        product3.setName(NAME3);
        product3.setImageUrl(IMAGE_URL3);
        product3.setDescription(DESCRIPTION3);
        product3.setPrice(PRICE3);

        product4.setName(NAME4);
        product4.setImageUrl(IMAGE_URL4);
        product4.setDescription(DESCRIPTION4);
        product4.setPrice(PRICE4);

        product5.setName(NAME5);
        product5.setImageUrl(IMAGE_URL5);
        product5.setDescription(DESCRIPTION5);
        product5.setPrice(PRICE5);

        product6.setName(NAME6);
        product6.setImageUrl(IMAGE_URL6);
        product6.setDescription(DESCRIPTION6);
        product6.setPrice(PRICE6);
        
        product7.setName(NAME7);
        product7.setImageUrl(IMAGE_URL7);
        product7.setDescription(DESCRIPTION7);
        product7.setPrice(PRICE7);
        
        product8.setName(NAME8);
        product8.setImageUrl(IMAGE_URL8);
        product8.setDescription(DESCRIPTION8);
        product8.setPrice(PRICE8);
        
        
        productService.save(product1);
        productService.save(product2);
        productService.save(product3);
        productService.save(product4);
        productService.save(product5);
        productService.save(product6);
        productService.save(product7);
        productService.save(product8);
     
    }
}
