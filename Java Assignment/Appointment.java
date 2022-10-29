 public abstract class Appoinment {
        private String description;


        public Appointment()
        {
            description = "";
        }
        public void setDescription(String description)
        {
            this.description = description;
        }
        public abstract boolean occursOn(int year, int month, int day);

        public String toString()
        {
            return description;
        }
    }
}
