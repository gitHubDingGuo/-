function checkPassword() {
     	            var pass1 = document.getElementById("Password");
     	            var pass2 = document.getElementById("Repassword");
     	     
     	            if (pass1.value != pass2.value)
     	                pass2.setCustomValidity("两次输入的密码不匹配");
     	            else
     	                pass2.setCustomValidity("");
     	        }
     	