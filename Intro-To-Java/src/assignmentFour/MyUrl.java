package assignmentFour;

public class MyUrl {

    private String mUrl;
    private int count;

    /* this constructor initializes the base URL to the url parameter value.
    It adds the protocol prefix http:// on the front if not present in the url
    parameter */
    public MyUrl(String url) {

        if (url.startsWith("http://") != true) {
            mUrl = "http://" + url;
        } else {
            mUrl = url;
        }

    }

    /* this overloaded method adds a string argument to the URL of the form n
    ame=value.  It URL encodes both the name and value parameters by calling 
   the urlEncode() method on each. */


    public void addArgument(String name, String value) {

        count++;

        if (count == 1) {
            mUrl = mUrl + "?";
        } else {
            mUrl = mUrl + "&";
        }

        String encodedName;
        String encodedValue;
        encodedName = urlEncode(name);
        encodedValue = urlEncode(value);
        mUrl = mUrl + encodedName + "=" + encodedValue;

    }

    /* this overloaded method adds an int argument to the URL of the form 
    name=value. It URL encodes the name parameter by calling urlEncode().. 
    The value is the string representation of the ivalue parameter. Use 
    Integer.toString(ivalue) to convert the integer to a string representation.
    */
    
    public void addArgument(String name, int ivalue) {
        
        count++;

        if (count == 1) {
            mUrl = mUrl + "?";
        } else {
            mUrl = mUrl + "&";
        }

        String encodedName, encodedIvalue;
        encodedName = urlEncode(name);
        encodedIvalue = Integer.toString(ivalue);
        mUrl = mUrl + encodedName + "=" + encodedIvalue;

    }
    
    /*this overloaded method adds a double argument to the URL of the 
    form name=value. It URL encodes the name parameter by calling urlEncode().. 
    The value is the string representation of the dvalue parameter. 
    Use Double.toString(dvalue) to convert the double to a string representation.
    */
    
    public void addArgument(String name, double dvalue) {

        count++;

        if (count == 1) {
            mUrl = mUrl + "?";
        } else {
            mUrl = mUrl + "&";
        }

        String encodedName, encodedDvalue;
        encodedName = urlEncode(name);
        encodedDvalue = Double.toString(dvalue);
        mUrl = mUrl + encodedName + "=" + encodedDvalue;

    }

    /* this method returns the object's URL value (the base URL plus all arguments).*/
    
    @Override
    public String toString() {
        return mUrl;
    }

    public static String urlEncode(String text) {
        String output = "";
        int encode = text.length();

        for (int i = 0; i < encode; i++) {

            // Assigns iterated characters to a variable 
            char n = text.charAt(i);

            //String of acceptable ASCII characters
            String acceptable;
            acceptable = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-"
                    + "_.*";

            /* Loop that runs through each character and replaces spaces with 
            '+' and adds '%' + the correct ASCII character for the characters 
            that aren't included in the String of acceptable characters. */
            if (acceptable.indexOf(n) != -1) {

                output += n;

            } else if (n == ' ') {
                output += "+";
            } else {
                String hexValue = Integer.toHexString(n);
                output += '%' + hexValue;

            }
        }
        return output;
    }

}
