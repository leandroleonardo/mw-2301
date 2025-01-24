package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 24/01/2025, 08:56:36
 *
 */
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("vars.inputResult"),
    cronapi.math.Operations.sum(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.inputX")),
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.inputY"))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

