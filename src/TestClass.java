class TestClass {

    public boolean AssertEquals(Object value1, Object value2) {
        if (value1 == value2) {
            return true;
        } else {
            System.out.println("AssertEquals FAILURE: ["+value1+", "+value2+"]");
            return false;
        }
    }

    public boolean AssertNotEquals(Object value1, Object value2) {
        if (value1 != value2) {
            return true;
        } else {
            System.out.println("AssertNotEquals FAILURE: ["+value1+", "+value2+"]");
            return false;
        }
    }

    public boolean AssertTrue(Boolean condition) {
        if (condition == true) {
            return true;
        } else {
            System.out.println("AssertTrue FAILURE: ["+condition+"]");
            return false;
        }
    }

    public boolean AssertFalse(Boolean condition) {
        if (condition != true) {
            return true;
        } else {
            System.out.println("AssertFalse FAILURE: ["+condition+"]");
            return false;
        }
    }

    public boolean AssertBlank(Object value) {
        if (value == "") {
            return true;
        } else {
            System.out.println("AssertBlank FAILURE: ["+value+"]");
            return false;
        }
    }

    public boolean AssertNotBlank(Object value) {
        if (value != "") {
            return true;
        } else {
            System.out.println("AssertNotBlank FAILURE: ["+value+"]");
            return false;
        }
    }

}
