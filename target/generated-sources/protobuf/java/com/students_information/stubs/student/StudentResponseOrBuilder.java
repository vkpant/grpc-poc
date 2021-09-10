// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.students_information.stubs.student;

public interface StudentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.students_information.stubs.student.StudentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string student_id = 1;</code>
   * @return The studentId.
   */
  java.lang.String getStudentId();
  /**
   * <code>string student_id = 1;</code>
   * @return The bytes for studentId.
   */
  com.google.protobuf.ByteString
      getStudentIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.com.students_information.stubs.student.Gender gender = 4;</code>
   * @return The gender.
   */
  com.students_information.stubs.student.Gender getGender();

  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   * @return The enum numeric value on the wire for maths.
   */
  int getMathsValue();
  /**
   * <code>.com.students_information.stubs.student.Grade maths = 5;</code>
   * @return The maths.
   */
  com.students_information.stubs.student.Grade getMaths();

  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   * @return The enum numeric value on the wire for art.
   */
  int getArtValue();
  /**
   * <code>.com.students_information.stubs.student.Grade art = 6;</code>
   * @return The art.
   */
  com.students_information.stubs.student.Grade getArt();

  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   * @return The enum numeric value on the wire for chemistry.
   */
  int getChemistryValue();
  /**
   * <code>.com.students_information.stubs.student.Grade chemistry = 7;</code>
   * @return The chemistry.
   */
  com.students_information.stubs.student.Grade getChemistry();
}