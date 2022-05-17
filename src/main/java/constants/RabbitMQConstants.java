package constants;

/**
 *
 */
public class RabbitMQConstants {
  public static final String SUM_QUEUE = "sumQueue";
  public static final String SUB_QUEUE = "subQueue";
  public static final String MULT_QUEUE = "multQueue";
  public static final String DIV_QUEUE = "divQueue";

  public static final String SUM_EXCHANGE = "SumExchange";
  public static final String SUB_EXCHANGE = "SubExchange";
  public static final String MULT_EXCHANGE = "ExchangeCalculator";
  public static final String DIV_EXCHANGE = "ExchangeCalculator";

  public static final String ROUTING_KEY = "OperationValues";

  public static final String RESULT_SUM_QUEUE = "ResultSumQueue";
  public static final String RESULT_SUB_QUEUE = "ResultSQueue";
  public static final String RESULT_MULT_QUEUE = "ResultMultQueue";
  public static final String RESULT_DIV_QUEUE = "ResultDivQueue";

  public static final String RESULT_SUM_EXCHANGE = "ResultSumExchange";
  public static final String RESULT_SUB_EXCHANGE = "ResultSubExchange";
  public static final String RESULT_MULT_EXCHANGE = "ResultExchangeCalculator";
  public static final String RESULT_DIV_EXCHANGE = "ResultExchangeCalculator";

  public static final String RESULT_ROUTING_KEY = "ResultValues";
}
