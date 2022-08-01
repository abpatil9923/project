### project


### #swagger url

http://localhost:8089/swagger-ui.html#/product-controller


###Add Seller Info and Product
http://localhost:8089/add_product

### #Seller 1

{

    "sellerName" : "Atul",
	
    "sellerMobile" : "98881580895",
    "products" :[
        {
            "productName" : "Dell",
            "productType" : "Laptop",
            "productCategory" : "Electronics",
            "productPriceRange" : {
                    "minPrice" : "10000",
                    "maxPrice" : "15000"
            }
        },
        {
            "productName" : "Sony",
            "productType" : "Washing machine",
            "productCategory" : "Electronics",
            "productPriceRange" : {
                "minPrice" : "22000",
                "maxPrice" : "25000"
            } 
        }   
    ]
}


###Seller 2
{

    "sellerName" : "Rahul",
    "sellerMobile" : "7658158089",
    "products" :[
        {
            "productName" : "Sparx-s",
            "productType" : "Sandal",
            "productCategory" : "Footwear",
            "productPriceRange" : {
                    "minPrice" : "900",
                    "maxPrice" : "1200"
            }
        },
        {
            "productName" : "Rebook",
            "productType" : "Shoes",
            "productCategory" : "Footwear",
            "productPriceRange" : {

                "minPrice" : "1400",
                "maxPrice" : "1500"
            } 
        }   
    ]
}

###Seller 3

`{

    "sellerName" : "Rahul",
    "sellerMobile" : "7658158089",
    "products" :[
        {
            "productName" : "Head and Shoulders",
            "productType" : "shampoo",
            "productCategory" : "Hair Care",
            "productPriceRange" : {
                    "minPrice" : "900",
                    "maxPrice" : "1200"
            }
        },
        {
            "productName" : "Mama Earth",
            "productType" : "Beard Oil",
            "productCategory" : "Hair Care",
            "productPriceRange" : {

                "minPrice" : "1400",
                "maxPrice" : "1500"
            } 
        }   
    ]
}`


###Get All the products
http://localhost:8089/products



###Get specific products based on product type
http://localhost:8089/product_type/{product-type}



###Get specific products based on product category
http://localhost:8089/product_category/{product-category}



###Get specific products based on product name
http://localhost:8089/product_name/{product-name}



###Get products of particular seller
http://localhost:8089/products_by_sellerid/{seller-id}


###Delete Product
http://localhost:8089/delete_by_sellerid/{seller-id}
