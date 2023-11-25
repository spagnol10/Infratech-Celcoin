package org.api.celcoin.infra.celcoin.mappers;

import org.api.celcoin.domain.dto.PixDTO;
import org.api.celcoin.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

    public static PixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return dto;
    }

    public static CelcoinPixDTO toVendorDTO(PixDTO appDTO) {
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }

}
