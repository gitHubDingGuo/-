$(function() {
	$('.col-sm-4').hover(
		function() {
			$(this).find('.hideP').show();
		},
		function() {
			$(this).find('.hideP').hide();
		}
	);
});
$(document).ready(function() {
	$('#btnSide').click(function() {
		$('#divSide').stop().animate({
				left: '0px'
			}, 100).animate({
				left: '-10px'
			}, 100)
			.animate({
				left: '0px'
			}, 100);
	});
	$('#closeSide').click(function() {
		$('#divSide').stop().animate({
			left: '-200px'
		}, 100);
	})
	$(window).scroll(function() {
		if ($(document).scrollTop() > 300) {
			$('#rTop').stop().animate({
				bottom: '30px'
			}, 100);
		} else {
			$('#rTop').stop().animate({
				bottom: '-100px'
			}, 100);
		}
	});
	$('#rTop').click(function() {
		$('html').animate({
			scrollTop: 0
		}, 300);
	});
})
