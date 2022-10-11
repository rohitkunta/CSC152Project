/***************************************************************************
This is a Policy Class that will model an insurance policy for one person *
****************************************************************************/

public class Policy
{
    private long policyNumber;
    private String fullName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     no-arg constructor, sets numerical values to -1 and String
     Values to blank.
     */
    public Policy()
    {
        policyNumber = -1;
        fullName = "";
        firstName = "";
        lastName = "";
        age = -1;
        smokingStatus = "";
        height = -1;
        weight = -1;
    }

    /**
     * constructor that sets values of
     * Policy object to desired values
     * @param pNumber
     * @param fullN
     * @param firstN
     * @param lastN
     * @param yearsLived
     * @param smoker
     * @param heightOfHolder
     * @param weightOfHolder
     */
    public Policy(long pNumber, String fullN, String firstN, String lastN, int yearsLived, String smoker, double heightOfHolder, double weightOfHolder)
    {
        policyNumber = pNumber;
        fullName = fullN;
        firstName = firstN;
        lastName = lastN;
        age = yearsLived;
        smokingStatus = smoker;
        height = heightOfHolder;
        weight = weightOfHolder;
    }

    /**
     * sets policyNumber field
     * @param pNumber
     */
    public void setPolicyNumber(long pNumber)
    {
        policyNumber = pNumber;
    }

    /**
     * accessor method for the policy number field
     * @return policy Number
     */
    public long getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * sets fullName field
     * @param fullN
     */
    public void setFullName(String fullN)
    {
        fullName = fullN;
    }

    /**
     * accessor method for the fullName field
     * @return full name of the policy holder
     */
    public String getFullName()
    {
        return fullName;
    }

    /**
     * sets firstName field
     * @param firstN
     */
    public void setFirstName(String firstN)
    {
        firstName = firstN;
    }

    /**
     * accessor method for the firstName field
     * @return first name of the policy holder
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * sets lastName field
     * @param lastN
     */
    public void setLastName(String lastN)
    {
        lastName = lastN;
    }

    /**
     * accessor method for the lastName field
     * @return last name of the policy holder
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * sets age field
     * @param yearsLived
     */
    public void setAge(int yearsLived)
    {
        age = yearsLived;
    }

    /**
     * accessor method for the age field
     * @return age of the policy holder
     */
    public int getAge()
    {
        return age;
    }

    /**
     * sets smokingStatus field
     * @param smoker
     */
    public void setSmokingStatus(String smoker)
    {
        smokingStatus = smoker;
    }

    /**
     * accessor method for the smokingStatus field
     * @return smoking status of the policy holder
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * sets height field
     * @param heightOfHolder
     */
    public void setHeight(double heightOfHolder)
    {
        height = heightOfHolder;
    }

    /**
     * accessor method for the height field
     * @return height of the policy holder in inches
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * sets weight field
     * @param weightOfHolder
     */
    public void setWeight(double weightOfHolder)
    {
        weight = weightOfHolder;
    }

    /**
     * accessor method for the weight field
     * @return weight of the policyholder in pounds
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * calculates and returns the BMI of the policy holder
     * @return the BMI of the policyholder
     */
    public double getBMI()
    {
        return ((weight * 703D)/(height*height));
    }

    /**
     * calculates and returns the price of the insurance policy
     * @return the price of the insurance policy
     */
    public double getPrice()
    {
        double totalPrice = 600;
        if (age > 50)
        {
            totalPrice += 75;
        }

        if (smokingStatus.equals("smoker"))
        {
            totalPrice += 100;
        }

        if (getBMI() > 35)
        {
            totalPrice += ((getBMI() - 35) * 20);
        }

        return totalPrice;
    }

}