import React, { useState, useEffect } from 'react';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';
import './index.css'
import { apiInstance } from '../../utils/Axios';

function EmployeeList() {
    const [employees, setEmployees] = useState([]);

    useEffect(() => {
        fetchEmployees();
    }, []);

    const fetchEmployees = async () => {
        try {
            const response = await apiInstance.
            setEmployees(response.data);
        } catch (error) {
            console.error('Error fetching employees', error);
        }
    };

    const handleDelete = async (employeeId) => {
        try {
            await axios.delete(`/api/employees/${employeeId}`);
            fetchEmployees(); // Refresh the list after deletion
        } catch (error) {
            console.error('Error deleting employee', error);
        }
    };

    // Placeholder functions for create and update actions
    const handleCreate = () => {
        console.log("Create new employee");
        // Implementation for creating a new employee
    };

    const handleUpdate = (employeeId) => {
        console.log(`Update employee with ID: ${employeeId}`);
        // Implementation for updating an existing employee
    };

    return (
        <>
        <div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col">Day</th>
            <th scope="col">Article Name</th>
            <th scope="col">Author</th>
            <th scope="col">Shares</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">1</th>
            <td>adil</td>
                            <td>jarid</td>
                            <td>A51313</td>
                            <td>MAR</td>
            <td>
              <button type="button" class="btn btn-primary"><i class="far fa-eye"></i></button>
              <button type="button" class="btn btn-success"><i class="fas fa-edit"></i></button>
            <button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button>
            </td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>saad</td>
                            <td>jarid</td>
                            <td>A4113</td>
                            <td>MAR</td>
                            <td>IT</td>
            <td>
              <button type="button" class="btn btn-primary"><i class="far fa-eye"></i></button>
              <button type="button" class="btn btn-success"><i class="fas fa-edit"></i></button>
            <button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button>
            </td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td>moncef</td>
                            <td>sqx</td>
                            <td>A51773</td>
                            <td>MAR</td>
                            <td>Finance</td>
            <td>
              <button type="button" class="btn btn-primary"><i class="far fa-eye"></i></button>
              <button type="button" class="btn btn-success"><i class="fas fa-edit"></i></button>
            <button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</div>
</>
    );
}

export default EmployeeList;
