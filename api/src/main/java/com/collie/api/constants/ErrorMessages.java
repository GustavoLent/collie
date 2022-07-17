package com.collie.api.constants;

public class ErrorMessages {
    public static final String UPDATE_ID_NOT_FOUND = "Nenhum agendamento foi encontrado para o ID fornecido.";
    public static final String UPDATE_ERROR = "Erro durante a atualização.";
    public static final String ADD_ERROR = "Erro durante a inserção.";
    public static final String GET_ERROR = "Erro ao pegar os dados.";

    public static final String CONTROLLER_UNEXPECTED_GET = "Erro inesperado durante a listagem de agendamentos.";
    public static final String CONTROLLER_UNEXPECTED_ADD = "Erro inesperado durante a inserção do agendamento.";
    public static final String CONTROLLER_UNEXPECTED_UPDATE = "Erro inesperado durante a atualização do status do agendamento.";

    public static final String MISSING_DATE = "A Data do agendamento deve ser especificada";
    public static final String MISSING_NAME = "O nome do cliente deve ser especificado";
    public static final String MISSING_PHONE = "O telefone do cliente deve ser especificado";
    public static final String MISSING_PRICE = "O preço do serviço deve ser especificado";
    public static final String MISSING_SERVICE = "A descrição do serviço deve ser especificado";
    public static final String MISSING_STATUS = "O status do serviço deve ser especificado";
}
