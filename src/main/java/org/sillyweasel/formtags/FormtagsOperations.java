package org.sillyweasel.formtags;

/**
 * Interface for form tags operations
 */
public interface FormtagsOperations {

    /**
     * Indicate of the install tags command should be available
     *
     * @return true if it should be available, otherwise false
     */
    boolean isInstallTagsCommandAvailable();

    /**
     * Install tags used for MVC scaffolded apps into the target project.
     */
    void installTags();
}