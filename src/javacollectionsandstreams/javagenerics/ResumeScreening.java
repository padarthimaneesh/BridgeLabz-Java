package javacollectionsandstreams.javagenerics;

abstract class JobRole {
    String role;

    JobRole(String role) {
        this.role = role;
    }

    abstract void screen();
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }

    void screen() {
        System.out.println("Screening resume for " + role);
    }
}

class Resume<T extends JobRole> {
    T job;

    Resume(T job) {
        this.job = job;
    }

    void process() {
        job.screen();
    }
}

public class ResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r = new Resume<>(new SoftwareEngineer());
        r.process();
    }
}