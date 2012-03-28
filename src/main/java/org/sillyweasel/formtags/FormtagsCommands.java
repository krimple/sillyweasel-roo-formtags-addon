package org.sillyweasel.formtags;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.shell.CliCommand;
import org.springframework.roo.shell.CommandMarker;

import java.util.logging.Logger;

/**
 * Define command available for the formtags add-on
 */
@Component // Use these Apache Felix annotations to register your commands class in the Roo container
@Service
public class FormtagsCommands implements CommandMarker { // All command types must implement the CommandMarker interface


  /**
   * Get a reference to the FormtagsOperations from the underlying OSGi container
   */
  @Reference
  private FormtagsOperations operations;

  /**
   * Replace existing MVC tagx files in the target project
   */
  @CliCommand(value = "formtags install", help = "Add new tags (formtags:form, formtags:button, formtags:buttons) for webflow and non-scaffolded forms")
  public void installTags() {
    operations.installTags();
  }
}