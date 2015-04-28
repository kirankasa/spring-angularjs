var myApp = angular.module('myApp',['ngRoute']);

myApp.config(['$routeProvider', function ($routeProvider) {

    $routeProvider.when('/employee', {
        templateUrl: 'templates/employee.html',
        controller: EmployeeController
    });


    $routeProvider.when('/student', {
        templateUrl: 'templates/student.html',
        controller: StudentController
    });

    $routeProvider.otherwise({redirectTo: '/employee'});
}]);