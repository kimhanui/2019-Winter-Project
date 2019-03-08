package kr.or.teamserver.coinserver.service;

import java.util.List;

import kr.or.teamserver.coinserver.model.Washer;

public interface WasherService {
    Washer save(long electricPower);

    Washer save(long id, long electricPower);

    Washer findOne(long id);

    List<Washer> findAll();
}
