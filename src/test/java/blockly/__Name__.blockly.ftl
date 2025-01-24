<?xml version="1.0" encoding="UTF-8"?>
<#assign type = "JS">
<#assign security = "">
<#if isSrc??>
<#assign type = isSrc?then('JAVA','JS')  >
</#if>
<#if isAuth??>
<#assign security = isAuth?then('','{"post":"Public","get":"Public","execute":"Public","delete":"Public","put":"Public","filter":"Public"}')  >
</#if>
<blockly formTarget="" resourceType="${type}" blocklyType="${blocklyType}" ruleDescription="${Name?xml}" ruleName="${Name?xml}" ruleSynchronous="false" ruleType="I" ruleSecurity='${security}'>
<block colour="#995ba5" id="Anb:u5+^,0vLkL9QIqn5" tooltip="${Name?xml} - ${FunctionName?xml}" type="procedures_defreturn" x="-350" y="130">
<mutation>
  <#if param??>
  <arg name="${param}"/>
  </#if>
</mutation>
<field name="NAME">${FunctionName?xml}</field>
<comment h="80" pinned="false" w="160"></comment>
</block>
</blockly>
