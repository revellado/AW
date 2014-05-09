package es.unileon.aplicacionesweb.springapp.logic.account;

/**
*
* @author runix
*/
public class DetailedInformation {

//	 Original code
//   private final StringBuffer info;
//   private boolean nonEditable;
	 private StringBuffer info;
     public StringBuffer getInfo() {
		return info;
	}

	public void setInfo(StringBuffer info) {
		this.info = info;
	}

	public boolean isNonEditable() {
		return nonEditable;
	}

	public void setNonEditable(boolean nonEditable) {
		this.nonEditable = nonEditable;
	}

	private boolean nonEditable;
     
   /**
    *
    * @param information
    */
   public DetailedInformation(String information) {
       this.info = new StringBuffer(information);
       this.nonEditable = false;
   }

   /**
    *
    */
   public DetailedInformation() {
       this("");
   }

   /**
    *
    * @param information
    */
   public void appendInformation(String information) {
       if (!this.nonEditable) {
           this.info.append(information);
           if (information.charAt(information.length() - 1) != '\n') {
               this.info.append("\n");
           }
       }
   }

   /**
    *
    * @param information
    */
   public void appendInformaton(StringBuffer information) {
       this.appendInformation(information.toString());
   }

   /**
    *
    */
   public void doFinal() {
       this.nonEditable = true;
   }
   
   /**
    *
    * @return
    */
   @Override
   public String toString() {
       return this.info.toString();
   }
}
