var NodeGeocoder = require('node-geocoder');
 
var options = {
  provider: 'opencage',
 
  // Optional depending on the providers
  httpAdapter: 'https', // Default
  apiKey: '4165bd968c4740359a234e0c33f75734', // for Mapquest, OpenCage, Google Premier
  formatter: null         // 'gpx', 'string', ...
};
 
var geocoder = NodeGeocoder(options);
 
// Using callback
geocoder.geocode('Pune India', function(err, res) {

  console.log(err);
  console.log(res);
});