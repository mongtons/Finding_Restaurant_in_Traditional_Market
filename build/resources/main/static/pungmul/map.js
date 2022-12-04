var container = document.getElementById('map');
var options = {
    center: new kakao.maps.LatLng(37.8665915, 127.7186952),
    level: 1
};

var map = new kakao.maps.Map(container, options);

// $(document).ready(() => {

// });

kakao.maps.event.addListener(map, 'move', () => {
    console.log(mpa.getCenter())
})