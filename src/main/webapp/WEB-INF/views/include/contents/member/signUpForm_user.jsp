<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.sql.*, javax.servlet.http.*, java.io.*, java.text.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<<script type="text/javascript">

  $(document).ready(function() {
      // 팝업 창 크기를 HTML 크기에 맞추어 자동으로 크기를 조정하는 함수.
      var strWidth;
      var strHeight;

      //innerWidth / innerHeight / outerWidth / outerHeight 지원 브라우저 
      if ( window.innerWidth && window.innerHeight && window.outerWidth && window.outerHeight ) {
          strWidth = $('.userInfoPop').outerWidth() + (window.outerWidth - window.innerWidth);
          strHeight = $('.userInfoPop').outerHeight() + (window.outerHeight - window.innerHeight);
      }
      else {
          var strDocumentWidth = $(document).outerWidth();
          var strDocumentHeight = $(document).outerHeight();

          window.resizeTo ( strDocumentWidth, strDocumentHeight );

          var strMenuWidth = strDocumentWidth - $(window).width();
          var strMenuHeight = strDocumentHeight - $(window).height();

          strWidth = $('.userInfoPop').outerWidth() + strMenuWidth;
          strHeight = $('.userInfoPop').outerHeight() + strMenuHeight;
      }

      //resize 
      window.resizeTo( strWidth, strHeight );

  });
</script>


<style type="text/css">
#signUp {
	width: 700px;
	margin-left: 150;
	margin-right: 150;
	border: 3px;
	float: none;
}

#title {
	vertical-align: middle;
	text-align: center;
	height: 50px;
	width: 150px;
}

.error {
color: red;
}
</style>


<c:url var="signUpUrl" value="/userSignUpAction"/>
<sf:form modelAttribute="signUpMemberVO" method="POST" action="${signUpUrl }">
	<center>
	<br> <b><font size="6" color="gray">일반 회원가입</font></b> <br><br>
	<table id="signUp" width=400 border=1 cellpadding=5>
		<tr>
			<td id="title"><b>아이디</b></td>
			<td><sf:input path="id" size="50" maxlength="50" placeholder="아이디는 6~15자 이내로 설정해 주세요."/> <br/>
			<sf:errors path="id" cssClass="error"/>
			<input type="button" name="idcheck" value="중복확인" onclick="window.open('/cafe/idcheckAction','중복확인','width=300, height=5, scrollbars=no, resizable=no, toolbars=no, menubar=no')">
			</td>
		</tr>
	
		<tr>
			<td id="title"><b>비밀번호</b></td>
			<td><sf:input type="password" path="password" size="50" maxlength="50" placeholder="비밀번호는 영문,숫자를 포함한  6~15자 이내로 설정해주세요."/> <br/>
			<sf:errors path="password" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td id="title"><b>비밀번호 확인</b></td>
			<td><input type="password" name="passwordcheck" size="50" maxlength="50" placeholder="비밀번호를 다시 한번 입력해 주세요."/> <br/>
			</td>
		</tr>
	
		<tr>
			<td id="title"><b>이메일</b></td>
			<td><sf:input path="email" size="50" maxlength="50" placeholder="이메일 주소를 입력해 주세요."/> <br/>
			<sf:errors path="email" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td id="title"><b>전화번호</b></td>
			<td><sf:input path="tel" size="50" maxlength="50" placeholder="전화번호는 -를 제외한 숫자만 입력해 주세요."/> <br/>
			<sf:errors path="tel" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td id="title"><b>이름</b></td>
			<td><sf:input path="name" size="50" maxlength="50" placeholder="이름은 2~8자 이내로 입력해 주세요."/> <br/>
			<sf:errors path="name" cssClass="error"/>
			</td>
		</tr>
	
		<tr>
			<td id="title"><b>닉네임</b></td>
			<td><sf:input path="nickname" size="50" maxlength="50" placeholder="닉네임은 2~8자 이내로 설정해 주세요."/> <br/>
			<sf:errors path="nickname" cssClass="error"/>
			</td>
		</tr>
		
		<tr>
			<td id="title"><b>지역구</b></td>
			<td><sf:input path="gu" size="50" maxlength="50" placeholder="○○구 까지만입력해 주세요."/> <br/>
			<sf:errors path="gu" cssClass="error"/>
			</td>
		</tr>
	
	
	</table>
	<input type="submit" value="회원가입">
	</center>
</sf:form>