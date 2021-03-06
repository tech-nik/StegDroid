/*
 * Copyright 1999-2002 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package imp.javax.sound.sampled;

/**
 * {@link Line Lines} often have a set of controls, such as gain and pan, that affect
 * the audio signal passing through the line.  Java Sound's <code>Line</code> objects
 * let you obtain a particular control object by passing its class as the
 * argument to a {@link Line#getControl(Control.Type) getControl} method.
 * <p>
 * Because the various types of controls have different purposes and features,
 * all of their functionality is accessed from the subclasses that define
 * each kind of control.
 *
 * @author Kara Kytle
 * @version 1.32, 07/05/05
 *
 * @see Line#getControls
 * @see Line#isControlSupported
 * @since 1.3
 */
public abstract class Control {

    // INSTANCE VARIABLES

    /**
     * The control type.
     */
    private final Type type;

    // CONSTRUCTORS

    /**
     * Constructs a Control with the specified type.
     * @param type the kind of control desired
     */
    protected Control(Type type) {
        this .type = type;
    }

    // METHODS

    /**
     * Obtains the control's type.
     * @return the control's type.
     */
    public Type getType() {
        return type;
    }

    // ABSTRACT METHODS

    /**
     * Obtains a String describing the control type and its current state.
     * @return a String representation of the Control.
     */
    @Override
	public String toString() {
        return new String(getType() + " Control");
    }

    /**
     * An instance of the <code>Type</code> class represents the type of
     * the control.  Static instances are provided for the
     * common types.
     */
    public static class Type {

        // CONTROL TYPE DEFINES

        // INSTANCE VARIABLES

        /**
         * Type name.
         */
        private String name;

        // CONSTRUCTOR

        /**
         * Constructs a new control type with the name specified.
         * The name should be a descriptive string appropriate for
         * labelling the control in an application, such as "Gain" or "Balance."
         * @param name	the name of the new control type.
         */
        protected Type(String name) {
            this .name = name;
        }

        // METHODS

        /**
         * Finalizes the equals method
         */
        @Override
		public final boolean equals(Object obj) {
            return super .equals(obj);
        }

        /**
         * Finalizes the hashCode method
         */
        @Override
		public final int hashCode() {
            return super .hashCode();
        }

        /**
         * Provides the <code>String</code> representation of the control type.  This <code>String</code> is
         * the same name that was passed to the constructor.
         *
         * @return the control type name
         */
        @Override
		public final String toString() {
            return name;
        }
    } // class Type

} // class Control