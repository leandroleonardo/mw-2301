window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * @function Executar
 *
 *
 *
 * @param x
 * @param y
 *
 * @author Leandro Leonardo Assarice
 * @since 24/01/2025, 12:40:50
 *
 */
window.blockly.js.blockly.Bloco.ExecutarArgs = [{ description: 'x', id: 'b7193f1f' }, { description: 'y', id: '64c6ae30' }];
window.blockly.js.blockly.Bloco.Executar = async function(x, y) {

  //
  this.cronapi.screen.changeValueOfField("vars.inputResult", (x + y));
}
