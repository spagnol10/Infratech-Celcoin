package org.api.celcoin.domain.usecases;

import org.api.celcoin.domain.dto.ProductDTO;
import org.api.celcoin.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListProducts {

    private IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
        return vendor.listProducts(stateCode, operatorId);
    }

}
