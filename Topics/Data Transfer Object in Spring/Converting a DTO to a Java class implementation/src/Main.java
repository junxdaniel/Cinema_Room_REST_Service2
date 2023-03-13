class Solution {    
    Product convertProductDTOToProduct(ProductDTO dto) {
        //your code
        Product product = new Product(dto.getId(), dto.getModel(), dto.getPrice(), null, null);
        product.setDateOfArrival(LocalDate.parse("2023-01-15"));
        product.setVendor("SuperVendor");
        return product;
    }
}