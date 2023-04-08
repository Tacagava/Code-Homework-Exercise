import './Footer.css';
import React, { Component } from 'react';
import { FaHeart } from "react-icons/fa";
export const Footer = () => {

    return(
        <footer>

            <div className='Izquierda'>
                <h5>About</h5>
                <h5>Support</h5>
                <h5>Opinions</h5>
            </div>
            <div className='Derecha'>
                <h5>Number: (604) 350 8340 </h5>
                <h5>Email: Tatygarcia833@gmail.com</h5>
                <h5>Direcction: 2028 West 29th Avenue</h5>
            </div>

        </footer>
    )
}

class Like extends Component {
    render() {
      return (
        <div>
        <FaHeart className='yellow'/>
      </div>
  
      )
    }
  }
  
  export default Like;