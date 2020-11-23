package anwyszomi.services;

import anwyszomi.domain.Response;
import anwyszomi.supplier.ApiResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class TopHeadlinesServiceImpl implements TopHeadlinesService {

    @Autowired
    ApiResponder apiResponder;

    @Override
    public Response findAll() {
        return apiResponder.responseOfTopHeadlinesBBCNews();
    }


}
