        package org.example;

        import java.util.Arrays;

        public class Employee {
            private int id;
            private String fullName;
            private String email;
            private String password;
            private String[] healthPlans;

            public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
                this.id = id;
                this.fullName = fullName;
                this.email = email;
                this.password = password;
                this.healthPlans = healthPlans;
            }

            public String getPassword() {
                return password;
            }

            public String getFullName() {
                return fullName;
            }

            public String getEmail() {
                return email;
            }

            public int getId() {
                return id;
            }

            public String[] getHealthPlans() {
                return healthPlans;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public void setHealthPlans(String[] healthPlans) {
                this.healthPlans = healthPlans;
            }
            public void addHealthPlan(int index, String name) {

                if (index < 0 || index >= healthPlans.length) {
                    return;
                }

                if (healthPlans[index] == null) {
                    healthPlans[index] = name;
                } else {
                    System.out.println("Index " + index + " zaten dolu! Bu alanda yeni bir plan eklenemez.");
                }
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", fullName='" + fullName + '\'' +
                        ", email='" + email + '\'' +
                        ", password='" + password + '\'' +
                        ", healthPlans=" + Arrays.toString(healthPlans) +
                        '}';
            }
        }
