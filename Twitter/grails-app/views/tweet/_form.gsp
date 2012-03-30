<%@ page import="twitter.Tweet" %>



<div class="fieldcontain ${hasErrors(bean: tweetInstance, field: 'mensagem', 'error')} required">
	<label for="mensagem">
		<g:message code="tweet.mensagem.label" default="Mensagem" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="mensagem" cols="40" rows="5" maxlength="140" required="" value="${tweetInstance?.mensagem}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: tweetInstance, field: 'usuario', 'error')} required">
	<label for="usuario">
		<g:message code="tweet.usuario.label" default="Usuario" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="usuario" name="usuario.id" from="${twitter.Usuario.list()}" optionKey="id" required="" value="${tweetInstance?.usuario?.id}" class="many-to-one"/>
</div>

