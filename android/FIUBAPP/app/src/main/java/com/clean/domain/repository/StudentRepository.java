/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clean.domain.repository;

import com.clean.domain.model.Course;
import com.clean.domain.model.DegreeProgram;
import com.clean.domain.model.Student;
import com.clean.domain.model.Subject;

import java.util.List;
import java.util.Map;


/**
 * Interface that represents a Repository for getting {@link Student} related data.
 */
public interface StudentRepository {

    /**
     * Get a List of {@link DegreeProgram}.
     */
    List<DegreeProgram> getDegreePrograms();

    /**
     * Get a List of {@link Subject}.
     */
    List<Subject> getAvailableSubjects();

    /**
     * Get a Map of {@link Course} as value, and the subject code as key.
     */
    Map<Integer, Course> getEnrolledCourses();

    /**
     * Get a list of {@link Course}.
     * @param subjectCode The subject code used to retrieve the courses of the subject.
     */
    List<Course> getCourses(final int subjectCode);

    /**
     * Get a {@link Course}.
     * @param subjectCode The subject code used to retrieve the courses of the subject.
     * @param courseId The course id used to retrieve the course.
     */
    Course getCourse(final int subjectCode, final int courseId);

    /**
     * Get a {@link Subject}.
     */
    Subject getSubject(final int subjectCode);


    /**
     * Save the enrolled {@link Course}.
     * @param subjectCode The subject code of the subject from wich is the course.
     * @param course The course enrolled.
     */
    void enrollCourse(final int subjectCode, Course course);

}