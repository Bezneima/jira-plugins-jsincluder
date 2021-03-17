/* (C)2021 */
package ru.mail.jira.plugins.jsincluder;

import net.java.ao.Entity;
import net.java.ao.OneToMany;
import net.java.ao.schema.StringLength;

@SuppressWarnings("unused")
public interface Script extends Entity {
  String getName();

  void setName(String name);

  @StringLength(StringLength.UNLIMITED)
  String getCode();

  void setCode(String code);

  @StringLength(StringLength.UNLIMITED)
  String getCss();

  void setCss(String css);

  @OneToMany
  public Binding[] getBindings();

  boolean isDisabled();

  void setDisabled(boolean disabled);
}
