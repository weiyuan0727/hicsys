function test() {
    alert("hello");

}

function getcode() {
    $.ajax({
        type:"get",
        url: "http://localhost:6061/oauth/authorize?" +
            "client_id=client_2" +
            "&redirect_uri=https://www.baidu.com/" +
            "&response_type=code" +
            "&scope=all",
        success: function (data) {
            alert(data);

        }
    });

}