package test;

import com.google.gson.annotations.SerializedName;

public class TestModel {

	@SerializedName("savol")
	private String savol;
	@SerializedName("javob1")
	private String javob1;


	@SerializedName("aniqJavob")
	private String aniqJavob;

	@SerializedName("javob4")
	private String javob4;

	@SerializedName("javob3")
	private String javob3;

	@SerializedName("javob2")
	private String javob2;

	public TestModel(String savol,String javob1, String javob2 ,String javob3, String javob4,  String aniqJavob) {
		this.javob1 = javob1;
		this.savol = savol;
		this.aniqJavob = aniqJavob;
		this.javob4 = javob4;
		this.javob3 = javob3;
		this.javob2 = javob2;
	}

	public void setJavob1(String javob1){
		this.javob1 = javob1;
	}

	public String getJavob1(){
		return javob1;
	}

	public void setSavol(String savol){
		this.savol = savol;
	}

	public String getSavol(){
		return savol;
	}

	public void setAniqJavob(String aniqJavob){
		this.aniqJavob = aniqJavob;
	}

	public String getAniqJavob(){
		return aniqJavob;
	}

	public void setJavob4(String javob4){
		this.javob4 = javob4;
	}

	public String getJavob4(){
		return javob4;
	}

	public void setJavob3(String javob3){
		this.javob3 = javob3;
	}

	public String getJavob3(){
		return javob3;
	}

	public void setJavob2(String javob2){
		this.javob2 = javob2;
	}

	public String getJavob2(){
		return javob2;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"javob1 = '" + javob1 + '\'' + 
			",savol = '" + savol + '\'' + 
			",aniqJavob = '" + aniqJavob + '\'' + 
			",javob4 = '" + javob4 + '\'' + 
			",javob3 = '" + javob3 + '\'' + 
			",javob2 = '" + javob2 + '\'' + 
			"}";
		}
}