/**
 * Copyright (C) 2003-2007 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.services.jcr.ext.artifact;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author : Volodymyr Krasnikov volodymyr.krasnikov@exoplatform.com.ua
 * 
 * @version $Id: MavenFileFilter.java 11:45:04
 */

public class MavenFileFilter implements FilenameFilter {

  /*
   * (non-Javadoc)
   * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
   */
  private List<String> list = new ArrayList<String>();

  public MavenFileFilter() {
    list.add("jar");
    // list.add("pom");
    // list.add("xml");
    // list.add("sha1");
    list.add("txt");

  }

  public boolean accept(File dir, String name)
  {
    String ext = FilenameUtils.getExtension(name);
    return true;// list.contains(ext);
  }
}