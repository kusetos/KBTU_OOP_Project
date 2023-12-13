package Enumerators;

public enum Grade {
    A,
    AMINUS {
        public String toString(){
            return "A+";
        }
    },
    BPLUS {
        public String toString(){
            return "B+";
        }
    },
    B,
    BMINUS {
        public String toString(){
            return "B-";
        }
    },
    CPLUS {
        public String toString(){
            return "C+";
        }
    },
    C,
    CMINUS {
        public String toString(){
            return "C-";
        }
    },
    DPLUS {
        public String toString(){
            return "D+";
        }
    },
    D,
    DMINUS {
        public String toString(){
            return "D-";
        }
    }
    
}