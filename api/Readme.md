# Collie API

## Adicionar agendamento:
- Requisição `PUSH` para a rota `/schedules`
```json
{  
	"date": "2022-07-18 08:00",
	"name": "Gustavo",
	"phone": "19983563057",
	"price": "50.00",
	"service": "Tosa em cachorro",
	"status": "0"
}
```

## Listar agendamentos:
- Requisição `GET` para a rota `/schedules`


## Atualizar o status de um agendamento:
- Requisição `PATCH` para a rota `/schedules/status/{ID}/{STATUS}`

`localhost:8080/schedules/status/1/1`