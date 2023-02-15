const Taty = "3945eac77639fce12e6e8c4b2efbd198";

const webUI = (orignalObject) => {
    const mainContainer = document.getElementById("main-container");
    mainContainer.innerHTML = "";
  orignalObject.results.forEach(
      ({
        title,
        poster_path,
        release_date,
        overview,
        backdrop_path,
        popularity,
        vote_count,
        vote_average,
      }) => {
        mainContainer.innerHTML += `
          <section class="movieAll">
              <h1>${title}</h1>
              <img src="https://image.tmdb.org/t/p/w500/${poster_path}" alt="The ${title}'s poster">
              <p>Release Date: ${release_date}</p>
              <p>Overview: ${overview}</p>
              <p>Popularity: ${popularity}</p>
              <p>Vote Count: ${vote_count}</p>
              <p>Vote Average: ${vote_average}</p>
          </section>
      `;
      }
    );
  };
  
const fetchTMDB = async () => {
    try {
      const fetchData = await fetch(
        `https://api.themoviedb.org/3/movie/now_playing?api_key=${Taty}&language=en-US&page=1`
      );
      const jsonData = await fetchData.json();
      const movieData = jsonData;
      console.log(movieData);
  
      webUI(movieData);
    } catch (error) {
      console.log(error);
    }
  };
  
  fetchTMDB();
  const fetchDataOnSearch = async () => {
    const keyword = document.getElementById('search-keyword');
    try {
      const fetchData = await fetch(
        `https://api.themoviedb.org/3/search/movie?query=${keyword.value}&api_key=${Taty}&language=en-US&page=1`
      );
      const jsonData = await fetchData.json();
      const movieData = jsonData;
      console.log(movieData);
  
      webUI(movieData);
    } catch (error) {
      console.log(error);
    }

  }

