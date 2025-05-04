package pro1.apiDataModel;
import com.google.gson.annotations.SerializedName;

public class PrijmaciObor {


    @SerializedName("eprDeadlinePrihlaska")
    public ValueWrapper deadline;

    @SerializedName("eprDatumOd")
    public ValueWrapper eprDatumOd;

    @SerializedName("eprPouzivat")
    public String useFlag;

    @SerializedName("globalIdno")
    public long globalId;

    @SerializedName("kombIdno")
    public Long combinationId;

    @SerializedName("misto")
    public String location;

    @SerializedName("nazev")
    public String title;

    @SerializedName("oborIdno")
    public int fieldId;

    @SerializedName("predpisIdno")
    public Long regulationId;

    @SerializedName("rok")
    public String year;

    @SerializedName("stprIdno")
    public int studyPlanId;

    @SerializedName("webUrl")
    public String webUrl;

    @SerializedName("fakulta")
    public String faculty;

    @SerializedName("fakultaTxt")
    public String facultyText;

    @SerializedName("forma")
    public String form;

    @SerializedName("typ")
    public String type;

    @SerializedName("programNazev")
    public String programTitle;

    @SerializedName("typProgramu")
    public String programType;

    @SerializedName("programKod")
    public String programCode;

    @SerializedName("programJazyk")
    public String programLanguage;

    @SerializedName("oborZkratka")
    public String fieldShort;

    @SerializedName("oborNazev")
    public String fieldName;

    @SerializedName("eprihlaskaCleanURL")
    public String applicationUrl;

    public static class ValueWrapper {
        @SerializedName("value")
        public String value;
    }



}
