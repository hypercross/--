$.fn.selectRange = function(start, end) {
    if(!end) end = start; 
    return this.each(function() {
        if (this.setSelectionRange) {
            this.focus();
            this.setSelectionRange(start, end);
        } else if (this.createTextRange) {
            var range = this.createTextRange();
            range.collapse(true);
            range.moveEnd('character', end);
            range.moveStart('character', start);
            range.select();
        }
    });
};

$.fn.insertAtCaret = function(toinsert){
	var pos = this[0].selectionStart;
	this.val( this.val().slice(0,pos) + toinsert + this.val().slice(pos, this.val().length));
	this.selectRange(pos + toinsert.length);
}

$( document ).ready(function(){
	$(".btn").click(function(){
		$.ajax({
			url: "run?source=" + $("textarea").val(),
		}).done(function(data){
			$(".jumbotron").text(data)
		});
	});
	
	$('textarea').keydown(function(e){
		if(e.which == 9){
			e.preventDefault();
			$(this).insertAtCaret('\t');
		}
	});
});