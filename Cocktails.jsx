import './Cocktails.css'

const Cocktails = (props) => {
    console.log(props)
    return(
        
        <div className='Box'>

            <div className='Portada'>
                <h1 className='Name'>{props.searchValue.strDrink}</h1>
                <h3 className='Category'>{props.searchValue.strCategory}</h3>
                <img src={props.searchValue.strDrinkThumb} alt="" />
            </div>

            <div className='Information'>

                <div className='Ingredient'>
                    <h3>Ingredients</h3>
                    <p>{props.searchValue.strIngredient2}</p>
                    <p>{props.searchValue.strIngredient3}</p>
                    <p>{props.searchValue.strIngredient4}</p>
                    <p>{props.searchValue.strIngredient1}</p>
                </div>

                <div className='Measure'>
                    <h3>Measure</h3>
                    <p>{props.searchValue.strMeasure1}</p>
                    <p>{props.searchValue.strMeasure2}</p>
                    <p>{props.searchValue.strMeasure3}</p>
                    <p>{props.searchValue.strMeasure4}</p>
                </div>
                
                <div className='Instructions'>
                    <h3>Instructions</h3>
                    <p className='Instructions'>{props.searchValue.strInstructions}</p>
                </div>


            </div>


        </div>
    )
}

export default Cocktails;