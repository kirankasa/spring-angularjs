myApp.controller('EmployeeController', EmployeeController);

function EmployeeController($scope,$http) {

    $scope.fetchEmployee= function(){
        $http.get('employee').success(function(employeeList){
            $scope.employees = employeeList;
        });
    }

    $scope.addEmployee= function(newEmployee){
        $http.post('employee',newEmployee).success(function() {
            $scope.fetchEmployee();
        });
        $scope.employee={};
    }

    $scope.removeEmployee= function(employee){
        $http.delete('employee/'+employee.id).success(function() {
            $scope.fetchEmployee();
        });
    }

    $scope.fetchEmployee();
}