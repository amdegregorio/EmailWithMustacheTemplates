package com.amydegregorio.emailwithmustache.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;

public class EmailDto {
   @Email
   public String to;
   public String subject;
   public List<String> tasks;
   
   public EmailDto() {
      tasks = new ArrayList<String>();
      tasks.add("");
   }
   
   /**
    * Gets to.
    * @return the to
    */
   public String getTo() {
      return to;
   }
   
   /**
    * Sets to.
    * @param to the to to set
    */
   public void setTo(String to) {
      this.to = to;
   }
   
   /**
    * Gets subject.
    * @return the subject
    */
   public String getSubject() {
      return subject;
   }
   
   /**
    * Sets subject.
    * @param subject the subject to set
    */
   public void setSubject(String subject) {
      this.subject = subject;
   }
   
   /**
    * Gets tasks.
    * @return the tasks
    */
   public List<String> getTasks() {
      if (tasks == null) {
         tasks = new ArrayList<String>();
      }
      return tasks;
   }
   
   /**
    * Sets tasks.
    * @param tasks the tasks to set
    */
   public void setTasks(List<String> tasks) {
      this.tasks = tasks;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "EmailDto [to=" + to + ", subject=" + subject + ", tasks=" + tasks.size() + "]";
   }

}
