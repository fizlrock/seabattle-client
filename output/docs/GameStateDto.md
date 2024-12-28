

# GameStateDto

Состояние игры

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeCount** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Этап жизненного цикла игры |  |
|**oponentId** | **Long** |  |  [optional] |
|**youShoting** | **Boolean** | Ваша ли очередь делать выстрел |  [optional] |
|**yourField** | **String** | Состояние игрового поля  |  [optional] |
|**oponentField** | **String** | Состояние игрового поля  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTED | &quot;Started&quot; |
| WAITING_SECOND_PLAYER | &quot;WaitingSecondPlayer&quot; |
| ENDED | &quot;Ended&quot; |
| FAILED | &quot;Failed&quot; |



