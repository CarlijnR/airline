$.get("api/airplane"), function(data) {
    for (var i=0; i < data.length; i++) {
        $('#airplaneList').append(
        '<tr>' +
        '<td>' + data[i].id + '</td>' +
        '</tr>'
        )

    }
}