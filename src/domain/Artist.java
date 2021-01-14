package domain;

import java.util.StringJoiner;

/**
 * ���� {@code Artist} ����������� ��'��� �������.
 * 
 */
public class Artist extends Employee {
	
	/**
	 * �������� ����� ��'��� {@code Artist} � ���� �����������.
	 * 
	 * @param skiils � ������ ��������
	 * @param name � ��'� ��������
	 * @param jobTitle � ������ ��������
	 * @param level � ����� ��������
	 * @param dept � ���� ��������
	 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * ������� ����� ��'��� {@code Artist} � ���������� ������ �������.
     * 
     * @param skiils � ������ ��������
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * ������� ����� ��'��� {@code Artist}. ��� ����� ������������ ������ {@link Artist#skiils}.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * �������� ������������� ��'���� {@code Artist}
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    
    /**
     * ������ �������
     */
    private String[] skiils;
    
    /**
     * ������� ������ �������. 
     * @return
     */
    public String getSkills() {
        /*String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;*/
    	StringJoiner sj = new StringJoiner(", ");
    	for (String skiil : skiils) {
    		sj.add(skiil);
        }
    	return sj.toString();
    }
    
    /**
     * ���������� ������� ������ �������. {@link Artist#skiils}
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }
    
    /**
     * ������� ������ ������ �������. {@link Artist#skiils}
     * @return ������ ������� 
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
