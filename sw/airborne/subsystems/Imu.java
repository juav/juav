package sw.airborne.subsystems;

public class Imu {
	
	public static ImuState imu = new ImuState();
	public static ImuFloat imuf = new ImuFloat();
	
	public static final int IMU_BODY_TO_IMU_PHI = 0;
	public static final int IMU_BODY_TO_IMU_THETA = 0;
	public static final int IMU_BODY_TO_IMU_PSI = 0;
	
	public static final int IMU_GYRO_P_NEUTRAL = 0;
	public static final int IMU_GYRO_Q_NEUTRAL = 0;
	public static final int IMU_GYRO_R_NEUTRAL = 0;

	public static final int IMU_ACCEL_X_NEUTRAL = 0;
	public static final int IMU_ACCEL_Y_NEUTRAL = 0;
	public static final int IMU_ACCEL_Z_NEUTRAL = 0;
	
	public static void imu_init(){
//		#ifdef IMU_POWER_GPIO
//		  gpio_setup_output(IMU_POWER_GPIO);
//		  IMU_POWER_GPIO_ON(IMU_POWER_GPIO);
//		#endif
		
		 /* initialises neutrals */
		  RATES_ASSIGN(imu.gyro_neutral,  IMU_GYRO_P_NEUTRAL,  IMU_GYRO_Q_NEUTRAL,  IMU_GYRO_R_NEUTRAL);

		  VECT3_ASSIGN(imu.accel_neutral, IMU_ACCEL_X_NEUTRAL, IMU_ACCEL_Y_NEUTRAL, IMU_ACCEL_Z_NEUTRAL);
		  //VECT3_ASSIGN(imu.mag_neutral,   IMU_MAG_X_NEUTRAL,   IMU_MAG_Y_NEUTRAL,   IMU_MAG_Z_NEUTRAL);
		  INT_VECT3_ZERO(imu.mag_neutral);
		  
	}
	
	public static void ImuScaleAccel(ImuState _imu){
//		 VECT3_COPY(_imu.accel_prev, _imu.accel);				
//		    _imu.accel.x = ((_imu.accel_unscaled.x - _imu.accel_neutral.x)*IMU_ACCEL_X_SIGN*IMU_ACCEL_X_SENS_NUM)/IMU_ACCEL_X_SENS_DEN; 
//		    _imu.accel.y = ((_imu.accel_unscaled.y - _imu.accel_neutral.y)*IMU_ACCEL_Y_SIGN*IMU_ACCEL_Y_SENS_NUM)/IMU_ACCEL_Y_SENS_DEN; 
//		    _imu.accel.z = ((_imu.accel_unscaled.z - _imu.accel_neutral.z)*IMU_ACCEL_Z_SIGN*IMU_ACCEL_Z_SENS_NUM)/IMU_ACCEL_Z_SENS_DEN; 
	}
	
	public static void ImuScaleGyro(){
		
	}
	
	public static void ImuScaleMag(){
		
	}
}