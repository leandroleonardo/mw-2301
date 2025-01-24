window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * @function Soma
 *
 *
 *
 * @param x
 * @param y
 *
 * @author Leandro Leonardo Assarice
 * @since 24/01/2025, 11:21:57
 *
 */
window.blockly.js.blockly.Bloco.SomaArgs = [{ description: 'x', id: '34079902' }, { description: 'y', id: 'f3c72f2b' }];
window.blockly.js.blockly.Bloco.Soma = async function(x, y) {

  //
  this.cronapi.screen.changeValueOfField("vars.inputResult", (x + y));
}
