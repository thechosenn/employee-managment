import React from 'react'
import logout_logo from '../../assets/logout.png'
import Login from '../Login'
import Register from '../Register'
import './style.scss'
import { useAuth } from '../../Contexts/AuthContext'

const Header = () => {
  const { isLoggedIn, logout } = useAuth()

  return (
    <div className='header container'>
        <div className='header__logo'>EMPLOYEE<span>MANAGEMENT</span></div>
        {!isLoggedIn ? (
          <div className='header__auth'>
            <Register/>
            <Login/>
          </div>
        ):(
          <div className='header__logout'>
            <img alt="Logout" className='header__logout-logo' src={logout_logo} onClick={logout}/>
          </div>
        )}
    </div>
  )
}

export default Header
