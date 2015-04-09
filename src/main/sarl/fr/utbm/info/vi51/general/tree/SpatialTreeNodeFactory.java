/* 
 * $Id$
 * 
 * Copyright (c) 2011-15 Stephane GALLAND <stephane.galland@utbm.fr>.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * This program is free software; you can redistribute it and/or modify
 */
package fr.utbm.info.vi51.general.tree;

import java.io.Serializable;

import fr.utbm.info.vi51.framework.math.Rectangle2f;

/**
 * A factory of spatial tree nodes.
 * 
 * @param <N> - type of the root node.
 * @author St&eacute;phane GALLAND &lt;stephane.galland@utbm.fr&gt;
 * @version $Name$ $Revision$ $Date$
 */
public interface SpatialTreeNodeFactory<N extends SpatialTreeNode<?,?>> extends Serializable {

	/** Create an instance of a node.
	 *
	 * @param bounds - the bounds covered by the node.
	 * @param parent - the parent node in which the created node WILL BE added.
	 * @return the new instance.
	 */
	N newInstance(Rectangle2f bounds, N parent);
	
	/** Replies the max number of data per tree node.
	 *
	 * @return the max number of data.
	 */
	int getMaxDataCountPerNode();

}