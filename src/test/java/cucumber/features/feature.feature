Feature: Weather API

  @Weather
  Scenario Outline: Weather API - Conditions
    Given I want to make an API call "<API_Call>"
    When I receive results
    Then I receive condition results
    Examples: :
  | API_Call |
  |http://api.wunderground.com/api/215e564cbbcf82d2/conditions/q/CA/San_Francisco.json|

  @Weather
  Scenario Outline: Weather API - Alerts
    Given I want to make an API call "<API_Call>"
    When I receive results
    Then I receive alert results
    Examples: :
  | API_Call |
  |http://api.wunderground.com/api/215e564cbbcf82d2/alerts/q/IA/Des_Moines.json|
  |http://api.wunderground.com/api/215e564cbbcf82d2/alerts/q/zmw:00000.1.16172.json |

  @Weather
  Scenario Outline: Weather API - Almanac
    Given I want to make an API call "<API_Call>"
    When I receive results
    Then I receive almanac results
    Examples: :
  | API_Call |
  |http://api.wunderground.com/api/215e564cbbcf82d2/almanac/q/CA/San_Francisco.json|

  @Weather
  Scenario Outline: Weather API - Astronomy
    Given I want to make an API call "<API_Call>"
    When I receive results
    Then I receive astronomy results
    Examples: :
  | API_Call |
  |http://api.wunderground.com/api/215e564cbbcf82d2/astronomy/q/Australia/Sydney.json|

  @Weather
  Scenario Outline: Weather API - Hurricane
    Given I want to make an API call "<API_Call>"
    When I receive results
    Then I receive hurricane results
    Examples: :
  | API_Call |
  |http://api.wunderground.com/api/215e564cbbcf82d2/currenthurricane/view.json|

  @Weather
  Scenario Outline: Weather API - Radar_GIF
    Given I want to make an API call "<API_Call>"
    Then I receive a gif
    Examples: :
    | API_Call |
    |http://api.wunderground.com/api/215e564cbbcf82d2/radar/q/KS/Topeka.gif?width=280&height=280&newmaps=1|
    |http://api.wunderground.com/api/215e564cbbcf82d2/animatedradar/q/MI/Ann_Arbor.gif?newmaps=1&timelabel=1&timelabel.y=10&num=5&delay=50|
    |http://api.wunderground.com/api/215e564cbbcf82d2/radar/image.gif?maxlat=42.35&maxlon=-109.311&minlat=39.27&minlon=-114.644&width=600&height=480&newmaps=1|
    |http://api.wunderground.com/api/215e564cbbcf82d2/radar/image.gif?centerlat=38&centerlon=-96.4&radius=100&width=280&height=280&newmaps=1|
