
class Solution {
    ProductDTO convertProductToDTO(Product product) {
        //your code
        ProductDTO dto = new ProductDTO(product.getId(), product.getModel(), product.getPrice());
        return dto;
    }
}