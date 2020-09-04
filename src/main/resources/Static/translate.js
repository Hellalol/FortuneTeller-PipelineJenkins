$(document).ready(function(){
    $("#submitInputs").click(function(){


        var name = $("#name").val();
        var age = $("#age").val();
        var nationality = $("#nationality").val();
        var gender = $("#gender").val();
        var url = "http://localhost:8081/submit/" + name + "/" + age + "/" + nationality + "/" + gender;


        $.ajax({
            url: url
        }).then(function(data) {
                $("#message").text(data.message);
                $("#quote").text(data.quote);
        });

        return false;

    });
});