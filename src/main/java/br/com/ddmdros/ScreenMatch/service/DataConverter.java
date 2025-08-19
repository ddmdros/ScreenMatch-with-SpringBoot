package br.com.ddmdros.ScreenMatch.service;

import br.com.ddmdros.ScreenMatch.model.SeriesData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter{
    private  ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> converterClass) {
        try {
            return mapper.readValue(json,converterClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
