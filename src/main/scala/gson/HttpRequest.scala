package gson

case class GetData(
    data: Data,
    message: String,
    status: String
)
case class Data(
    balance: String,
    transCode: String
)
