/* (C)2021 */
package ru.mail.jira.plugins.jsincluder;

import net.java.ao.Entity;
import net.java.ao.schema.Index;
import net.java.ao.schema.Indexed;
import net.java.ao.schema.Indexes;

@Indexes({
  @Index(
      name = "projectCreateContext",
      methodNames = {"getProjectId", "getProjectCategoryId", "isCreateContextEnabled"}),
  @Index(
      name = "projectEditContext",
      methodNames = {"getProjectId", "getProjectCategoryId", "isEditContextEnabled"}),
  @Index(
      name = "projectTransitionContext",
      methodNames = {"getProjectId", "getProjectCategoryId", "isTransitionContextEnabled"}),
  @Index(
      name = "projectViewContext",
      methodNames = {
        "getProjectId",
        "getProjectCategoryId",
        "isViewContextEnabled",
        "isEditContextEnabled",
        "isTransitionContextEnabled"
      })
})
public interface Binding extends Entity {
  Script getScript();

  void setScript(Script script);

  @Indexed
  Long getProjectId();

  void setProjectId(Long projectId);

  @Indexed
  Long getProjectCategoryId();

  void setProjectCategoryId(Long projectId);

  @Indexed
  String getIssueTypeIds();

  void setIssueTypeIds(String issueTypeIds);

  boolean isCreateContextEnabled();

  void setCreateContextEnabled(boolean createContextEnabled);

  boolean isViewContextEnabled();

  void setViewContextEnabled(boolean viewContextEnabled);

  boolean isEditContextEnabled();

  void setEditContextEnabled(boolean editContextEnabled);

  boolean isTransitionContextEnabled();

  void setTransitionContextEnabled(boolean transitionContextEnabled);

  @Deprecated
  String getProjectKeys();

  @Deprecated
  void setProjectKeys(String projectKeys);
}
