(function() {
	

		
		var app = angular.module('translator', ['ngCookies']);
		
		
		app.factory('formTranslatorCache', function($cacheFactory) {
			return $cacheFactory('formTranslatorCache');
			});
		
		app.controller('FormController', ['$http', 'formTranslatorCache', function($http, formTranslatorCache){			
			// INIT
			// read model data from server
			var controller = this;			
			
			$http.get('./i485.html', {params: { getJsonForm: "" }}).success(function(data, status, headers, config) {
				controller.form = data;				
				// read saved cookies data if any are available
				var cookieDataPartOne = formTranslatorCache.get('formI485.partOne');
				if(typeof cookieDataPartOne != 'undefined' ){
					controller.form.partOne = cookieDataPartOne;					
				}
				var cookieDataPartTwo = formTranslatorCache.get('formI485.partTwo');
				if(typeof cookieDataPartTwo != 'undefined' ){
					controller.form.partTwo = cookieDataPartTwo;					
				}
				var cookieDataPartThree = formTranslatorCache.get('formI485.partThree');
				if(typeof cookieDataPartThree != 'undefined' ){
					controller.form.partThree = cookieDataPartThree;					
				}
				var cookieDataPartFour = formTranslatorCache.get('formI485.partFour');
				if(typeof cookieDataPartFour != 'undefined' ){
					controller.form.partFour = cookieDataPartFour;					
				}
				
			  });
			
			// end of INIT			
			
			// save data to cookies for later use
			this.saveToCookies = function(){
				formTranslatorCache.remove('formI485.partOne');
				formTranslatorCache.remove('formI485.partTwo');
				formTranslatorCache.remove('formI485.partThree');
				formTranslatorCache.remove('formI485.partFour');
				formTranslatorCache.put('formI485.partOne', this.form.partOne);
				formTranslatorCache.put('formI485.partTwo', this.form.partTwo);
				formTranslatorCache.put('formI485.partThree', this.form.partThree);
				formTranslatorCache.put('formI485.partFour', this.form.partFour);
			};

		
		}]);
		
		
})();