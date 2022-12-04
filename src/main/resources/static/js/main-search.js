$('documnet').ready(() => {
    // alert('Hello')
    const searchBtn = document.getElementById('search-btn');
    const searchInput = document.getElementById('search-input');
    const searchForm = document.getElementById('search-form');


    searchBtn.addEventListener('click', () => {
        searchForm.submit()
    })


    searchInput.addEventListener('keyup', (e) => {
        if(e.key == 'Enter') {
            searchForm.submit()
        }
    })
})