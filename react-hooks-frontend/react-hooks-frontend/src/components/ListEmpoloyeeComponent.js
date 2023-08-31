import React, { useEffect, useState } from 'react'
import EmployeeService from '../services/EmployeeService'

const ListEmpoloyeeComponent = () => {

    const [employee, setEmployee] = useState([])

    useEffect(() => {
        EmployeeService.getAllEmployees().then((response) => {
            setEmployee(response.data)
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    }, [])

  return (
    <div className="container">
        <h2 className='text-center'>List Employee</h2>
        <table className='table table-bordered table-stripped'>
            <thead>
                <th>Employee Id</th>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email Id</th>
            </thead>
            <tbody>
                {
                    //JSX Code
                    employee.map(
                        employee =>
                        <tr key = {employee.id}>
                            <td> {employee.id} </td>
                            <td> {employee.firstName} </td>
                            <td> {employee.lastName} </td>
                            <td> {employee.email} </td>
                        </tr>
                    )
                }
            </tbody>

        </table>
    </div>
  )
}

export default ListEmpoloyeeComponent
