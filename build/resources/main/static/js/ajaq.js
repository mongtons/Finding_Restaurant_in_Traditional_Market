/**
 * Ajax Quick - Quick access to DB
 * @param {string} target Target URL
 * @param {Object} Data Object type of sending data
 * @returns {AjaqObject} Ajaq result data { "status": true, "result": data };
 */
 function ajaq(target, Data = null) {
    let result;
    $.ajax({
        url: target,
        type: "get",
        dataType: 'json',
        async: false,
        data: Data,
        success: function (data) {
            result = { "status": true, "result": data };
        },
        error: function (err) {
            result = { "status": true, "message": err };
        }
    });
    return result;
}