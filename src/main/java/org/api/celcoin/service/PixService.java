package org.api.celcoin.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.api.celcoin.domain.dto.PixDTO;
import org.api.celcoin.domain.repositories.IPixDatabaseRepository;
import org.api.celcoin.domain.usecases.CreatePixQRCode;
import org.api.celcoin.infra.celcoin.repository.PixCelcoinRepository;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoinRepository celcoin;

    @Inject
    IPixDatabaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQRCode createPix = new CreatePixQRCode(celcoin, panacheRepo);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
