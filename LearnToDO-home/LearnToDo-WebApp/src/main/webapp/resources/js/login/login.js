var app = angular.module('loginLearnToDo', ['ngAnimate']);
app.controller('loginController', function($scope ,$http) {
	$scope.LoginDTO='';
	 var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
     var mediumRegex = new RegExp("^(((?=.*[a-z])(?=.*[A-Z]))|((?=.*[a-z])(?=.*[0-9]))|((?=.*[A-Z])(?=.*[0-9])))(?=.{6,})");
     $scope.showModal=true;
     $scope.analyze = function(value) {
         if(strongRegex.test(value)) {
        	 //strong
         } else if(mediumRegex.test(value)) {
        	// medium strong
         } else {
        	 //Not acceptable
         }
     };
     //This method will be used for signing
	$scope.getSignIn=function(){
		if($scope.loginform.$valid){
			$scope.LoginDTO.type="login";
			$scope.LoginDTO.lgnUserName=null;
			var res = $http.post('/login',$scope.LoginDTO);
			res.success(function(data, status, headers, config) {
				$scope.message = data;
			});
			res.error(function(data, status, headers, config) {
				alert( "failure message: " + JSON.stringify({data: data}));
			});		
		}
	}
	
    $scope.registernewUser=function(){
    	if($scope.loginform.$valid){
    	$scope.initPage=$scope.showModal
        $scope.showModal = !$scope.showModal;
    	}
	}
    //This method is used to register new user
    $scope.registerUser=function(){
    	
    }
});
app.directive('modal', function () {
    return {
      template: '<div class="login-box animated fadeInUp">' + 
          '<div class="modal-dialog">' + 
            '<div class="modal-content">' + 
              '<div class="box-header">' +  
                '<h2 class="modal-title">{{ title }}</h2>' + 
              '</div>' + 
              '<div class="modal-body" ng-transclude></div>' + 
            '</div>' + 
          '</div>' + 
        '</div>',
      restrict: 'E',
      transclude: true,
      replace:true,
      scope:true,
      link: function postLink(scope, element, attrs) {
        scope.title = attrs.title;
      }
    };
  });