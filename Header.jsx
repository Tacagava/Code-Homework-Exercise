import './Header.css';
import logo from './logo.png';

export const Header = () => {

    return(
        <header>
            <div className='Nav'>
                <img src={logo} alt="logo de pagina"/>
                <h5>Home</h5>
                <h5>About</h5>
                <h5>Cocktails</h5>
                <h5>Contact</h5>
            </div>
            <img src="https://images.unsplash.com/photo-1514361726087-38371321b5cd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80" alt="" />

        </header>
    )
}