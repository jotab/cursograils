
<%@ page import="twitter.Tweet" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tweet.label', default: 'Tweet')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-tweet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-tweet" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="mensagem" title="${message(code: 'tweet.mensagem.label', default: 'Mensagem')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'tweet.dateCreated.label', default: 'Date Created')}" />
					
						<th><g:message code="tweet.usuario.label" default="Usuario" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${tweetInstanceList}" status="i" var="tweetInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${tweetInstance.id}">${fieldValue(bean: tweetInstance, field: "mensagem")}</g:link></td>
					
						<td><g:formatDate date="${tweetInstance.dateCreated}" /></td>
					
						<td>${fieldValue(bean: tweetInstance, field: "usuario")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${tweetInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
