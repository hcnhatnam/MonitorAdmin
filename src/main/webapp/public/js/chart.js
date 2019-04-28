$(function() {
  /* ChartJS
   * -------
   * Data and config for chartjs
   */
  'use strict';

  var areaData = {
    labels: ["2013", "2014", "2015", "2016", "2017","2017"],
    datasets: [{
      label: '# of Request',
      data: [12, 19, 3, 5, 2,7, 3],
      backgroundColor: [
        'rgba(255, 99, 132, 0.2)',
      ],
      borderColor: [
        'rgba(255,99,132,1)',
      ],
      borderWidth: 1,
      fill: true, // 3: no fill
    }]
  };

  var areaOptions = {
    plugins: {
      filler: {
        propagate: true
      }
    }
  }

  if ($("#areaChart").length) {
    var areaChartCanvas = $("#areaChart").get(0).getContext("2d");
    var areaChart = new Chart(areaChartCanvas, {
      type: 'line',
      data: areaData,
      options: areaOptions
    });
  }
  var statisResult = /*[[${statisResult}]]*/ 'default';
  console.log(statisResult);
  labelStat=[]
  dataStat=[]
  for (let index = 0; index < statisResult.length; index++) {
    timeReq=statisResult[index].timeReq
    labelStat.push(temp1.timeReq.substr(8,2)+"-"+temp1.timeReq.substr(5,2))
    dataStat.push(statisResult[index].numReq)
  }
});