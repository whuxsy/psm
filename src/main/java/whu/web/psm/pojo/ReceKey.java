package whu.web.psm.pojo;

public class ReceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rece.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rece.mid
     *
     * @mbggenerated
     */
    private Integer mid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rece.phone
     *
     * @return the value of rece.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rece.phone
     *
     * @param phone the value for rece.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rece.mid
     *
     * @return the value of rece.mid
     *
     * @mbggenerated
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rece.mid
     *
     * @param mid the value for rece.mid
     *
     * @mbggenerated
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }
}