package org.api.celcoin.domain.mappers;

import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.domain.entities.RechargeBO;

import java.util.UUID;

public class RechargeMapper {

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : null,
                dto.getValue(),
                dto.getDocument(),
                dto.getOperatorId(),
                PhoneMapper.toBO(dto.getPhone()),
                dto.getReceipt(),
                dto.getTransactionId(),
                dto.isSuccess());
    }

    public static RechargeDTO toDTO(RechargeBO bo) {
        RechargeDTO dto = new RechargeDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setValue(bo.getValue());
        dto.setDocument(bo.getDocument());
        dto.setOperatorId(bo.getProviderId());
        dto.setPhone(PhoneMapper.toDTO(bo.getPhone()));
        dto.setReceipt(bo.getReceipt());
        dto.setTransactionId(bo.getTransactionId());
        dto.setSuccess(bo.isSuccess());

        return dto;
    }

}
