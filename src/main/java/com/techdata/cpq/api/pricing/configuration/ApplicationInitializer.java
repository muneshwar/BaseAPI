package com.techdata.cpq.api.pricing.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author CPQ Pricing Wrapper API Development
 *
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 @Override
 protected Class < ? > [] getRootConfigClasses() {
  return new Class[] {
   ApplicationConfiguration.class
  };
 }
 @Override
 protected Class < ? > [] getServletConfigClasses() {
  return null;
 }
 @Override
 protected String[] getServletMappings() {
  return new String[] {
   "/*"
  };
 }
}