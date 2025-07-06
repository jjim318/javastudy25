function CheckAddBook()	{
	
	var bookId=document.getElementById("bookid");
	var name=document.getElementById("name");
	var unitPrice=document.getElementById("unitPrice");
	var unitsInStock=document.getElementById("unitsInStock");
	var desciption=document.getElementById("description");
	//폼 페이지에서 유효성 검사를 위한 입력 항목인 도서 아이디, 도서명 , 가격, 재고수, 설명 등 id속성 값으로 
	//입력 데이터를 가져올 수있도록 하는 getElementById()메서드 작성
	
	//도서아이디 체크
	if (!check(/^ISBN[0-9]{4,11}$/, bookId, "[도서 코드]\nISBN과 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 ISBN로 시작하세요"))
	return false;
	//도서 아이디가 정규 표현식과 일치하는지 검사
	
	//도서명 체크
	if (name.value.length < 4 || name.value.length > 50) {
		alert("[도서명'\n최소 4자에서 최대 50자까지 입력하세요");
		name.focus();
		return false;
	}//도서명의 문자 길이가 4~50자인지 검사
	
	//도서 가격 체크
	if (unitPrice.value.length==0 || isNaN(unitPrice.value)){
		alert("[가격]\n숫자만 입력하세요");
		unitPrice.focus();
		return false;
	}//도서 가격의 문자 길이가 0인지 숫자인지 검사
	
	if (unitPrice.value < 0) {
		alert("[가격]\n음수를 입력할 수 없습니다");
		unitPrice.focus();
		return false;
	}//도서 가격이 음수인지 검사
	
	//재고 수 체크
	if (isNaN(unitsInStock.value)) {
		alert("[재고 수]\n숫자만 입력하세요");
		unitsInStock.focus();
		return false;
	}//도서 재고 수가 숫자가 아닌지 검사
	
	//상세 설명 100자 이상
	if (descridesciption.value.length < 100) {
		alert("[상세설명]\n최소 100자 이상 입력하세요");
		desciption.focus();
		return false;
	}//도서 설명의 문자 길이가 100자 이상인지를 검사
	
	function check(regExp, e, msg) {
		if (regExp.test(e.value)) {
			return true;
		}
		alert(msg);
		e.focus();
		return false;
	}//입력 항목에 대해 정규 표현식으로 검사하여 오류가 있으면 오류 메세지를 출력하고 해당입력 항목에 커서 놓이도록 함
	
	document.newBook.submit()
}//자바 스크립트로 폼 페이지에 입력 항목의 데이터를 검사하는 핸들러 함수 checkAddBook()를 작성