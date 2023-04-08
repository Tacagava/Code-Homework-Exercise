import './App.css';
import axios from 'axios';
import { useEffect, useState } from 'react';
import Cocktails from './Components/Cocktails/Cocktails';
import { Header } from './Components/Header/Header';
import { Footer } from  './Components/Footer/Footer';



function App() {

  const [SearchData, setSearchData] = useState(null);

  useEffect(() => {
    getCocktailsData();
  }, [])

  const getCocktailsData = async () => {
    const { data } = await axios.get('www.thecocktaildb.com/api/json/v1/1/lookup.php?i=11007');
    console.log(data, "Data");
    setSearchData(data);
  }


  return (
    <div className="App">

      <Header/>

      <section className='SecondPart'>
        {
        SearchData && SearchData.drinks.map((searchValue) => {
            return <Cocktails searchValue={searchValue} />
          })
        }
      </section>

      <Footer/>


    </div>
  );
}

export default App;
