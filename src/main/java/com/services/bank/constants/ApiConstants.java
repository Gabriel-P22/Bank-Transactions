package com.services.bank.constants;

public class ApiConstants {
    public static final String CPF_OR_CNPJ_REGEX = "^(?:\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}|\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}|\\d{14})$";
    public static final String CPF_REGEX = "^(?:\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$";
    public static final String AUTHORIZE_URL = "http://localhost:8081";
    public static final String AUTHORIZE_PATH = "/transactions/v1/authorize";
    public static String HEADER_KEY = "authorization";
    public static String HEADER_VALUE = "valid";
}
