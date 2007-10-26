//
// Cleversafe open-source code header - Version 1.1 - December 1, 2006
//
// Cleversafe Dispersed Storage(TM) is software for secure, private and
// reliable storage of the world's data using information dispersal.
//
// Copyright (C) 2005-2007 Cleversafe, Inc.
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
// USA.
//
// Contact Information: Cleversafe, 10 W. 35th Street, 16th Floor #84,
// Chicago IL 60616
// email licensing@cleversafe.org
//
// END-OF-HEADER
//-----------------------
// @author: mmotwani
//
// Date: Oct 24, 2007
//---------------------

package org.jscsi.scsi.tasks;

import org.jscsi.scsi.protocol.Command;
import org.jscsi.scsi.protocol.inquiry.InquiryDataRegistry;
import org.jscsi.scsi.protocol.mode.ModePageRegistry;
import org.jscsi.scsi.transport.TargetTransportPort;

// TODO: Describe class or interface
public abstract class AbstractTask implements Task
{
   // Data   
   private TargetTransportPort _targetPort;
   private Command _command;
   private ModePageRegistry _modePageRegistry;
   private InquiryDataRegistry _inquiryDataRegistry;

   protected AbstractTask()
   {
   }

   // Constructors
   protected AbstractTask(
         TargetTransportPort targetPort,
         Command command,
         ModePageRegistry modePageRegistry,
         InquiryDataRegistry inquiryDataRegistry)
   {
      this._targetPort = targetPort;
      this._command = command;
      this._modePageRegistry = modePageRegistry;
      this._inquiryDataRegistry = inquiryDataRegistry;
   }

   // Methods common to all GridTasks
   public Command getCommand()
   {
      return this._command;
   }

   public TargetTransportPort getTargetTransportPort()
   {
      return this._targetPort;
   }

   public ModePageRegistry getModePageRegistry()
   {
      return this._modePageRegistry;
   }

   public InquiryDataRegistry getInquiryDataRegistry()
   {
      return this._inquiryDataRegistry;
   }

   // protected setters
   protected void setTargetTransportPort(TargetTransportPort targetPort)
   {
      this._targetPort = targetPort;
   }

   protected void setCommand(Command command)
   {
      this._command = command;
   }

   protected void setModePageRegistry(ModePageRegistry modePageRegistry)
   {
      this._modePageRegistry = modePageRegistry;
   }
   
   protected void setInquiryDataRegistry(InquiryDataRegistry inquiryDataRegistry)
   {
      this._inquiryDataRegistry = inquiryDataRegistry;
   }
}