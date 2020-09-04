$(document).ready(function(){
    $("#submitInputs").click(function(){


        var name = $("#name").val();
        var age = $("#age").val();
        var nationality = $("#nationality").val();
        var gender = $("input[name='gender']:checked").val();
        var url = "http://localhost:8081/submit/" + name + "/" + age + "/" + nationality + "/" + gender;


        if(age > 150) {
            $("#message").text("You are not that old, please edit age");
            $("#quote").text("");
            return false;
        }

        $.ajax({
            url: url
        }).then(function(data) {
                $("#message").text(data.message);
                $("#quote").text(data.quote);
        });

        return false;

    });
});


