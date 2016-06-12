



$('#reset').bind('click',function() {
	
	$pname = $('#pname');
	$dname = $('#dname');
	$vdate = $('#vdate');
	$vtime = $('#vtime');
	$reason = $('#reason');
	$filename = $('#filename');

	$pname.val('');
	$dname.val('');
	$vdate.val('');
	$vtime.val('');
	$reason.val('');
	$filename.val('');
})

$('#submit').bind('click',function() {
	
	$pname = $('#pname');
	$dname = $('#dname');
	$vdate = $('#vdate');
	$vtime = $('#vtime');
	$reason = $('#reason');
	$filename = $('#filename');

	var pname = $pname.val();
	var dname = $dname.val();
	var vdate = $vdate.val();
	var vtime = $vtime.val();
	var reason = $reason.val();
	var filename = $filename.val();
	validate(pname,dname,vdate,vtime,reason,filename);
})



function validate (pname,dname,vdate,vtime,reason,filename) {
	var data = '?pname='+pname+'&dname='+dname+'&vdate='+vdate+'&vtime='+vtime+'&reason='+reason+'&filename='+filename;
	var url = '/uploadRx'+data;
	$.ajax( {
		type : 'GET',
		url  : url,
		success : function(data) {
			if(data)
				alert("Uploaded successfully");
			else
				alert("upload failed");
		}

	});
	

}
function upload() {
		var filename = $('#filename').val();
	if(filename) {
		$('#result p').html("Uploaded successfully")
	}
	else {
		$('#result p').html("Please enter file to upload ")
	}
	$('#result').show();
	}