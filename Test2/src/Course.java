public enum Course {

        SCSJ2154("Object Oriented Programming", 4),
        SCSD2623("Database Systems", 3),
        SCSV1223("Web Development", 3),
        SCSJ2203("Software Engineering", 3),
        SCSR2043("Operating Systems", 3),
        ULAB2122("English Language", 2),
        UCSD2762("Technopreneurship", 2),
        SCSD3761("Technical Seminar", 1);

         String code;
         String desc;
         int credit;

        Course(String desc, int credit) {

            this.desc = desc;
            this.credit = credit;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public double getGradeValue() {
            if (code == "A")
                return 4.0;
            else if (code == "B")
                return 3.0;
            else if (code == "C")
                return 2.0;
            else if (code == "D")
                return 1.0;
            else if (code == "E")
                return 0.0;
            else
                return -1;
        }
    
}
