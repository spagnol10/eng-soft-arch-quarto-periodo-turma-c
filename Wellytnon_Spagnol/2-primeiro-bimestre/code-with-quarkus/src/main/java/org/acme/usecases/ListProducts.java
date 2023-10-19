//package org.acme.usecases;
//
//import org.acme.dto.recharge.ProductDTO;
//import org.acme.repositories.IRechargeVendorRepository;
//
//import java.util.List;
//
//public class ListProducts {
//
//    private IRechargeVendorRepository vendor;
//
//    public ListProducts(IRechargeVendorRepository vendor) {
//        this.vendor = vendor;
//    }
//
//    public List<ProductDTO> execute(Integer operatorId) {
//        // Implemente o código para listar os produtos disponíveis para um operador específico usando a instância do fornecedor (vendor).
//
//        // Consulte a API do fornecedor ou outra fonte de dados para obter a lista de produtos para o operador com o ID fornecido.
//        List<ProductDTO> productList = vendor.getProductsByOperator(operatorId);
//
//        return productList;
//    }
//}
