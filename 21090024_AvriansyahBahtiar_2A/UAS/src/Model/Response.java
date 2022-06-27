package model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;

public class Response implements Serializable {
    private Integer NewRecovered;

    private BigDecimal Infection_Risk;

    private Integer TotCases_1M_Pop;

    private Integer one_Testevery_X_ppl;

    private Integer TotalCases;

    private Integer Tests_1M_Pop;

    private Integer Deaths_1M_pop;

    private Integer ActiveCases;

    private Integer one_Caseevery_X_ppl;

    private BigDecimal Recovery_Proporation;

    private BigDecimal Case_Fatality_Rate;

    private Integer Serious_Critical;

    private Integer rank;

    private String Population;

    private String id;

    private Integer TotalDeaths;

    private Integer NewDeaths;

    private String TotalRecovered;

    private Integer one_Deathevery_X_ppl;

    private String TwoLetterSymbol;

    private String Continent;

    private String Country;

    private String TotalTests;

    private Integer NewCases;

    private String ThreeLetterSymbol;

    private BigDecimal Test_Percentage;

    public Integer getNewRecovered() {
        return this.NewRecovered;
    }

    public void setNewRecovered(Integer NewRecovered) {
        this.NewRecovered = NewRecovered;
    }

    public BigDecimal getInfection_Risk() {
        return this.Infection_Risk;
    }

    public void setInfection_Risk(BigDecimal Infection_Risk) {
        this.Infection_Risk = Infection_Risk;
    }

    public Integer getTotCases_1M_Pop() {
        return this.TotCases_1M_Pop;
    }

    public void setTotCases_1M_Pop(Integer TotCases_1M_Pop) {
        this.TotCases_1M_Pop = TotCases_1M_Pop;
    }

    public Integer getOne_Testevery_X_ppl() {
        return this.one_Testevery_X_ppl;
    }

    public void setOne_Testevery_X_ppl(Integer one_Testevery_X_ppl) {
        this.one_Testevery_X_ppl = one_Testevery_X_ppl;
    }

    public Integer getTotalCases() {
        return this.TotalCases;
    }

    public void setTotalCases(Integer TotalCases) {
        this.TotalCases = TotalCases;
    }

    public Integer getTests_1M_Pop() {
        return this.Tests_1M_Pop;
    }

    public void setTests_1M_Pop(Integer Tests_1M_Pop) {
        this.Tests_1M_Pop = Tests_1M_Pop;
    }

    public Integer getDeaths_1M_pop() {
        return this.Deaths_1M_pop;
    }

    public void setDeaths_1M_pop(Integer Deaths_1M_pop) {
        this.Deaths_1M_pop = Deaths_1M_pop;
    }

    public Integer getActiveCases() {
        return this.ActiveCases;
    }

    public void setActiveCases(Integer ActiveCases) {
        this.ActiveCases = ActiveCases;
    }

    public Integer getOne_Caseevery_X_ppl() {
        return this.one_Caseevery_X_ppl;
    }

    public void setOne_Caseevery_X_ppl(Integer one_Caseevery_X_ppl) {
        this.one_Caseevery_X_ppl = one_Caseevery_X_ppl;
    }

    public BigDecimal getRecovery_Proporation() {
        return this.Recovery_Proporation;
    }

    public void setRecovery_Proporation(BigDecimal Recovery_Proporation) {
        this.Recovery_Proporation = Recovery_Proporation;
    }

    public BigDecimal getCase_Fatality_Rate() {
        return this.Case_Fatality_Rate;
    }

    public void setCase_Fatality_Rate(BigDecimal Case_Fatality_Rate) {
        this.Case_Fatality_Rate = Case_Fatality_Rate;
    }

    public Integer getSerious_Critical() {
        return this.Serious_Critical;
    }

    public void setSerious_Critical(Integer Serious_Critical) {
        this.Serious_Critical = Serious_Critical;
    }

    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getPopulation() {
        return this.Population;
    }

    public void setPopulation(String Population) {
        this.Population = Population;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalDeaths() {
        return this.TotalDeaths;
    }

    public void setTotalDeaths(Integer TotalDeaths) {
        this.TotalDeaths = TotalDeaths;
    }

    public Integer getNewDeaths() {
        return this.NewDeaths;
    }

    public void setNewDeaths(Integer NewDeaths) {
        this.NewDeaths = NewDeaths;
    }

    public String getTotalRecovered() {
        return this.TotalRecovered;
    }

    public void setTotalRecovered(String TotalRecovered) {
        this.TotalRecovered = TotalRecovered;
    }

    public Integer getOne_Deathevery_X_ppl() {
        return this.one_Deathevery_X_ppl;
    }

    public void setOne_Deathevery_X_ppl(Integer one_Deathevery_X_ppl) {
        this.one_Deathevery_X_ppl = one_Deathevery_X_ppl;
    }

    public String getTwoLetterSymbol() {
        return this.TwoLetterSymbol;
    }

    public void setTwoLetterSymbol(String TwoLetterSymbol) {
        this.TwoLetterSymbol = TwoLetterSymbol;
    }

    public String getContinent() {
        return this.Continent;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getTotalTests() {
        return this.TotalTests;
    }

    public void setTotalTests(String TotalTests) {
        this.TotalTests = TotalTests;
    }

    public Integer getNewCases() {
        return this.NewCases;
    }

    public void setNewCases(Integer NewCases) {
        this.NewCases = NewCases;
    }

    public String getThreeLetterSymbol() {
        return this.ThreeLetterSymbol;
    }

    public void setThreeLetterSymbol(String ThreeLetterSymbol) {
        this.ThreeLetterSymbol = ThreeLetterSymbol;
    }

    public BigDecimal getTest_Percentage() {
        return this.Test_Percentage;
    }

    public void setTest_Percentage(BigDecimal Test_Percentage) {
        this.Test_Percentage = Test_Percentage;
    }
}
