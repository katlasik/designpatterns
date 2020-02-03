package pl.workshop.decorator.sensors;

interface AveragingSensorSource extends SensorSource {

   double average(int n);

}
