import br.com.nicolas.app.Calculator;
import br.com.nicolas.app.calculation.CalculatorImpl;

module app.calculation {
  exports br.com.nicolas.app.calculation;
  requires app.logging;
  requires app.api;
  provides Calculator with CalculatorImpl;
}