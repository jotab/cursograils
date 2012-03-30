<%@ page import="twitter.Usuario" %>



<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="usuario.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${usuarioInstance?.nome}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="usuario.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${usuarioInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'lastUpdate', 'error')} required">
	<label for="lastUpdate">
		<g:message code="usuario.lastUpdate.label" default="Last Update" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="lastUpdate" precision="day"  value="${usuarioInstance?.lastUpdate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'tweets', 'error')} ">
	<label for="tweets">
		<g:message code="usuario.tweets.label" default="Tweets" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${usuarioInstance?.tweets?}" var="t">
    <li><g:link controller="tweet" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="tweet" action="create" params="['usuario.id': usuarioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'tweet.label', default: 'Tweet')])}</g:link>
</li>
</ul>

</div>

