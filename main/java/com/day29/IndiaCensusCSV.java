package com.day29;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    @CsvBindByName(column = "State")
    public String state;

    @CsvBindByName(column = "Population")
    public String population;

    @CsvBindByName(column = "AreaInSq.km")
    public String areaInSqkm;

    @CsvBindByName(column = "DensityPerSq.km")
    public String densityPerSqkm;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" + "state='" + state + '\'' + ", population='" + population + '\'' + ", areaInSqKm='"
                + areaInSqkm + '\'' + ", densityPerSqKm='" + densityPerSqkm + '\'' + '}';
    }

}
