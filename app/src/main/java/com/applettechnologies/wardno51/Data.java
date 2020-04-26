package com.applettechnologies.wardno51;

public class Data {

    private String DataId;
    private String DataDistrictName;
    private String DataWard;
    private String DataBooth;
    private String DataPersonName;
    private String DataMob1;
    private String DataMob2;
    private String DataKarykrta;
    private String DataRemark;

    public Data(){

    }

    public Data(String dataId, String dataDistrictName, String dataWard, String dataBooth, String dataPersonName, String dataMob1, String dataMob2, String dataKarykrta, String dataRemark) {
        DataId = dataId;
        DataDistrictName = dataDistrictName;
        DataWard = dataWard;
        DataBooth = dataBooth;
        DataPersonName = dataPersonName;
        DataMob1 = dataMob1;
        DataMob2 = dataMob2;
        DataKarykrta = dataKarykrta;
        DataRemark = dataRemark;


    }

    public String getDataId() {
        return DataId;
    }

    public String getDataName() {
        return DataDistrictName;
    }

    public String getDataWard() {
        return DataWard;
    }

    public String getDataBooth() {
        return DataBooth;
    }

    public String getDataPersonName() {
        return DataPersonName;
    }

    public String getDataMob1() { return DataMob1; }

    public String getDataMob2() { return DataMob2; }

    public String getDataKarykrta() { return DataKarykrta; }

    public String getDataRemark() { return DataRemark; }

}
