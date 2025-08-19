package br.com.ddmdros.ScreenMatch.service;

public interface IDataConverter {

    <T> T getData(String json, Class<T> converterClass);
}
