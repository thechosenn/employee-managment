import './App.scss';
import EmployeeList from './components/Employee/EmployeeList';
import { useAuth } from './Contexts/AuthContext'
import { useEffect, useState } from 'react'
import { apiInstance } from './utils/Axios'
import Header from './components/Header'

function App() {

  const { isLoggedIn, login } = useAuth() 

  

  return (
    <>
      <Header/>
      <div className='custom__container'>
        {isLoggedIn?(
          <>
            <EmployeeList/>
          </>
          
        ):(
          <h1>You should Login!!</h1>
        )}
        
      </div>
</>
  );
}

export default App;
