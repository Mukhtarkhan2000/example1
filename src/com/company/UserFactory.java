package com.company;

public class UserFactory {
    User createUser(UserType type) throws Exception {
        User user = null;

        switch (type)
        {
            case STUDENT:
                user = new Student();
                break;
            case PUPIL:
                user = new Pupil();
                break;
            default:
                throw new Exception("Invalid User type!");
        }

        return user;
    }
}