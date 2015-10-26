package ods.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the [MESSAGE] database table.
 * 
 */
@Entity
@Table(name="[MESSAGE]")
@NamedQuery(name="MessageLatLon.findAll", query="SELECT m FROM MessageLatLon m")
public class MessageLatLon implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@Column(name="MESSAGE_ID", unique=true, nullable=false)
	private Long messageId;

	@Column(name="ACCUMULATED_MILES", precision=10, scale=2)
	private BigDecimal accumulatedMiles;

	@Column(name="ALARM")/*Short*/
	private Short alarm;

	@Column(name="ANALOG_1")
	private Long analog1;

	@Column(name="ANALOG_2")
	private Long analog2;

	@Column(name="ANALOG_3")
	private Long analog3;

	@Column(name="AUX", precision=6, scale=2)
	private BigDecimal aux;

	@Column(name="BATT_CAPACITY_MAX", precision=6, scale=2)
	private BigDecimal battCapacityMax;

	@Column(name="BATT_CAPACITY_MIN", precision=6, scale=2)
	private BigDecimal battCapacityMin;

	@Column(name="BATT_VOLTS", precision=3, scale=2)
	private BigDecimal battVolts;

	@Column(name="BEARING_FROM_NEAREST_GEOPOINT", precision=4, scale=1)
	private BigDecimal bearingFromNearestGeopoint;

	@Column(name="BEARING_FROM_NEAREST_TOWN", precision=4, scale=1)
	private BigDecimal bearingFromNearestTown;

	@Column(name="BUS_VOLTAGE", precision=6, scale=2)
	private BigDecimal busVoltage;

	@Column(name="BUS_VOLTAGE_74V", precision=6, scale=2)
	private BigDecimal busVoltage74v;

	@Column(name="CAP_VOLTS", precision=3, scale=2)
	private BigDecimal capVolts;

	@Column(name="CAP_VOLTS_MAX", precision=4, scale=2)
	private BigDecimal capVoltsMax;

	@Column(name="CAP_VOLTS_MIN", precision=4, scale=2)
	private BigDecimal capVoltsMin;

	@Column(name="CORE_FCS")
	private Integer coreFcs;

	@Column(name="COUNTRY", length=2)
	private String country;

	@Column(name="COURSE")
	private Short course;

	@Column(name="D0")
	private Short d0;

	@Column(name="D1")
	private Short d1;

	@Column(name="D10")
	private Short d10;

	@Column(name="D11")
	private Short d11;

	@Column(name="D2")
	private Short d2;

	@Column(name="D3")
	private Short d3;

	@Column(name="D4")
	private Short d4;

	@Column(name="D5")
	private Short d5;

	@Column(name="D6")
	private Short d6;

	@Column(name="D7")
	private Short d7;

	@Column(name="D8")
	private Short d8;

	@Column(name="D9")
	private Short d9;

	@Column(name="DECELERATION_ID")
	private Integer decelerationId;

	@Column(name="DECODE_DTTM")
	private Timestamp decodeDttm;

	@Column(name="DEWPOINT")
	private Integer dewpoint;

	@Column(name="DIGITAL_1", length=6)
	private String digital1;

	@Column(name="DIGITAL_2", length=6)
	private String digital2;

	@Column(name="DIGITAL_3", length=6)
	private String digital3;

	@Column(name="DIGITAL_4", length=6)
	private String digital4;

	@Column(name="DISTANCE_FROM_NEAREST_GEOPOINT", precision=6, scale=2)
	private BigDecimal distanceFromNearestGeopoint;

	@Column(name="DISTANCE_FROM_NEAREST_TOWN", precision=6, scale=2)
	private BigDecimal distanceFromNearestTown;

	@Column(name="DIVISION_ID")
	private Integer divisionId;

	@Column(name="ELEVATION")
	private Short elevation;

	@Column(name="ENGINE_RUN_STATUS")
	private Short engineRunStatus;

	@Column(name="ENGINE_RUN_TIME", precision=8, scale=2)
	private BigDecimal engineRunTime;

	@Column(name="FAULT_CODE")
	private Short faultCode;

	@Column(name="FIRMWARE")
	private Integer firmware;

	@Column(name="FIRMWARE_BUILD")
	private Short firmwareBuild;

	@Column(name="FIRMWARE_FCS")
	private Integer firmwareFcs;

	@Column(name="FIX_TYPE", length=6)
	private String fixType;

	@Column(name="FLAG_0")
	private Integer flag0;

	@Column(name="FLAG_1")
	private Integer flag1;

	@Column(name="FLAG_2")
	private Integer flag2;

	@Column(name="FLAG_3")
	private Integer flag3;

	@Column(name="FLAG_4")
	private Integer flag4;

	@Column(name="FLAG_5")
	private Integer flag5;

	@Column(name="FLAG_6")
	private Integer flag6;

	@Column(name="FLAG_7")
	private Integer flag7;

	@Column(name="FOTA_FCS")
	private Integer fotaFcs;

	@Column(name="FUEL_A2D", precision=8, scale=2)
	private BigDecimal fuelA2d;

	@Column(name="FUEL_LEVEL", precision=6, scale=2)
	private BigDecimal fuelLevel;

	@Column(name="GEOFENCE", length=50)
	private String geofence;

	@Column(name="GEOGRAPHY", length=149)
	private String geography;

	@Column(name="GOLD_FCS")
	private Integer goldFcs;

	@Column(name="GPS_DTTM")
	private Timestamp gpsDttm;

	@Column(name="GPS_OVERLAY")
	private Boolean gpsOverlay;

	@Column(name="GPS_RUN_TIME")
	private Integer gpsRunTime;

	@Column(name="GPS_SATELLITE_IN_VIEW")
	private Short gpsSatelliteInView;

	@Column(name="HDOP", precision=4, scale=1)
	private BigDecimal hdop;

	@Column(name="HPE")
	private Short hpe;

	@Column(name="HTUA", length=50)
	private String htua;

	@Column(name="HUMIDITY")
	private Integer humidity;

	@Column(name="IDLE_TIME", precision=6, scale=2)
	private BigDecimal idleTime;

	@Column(name="IMPACT_DURATION")
	private Short impactDuration;

	@Column(name="IMPACT_ID")
	private Integer impactId;

	@Column(name="IMPACT_RUN_TIME")
	private Integer impactRunTime;

	@Column(name="LATITUDE", precision=9, scale=6)
	private BigDecimal latitude;

	@Column(name="LOCAL_DTTM")
	private Timestamp localDttm;

	@Column(name="LOCAL_DTTM_TZ", length=6)
	private String localDttmTz;

	@Column(name="LongITUDE", precision=9, scale=6)
	private BigDecimal Longitude;

	@Column(name="MAX_SPEED", precision=4, scale=1)
	private BigDecimal maxSpeed;

	@Column(name="MESSAGE_IN_QUEUE")
	private Short messageInQueue;

	@Column(name="MESSAGE_TYPE", length=50)
	private String messageType;

	@Column(name="MESSAGE_TYPE_ID", nullable=false)
	private Integer messageTypeId;

	@Column(name="MILE_FROM_PREVIOUS_MESSAGE", precision=8, scale=2)
	private BigDecimal mileFromPreviousMessage;

	@Column(name="NEAREST_GEOPOINT", length=302)
	private String nearestGeopoint;

	@Column(name="NEAREST_RR", length=255)
	private String nearestRr;

	@Column(name="NEAREST_TOWN", length=50)
	private String nearestTown;

	@Column(name="OBSERVATION_DTTM")
	private Timestamp observationDttm;

	@Column(name="ODOMETER", precision=10, scale=2)
	private BigDecimal odometer;

	@Column(name="PHOTO")
	private Long photo;

	@Column(name="RADIO_RUN_TIME")
	private Integer radioRunTime;

	@Column(name="RAILYARD", length=50)
	private String railyard;

	@Column(name="RECEIVE_DTTM")
	private Timestamp receiveDttm;

	@Column(name="RELAY_1", length=6)
	private String relay1;

	@Column(name="RELAY_2", length=6)
	private String relay2;

	@Column(name="[RESET]")
	private Short reset;

	@Column(name="RF_MESSAGE_TYPE_ID")
	private Long rfMessageTypeId;

	@Column(name="RF_RUN_TIME")
	private Integer rfRunTime;

	@Column(name="RSSI")
	private Short rssi;

	@Column(name="RUN_TIME")
	private Integer runTime;

	@Column(name="S1_ANALOG", precision=12, scale=2)
	private BigDecimal s1Analog;

	@Column(name="S1_ANALOG_A2D", length=6)
	private String s1AnalogA2d;

	@Column(name="S1_AP_ID", length=20)
	private String s1ApId;

	@Column(name="S1_AP_NAME", length=255)
	private String s1ApName;

	@Column(name="S1_DIGITAL")
	private Short s1Digital;

	@Column(name="S1_DIGITAL_2")
	private Short s1Digital2;

	@Column(name="S1_DIGITAL_2_CHANGE")
	private Short s1Digital2Change;

	@Column(name="S1_DIGITAL_CHANGE")
	private Short s1DigitalChange;

	@Column(name="S1_LOW_VOLTAGE")
	private Short s1LowVoltage;

	@Column(name="S1_MESSAGE_TYPE", length=50)
	private String s1MessageType;

	@Column(name="S1_POWER_SOURCE")
	private Short s1PowerSource;

	@Column(name="S1_RF_RESERVED")
	private Integer s1RfReserved;

	@Column(name="S1_SERIAL_NUMBER", length=16)
	private String s1SerialNumber;

	@Column(name="S1_T_CHANGE")
	private Short s1TChange;

	@Column(name="S1_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s1Temperature;

	@Column(name="S1_TEMPERATURE_A2D", length=6)
	private String s1TemperatureA2d;

	@Column(name="S1_TX_DTTM")
	private Timestamp s1TxDttm;

	@Column(name="S1_UNIT_NAME", length=255)
	private String s1UnitName;

	@Column(name="S1_VOLTAGE", precision=4, scale=2)
	private BigDecimal s1Voltage;

	@Column(name="S1_X_TILT")
	private Short s1XTilt;

	@Column(name="S1_X_TILT_CHANGE")
	private Short s1XTiltChange;

	@Column(name="S1_X_TILT_DIGITAL")
	private Short s1XTiltDigital;

	@Column(name="S1_Y_TILT")
	private Short s1YTilt;

	@Column(name="S1_Y_TILT_CHANGE")
	private Short s1YTiltChange;

	@Column(name="S1_Y_TILT_DIGITAL")
	private Short s1YTiltDigital;

	@Column(name="S10_ANALOG", precision=12, scale=2)
	private BigDecimal s10Analog;

	@Column(name="S10_ANALOG_A2D", length=6)
	private String s10AnalogA2d;

	@Column(name="S10_DIGITAL")
	private Short s10Digital;

	@Column(name="S10_DIGITAL_2")
	private Short s10Digital2;

	@Column(name="S10_DIGITAL_2_CHANGE")
	private Short s10Digital2Change;

	@Column(name="S10_DIGITAL_CHANGE")
	private Short s10DigitalChange;

	@Column(name="S10_LOW_VOLTAGE")
	private Short s10LowVoltage;

	@Column(name="S10_POWER_SOURCE")
	private Short s10PowerSource;

	@Column(name="S10_RF_RESERVED")
	private Integer s10RfReserved;

	@Column(name="S10_SERIAL_NUMBER", length=16)
	private String s10SerialNumber;

	@Column(name="S10_T_CHANGE")
	private Short s10TChange;

	@Column(name="S10_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s10Temperature;

	@Column(name="S10_TEMPERATURE_A2D", length=6)
	private String s10TemperatureA2d;

	@Column(name="S10_TX_DTTM")
	private Timestamp s10TxDttm;

	@Column(name="S10_VOLTAGE", precision=4, scale=2)
	private BigDecimal s10Voltage;

	@Column(name="S10_X_TILT")
	private Short s10XTilt;

	@Column(name="S10_X_TILT_CHANGE")
	private Short s10XTiltChange;

	@Column(name="S10_X_TILT_DIGITAL")
	private Short s10XTiltDigital;

	@Column(name="S10_Y_TILT")
	private Short s10YTilt;

	@Column(name="S10_Y_TILT_CHANGE")
	private Short s10YTiltChange;

	@Column(name="S10_Y_TILT_DIGITAL")
	private Short s10YTiltDigital;

	@Column(name="S2_ANALOG", precision=12, scale=2)
	private BigDecimal s2Analog;

	@Column(name="S2_ANALOG_A2D", length=6)
	private String s2AnalogA2d;

	@Column(name="S2_DIGITAL")
	private Short s2Digital;

	@Column(name="S2_DIGITAL_2")
	private Short s2Digital2;

	@Column(name="S2_DIGITAL_2_CHANGE")
	private Short s2Digital2Change;

	@Column(name="S2_DIGITAL_CHANGE")
	private Short s2DigitalChange;

	@Column(name="S2_LOW_VOLTAGE")
	private Short s2LowVoltage;

	@Column(name="S2_POWER_SOURCE")
	private Short s2PowerSource;

	@Column(name="S2_RF_RESERVED")
	private Integer s2RfReserved;

	@Column(name="S2_SERIAL_NUMBER", length=16)
	private String s2SerialNumber;

	@Column(name="S2_T_CHANGE")
	private Short s2TChange;

	@Column(name="S2_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s2Temperature;

	@Column(name="S2_TEMPERATURE_A2D", length=6)
	private String s2TemperatureA2d;

	@Column(name="S2_TX_DTTM")
	private Timestamp s2TxDttm;

	@Column(name="S2_VOLTAGE", precision=4, scale=2)
	private BigDecimal s2Voltage;

	@Column(name="S2_X_TILT")
	private Short s2XTilt;

	@Column(name="S2_X_TILT_CHANGE")
	private Short s2XTiltChange;

	@Column(name="S2_X_TILT_DIGITAL")
	private Short s2XTiltDigital;

	@Column(name="S2_Y_TILT")
	private Short s2YTilt;

	@Column(name="S2_Y_TILT_CHANGE")
	private Short s2YTiltChange;

	@Column(name="S2_Y_TILT_DIGITAL")
	private Short s2YTiltDigital;

	@Column(name="S3_ANALOG", precision=12, scale=2)
	private BigDecimal s3Analog;

	@Column(name="S3_ANALOG_A2D", length=6)
	private String s3AnalogA2d;

	@Column(name="S3_DIGITAL")
	private Short s3Digital;

	@Column(name="S3_DIGITAL_2")
	private Short s3Digital2;

	@Column(name="S3_DIGITAL_2_CHANGE")
	private Short s3Digital2Change;

	@Column(name="S3_DIGITAL_CHANGE")
	private Short s3DigitalChange;

	@Column(name="S3_LOW_VOLTAGE")
	private Short s3LowVoltage;

	@Column(name="S3_POWER_SOURCE")
	private Short s3PowerSource;

	@Column(name="S3_RF_RESERVED")
	private Integer s3RfReserved;

	@Column(name="S3_SERIAL_NUMBER", length=16)
	private String s3SerialNumber;

	@Column(name="S3_T_CHANGE")
	private Short s3TChange;

	@Column(name="S3_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s3Temperature;

	@Column(name="S3_TEMPERATURE_A2D", length=6)
	private String s3TemperatureA2d;

	@Column(name="S3_TX_DTTM")
	private Timestamp s3TxDttm;

	@Column(name="S3_VOLTAGE", precision=4, scale=2)
	private BigDecimal s3Voltage;

	@Column(name="S3_X_TILT")
	private Short s3XTilt;

	@Column(name="S3_X_TILT_CHANGE")
	private Short s3XTiltChange;

	@Column(name="S3_X_TILT_DIGITAL")
	private Short s3XTiltDigital;

	@Column(name="S3_Y_TILT")
	private Short s3YTilt;

	@Column(name="S3_Y_TILT_CHANGE")
	private Short s3YTiltChange;

	@Column(name="S3_Y_TILT_DIGITAL")
	private Short s3YTiltDigital;

	@Column(name="S4_ANALOG", precision=12, scale=2)
	private BigDecimal s4Analog;

	@Column(name="S4_ANALOG_A2D", length=6)
	private String s4AnalogA2d;

	@Column(name="S4_DIGITAL")
	private Short s4Digital;

	@Column(name="S4_DIGITAL_2")
	private Short s4Digital2;

	@Column(name="S4_DIGITAL_2_CHANGE")
	private Short s4Digital2Change;

	@Column(name="S4_DIGITAL_CHANGE")
	private Short s4DigitalChange;

	@Column(name="S4_LOW_VOLTAGE")
	private Short s4LowVoltage;

	@Column(name="S4_POWER_SOURCE")
	private Short s4PowerSource;

	@Column(name="S4_RF_RESERVED")
	private Integer s4RfReserved;

	@Column(name="S4_SERIAL_NUMBER", length=16)
	private String s4SerialNumber;

	@Column(name="S4_T_CHANGE")
	private Short s4TChange;

	@Column(name="S4_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s4Temperature;

	@Column(name="S4_TEMPERATURE_A2D", length=6)
	private String s4TemperatureA2d;

	@Column(name="S4_TX_DTTM")
	private Timestamp s4TxDttm;

	@Column(name="S4_VOLTAGE", precision=4, scale=2)
	private BigDecimal s4Voltage;

	@Column(name="S4_X_TILT")
	private Short s4XTilt;

	@Column(name="S4_X_TILT_CHANGE")
	private Short s4XTiltChange;

	@Column(name="S4_X_TILT_DIGITAL")
	private Short s4XTiltDigital;

	@Column(name="S4_Y_TILT")
	private Short s4YTilt;

	@Column(name="S4_Y_TILT_CHANGE")
	private Short s4YTiltChange;

	@Column(name="S4_Y_TILT_DIGITAL")
	private Short s4YTiltDigital;

	@Column(name="S5_ANALOG", precision=12, scale=2)
	private BigDecimal s5Analog;

	@Column(name="S5_ANALOG_A2D", length=6)
	private String s5AnalogA2d;

	@Column(name="S5_DIGITAL")
	private Short s5Digital;

	@Column(name="S5_DIGITAL_2")
	private Short s5Digital2;

	@Column(name="S5_DIGITAL_2_CHANGE")
	private Short s5Digital2Change;

	@Column(name="S5_DIGITAL_CHANGE")
	private Short s5DigitalChange;

	@Column(name="S5_LOW_VOLTAGE")
	private Short s5LowVoltage;

	@Column(name="S5_POWER_SOURCE")
	private Short s5PowerSource;

	@Column(name="S5_RF_RESERVED")
	private Integer s5RfReserved;

	@Column(name="S5_SERIAL_NUMBER", length=16)
	private String s5SerialNumber;

	@Column(name="S5_T_CHANGE")
	private Short s5TChange;

	@Column(name="S5_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s5Temperature;

	@Column(name="S5_TEMPERATURE_A2D", length=6)
	private String s5TemperatureA2d;

	@Column(name="S5_TX_DTTM")
	private Timestamp s5TxDttm;

	@Column(name="S5_VOLTAGE", precision=4, scale=2)
	private BigDecimal s5Voltage;

	@Column(name="S5_X_TILT")
	private Short s5XTilt;

	@Column(name="S5_X_TILT_CHANGE")
	private Short s5XTiltChange;

	@Column(name="S5_X_TILT_DIGITAL")
	private Short s5XTiltDigital;

	@Column(name="S5_Y_TILT")
	private Short s5YTilt;

	@Column(name="S5_Y_TILT_CHANGE")
	private Short s5YTiltChange;

	@Column(name="S5_Y_TILT_DIGITAL")
	private Short s5YTiltDigital;

	@Column(name="S6_ANALOG", precision=12, scale=2)
	private BigDecimal s6Analog;

	@Column(name="S6_ANALOG_A2D", length=6)
	private String s6AnalogA2d;

	@Column(name="S6_DIGITAL")
	private Short s6Digital;

	@Column(name="S6_DIGITAL_2")
	private Short s6Digital2;

	@Column(name="S6_DIGITAL_2_CHANGE")
	private Short s6Digital2Change;

	@Column(name="S6_DIGITAL_CHANGE")
	private Short s6DigitalChange;

	@Column(name="S6_LOW_VOLTAGE")
	private Short s6LowVoltage;

	@Column(name="S6_POWER_SOURCE")
	private Short s6PowerSource;

	@Column(name="S6_RF_RESERVED")
	private Integer s6RfReserved;

	@Column(name="S6_SERIAL_NUMBER", length=16)
	private String s6SerialNumber;

	@Column(name="S6_T_CHANGE")
	private Short s6TChange;

	@Column(name="S6_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s6Temperature;

	@Column(name="S6_TEMPERATURE_A2D", length=6)
	private String s6TemperatureA2d;

	@Column(name="S6_TX_DTTM")
	private Timestamp s6TxDttm;

	@Column(name="S6_VOLTAGE", precision=4, scale=2)
	private BigDecimal s6Voltage;

	@Column(name="S6_X_TILT")
	private Short s6XTilt;

	@Column(name="S6_X_TILT_CHANGE")
	private Short s6XTiltChange;

	@Column(name="S6_X_TILT_DIGITAL")
	private Short s6XTiltDigital;

	@Column(name="S6_Y_TILT")
	private Short s6YTilt;

	@Column(name="S6_Y_TILT_CHANGE")
	private Short s6YTiltChange;

	@Column(name="S6_Y_TILT_DIGITAL")
	private Short s6YTiltDigital;

	@Column(name="S7_ANALOG", precision=12, scale=2)
	private BigDecimal s7Analog;

	@Column(name="S7_ANALOG_A2D", length=6)
	private String s7AnalogA2d;

	@Column(name="S7_DIGITAL")
	private Short s7Digital;

	@Column(name="S7_DIGITAL_2")
	private Short s7Digital2;

	@Column(name="S7_DIGITAL_2_CHANGE")
	private Short s7Digital2Change;

	@Column(name="S7_DIGITAL_CHANGE")
	private Short s7DigitalChange;

	@Column(name="S7_LOW_VOLTAGE")
	private Short s7LowVoltage;

	@Column(name="S7_POWER_SOURCE")
	private Short s7PowerSource;

	@Column(name="S7_RF_RESERVED")
	private Integer s7RfReserved;

	@Column(name="S7_SERIAL_NUMBER", length=16)
	private String s7SerialNumber;

	@Column(name="S7_T_CHANGE")
	private Short s7TChange;

	@Column(name="S7_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s7Temperature;

	@Column(name="S7_TEMPERATURE_A2D", length=6)
	private String s7TemperatureA2d;

	@Column(name="S7_TX_DTTM")
	private Timestamp s7TxDttm;

	@Column(name="S7_VOLTAGE", precision=4, scale=2)
	private BigDecimal s7Voltage;

	@Column(name="S7_X_TILT")
	private Short s7XTilt;

	@Column(name="S7_X_TILT_CHANGE")
	private Short s7XTiltChange;

	@Column(name="S7_X_TILT_DIGITAL")
	private Short s7XTiltDigital;

	@Column(name="S7_Y_TILT")
	private Short s7YTilt;

	@Column(name="S7_Y_TILT_CHANGE")
	private Short s7YTiltChange;

	@Column(name="S7_Y_TILT_DIGITAL")
	private Short s7YTiltDigital;

	@Column(name="S8_ANALOG", precision=12, scale=2)
	private BigDecimal s8Analog;

	@Column(name="S8_ANALOG_A2D", length=6)
	private String s8AnalogA2d;

	@Column(name="S8_DIGITAL")
	private Short s8Digital;

	@Column(name="S8_DIGITAL_2")
	private Short s8Digital2;

	@Column(name="S8_DIGITAL_2_CHANGE")
	private Short s8Digital2Change;

	@Column(name="S8_DIGITAL_CHANGE")
	private Short s8DigitalChange;

	@Column(name="S8_LOW_VOLTAGE")
	private Short s8LowVoltage;

	@Column(name="S8_POWER_SOURCE")
	private Short s8PowerSource;

	@Column(name="S8_RF_RESERVED")
	private Integer s8RfReserved;

	@Column(name="S8_SERIAL_NUMBER", length=16)
	private String s8SerialNumber;

	@Column(name="S8_T_CHANGE")
	private Short s8TChange;

	@Column(name="S8_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s8Temperature;

	@Column(name="S8_TEMPERATURE_A2D", length=6)
	private String s8TemperatureA2d;

	@Column(name="S8_TX_DTTM")
	private Timestamp s8TxDttm;

	@Column(name="S8_VOLTAGE", precision=4, scale=2)
	private BigDecimal s8Voltage;

	@Column(name="S8_X_TILT")
	private Short s8XTilt;

	@Column(name="S8_X_TILT_CHANGE")
	private Short s8XTiltChange;

	@Column(name="S8_X_TILT_DIGITAL")
	private Short s8XTiltDigital;

	@Column(name="S8_Y_TILT")
	private Short s8YTilt;

	@Column(name="S8_Y_TILT_CHANGE")
	private Short s8YTiltChange;

	@Column(name="S8_Y_TILT_DIGITAL")
	private Short s8YTiltDigital;

	@Column(name="S9_ANALOG", precision=12, scale=2)
	private BigDecimal s9Analog;

	@Column(name="S9_ANALOG_A2D", length=6)
	private String s9AnalogA2d;

	@Column(name="S9_DIGITAL")
	private Short s9Digital;

	@Column(name="S9_DIGITAL_2")
	private Short s9Digital2;

	@Column(name="S9_DIGITAL_2_CHANGE")
	private Short s9Digital2Change;

	@Column(name="S9_DIGITAL_CHANGE")
	private Short s9DigitalChange;

	@Column(name="S9_LOW_VOLTAGE")
	private Short s9LowVoltage;

	@Column(name="S9_POWER_SOURCE")
	private Short s9PowerSource;

	@Column(name="S9_RF_RESERVED")
	private Integer s9RfReserved;

	@Column(name="S9_SERIAL_NUMBER", length=16)
	private String s9SerialNumber;

	@Column(name="S9_T_CHANGE")
	private Short s9TChange;

	@Column(name="S9_TEMPERATURE", precision=7, scale=2)
	private BigDecimal s9Temperature;

	@Column(name="S9_TEMPERATURE_A2D", length=6)
	private String s9TemperatureA2d;

	@Column(name="S9_TX_DTTM")
	private Timestamp s9TxDttm;

	@Column(name="S9_VOLTAGE", precision=4, scale=2)
	private BigDecimal s9Voltage;

	@Column(name="S9_X_TILT")
	private Short s9XTilt;

	@Column(name="S9_X_TILT_CHANGE")
	private Short s9XTiltChange;

	@Column(name="S9_X_TILT_DIGITAL")
	private Short s9XTiltDigital;

	@Column(name="S9_Y_TILT")
	private Short s9YTilt;

	@Column(name="S9_Y_TILT_CHANGE")
	private Short s9YTiltChange;

	@Column(name="S9_Y_TILT_DIGITAL")
	private Short s9YTiltDigital;

	@Column(name="SECOND_FROM_PREVIOUS_MESSAGE")
	private Integer secondFromPreviousMessage;

	@Column(name="SPEED", precision=4, scale=1)
	private BigDecimal speed;

	@Column(name="SPEED_DROP")
	private Short speedDrop;

	@Column(name="[STATE]", length=50)
	private String state;

	@Column(name="STU_A2D_1")
	private Short stuA2d1;

	@Column(name="STU_A2D_2")
	private Short stuA2d2;

	@Column(name="STU_ANALOG_1", precision=12, scale=6)
	private BigDecimal stuAnalog1;

	@Column(name="STU_ANALOG_2", precision=12, scale=6)
	private BigDecimal stuAnalog2;

	@Column(name="STU_DIGITAL_1")
	private Boolean stuDigital1;

	@Column(name="STU_DIGITAL_2")
	private Boolean stuDigital2;

	@Column(name="TEMPERATURE")
	private Integer temperature;

	@Column(name="TEMPERATURE_1", precision=7, scale=2)
	private BigDecimal temperature1;

	@Column(name="TEMPERATURE_2", precision=7, scale=2)
	private BigDecimal temperature2;

	@Column(name="TEMPERATURE_AL")
	private Short temperatureAl;

	@Column(name="TEMPERATURE_AL2")
	private Short temperatureAl2;

	@Column(name="TEMPERATURE_AMBIENT")
	private Short temperatureAmbient;

	@Column(name="TEMPERATURE_AR")
	private Short temperatureAr;

	@Column(name="TEMPERATURE_AR2")
	private Short temperatureAr2;

	@Column(name="TEMPERATURE_BL")
	private Short temperatureBl;

	@Column(name="TEMPERATURE_BL2")
	private Short temperatureBl2;

	@Column(name="TEMPERATURE_BR")
	private Short temperatureBr;

	@Column(name="TEMPERATURE_BR2")
	private Short temperatureBr2;

	@Column(name="TEMPERATURE_COOLANT")
	private Short temperatureCoolant;

	@Column(name="TIME_SINCE_MOVE_BEGIN", precision=6, scale=2)
	private BigDecimal timeSinceMoveBegin;

	@Column(name="TIME_SINCE_MOVE_END", precision=6, scale=2)
	private BigDecimal timeSinceMoveEnd;

	@Column(name="TIME_TO_FIX")
	private Integer timeToFix;

	@Column(name="UNIT_DTTM", nullable=false)
	private Timestamp unitDttm;

	@Column(name="UNIT_ID", nullable=false, length=20)
	private String unitId;

	@Column(name="UNIT_INFO", length=150)
	private String unitInfo;

	@Column(name="UNIT_INFO2", length=150)
	private String unitInfo2;

	@Column(name="UNIT_NAME", length=255)
	private String unitName;

	@Column(name="UNIT_TYPE", length=50)
	private String unitType;

	@Column(name="VISIBILITY")
	private Integer visibility;

	@Column(name="WABTEC_FUEL")
	private Short wabtecFuel;

	@Column(name="WIND_DEGREES")
	private Integer windDegrees;

	@Column(name="WIND_SPEED")
	private Integer windSpeed;

	@Column(name="X_DV", precision=3, scale=1)
	private BigDecimal xDv;

	@Column(name="X_G_100HZ", precision=3, scale=1)
	private BigDecimal xG100hz;

	@Column(name="X_G_10HZ", precision=3, scale=1)
	private BigDecimal xG10hz;

	@Column(name="Y_DV", precision=3, scale=1)
	private BigDecimal yDv;

	@Column(name="Y_G_100HZ", precision=3, scale=1)
	private BigDecimal yG100hz;

	@Column(name="Y_G_10HZ", precision=3, scale=1)
	private BigDecimal yG10hz;

	@Column(name="Z_DV", precision=3, scale=1)
	private BigDecimal zDv;

	@Column(name="Z_G_100HZ", precision=3, scale=1)
	private BigDecimal zG100hz;

	@Column(name="Z_G_10HZ", precision=3, scale=1)
	private BigDecimal zG10hz;

	public MessageLatLon() {
	}

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public BigDecimal getAccumulatedMiles() {
		return this.accumulatedMiles;
	}

	public void setAccumulatedMiles(BigDecimal accumulatedMiles) {
		this.accumulatedMiles = accumulatedMiles;
	}

	public Short getAlarm() {
		return this.alarm;
	}

	public void setAlarm(Short alarm) {
		this.alarm = alarm;
	}

	public Long getAnalog1() {
		return this.analog1;
	}

	public void setAnalog1(Long analog1) {
		this.analog1 = analog1;
	}

	public Long getAnalog2() {
		return this.analog2;
	}

	public void setAnalog2(Long analog2) {
		this.analog2 = analog2;
	}

	public Long getAnalog3() {
		return this.analog3;
	}

	public void setAnalog3(Long analog3) {
		this.analog3 = analog3;
	}

	public BigDecimal getAux() {
		return this.aux;
	}

	public void setAux(BigDecimal aux) {
		this.aux = aux;
	}

	public BigDecimal getBattCapacityMax() {
		return this.battCapacityMax;
	}

	public void setBattCapacityMax(BigDecimal battCapacityMax) {
		this.battCapacityMax = battCapacityMax;
	}

	public BigDecimal getBattCapacityMin() {
		return this.battCapacityMin;
	}

	public void setBattCapacityMin(BigDecimal battCapacityMin) {
		this.battCapacityMin = battCapacityMin;
	}

	public BigDecimal getBattVolts() {
		return this.battVolts;
	}

	public void setBattVolts(BigDecimal battVolts) {
		this.battVolts = battVolts;
	}

	public BigDecimal getBearingFromNearestGeopoint() {
		return this.bearingFromNearestGeopoint;
	}

	public void setBearingFromNearestGeopoint(BigDecimal bearingFromNearestGeopoint) {
		this.bearingFromNearestGeopoint = bearingFromNearestGeopoint;
	}

	public BigDecimal getBearingFromNearestTown() {
		return this.bearingFromNearestTown;
	}

	public void setBearingFromNearestTown(BigDecimal bearingFromNearestTown) {
		this.bearingFromNearestTown = bearingFromNearestTown;
	}

	public BigDecimal getBusVoltage() {
		return this.busVoltage;
	}

	public void setBusVoltage(BigDecimal busVoltage) {
		this.busVoltage = busVoltage;
	}

	public BigDecimal getBusVoltage74v() {
		return this.busVoltage74v;
	}

	public void setBusVoltage74v(BigDecimal busVoltage74v) {
		this.busVoltage74v = busVoltage74v;
	}

	public BigDecimal getCapVolts() {
		return this.capVolts;
	}

	public void setCapVolts(BigDecimal capVolts) {
		this.capVolts = capVolts;
	}

	public BigDecimal getCapVoltsMax() {
		return this.capVoltsMax;
	}

	public void setCapVoltsMax(BigDecimal capVoltsMax) {
		this.capVoltsMax = capVoltsMax;
	}

	public BigDecimal getCapVoltsMin() {
		return this.capVoltsMin;
	}

	public void setCapVoltsMin(BigDecimal capVoltsMin) {
		this.capVoltsMin = capVoltsMin;
	}

	public Integer getCoreFcs() {
		return this.coreFcs;
	}

	public void setCoreFcs(Integer coreFcs) {
		this.coreFcs = coreFcs;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Short getCourse() {
		return this.course;
	}

	public void setCourse(Short course) {
		this.course = course;
	}

	public Short getD0() {
		return this.d0;
	}

	public void setD0(Short d0) {
		this.d0 = d0;
	}

	public Short getD1() {
		return this.d1;
	}

	public void setD1(Short d1) {
		this.d1 = d1;
	}

	public Short getD10() {
		return this.d10;
	}

	public void setD10(Short d10) {
		this.d10 = d10;
	}

	public Short getD11() {
		return this.d11;
	}

	public void setD11(Short d11) {
		this.d11 = d11;
	}

	public Short getD2() {
		return this.d2;
	}

	public void setD2(Short d2) {
		this.d2 = d2;
	}

	public Short getD3() {
		return this.d3;
	}

	public void setD3(Short d3) {
		this.d3 = d3;
	}

	public Short getD4() {
		return this.d4;
	}

	public void setD4(Short d4) {
		this.d4 = d4;
	}

	public Short getD5() {
		return this.d5;
	}

	public void setD5(Short d5) {
		this.d5 = d5;
	}

	public Short getD6() {
		return this.d6;
	}

	public void setD6(Short d6) {
		this.d6 = d6;
	}

	public Short getD7() {
		return this.d7;
	}

	public void setD7(Short d7) {
		this.d7 = d7;
	}

	public Short getD8() {
		return this.d8;
	}

	public void setD8(Short d8) {
		this.d8 = d8;
	}

	public Short getD9() {
		return this.d9;
	}

	public void setD9(Short d9) {
		this.d9 = d9;
	}

	public Integer getDecelerationId() {
		return this.decelerationId;
	}

	public void setDecelerationId(Integer decelerationId) {
		this.decelerationId = decelerationId;
	}

	public Timestamp getDecodeDttm() {
		return this.decodeDttm;
	}

	public void setDecodeDttm(Timestamp decodeDttm) {
		this.decodeDttm = decodeDttm;
	}

	public Integer getDewpoint() {
		return this.dewpoint;
	}

	public void setDewpoInteger(Integer dewpoInteger) {
		this.dewpoint = dewpoInteger;
	}

	public String getDigital1() {
		return this.digital1;
	}

	public void setDigital1(String digital1) {
		this.digital1 = digital1;
	}

	public String getDigital2() {
		return this.digital2;
	}

	public void setDigital2(String digital2) {
		this.digital2 = digital2;
	}

	public String getDigital3() {
		return this.digital3;
	}

	public void setDigital3(String digital3) {
		this.digital3 = digital3;
	}

	public String getDigital4() {
		return this.digital4;
	}

	public void setDigital4(String digital4) {
		this.digital4 = digital4;
	}

	public BigDecimal getDistanceFromNearestGeopoint() {
		return this.distanceFromNearestGeopoint;
	}

	public void setDistanceFromNearestGeopoint(BigDecimal distanceFromNearestGeopoint) {
		this.distanceFromNearestGeopoint = distanceFromNearestGeopoint;
	}

	public BigDecimal getDistanceFromNearestTown() {
		return this.distanceFromNearestTown;
	}

	public void setDistanceFromNearestTown(BigDecimal distanceFromNearestTown) {
		this.distanceFromNearestTown = distanceFromNearestTown;
	}

	public Integer getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}

	public Short getElevation() {
		return this.elevation;
	}

	public void setElevation(Short elevation) {
		this.elevation = elevation;
	}

	public Short getEngineRunStatus() {
		return this.engineRunStatus;
	}

	public void setEngineRunStatus(Short engineRunStatus) {
		this.engineRunStatus = engineRunStatus;
	}

	public BigDecimal getEngineRunTime() {
		return this.engineRunTime;
	}

	public void setEngineRunTime(BigDecimal engineRunTime) {
		this.engineRunTime = engineRunTime;
	}

	public Short getFaultCode() {
		return this.faultCode;
	}

	public void setFaultCode(Short faultCode) {
		this.faultCode = faultCode;
	}

	public Integer getFirmware() {
		return this.firmware;
	}

	public void setFirmware(Integer firmware) {
		this.firmware = firmware;
	}

	public Short getFirmwareBuild() {
		return this.firmwareBuild;
	}

	public void setFirmwareBuild(Short firmwareBuild) {
		this.firmwareBuild = firmwareBuild;
	}

	public Integer getFirmwareFcs() {
		return this.firmwareFcs;
	}

	public void setFirmwareFcs(Integer firmwareFcs) {
		this.firmwareFcs = firmwareFcs;
	}

	public String getFixType() {
		return this.fixType;
	}

	public void setFixType(String fixType) {
		this.fixType = fixType;
	}

	public Integer getFlag0() {
		return this.flag0;
	}

	public void setFlag0(Integer flag0) {
		this.flag0 = flag0;
	}

	public Integer getFlag1() {
		return this.flag1;
	}

	public void setFlag1(Integer flag1) {
		this.flag1 = flag1;
	}

	public Integer getFlag2() {
		return this.flag2;
	}

	public void setFlag2(Integer flag2) {
		this.flag2 = flag2;
	}

	public Integer getFlag3() {
		return this.flag3;
	}

	public void setFlag3(Integer flag3) {
		this.flag3 = flag3;
	}

	public Integer getFlag4() {
		return this.flag4;
	}

	public void setFlag4(Integer flag4) {
		this.flag4 = flag4;
	}

	public Integer getFlag5() {
		return this.flag5;
	}

	public void setFlag5(Integer flag5) {
		this.flag5 = flag5;
	}

	public Integer getFlag6() {
		return this.flag6;
	}

	public void setFlag6(Integer flag6) {
		this.flag6 = flag6;
	}

	public Integer getFlag7() {
		return this.flag7;
	}

	public void setFlag7(Integer flag7) {
		this.flag7 = flag7;
	}

	public Integer getFotaFcs() {
		return this.fotaFcs;
	}

	public void setFotaFcs(Integer fotaFcs) {
		this.fotaFcs = fotaFcs;
	}

	public BigDecimal getFuelA2d() {
		return this.fuelA2d;
	}

	public void setFuelA2d(BigDecimal fuelA2d) {
		this.fuelA2d = fuelA2d;
	}

	public BigDecimal getFuelLevel() {
		return this.fuelLevel;
	}

	public void setFuelLevel(BigDecimal fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public String getGeofence() {
		return this.geofence;
	}

	public void setGeofence(String geofence) {
		this.geofence = geofence;
	}

	public String getGeography() {
		return this.geography;
	}

	public void setGeography(String geography) {
		this.geography = geography;
	}

	public Integer getGoldFcs() {
		return this.goldFcs;
	}

	public void setGoldFcs(Integer goldFcs) {
		this.goldFcs = goldFcs;
	}

	public Timestamp getGpsDttm() {
		return this.gpsDttm;
	}

	public void setGpsDttm(Timestamp gpsDttm) {
		this.gpsDttm = gpsDttm;
	}

	public Boolean getGpsOverlay() {
		return this.gpsOverlay;
	}

	public void setGpsOverlay(Boolean gpsOverlay) {
		this.gpsOverlay = gpsOverlay;
	}

	public Integer getGpsRunTime() {
		return this.gpsRunTime;
	}

	public void setGpsRunTime(Integer gpsRunTime) {
		this.gpsRunTime = gpsRunTime;
	}

	public Short getGpsSatelliteInView() {
		return this.gpsSatelliteInView;
	}

	public void setGpsSatelliteInView(Short gpsSatelliteInView) {
		this.gpsSatelliteInView = gpsSatelliteInView;
	}

	public BigDecimal getHdop() {
		return this.hdop;
	}

	public void setHdop(BigDecimal hdop) {
		this.hdop = hdop;
	}

	public Short getHpe() {
		return this.hpe;
	}

	public void setHpe(Short hpe) {
		this.hpe = hpe;
	}

	public String getHtua() {
		return this.htua;
	}

	public void setHtua(String htua) {
		this.htua = htua;
	}

	public Integer getHumidity() {
		return this.humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public BigDecimal getIdleTime() {
		return this.idleTime;
	}

	public void setIdleTime(BigDecimal idleTime) {
		this.idleTime = idleTime;
	}

	public Short getImpactDuration() {
		return this.impactDuration;
	}

	public void setImpactDuration(Short impactDuration) {
		this.impactDuration = impactDuration;
	}

	public Integer getImpactId() {
		return this.impactId;
	}

	public void setImpactId(Integer impactId) {
		this.impactId = impactId;
	}

	public Integer getImpactRunTime() {
		return this.impactRunTime;
	}

	public void setImpactRunTime(Integer impactRunTime) {
		this.impactRunTime = impactRunTime;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public Timestamp getLocalDttm() {
		return this.localDttm;
	}

	public void setLocalDttm(Timestamp localDttm) {
		this.localDttm = localDttm;
	}

	public String getLocalDttmTz() {
		return this.localDttmTz;
	}

	public void setLocalDttmTz(String localDttmTz) {
		this.localDttmTz = localDttmTz;
	}

	public BigDecimal getLongitude() {
		return this.Longitude;
	}

	public void setLongitude(BigDecimal Longitude) {
		this.Longitude = Longitude;
	}

	public BigDecimal getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(BigDecimal maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Short getMessageInQueue() {
		return this.messageInQueue;
	}

	public void setMessageInQueue(Short messageInQueue) {
		this.messageInQueue = messageInQueue;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Integer getMessageTypeId() {
		return this.messageTypeId;
	}

	public void setMessageTypeId(Integer messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public BigDecimal getMileFromPreviousMessage() {
		return this.mileFromPreviousMessage;
	}

	public void setMileFromPreviousMessage(BigDecimal mileFromPreviousMessage) {
		this.mileFromPreviousMessage = mileFromPreviousMessage;
	}

	public String getNearestGeopoint() {
		return this.nearestGeopoint;
	}

	public void setNearestGeopoint(String nearestGeopoint) {
		this.nearestGeopoint = nearestGeopoint;
	}

	public String getNearestRr() {
		return this.nearestRr;
	}

	public void setNearestRr(String nearestRr) {
		this.nearestRr = nearestRr;
	}

	public String getNearestTown() {
		return this.nearestTown;
	}

	public void setNearestTown(String nearestTown) {
		this.nearestTown = nearestTown;
	}

	public Timestamp getObservationDttm() {
		return this.observationDttm;
	}

	public void setObservationDttm(Timestamp observationDttm) {
		this.observationDttm = observationDttm;
	}

	public BigDecimal getOdometer() {
		return this.odometer;
	}

	public void setOdometer(BigDecimal odometer) {
		this.odometer = odometer;
	}

	public Long getPhoto() {
		return this.photo;
	}

	public void setPhoto(Long photo) {
		this.photo = photo;
	}

	public Integer getRadioRunTime() {
		return this.radioRunTime;
	}

	public void setRadioRunTime(Integer radioRunTime) {
		this.radioRunTime = radioRunTime;
	}

	public String getRailyard() {
		return this.railyard;
	}

	public void setRailyard(String railyard) {
		this.railyard = railyard;
	}

	public Timestamp getReceiveDttm() {
		return this.receiveDttm;
	}

	public void setReceiveDttm(Timestamp receiveDttm) {
		this.receiveDttm = receiveDttm;
	}

	public String getRelay1() {
		return this.relay1;
	}

	public void setRelay1(String relay1) {
		this.relay1 = relay1;
	}

	public String getRelay2() {
		return this.relay2;
	}

	public void setRelay2(String relay2) {
		this.relay2 = relay2;
	}

	public Short getReset() {
		return this.reset;
	}

	public void setReset(Short reset) {
		this.reset = reset;
	}

	public Long getRfMessageTypeId() {
		return this.rfMessageTypeId;
	}

	public void setRfMessageTypeId(Long rfMessageTypeId) {
		this.rfMessageTypeId = rfMessageTypeId;
	}

	public Integer getRfRunTime() {
		return this.rfRunTime;
	}

	public void setRfRunTime(Integer rfRunTime) {
		this.rfRunTime = rfRunTime;
	}

	public Short getRssi() {
		return this.rssi;
	}

	public void setRssi(Short rssi) {
		this.rssi = rssi;
	}

	public Integer getRunTime() {
		return this.runTime;
	}

	public void setRunTime(Integer runTime) {
		this.runTime = runTime;
	}

	public BigDecimal getS1Analog() {
		return this.s1Analog;
	}

	public void setS1Analog(BigDecimal s1Analog) {
		this.s1Analog = s1Analog;
	}

	public String getS1AnalogA2d() {
		return this.s1AnalogA2d;
	}

	public void setS1AnalogA2d(String s1AnalogA2d) {
		this.s1AnalogA2d = s1AnalogA2d;
	}

	public String getS1ApId() {
		return this.s1ApId;
	}

	public void setS1ApId(String s1ApId) {
		this.s1ApId = s1ApId;
	}

	public String getS1ApName() {
		return this.s1ApName;
	}

	public void setS1ApName(String s1ApName) {
		this.s1ApName = s1ApName;
	}

	public Short getS1Digital() {
		return this.s1Digital;
	}

	public void setS1Digital(Short s1Digital) {
		this.s1Digital = s1Digital;
	}

	public Short getS1Digital2() {
		return this.s1Digital2;
	}

	public void setS1Digital2(Short s1Digital2) {
		this.s1Digital2 = s1Digital2;
	}

	public Short getS1Digital2Change() {
		return this.s1Digital2Change;
	}

	public void setS1Digital2Change(Short s1Digital2Change) {
		this.s1Digital2Change = s1Digital2Change;
	}

	public Short getS1DigitalChange() {
		return this.s1DigitalChange;
	}

	public void setS1DigitalChange(Short s1DigitalChange) {
		this.s1DigitalChange = s1DigitalChange;
	}

	public Short getS1LowVoltage() {
		return this.s1LowVoltage;
	}

	public void setS1LowVoltage(Short s1LowVoltage) {
		this.s1LowVoltage = s1LowVoltage;
	}

	public String getS1MessageType() {
		return this.s1MessageType;
	}

	public void setS1MessageType(String s1MessageType) {
		this.s1MessageType = s1MessageType;
	}

	public Short getS1PowerSource() {
		return this.s1PowerSource;
	}

	public void setS1PowerSource(Short s1PowerSource) {
		this.s1PowerSource = s1PowerSource;
	}

	public Integer getS1RfReserved() {
		return this.s1RfReserved;
	}

	public void setS1RfReserved(Integer s1RfReserved) {
		this.s1RfReserved = s1RfReserved;
	}

	public String getS1SerialNumber() {
		return this.s1SerialNumber;
	}

	public void setS1SerialNumber(String s1SerialNumber) {
		this.s1SerialNumber = s1SerialNumber;
	}

	public Short getS1TChange() {
		return this.s1TChange;
	}

	public void setS1TChange(Short s1TChange) {
		this.s1TChange = s1TChange;
	}

	public BigDecimal getS1Temperature() {
		return this.s1Temperature;
	}

	public void setS1Temperature(BigDecimal s1Temperature) {
		this.s1Temperature = s1Temperature;
	}

	public String getS1TemperatureA2d() {
		return this.s1TemperatureA2d;
	}

	public void setS1TemperatureA2d(String s1TemperatureA2d) {
		this.s1TemperatureA2d = s1TemperatureA2d;
	}

	public Timestamp getS1TxDttm() {
		return this.s1TxDttm;
	}

	public void setS1TxDttm(Timestamp s1TxDttm) {
		this.s1TxDttm = s1TxDttm;
	}

	public String getS1UnitName() {
		return this.s1UnitName;
	}

	public void setS1UnitName(String s1UnitName) {
		this.s1UnitName = s1UnitName;
	}

	public BigDecimal getS1Voltage() {
		return this.s1Voltage;
	}

	public void setS1Voltage(BigDecimal s1Voltage) {
		this.s1Voltage = s1Voltage;
	}

	public Short getS1XTilt() {
		return this.s1XTilt;
	}

	public void setS1XTilt(Short s1XTilt) {
		this.s1XTilt = s1XTilt;
	}

	public Short getS1XTiltChange() {
		return this.s1XTiltChange;
	}

	public void setS1XTiltChange(Short s1XTiltChange) {
		this.s1XTiltChange = s1XTiltChange;
	}

	public Short getS1XTiltDigital() {
		return this.s1XTiltDigital;
	}

	public void setS1XTiltDigital(Short s1XTiltDigital) {
		this.s1XTiltDigital = s1XTiltDigital;
	}

	public Short getS1YTilt() {
		return this.s1YTilt;
	}

	public void setS1YTilt(Short s1YTilt) {
		this.s1YTilt = s1YTilt;
	}

	public Short getS1YTiltChange() {
		return this.s1YTiltChange;
	}

	public void setS1YTiltChange(Short s1YTiltChange) {
		this.s1YTiltChange = s1YTiltChange;
	}

	public Short getS1YTiltDigital() {
		return this.s1YTiltDigital;
	}

	public void setS1YTiltDigital(Short s1YTiltDigital) {
		this.s1YTiltDigital = s1YTiltDigital;
	}

	public BigDecimal getS10Analog() {
		return this.s10Analog;
	}

	public void setS10Analog(BigDecimal s10Analog) {
		this.s10Analog = s10Analog;
	}

	public String getS10AnalogA2d() {
		return this.s10AnalogA2d;
	}

	public void setS10AnalogA2d(String s10AnalogA2d) {
		this.s10AnalogA2d = s10AnalogA2d;
	}

	public Short getS10Digital() {
		return this.s10Digital;
	}

	public void setS10Digital(Short s10Digital) {
		this.s10Digital = s10Digital;
	}

	public Short getS10Digital2() {
		return this.s10Digital2;
	}

	public void setS10Digital2(Short s10Digital2) {
		this.s10Digital2 = s10Digital2;
	}

	public Short getS10Digital2Change() {
		return this.s10Digital2Change;
	}

	public void setS10Digital2Change(Short s10Digital2Change) {
		this.s10Digital2Change = s10Digital2Change;
	}

	public Short getS10DigitalChange() {
		return this.s10DigitalChange;
	}

	public void setS10DigitalChange(Short s10DigitalChange) {
		this.s10DigitalChange = s10DigitalChange;
	}

	public Short getS10LowVoltage() {
		return this.s10LowVoltage;
	}

	public void setS10LowVoltage(Short s10LowVoltage) {
		this.s10LowVoltage = s10LowVoltage;
	}

	public Short getS10PowerSource() {
		return this.s10PowerSource;
	}

	public void setS10PowerSource(Short s10PowerSource) {
		this.s10PowerSource = s10PowerSource;
	}

	public Integer getS10RfReserved() {
		return this.s10RfReserved;
	}

	public void setS10RfReserved(Integer s10RfReserved) {
		this.s10RfReserved = s10RfReserved;
	}

	public String getS10SerialNumber() {
		return this.s10SerialNumber;
	}

	public void setS10SerialNumber(String s10SerialNumber) {
		this.s10SerialNumber = s10SerialNumber;
	}

	public Short getS10TChange() {
		return this.s10TChange;
	}

	public void setS10TChange(Short s10TChange) {
		this.s10TChange = s10TChange;
	}

	public BigDecimal getS10Temperature() {
		return this.s10Temperature;
	}

	public void setS10Temperature(BigDecimal s10Temperature) {
		this.s10Temperature = s10Temperature;
	}

	public String getS10TemperatureA2d() {
		return this.s10TemperatureA2d;
	}

	public void setS10TemperatureA2d(String s10TemperatureA2d) {
		this.s10TemperatureA2d = s10TemperatureA2d;
	}

	public Timestamp getS10TxDttm() {
		return this.s10TxDttm;
	}

	public void setS10TxDttm(Timestamp s10TxDttm) {
		this.s10TxDttm = s10TxDttm;
	}

	public BigDecimal getS10Voltage() {
		return this.s10Voltage;
	}

	public void setS10Voltage(BigDecimal s10Voltage) {
		this.s10Voltage = s10Voltage;
	}

	public Short getS10XTilt() {
		return this.s10XTilt;
	}

	public void setS10XTilt(Short s10XTilt) {
		this.s10XTilt = s10XTilt;
	}

	public Short getS10XTiltChange() {
		return this.s10XTiltChange;
	}

	public void setS10XTiltChange(Short s10XTiltChange) {
		this.s10XTiltChange = s10XTiltChange;
	}

	public Short getS10XTiltDigital() {
		return this.s10XTiltDigital;
	}

	public void setS10XTiltDigital(Short s10XTiltDigital) {
		this.s10XTiltDigital = s10XTiltDigital;
	}

	public Short getS10YTilt() {
		return this.s10YTilt;
	}

	public void setS10YTilt(Short s10YTilt) {
		this.s10YTilt = s10YTilt;
	}

	public Short getS10YTiltChange() {
		return this.s10YTiltChange;
	}

	public void setS10YTiltChange(Short s10YTiltChange) {
		this.s10YTiltChange = s10YTiltChange;
	}

	public Short getS10YTiltDigital() {
		return this.s10YTiltDigital;
	}

	public void setS10YTiltDigital(Short s10YTiltDigital) {
		this.s10YTiltDigital = s10YTiltDigital;
	}

	public BigDecimal getS2Analog() {
		return this.s2Analog;
	}

	public void setS2Analog(BigDecimal s2Analog) {
		this.s2Analog = s2Analog;
	}

	public String getS2AnalogA2d() {
		return this.s2AnalogA2d;
	}

	public void setS2AnalogA2d(String s2AnalogA2d) {
		this.s2AnalogA2d = s2AnalogA2d;
	}

	public Short getS2Digital() {
		return this.s2Digital;
	}

	public void setS2Digital(Short s2Digital) {
		this.s2Digital = s2Digital;
	}

	public Short getS2Digital2() {
		return this.s2Digital2;
	}

	public void setS2Digital2(Short s2Digital2) {
		this.s2Digital2 = s2Digital2;
	}

	public Short getS2Digital2Change() {
		return this.s2Digital2Change;
	}

	public void setS2Digital2Change(Short s2Digital2Change) {
		this.s2Digital2Change = s2Digital2Change;
	}

	public Short getS2DigitalChange() {
		return this.s2DigitalChange;
	}

	public void setS2DigitalChange(Short s2DigitalChange) {
		this.s2DigitalChange = s2DigitalChange;
	}

	public Short getS2LowVoltage() {
		return this.s2LowVoltage;
	}

	public void setS2LowVoltage(Short s2LowVoltage) {
		this.s2LowVoltage = s2LowVoltage;
	}

	public Short getS2PowerSource() {
		return this.s2PowerSource;
	}

	public void setS2PowerSource(Short s2PowerSource) {
		this.s2PowerSource = s2PowerSource;
	}

	public Integer getS2RfReserved() {
		return this.s2RfReserved;
	}

	public void setS2RfReserved(Integer s2RfReserved) {
		this.s2RfReserved = s2RfReserved;
	}

	public String getS2SerialNumber() {
		return this.s2SerialNumber;
	}

	public void setS2SerialNumber(String s2SerialNumber) {
		this.s2SerialNumber = s2SerialNumber;
	}

	public Short getS2TChange() {
		return this.s2TChange;
	}

	public void setS2TChange(Short s2TChange) {
		this.s2TChange = s2TChange;
	}

	public BigDecimal getS2Temperature() {
		return this.s2Temperature;
	}

	public void setS2Temperature(BigDecimal s2Temperature) {
		this.s2Temperature = s2Temperature;
	}

	public String getS2TemperatureA2d() {
		return this.s2TemperatureA2d;
	}

	public void setS2TemperatureA2d(String s2TemperatureA2d) {
		this.s2TemperatureA2d = s2TemperatureA2d;
	}

	public Timestamp getS2TxDttm() {
		return this.s2TxDttm;
	}

	public void setS2TxDttm(Timestamp s2TxDttm) {
		this.s2TxDttm = s2TxDttm;
	}

	public BigDecimal getS2Voltage() {
		return this.s2Voltage;
	}

	public void setS2Voltage(BigDecimal s2Voltage) {
		this.s2Voltage = s2Voltage;
	}

	public Short getS2XTilt() {
		return this.s2XTilt;
	}

	public void setS2XTilt(Short s2XTilt) {
		this.s2XTilt = s2XTilt;
	}

	public Short getS2XTiltChange() {
		return this.s2XTiltChange;
	}

	public void setS2XTiltChange(Short s2XTiltChange) {
		this.s2XTiltChange = s2XTiltChange;
	}

	public Short getS2XTiltDigital() {
		return this.s2XTiltDigital;
	}

	public void setS2XTiltDigital(Short s2XTiltDigital) {
		this.s2XTiltDigital = s2XTiltDigital;
	}

	public Short getS2YTilt() {
		return this.s2YTilt;
	}

	public void setS2YTilt(Short s2YTilt) {
		this.s2YTilt = s2YTilt;
	}

	public Short getS2YTiltChange() {
		return this.s2YTiltChange;
	}

	public void setS2YTiltChange(Short s2YTiltChange) {
		this.s2YTiltChange = s2YTiltChange;
	}

	public Short getS2YTiltDigital() {
		return this.s2YTiltDigital;
	}

	public void setS2YTiltDigital(Short s2YTiltDigital) {
		this.s2YTiltDigital = s2YTiltDigital;
	}

	public BigDecimal getS3Analog() {
		return this.s3Analog;
	}

	public void setS3Analog(BigDecimal s3Analog) {
		this.s3Analog = s3Analog;
	}

	public String getS3AnalogA2d() {
		return this.s3AnalogA2d;
	}

	public void setS3AnalogA2d(String s3AnalogA2d) {
		this.s3AnalogA2d = s3AnalogA2d;
	}

	public Short getS3Digital() {
		return this.s3Digital;
	}

	public void setS3Digital(Short s3Digital) {
		this.s3Digital = s3Digital;
	}

	public Short getS3Digital2() {
		return this.s3Digital2;
	}

	public void setS3Digital2(Short s3Digital2) {
		this.s3Digital2 = s3Digital2;
	}

	public Short getS3Digital2Change() {
		return this.s3Digital2Change;
	}

	public void setS3Digital2Change(Short s3Digital2Change) {
		this.s3Digital2Change = s3Digital2Change;
	}

	public Short getS3DigitalChange() {
		return this.s3DigitalChange;
	}

	public void setS3DigitalChange(Short s3DigitalChange) {
		this.s3DigitalChange = s3DigitalChange;
	}

	public Short getS3LowVoltage() {
		return this.s3LowVoltage;
	}

	public void setS3LowVoltage(Short s3LowVoltage) {
		this.s3LowVoltage = s3LowVoltage;
	}

	public Short getS3PowerSource() {
		return this.s3PowerSource;
	}

	public void setS3PowerSource(Short s3PowerSource) {
		this.s3PowerSource = s3PowerSource;
	}

	public Integer getS3RfReserved() {
		return this.s3RfReserved;
	}

	public void setS3RfReserved(Integer s3RfReserved) {
		this.s3RfReserved = s3RfReserved;
	}

	public String getS3SerialNumber() {
		return this.s3SerialNumber;
	}

	public void setS3SerialNumber(String s3SerialNumber) {
		this.s3SerialNumber = s3SerialNumber;
	}

	public Short getS3TChange() {
		return this.s3TChange;
	}

	public void setS3TChange(Short s3TChange) {
		this.s3TChange = s3TChange;
	}

	public BigDecimal getS3Temperature() {
		return this.s3Temperature;
	}

	public void setS3Temperature(BigDecimal s3Temperature) {
		this.s3Temperature = s3Temperature;
	}

	public String getS3TemperatureA2d() {
		return this.s3TemperatureA2d;
	}

	public void setS3TemperatureA2d(String s3TemperatureA2d) {
		this.s3TemperatureA2d = s3TemperatureA2d;
	}

	public Timestamp getS3TxDttm() {
		return this.s3TxDttm;
	}

	public void setS3TxDttm(Timestamp s3TxDttm) {
		this.s3TxDttm = s3TxDttm;
	}

	public BigDecimal getS3Voltage() {
		return this.s3Voltage;
	}

	public void setS3Voltage(BigDecimal s3Voltage) {
		this.s3Voltage = s3Voltage;
	}

	public Short getS3XTilt() {
		return this.s3XTilt;
	}

	public void setS3XTilt(Short s3XTilt) {
		this.s3XTilt = s3XTilt;
	}

	public Short getS3XTiltChange() {
		return this.s3XTiltChange;
	}

	public void setS3XTiltChange(Short s3XTiltChange) {
		this.s3XTiltChange = s3XTiltChange;
	}

	public Short getS3XTiltDigital() {
		return this.s3XTiltDigital;
	}

	public void setS3XTiltDigital(Short s3XTiltDigital) {
		this.s3XTiltDigital = s3XTiltDigital;
	}

	public Short getS3YTilt() {
		return this.s3YTilt;
	}

	public void setS3YTilt(Short s3YTilt) {
		this.s3YTilt = s3YTilt;
	}

	public Short getS3YTiltChange() {
		return this.s3YTiltChange;
	}

	public void setS3YTiltChange(Short s3YTiltChange) {
		this.s3YTiltChange = s3YTiltChange;
	}

	public Short getS3YTiltDigital() {
		return this.s3YTiltDigital;
	}

	public void setS3YTiltDigital(Short s3YTiltDigital) {
		this.s3YTiltDigital = s3YTiltDigital;
	}

	public BigDecimal getS4Analog() {
		return this.s4Analog;
	}

	public void setS4Analog(BigDecimal s4Analog) {
		this.s4Analog = s4Analog;
	}

	public String getS4AnalogA2d() {
		return this.s4AnalogA2d;
	}

	public void setS4AnalogA2d(String s4AnalogA2d) {
		this.s4AnalogA2d = s4AnalogA2d;
	}

	public Short getS4Digital() {
		return this.s4Digital;
	}

	public void setS4Digital(Short s4Digital) {
		this.s4Digital = s4Digital;
	}

	public Short getS4Digital2() {
		return this.s4Digital2;
	}

	public void setS4Digital2(Short s4Digital2) {
		this.s4Digital2 = s4Digital2;
	}

	public Short getS4Digital2Change() {
		return this.s4Digital2Change;
	}

	public void setS4Digital2Change(Short s4Digital2Change) {
		this.s4Digital2Change = s4Digital2Change;
	}

	public Short getS4DigitalChange() {
		return this.s4DigitalChange;
	}

	public void setS4DigitalChange(Short s4DigitalChange) {
		this.s4DigitalChange = s4DigitalChange;
	}

	public Short getS4LowVoltage() {
		return this.s4LowVoltage;
	}

	public void setS4LowVoltage(Short s4LowVoltage) {
		this.s4LowVoltage = s4LowVoltage;
	}

	public Short getS4PowerSource() {
		return this.s4PowerSource;
	}

	public void setS4PowerSource(Short s4PowerSource) {
		this.s4PowerSource = s4PowerSource;
	}

	public Integer getS4RfReserved() {
		return this.s4RfReserved;
	}

	public void setS4RfReserved(Integer s4RfReserved) {
		this.s4RfReserved = s4RfReserved;
	}

	public String getS4SerialNumber() {
		return this.s4SerialNumber;
	}

	public void setS4SerialNumber(String s4SerialNumber) {
		this.s4SerialNumber = s4SerialNumber;
	}

	public Short getS4TChange() {
		return this.s4TChange;
	}

	public void setS4TChange(Short s4TChange) {
		this.s4TChange = s4TChange;
	}

	public BigDecimal getS4Temperature() {
		return this.s4Temperature;
	}

	public void setS4Temperature(BigDecimal s4Temperature) {
		this.s4Temperature = s4Temperature;
	}

	public String getS4TemperatureA2d() {
		return this.s4TemperatureA2d;
	}

	public void setS4TemperatureA2d(String s4TemperatureA2d) {
		this.s4TemperatureA2d = s4TemperatureA2d;
	}

	public Timestamp getS4TxDttm() {
		return this.s4TxDttm;
	}

	public void setS4TxDttm(Timestamp s4TxDttm) {
		this.s4TxDttm = s4TxDttm;
	}

	public BigDecimal getS4Voltage() {
		return this.s4Voltage;
	}

	public void setS4Voltage(BigDecimal s4Voltage) {
		this.s4Voltage = s4Voltage;
	}

	public Short getS4XTilt() {
		return this.s4XTilt;
	}

	public void setS4XTilt(Short s4XTilt) {
		this.s4XTilt = s4XTilt;
	}

	public Short getS4XTiltChange() {
		return this.s4XTiltChange;
	}

	public void setS4XTiltChange(Short s4XTiltChange) {
		this.s4XTiltChange = s4XTiltChange;
	}

	public Short getS4XTiltDigital() {
		return this.s4XTiltDigital;
	}

	public void setS4XTiltDigital(Short s4XTiltDigital) {
		this.s4XTiltDigital = s4XTiltDigital;
	}

	public Short getS4YTilt() {
		return this.s4YTilt;
	}

	public void setS4YTilt(Short s4YTilt) {
		this.s4YTilt = s4YTilt;
	}

	public Short getS4YTiltChange() {
		return this.s4YTiltChange;
	}

	public void setS4YTiltChange(Short s4YTiltChange) {
		this.s4YTiltChange = s4YTiltChange;
	}

	public Short getS4YTiltDigital() {
		return this.s4YTiltDigital;
	}

	public void setS4YTiltDigital(Short s4YTiltDigital) {
		this.s4YTiltDigital = s4YTiltDigital;
	}

	public BigDecimal getS5Analog() {
		return this.s5Analog;
	}

	public void setS5Analog(BigDecimal s5Analog) {
		this.s5Analog = s5Analog;
	}

	public String getS5AnalogA2d() {
		return this.s5AnalogA2d;
	}

	public void setS5AnalogA2d(String s5AnalogA2d) {
		this.s5AnalogA2d = s5AnalogA2d;
	}

	public Short getS5Digital() {
		return this.s5Digital;
	}

	public void setS5Digital(Short s5Digital) {
		this.s5Digital = s5Digital;
	}

	public Short getS5Digital2() {
		return this.s5Digital2;
	}

	public void setS5Digital2(Short s5Digital2) {
		this.s5Digital2 = s5Digital2;
	}

	public Short getS5Digital2Change() {
		return this.s5Digital2Change;
	}

	public void setS5Digital2Change(Short s5Digital2Change) {
		this.s5Digital2Change = s5Digital2Change;
	}

	public Short getS5DigitalChange() {
		return this.s5DigitalChange;
	}

	public void setS5DigitalChange(Short s5DigitalChange) {
		this.s5DigitalChange = s5DigitalChange;
	}

	public Short getS5LowVoltage() {
		return this.s5LowVoltage;
	}

	public void setS5LowVoltage(Short s5LowVoltage) {
		this.s5LowVoltage = s5LowVoltage;
	}

	public Short getS5PowerSource() {
		return this.s5PowerSource;
	}

	public void setS5PowerSource(Short s5PowerSource) {
		this.s5PowerSource = s5PowerSource;
	}

	public Integer getS5RfReserved() {
		return this.s5RfReserved;
	}

	public void setS5RfReserved(Integer s5RfReserved) {
		this.s5RfReserved = s5RfReserved;
	}

	public String getS5SerialNumber() {
		return this.s5SerialNumber;
	}

	public void setS5SerialNumber(String s5SerialNumber) {
		this.s5SerialNumber = s5SerialNumber;
	}

	public Short getS5TChange() {
		return this.s5TChange;
	}

	public void setS5TChange(Short s5TChange) {
		this.s5TChange = s5TChange;
	}

	public BigDecimal getS5Temperature() {
		return this.s5Temperature;
	}

	public void setS5Temperature(BigDecimal s5Temperature) {
		this.s5Temperature = s5Temperature;
	}

	public String getS5TemperatureA2d() {
		return this.s5TemperatureA2d;
	}

	public void setS5TemperatureA2d(String s5TemperatureA2d) {
		this.s5TemperatureA2d = s5TemperatureA2d;
	}

	public Timestamp getS5TxDttm() {
		return this.s5TxDttm;
	}

	public void setS5TxDttm(Timestamp s5TxDttm) {
		this.s5TxDttm = s5TxDttm;
	}

	public BigDecimal getS5Voltage() {
		return this.s5Voltage;
	}

	public void setS5Voltage(BigDecimal s5Voltage) {
		this.s5Voltage = s5Voltage;
	}

	public Short getS5XTilt() {
		return this.s5XTilt;
	}

	public void setS5XTilt(Short s5XTilt) {
		this.s5XTilt = s5XTilt;
	}

	public Short getS5XTiltChange() {
		return this.s5XTiltChange;
	}

	public void setS5XTiltChange(Short s5XTiltChange) {
		this.s5XTiltChange = s5XTiltChange;
	}

	public Short getS5XTiltDigital() {
		return this.s5XTiltDigital;
	}

	public void setS5XTiltDigital(Short s5XTiltDigital) {
		this.s5XTiltDigital = s5XTiltDigital;
	}

	public Short getS5YTilt() {
		return this.s5YTilt;
	}

	public void setS5YTilt(Short s5YTilt) {
		this.s5YTilt = s5YTilt;
	}

	public Short getS5YTiltChange() {
		return this.s5YTiltChange;
	}

	public void setS5YTiltChange(Short s5YTiltChange) {
		this.s5YTiltChange = s5YTiltChange;
	}

	public Short getS5YTiltDigital() {
		return this.s5YTiltDigital;
	}

	public void setS5YTiltDigital(Short s5YTiltDigital) {
		this.s5YTiltDigital = s5YTiltDigital;
	}

	public BigDecimal getS6Analog() {
		return this.s6Analog;
	}

	public void setS6Analog(BigDecimal s6Analog) {
		this.s6Analog = s6Analog;
	}

	public String getS6AnalogA2d() {
		return this.s6AnalogA2d;
	}

	public void setS6AnalogA2d(String s6AnalogA2d) {
		this.s6AnalogA2d = s6AnalogA2d;
	}

	public Short getS6Digital() {
		return this.s6Digital;
	}

	public void setS6Digital(Short s6Digital) {
		this.s6Digital = s6Digital;
	}

	public Short getS6Digital2() {
		return this.s6Digital2;
	}

	public void setS6Digital2(Short s6Digital2) {
		this.s6Digital2 = s6Digital2;
	}

	public Short getS6Digital2Change() {
		return this.s6Digital2Change;
	}

	public void setS6Digital2Change(Short s6Digital2Change) {
		this.s6Digital2Change = s6Digital2Change;
	}

	public Short getS6DigitalChange() {
		return this.s6DigitalChange;
	}

	public void setS6DigitalChange(Short s6DigitalChange) {
		this.s6DigitalChange = s6DigitalChange;
	}

	public Short getS6LowVoltage() {
		return this.s6LowVoltage;
	}

	public void setS6LowVoltage(Short s6LowVoltage) {
		this.s6LowVoltage = s6LowVoltage;
	}

	public Short getS6PowerSource() {
		return this.s6PowerSource;
	}

	public void setS6PowerSource(Short s6PowerSource) {
		this.s6PowerSource = s6PowerSource;
	}

	public Integer getS6RfReserved() {
		return this.s6RfReserved;
	}

	public void setS6RfReserved(Integer s6RfReserved) {
		this.s6RfReserved = s6RfReserved;
	}

	public String getS6SerialNumber() {
		return this.s6SerialNumber;
	}

	public void setS6SerialNumber(String s6SerialNumber) {
		this.s6SerialNumber = s6SerialNumber;
	}

	public Short getS6TChange() {
		return this.s6TChange;
	}

	public void setS6TChange(Short s6TChange) {
		this.s6TChange = s6TChange;
	}

	public BigDecimal getS6Temperature() {
		return this.s6Temperature;
	}

	public void setS6Temperature(BigDecimal s6Temperature) {
		this.s6Temperature = s6Temperature;
	}

	public String getS6TemperatureA2d() {
		return this.s6TemperatureA2d;
	}

	public void setS6TemperatureA2d(String s6TemperatureA2d) {
		this.s6TemperatureA2d = s6TemperatureA2d;
	}

	public Timestamp getS6TxDttm() {
		return this.s6TxDttm;
	}

	public void setS6TxDttm(Timestamp s6TxDttm) {
		this.s6TxDttm = s6TxDttm;
	}

	public BigDecimal getS6Voltage() {
		return this.s6Voltage;
	}

	public void setS6Voltage(BigDecimal s6Voltage) {
		this.s6Voltage = s6Voltage;
	}

	public Short getS6XTilt() {
		return this.s6XTilt;
	}

	public void setS6XTilt(Short s6XTilt) {
		this.s6XTilt = s6XTilt;
	}

	public Short getS6XTiltChange() {
		return this.s6XTiltChange;
	}

	public void setS6XTiltChange(Short s6XTiltChange) {
		this.s6XTiltChange = s6XTiltChange;
	}

	public Short getS6XTiltDigital() {
		return this.s6XTiltDigital;
	}

	public void setS6XTiltDigital(Short s6XTiltDigital) {
		this.s6XTiltDigital = s6XTiltDigital;
	}

	public Short getS6YTilt() {
		return this.s6YTilt;
	}

	public void setS6YTilt(Short s6YTilt) {
		this.s6YTilt = s6YTilt;
	}

	public Short getS6YTiltChange() {
		return this.s6YTiltChange;
	}

	public void setS6YTiltChange(Short s6YTiltChange) {
		this.s6YTiltChange = s6YTiltChange;
	}

	public Short getS6YTiltDigital() {
		return this.s6YTiltDigital;
	}

	public void setS6YTiltDigital(Short s6YTiltDigital) {
		this.s6YTiltDigital = s6YTiltDigital;
	}

	public BigDecimal getS7Analog() {
		return this.s7Analog;
	}

	public void setS7Analog(BigDecimal s7Analog) {
		this.s7Analog = s7Analog;
	}

	public String getS7AnalogA2d() {
		return this.s7AnalogA2d;
	}

	public void setS7AnalogA2d(String s7AnalogA2d) {
		this.s7AnalogA2d = s7AnalogA2d;
	}

	public Short getS7Digital() {
		return this.s7Digital;
	}

	public void setS7Digital(Short s7Digital) {
		this.s7Digital = s7Digital;
	}

	public Short getS7Digital2() {
		return this.s7Digital2;
	}

	public void setS7Digital2(Short s7Digital2) {
		this.s7Digital2 = s7Digital2;
	}

	public Short getS7Digital2Change() {
		return this.s7Digital2Change;
	}

	public void setS7Digital2Change(Short s7Digital2Change) {
		this.s7Digital2Change = s7Digital2Change;
	}

	public Short getS7DigitalChange() {
		return this.s7DigitalChange;
	}

	public void setS7DigitalChange(Short s7DigitalChange) {
		this.s7DigitalChange = s7DigitalChange;
	}

	public Short getS7LowVoltage() {
		return this.s7LowVoltage;
	}

	public void setS7LowVoltage(Short s7LowVoltage) {
		this.s7LowVoltage = s7LowVoltage;
	}

	public Short getS7PowerSource() {
		return this.s7PowerSource;
	}

	public void setS7PowerSource(Short s7PowerSource) {
		this.s7PowerSource = s7PowerSource;
	}

	public Integer getS7RfReserved() {
		return this.s7RfReserved;
	}

	public void setS7RfReserved(Integer s7RfReserved) {
		this.s7RfReserved = s7RfReserved;
	}

	public String getS7SerialNumber() {
		return this.s7SerialNumber;
	}

	public void setS7SerialNumber(String s7SerialNumber) {
		this.s7SerialNumber = s7SerialNumber;
	}

	public Short getS7TChange() {
		return this.s7TChange;
	}

	public void setS7TChange(Short s7TChange) {
		this.s7TChange = s7TChange;
	}

	public BigDecimal getS7Temperature() {
		return this.s7Temperature;
	}

	public void setS7Temperature(BigDecimal s7Temperature) {
		this.s7Temperature = s7Temperature;
	}

	public String getS7TemperatureA2d() {
		return this.s7TemperatureA2d;
	}

	public void setS7TemperatureA2d(String s7TemperatureA2d) {
		this.s7TemperatureA2d = s7TemperatureA2d;
	}

	public Timestamp getS7TxDttm() {
		return this.s7TxDttm;
	}

	public void setS7TxDttm(Timestamp s7TxDttm) {
		this.s7TxDttm = s7TxDttm;
	}

	public BigDecimal getS7Voltage() {
		return this.s7Voltage;
	}

	public void setS7Voltage(BigDecimal s7Voltage) {
		this.s7Voltage = s7Voltage;
	}

	public Short getS7XTilt() {
		return this.s7XTilt;
	}

	public void setS7XTilt(Short s7XTilt) {
		this.s7XTilt = s7XTilt;
	}

	public Short getS7XTiltChange() {
		return this.s7XTiltChange;
	}

	public void setS7XTiltChange(Short s7XTiltChange) {
		this.s7XTiltChange = s7XTiltChange;
	}

	public Short getS7XTiltDigital() {
		return this.s7XTiltDigital;
	}

	public void setS7XTiltDigital(Short s7XTiltDigital) {
		this.s7XTiltDigital = s7XTiltDigital;
	}

	public Short getS7YTilt() {
		return this.s7YTilt;
	}

	public void setS7YTilt(Short s7YTilt) {
		this.s7YTilt = s7YTilt;
	}

	public Short getS7YTiltChange() {
		return this.s7YTiltChange;
	}

	public void setS7YTiltChange(Short s7YTiltChange) {
		this.s7YTiltChange = s7YTiltChange;
	}

	public Short getS7YTiltDigital() {
		return this.s7YTiltDigital;
	}

	public void setS7YTiltDigital(Short s7YTiltDigital) {
		this.s7YTiltDigital = s7YTiltDigital;
	}

	public BigDecimal getS8Analog() {
		return this.s8Analog;
	}

	public void setS8Analog(BigDecimal s8Analog) {
		this.s8Analog = s8Analog;
	}

	public String getS8AnalogA2d() {
		return this.s8AnalogA2d;
	}

	public void setS8AnalogA2d(String s8AnalogA2d) {
		this.s8AnalogA2d = s8AnalogA2d;
	}

	public Short getS8Digital() {
		return this.s8Digital;
	}

	public void setS8Digital(Short s8Digital) {
		this.s8Digital = s8Digital;
	}

	public Short getS8Digital2() {
		return this.s8Digital2;
	}

	public void setS8Digital2(Short s8Digital2) {
		this.s8Digital2 = s8Digital2;
	}

	public Short getS8Digital2Change() {
		return this.s8Digital2Change;
	}

	public void setS8Digital2Change(Short s8Digital2Change) {
		this.s8Digital2Change = s8Digital2Change;
	}

	public Short getS8DigitalChange() {
		return this.s8DigitalChange;
	}

	public void setS8DigitalChange(Short s8DigitalChange) {
		this.s8DigitalChange = s8DigitalChange;
	}

	public Short getS8LowVoltage() {
		return this.s8LowVoltage;
	}

	public void setS8LowVoltage(Short s8LowVoltage) {
		this.s8LowVoltage = s8LowVoltage;
	}

	public Short getS8PowerSource() {
		return this.s8PowerSource;
	}

	public void setS8PowerSource(Short s8PowerSource) {
		this.s8PowerSource = s8PowerSource;
	}

	public Integer getS8RfReserved() {
		return this.s8RfReserved;
	}

	public void setS8RfReserved(Integer s8RfReserved) {
		this.s8RfReserved = s8RfReserved;
	}

	public String getS8SerialNumber() {
		return this.s8SerialNumber;
	}

	public void setS8SerialNumber(String s8SerialNumber) {
		this.s8SerialNumber = s8SerialNumber;
	}

	public Short getS8TChange() {
		return this.s8TChange;
	}

	public void setS8TChange(Short s8TChange) {
		this.s8TChange = s8TChange;
	}

	public BigDecimal getS8Temperature() {
		return this.s8Temperature;
	}

	public void setS8Temperature(BigDecimal s8Temperature) {
		this.s8Temperature = s8Temperature;
	}

	public String getS8TemperatureA2d() {
		return this.s8TemperatureA2d;
	}

	public void setS8TemperatureA2d(String s8TemperatureA2d) {
		this.s8TemperatureA2d = s8TemperatureA2d;
	}

	public Timestamp getS8TxDttm() {
		return this.s8TxDttm;
	}

	public void setS8TxDttm(Timestamp s8TxDttm) {
		this.s8TxDttm = s8TxDttm;
	}

	public BigDecimal getS8Voltage() {
		return this.s8Voltage;
	}

	public void setS8Voltage(BigDecimal s8Voltage) {
		this.s8Voltage = s8Voltage;
	}

	public Short getS8XTilt() {
		return this.s8XTilt;
	}

	public void setS8XTilt(Short s8XTilt) {
		this.s8XTilt = s8XTilt;
	}

	public Short getS8XTiltChange() {
		return this.s8XTiltChange;
	}

	public void setS8XTiltChange(Short s8XTiltChange) {
		this.s8XTiltChange = s8XTiltChange;
	}

	public Short getS8XTiltDigital() {
		return this.s8XTiltDigital;
	}

	public void setS8XTiltDigital(Short s8XTiltDigital) {
		this.s8XTiltDigital = s8XTiltDigital;
	}

	public Short getS8YTilt() {
		return this.s8YTilt;
	}

	public void setS8YTilt(Short s8YTilt) {
		this.s8YTilt = s8YTilt;
	}

	public Short getS8YTiltChange() {
		return this.s8YTiltChange;
	}

	public void setS8YTiltChange(Short s8YTiltChange) {
		this.s8YTiltChange = s8YTiltChange;
	}

	public Short getS8YTiltDigital() {
		return this.s8YTiltDigital;
	}

	public void setS8YTiltDigital(Short s8YTiltDigital) {
		this.s8YTiltDigital = s8YTiltDigital;
	}

	public BigDecimal getS9Analog() {
		return this.s9Analog;
	}

	public void setS9Analog(BigDecimal s9Analog) {
		this.s9Analog = s9Analog;
	}

	public String getS9AnalogA2d() {
		return this.s9AnalogA2d;
	}

	public void setS9AnalogA2d(String s9AnalogA2d) {
		this.s9AnalogA2d = s9AnalogA2d;
	}

	public Short getS9Digital() {
		return this.s9Digital;
	}

	public void setS9Digital(Short s9Digital) {
		this.s9Digital = s9Digital;
	}

	public Short getS9Digital2() {
		return this.s9Digital2;
	}

	public void setS9Digital2(Short s9Digital2) {
		this.s9Digital2 = s9Digital2;
	}

	public Short getS9Digital2Change() {
		return this.s9Digital2Change;
	}

	public void setS9Digital2Change(Short s9Digital2Change) {
		this.s9Digital2Change = s9Digital2Change;
	}

	public Short getS9DigitalChange() {
		return this.s9DigitalChange;
	}

	public void setS9DigitalChange(Short s9DigitalChange) {
		this.s9DigitalChange = s9DigitalChange;
	}

	public Short getS9LowVoltage() {
		return this.s9LowVoltage;
	}

	public void setS9LowVoltage(Short s9LowVoltage) {
		this.s9LowVoltage = s9LowVoltage;
	}

	public Short getS9PowerSource() {
		return this.s9PowerSource;
	}

	public void setS9PowerSource(Short s9PowerSource) {
		this.s9PowerSource = s9PowerSource;
	}

	public Integer getS9RfReserved() {
		return this.s9RfReserved;
	}

	public void setS9RfReserved(Integer s9RfReserved) {
		this.s9RfReserved = s9RfReserved;
	}

	public String getS9SerialNumber() {
		return this.s9SerialNumber;
	}

	public void setS9SerialNumber(String s9SerialNumber) {
		this.s9SerialNumber = s9SerialNumber;
	}

	public Short getS9TChange() {
		return this.s9TChange;
	}

	public void setS9TChange(Short s9TChange) {
		this.s9TChange = s9TChange;
	}

	public BigDecimal getS9Temperature() {
		return this.s9Temperature;
	}

	public void setS9Temperature(BigDecimal s9Temperature) {
		this.s9Temperature = s9Temperature;
	}

	public String getS9TemperatureA2d() {
		return this.s9TemperatureA2d;
	}

	public void setS9TemperatureA2d(String s9TemperatureA2d) {
		this.s9TemperatureA2d = s9TemperatureA2d;
	}

	public Timestamp getS9TxDttm() {
		return this.s9TxDttm;
	}

	public void setS9TxDttm(Timestamp s9TxDttm) {
		this.s9TxDttm = s9TxDttm;
	}

	public BigDecimal getS9Voltage() {
		return this.s9Voltage;
	}

	public void setS9Voltage(BigDecimal s9Voltage) {
		this.s9Voltage = s9Voltage;
	}

	public Short getS9XTilt() {
		return this.s9XTilt;
	}

	public void setS9XTilt(Short s9XTilt) {
		this.s9XTilt = s9XTilt;
	}

	public Short getS9XTiltChange() {
		return this.s9XTiltChange;
	}

	public void setS9XTiltChange(Short s9XTiltChange) {
		this.s9XTiltChange = s9XTiltChange;
	}

	public Short getS9XTiltDigital() {
		return this.s9XTiltDigital;
	}

	public void setS9XTiltDigital(Short s9XTiltDigital) {
		this.s9XTiltDigital = s9XTiltDigital;
	}

	public Short getS9YTilt() {
		return this.s9YTilt;
	}

	public void setS9YTilt(Short s9YTilt) {
		this.s9YTilt = s9YTilt;
	}

	public Short getS9YTiltChange() {
		return this.s9YTiltChange;
	}

	public void setS9YTiltChange(Short s9YTiltChange) {
		this.s9YTiltChange = s9YTiltChange;
	}

	public Short getS9YTiltDigital() {
		return this.s9YTiltDigital;
	}

	public void setS9YTiltDigital(Short s9YTiltDigital) {
		this.s9YTiltDigital = s9YTiltDigital;
	}

	public Integer getSecondFromPreviousMessage() {
		return this.secondFromPreviousMessage;
	}

	public void setSecondFromPreviousMessage(Integer secondFromPreviousMessage) {
		this.secondFromPreviousMessage = secondFromPreviousMessage;
	}

	public BigDecimal getSpeed() {
		return this.speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}

	public Short getSpeedDrop() {
		return this.speedDrop;
	}

	public void setSpeedDrop(Short speedDrop) {
		this.speedDrop = speedDrop;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Short getStuA2d1() {
		return this.stuA2d1;
	}

	public void setStuA2d1(Short stuA2d1) {
		this.stuA2d1 = stuA2d1;
	}

	public Short getStuA2d2() {
		return this.stuA2d2;
	}

	public void setStuA2d2(Short stuA2d2) {
		this.stuA2d2 = stuA2d2;
	}

	public BigDecimal getStuAnalog1() {
		return this.stuAnalog1;
	}

	public void setStuAnalog1(BigDecimal stuAnalog1) {
		this.stuAnalog1 = stuAnalog1;
	}

	public BigDecimal getStuAnalog2() {
		return this.stuAnalog2;
	}

	public void setStuAnalog2(BigDecimal stuAnalog2) {
		this.stuAnalog2 = stuAnalog2;
	}

	public Boolean getStuDigital1() {
		return this.stuDigital1;
	}

	public void setStuDigital1(Boolean stuDigital1) {
		this.stuDigital1 = stuDigital1;
	}

	public Boolean getStuDigital2() {
		return this.stuDigital2;
	}

	public void setStuDigital2(Boolean stuDigital2) {
		this.stuDigital2 = stuDigital2;
	}

	public Integer getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public BigDecimal getTemperature1() {
		return this.temperature1;
	}

	public void setTemperature1(BigDecimal temperature1) {
		this.temperature1 = temperature1;
	}

	public BigDecimal getTemperature2() {
		return this.temperature2;
	}

	public void setTemperature2(BigDecimal temperature2) {
		this.temperature2 = temperature2;
	}

	public Short getTemperatureAl() {
		return this.temperatureAl;
	}

	public void setTemperatureAl(Short temperatureAl) {
		this.temperatureAl = temperatureAl;
	}

	public Short getTemperatureAl2() {
		return this.temperatureAl2;
	}

	public void setTemperatureAl2(Short temperatureAl2) {
		this.temperatureAl2 = temperatureAl2;
	}

	public Short getTemperatureAmbient() {
		return this.temperatureAmbient;
	}

	public void setTemperatureAmbient(Short temperatureAmbient) {
		this.temperatureAmbient = temperatureAmbient;
	}

	public Short getTemperatureAr() {
		return this.temperatureAr;
	}

	public void setTemperatureAr(Short temperatureAr) {
		this.temperatureAr = temperatureAr;
	}

	public Short getTemperatureAr2() {
		return this.temperatureAr2;
	}

	public void setTemperatureAr2(Short temperatureAr2) {
		this.temperatureAr2 = temperatureAr2;
	}

	public Short getTemperatureBl() {
		return this.temperatureBl;
	}

	public void setTemperatureBl(Short temperatureBl) {
		this.temperatureBl = temperatureBl;
	}

	public Short getTemperatureBl2() {
		return this.temperatureBl2;
	}

	public void setTemperatureBl2(Short temperatureBl2) {
		this.temperatureBl2 = temperatureBl2;
	}

	public Short getTemperatureBr() {
		return this.temperatureBr;
	}

	public void setTemperatureBr(Short temperatureBr) {
		this.temperatureBr = temperatureBr;
	}

	public Short getTemperatureBr2() {
		return this.temperatureBr2;
	}

	public void setTemperatureBr2(Short temperatureBr2) {
		this.temperatureBr2 = temperatureBr2;
	}

	public Short getTemperatureCoolant() {
		return this.temperatureCoolant;
	}

	public void setTemperatureCoolant(Short temperatureCoolant) {
		this.temperatureCoolant = temperatureCoolant;
	}

	public BigDecimal getTimeSinceMoveBegin() {
		return this.timeSinceMoveBegin;
	}

	public void setTimeSinceMoveBegin(BigDecimal timeSinceMoveBegin) {
		this.timeSinceMoveBegin = timeSinceMoveBegin;
	}

	public BigDecimal getTimeSinceMoveEnd() {
		return this.timeSinceMoveEnd;
	}

	public void setTimeSinceMoveEnd(BigDecimal timeSinceMoveEnd) {
		this.timeSinceMoveEnd = timeSinceMoveEnd;
	}

	public Integer getTimeToFix() {
		return this.timeToFix;
	}

	public void setTimeToFix(Integer timeToFix) {
		this.timeToFix = timeToFix;
	}

	public Timestamp getUnitDttm() {
		return this.unitDttm;
	}

	public void setUnitDttm(Timestamp unitDttm) {
		this.unitDttm = unitDttm;
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUnitInfo() {
		return this.unitInfo;
	}

	public void setUnitInfo(String unitInfo) {
		this.unitInfo = unitInfo;
	}

	public String getUnitInfo2() {
		return this.unitInfo2;
	}

	public void setUnitInfo2(String unitInfo2) {
		this.unitInfo2 = unitInfo2;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitType() {
		return this.unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Short getWabtecFuel() {
		return this.wabtecFuel;
	}

	public void setWabtecFuel(Short wabtecFuel) {
		this.wabtecFuel = wabtecFuel;
	}

	public Integer getWindDegrees() {
		return this.windDegrees;
	}

	public void setWindDegrees(Integer windDegrees) {
		this.windDegrees = windDegrees;
	}

	public Integer getWindSpeed() {
		return this.windSpeed;
	}

	public void setWindSpeed(Integer windSpeed) {
		this.windSpeed = windSpeed;
	}

	public BigDecimal getXDv() {
		return this.xDv;
	}

	public void setXDv(BigDecimal xDv) {
		this.xDv = xDv;
	}

	public BigDecimal getXG100hz() {
		return this.xG100hz;
	}

	public void setXG100hz(BigDecimal xG100hz) {
		this.xG100hz = xG100hz;
	}

	public BigDecimal getXG10hz() {
		return this.xG10hz;
	}

	public void setXG10hz(BigDecimal xG10hz) {
		this.xG10hz = xG10hz;
	}

	public BigDecimal getYDv() {
		return this.yDv;
	}

	public void setYDv(BigDecimal yDv) {
		this.yDv = yDv;
	}

	public BigDecimal getYG100hz() {
		return this.yG100hz;
	}

	public void setYG100hz(BigDecimal yG100hz) {
		this.yG100hz = yG100hz;
	}

	public BigDecimal getYG10hz() {
		return this.yG10hz;
	}

	public void setYG10hz(BigDecimal yG10hz) {
		this.yG10hz = yG10hz;
	}

	public BigDecimal getZDv() {
		return this.zDv;
	}

	public void setZDv(BigDecimal zDv) {
		this.zDv = zDv;
	}

	public BigDecimal getZG100hz() {
		return this.zG100hz;
	}

	public void setZG100hz(BigDecimal zG100hz) {
		this.zG100hz = zG100hz;
	}

	public BigDecimal getZG10hz() {
		return this.zG10hz;
	}

	public void setZG10hz(BigDecimal zG10hz) {
		this.zG10hz = zG10hz;
	}

}