myApp.controller('StudentController', StudentController);

function StudentController($scope,$http) {

    $scope.fetchStudent= function(){
        $http.get('student').success(function(studentList){
            $scope.students = studentList;
        });
    }

    $scope.addStudent= function(newStudent){
        $http.post('student',newStudent).success(function() {
            $scope.fetchStudent();
        });
        $scope.student={};
    }

    $scope.removeStudent= function(student){
        $http.delete('student/'+student.id).success(function() {
            $scope.fetchStudent();
        });
    }

    $scope.fetchStudent();
}