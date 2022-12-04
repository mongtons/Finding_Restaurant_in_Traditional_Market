$(document).ready(() => {
    const url = new URL(location.href)
    const urlParams = url.searchParams;

    const value = urlParams.get('value');

    if (value != null) {
        // ===================== LOAD DATA =====================
        // console.log(value) 

        const formData = new FormData();
        formData.append("keyword", value);
        
        axios
        .post('http://localhost:8080/api/search', formData)
        .then((data) => {
            history.push("/search/" + type.type);
            // window.location.reload();
            console.log(data);
        })
        .catch((error) => {
            console.log(error);
            history.push("/search/" + type.type);
        });
        // ===================== LOAD DATA =====================

        document.title = value + ' 검색 결과 | 춘재'

        const suggestString = document.getElementById('top-title');
        const values = Array.from(suggestString.querySelectorAll('.value'));
        values.forEach((searchValue) => {
            console.log(searchValue)
            searchValue.innerHTML = value; 
        })
    }

    const searchBtn = document.getElementById('search-btn');
    const searchInput = document.getElementById('search-input');


    searchBtn.addEventListener('click', () => {
        search();
    })


    searchInput.addEventListener('keyup', (e) => {
        if(e.key == 'Enter') {
            search()
        }
    })
});

function search() {
    const input = document.getElementById('search-input');
    location.href = './?value=' + input.value
}