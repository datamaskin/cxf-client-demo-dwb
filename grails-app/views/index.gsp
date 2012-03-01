<%@ page import="net.uhurucloud.HelloWorld; net.uhurucloud.HelloWorldResponse" %>
<html>
<head>
  <title>CXF CLIENT DEMO</title>
  <meta name="layout" content="main"/>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.15/jquery-ui.min.js"></script>
</head>

<body>
<table><tr><td width="50%">
  <fieldset>
      <legend>Service Settings</legend>
      <span style="font-weight: bold;">Simple Url:</span> ${grailsApplication.config.service.simple.url}<BR>
      <span style="font-weight: bold;">Complex Url:</span> ${grailsApplication.config.service.complex.url}<br>
      <span style="font-weight: bold;">Secure Url:</span> ${grailsApplication.config.service.secure.url}<br><br>
      <input type="button" value="Reset Form" onclick="document.location.href = '${createLink(controller:"demo", action:"index")}'"/>
    </fieldset>
  <br><br>
  <g:form action="serviceSoapTest" controller="demo" name="serviceSoapTest">
    <fieldset>
    <legend>Invoke SAP Services</legend>
        <input name="aCardCode" type="text" value="${params.aCardCode ?: 'CardCode'}" onclick="if (this.value=='CardCode') {this.value = '';}" />
        <h5>Create BP</h5>
        <label>Enabled: <input id="rbp" type="radio" name="Enable" value="bp"></label>
        <br>
        <input name="grpn" type="text" value="${params.groupName ?: 'GroupName'}" onclick="if (this.value=='GroupName') {this.value = '';}" />
        <input name="pl" type="text" value="${params.priceList ?: 'PriceList'}" onclick="if (this.value=='PriceList') {this.value = '';}" />
        <input name="ph" type="text" value="${params.phone ?: 'phone'}" onclick="if (this.value=='phone') {this.value = '';}" />
        <input name="email" type="text" value="${params.email ?: 'email'}" onclick="if (this.value=='email') {this.value = '';}" />
        <input name="sp" type="text" value="${params.sp ?: 'SecondPhone'}" onclick="if (this.value=='SecondPhone') {this.value = '';}" />
        <input name="fax" type="text" value="${params.fax ?: 'Fax'}" onclick="if (this.value=='Fax') {this.value = '';}" />
        <br>
        <hr>
        <br>
        <h5>Create Address (Bill To/Ship To)</h5>
        <br>
        <input name="addressName" type="text" value="${params.an ?: 'AddressName'}" onclick="if (this.value=='AddressName') {this.value = '';}" />
        <input name="address1" type="text" value="${params.add1 ?: 'Address1'}" onclick="if (this.value=='Address1') {this.value = '';}" />
        <input name="city" type="text" value="${params.cty ?: 'City'}" onclick="if (this.value=='City') {this.value = '';}" />
        <input name="state" type="text" value="${params.ste ?: 'State'}" onclick="if (this.value=='State') {this.value = '';}" />
        <input name="postalCode" type="text" value="${params.pc ?: 'PostalCode'}" onclick="if (this.value=='PostalCode') {this.value = '';}" />
        <input name="countryCode" type="text" value="${params.cc ?: 'CountryCode'}" onclick="if (this.value=='CountryCode') {this.value = '';}" />
        <hr>
        <br>
        <h5>Create Invoice</h5>
        <label>Enabled: <input id="rinv" type="radio" name="Enable" value="inv"></label><BR>
        <input name="cardName" type="text" value="${params.cardName ?: 'CardName'}" onclick="if (this.value=='CardName') {this.value = '';}" />
        %{--<input name="addressName" type="text" value="${params.an ?: 'AddressName'}" onclick="if (this.value=='AddressName') {this.value = '';}" />--}%
        <input name="grpn" type="text" value="${params.groupName ?: 'GroupName'}" onclick="if (this.value=='GroupName') {this.value = '';}" />
        <input name="pl" type="text" value="${params.priceList ?: 'PriceList'}" onclick="if (this.value=='PriceList') {this.value = '';}" />
        <br><hr><br>
        <h5>Create Line Item</h5>
        <input name="cmmt" type="text" value="${params.comment ?: 'Comment'}" onclick="if (this.value=='Comment') {this.value = '';}" />
        <input name="desc" type="text" value="${params.desc ?: 'Description'}" onclick="if (this.value=='Description') {this.value = '';}" />
        <input name="itemCode" type="text" value="${params.itemCode ?: 'ItemCode'}" onclick="if (this.value=='ItemCode') {this.value = '';}" />
        <input name="quantity" type="text" value="${params.quantity ?: 'Quantity'}" onclick="if (this.value=='Quantity') {this.value = '';}" />
        <input name="taxCode" type="text" value="${params.taxCode ?: 'TaxCode'}" onclick="if (this.value=='TaxCode') {this.value = '';}" />
        <input name="unitP" type="text" value="${params.unitP ?: 'DiscountPrice'}" onclick="if (this.value=='DiscountPrice') {this.value = '';}" />
        <input name="whsCode" type="text" value="${params.whsCode ?: 'WareHouseCode'}" onclick="if (this.value=='WareHouseCode') {this.value = '';}" />
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="helloSAPDemo" controller="demo" name="helloSAPDemo">
    <fieldset>
    <legend>Invoke Hello SAP</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="stockQuoteDemo" controller="demo" name="stockQuoteDemo">
    <fieldset>
    <legend>Invoke Stock Quote Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="globalWeatherDemo" controller="demo" name="globalWeatherDemo">
    <fieldset>
    <legend>Invoke Global Weather Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="digDNSDemo" controller="demo" name="digDNSDemo">
    <fieldset>
    <legend>Invoke Dig DNS Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="shakeSpeareDemo" controller="demo" name="shakeSpeareDemo">
    <fieldset>
    <legend>Invoke Shakespeare Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="getCustomNewsDemo" controller="demo" name="getCustomNewsDemo">
    <fieldset>
    <legend>Invoke Custom News Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <g:form action="loginServiceDemo" controller="demo" name="loginServiceDemo">
    <fieldset>
    <legend>Invoke SAP Login Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="simpleServiceDemo" controller="demo" name="simpleServiceDemo">
    <fieldset>
    <legend>Invoke Simple Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="complexServiceDemo" controller="demo" name="complexServiceDemo">
    <fieldset>
    <legend>Invoke Complex Service</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="secureServiceDemo" controller="demo" name="secureServiceDemo">
    <fieldset>
    <legend>Invoke Secure Service Using Default Interceptor</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="customSecureServiceDemo" controller="demo" name="customSecureServiceDemo">
    <fieldset>
    <legend>Invoke Secure Service Using Custom Interceptor</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
  <br><br>
  <g:form action="insecureServiceDemo" controller="demo" name="insecureServiceDemo">
    <fieldset>
    <legend>Invoke Secure Service With No Credentials (Exception)</legend>
    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
    </fieldset>
  </g:form>
</td>
  <td width="50%">
    <fieldset>
    <legend>Service Results</legend>
       <g:if test="${isAlive && isConnected}">
          <BR><BR>
          <span style="font-weight: bold;">Is Alive:&nbsp;</span><span class="name">${isAlive}</span><BR>
          <span style="font-weight: bold;">Connected B1:&nbsp;</span> <span class="name">${isConnected}</span><BR>
          <span style="font-weight: bold;">Hello World:&nbsp;</span><span class="name">${helloWorld}</span><BR>
          <span style="font-weight: bold;">GetDataTableResult:&nbsp;</span><span class="name">${getDataTableResult}</span><BR>
          <span style="font-weight: bold;">Add BP:&nbsp;</span><span class="name">${addBP}</span><BR>
          <span style="font-weight: bold;">Add Invoice:&nbsp;</span><span class="name">${addInv}</span><BR>
          <span style="font-weight: bold;">Soap Service Exception:&nbsp;</span><span class="name">${soapServiceException}</span><BR>
        </g:if>
       <g:if test="${HelloWorld}">
           <BR><BR>
           <span class="name>"${HelloWorldResult?.encodeAsHTML()}</span><BR>
       </g:if>
       <g:if test="${stockQuote}">
          <BR><BR>
          <span class="name">${stockQuote?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${globalWeather}">
          <BR><BR>
          <span class="name">${globalWeather?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${digDNS}">
          <BR><BR>
          <span class="name">${digDNS?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${shakeSpeare}">
          <BR><BR>
          <span class="name">${shakeSpeare?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${getCustomNews}">
          <BR><BR>
          <span class="name">${getCustomNews?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${loginService}">
          <BR><BR>
          <span class="name">${loginService?.encodeAsHTML()}</span><BR>
        </g:if>
        <g:if test="${serviceException}">
          <BR><BR>
          <span style="font-weight: bold;">Exception:</span> <span class="name">${serviceException}</span><BR>
        </g:if>
        <g:if test="${simpleRequest1}">
          <BR><BR>
          <span style="font-weight: bold;">Request 1 Name:</span> <span class="name">${simpleRequest1?.name}</span><BR>
          <span style="font-weight: bold;">Request 1 Age:</span> ${simpleRequest1?.age}<BR>
          <span style="font-weight: bold;">Response 1 Is Old:</span> <span class="isOld">${simpleResponse1?.isOld}</span><br>
          <span style="font-weight: bold;">Response 1 Status:</span> <span class="status">${simpleResponse1?.status}</span><br>
        </g:if>
        <g:if test="${simpleRequest2}">
          <BR><BR>
          <span style="font-weight: bold;">Request 1 Name:</span> ${simpleRequest2?.name}<BR>
          <span style="font-weight: bold;">Request 1 Age:</span> ${simpleRequest2?.age}<BR>
          <span style="font-weight: bold;">Response 1 Is Old:</span> ${simpleResponse2?.isOld}<br>
          <span style="font-weight: bold;">Response 1 Status:</span> ${simpleResponse2?.status}<br>
        </g:if>
         <g:if test="${complexRequest1}">
          <BR><BR>
          <span style="font-weight: bold;">Request 1 Child:</span> ${complexRequest1?.singleChild}<BR>
          <span style="font-weight: bold;">Request 1 Propagate:</span> ${complexRequest1?.propagateCount}<BR>
          <span style="font-weight: bold;">Response 1 Child Count:</span> ${complexResponse1?.childCount}<br>
          <span style="font-weight: bold;">Response 1 Children:</span> ${complexResponse1?.children}<br>
           <span style="font-weight: bold;">Response 1 Message:</span> ${complexResponse1?.message}<br>
        </g:if>
        <g:if test="${complexRequest2}">
          <BR><BR>
          <span style="font-weight: bold;">Request 2 Child:</span> ${complexRequest2?.singleChild}<BR>
          <span style="font-weight: bold;">Request 2 Propagate:</span> ${complexRequest2?.propagateCount}<BR>
          <span style="font-weight: bold;">Response 2 Child Count:</span> ${complexResponse2?.childCount}<br>
          <span style="font-weight: bold;">Response 2 Children:</span> ${complexResponse2?.children}<br>
           <span style="font-weight: bold;">Response 2 Message:</span> ${complexResponse2?.message}<br>
        </g:if>
     </fieldset>
  </td>
</tr></table>
</body>
</html>
