/* custom behavior */
(function  () {
  var contents = document.getElementsByClassName('content');
	var link = function  () {
			var a = document.createElement('a');
			a.href = "https://twitter.com/numa08";
			a.innerText = "@numa08";
			var div = document.createElement('div');
			div.style.cssText = "float:left";
			div.appendChild(a);
			return div;
		};
 
	var footer = function(){
			var content = document.createElement('div');
			content.style.cssText = "text-align:right";
			content.appendChild(link());
			return content;
		};
 
	for (var i = contents.length - 1; i >= 0; i--) {
		console.log(i);
		contents[i].appendChild(footer());
	};
})();