/*
 * MergeProcessListener.java
 * Created on Jun 22, 2005
 * 
 * COPYRIGHT � 2005, THE REGENTS OF THE UNIVERSITY OF MICHIGAN,
 * ALL RIGHTS RESERVED; see the file COPYRIGHT.txt in this folder for details
 * 
 * This work is supported in part by the George E. Brown, Jr. Network
 * for Earthquake Engineering Simulation (NEES) Program of the National
 * Science Foundation under Award Numbers CMS-0117853 and CMS-0402490.
 * 
 * CVS information...
 *   $Revision: 153 $
 *   $Date: 2007-09-24 13:10:37 -0700 (Mon, 24 Sep 2007) $
 *   $RCSfile: MergeProgressListener.java,v $ 
 * 
 */
package org.nees.tivo;


interface MergeProgressListener {
    public void percentDone(int percentDone);
}