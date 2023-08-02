package com.example.atria;

public class RegisterActivity {
        public String name;
        public String team;
        public String mem;
        public String contact;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public RegisterActivity() {

        }

        public RegisterActivity(String name, String team, String mem, String contact) {
            this.name = name;
            this.team = team;
            this.mem = mem;
            this.contact = contact;
        }

        // Getters and setters (optional)

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

