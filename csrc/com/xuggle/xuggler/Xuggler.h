/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Xuggler-Main.
 *
 * Xuggle-Xuggler-Main is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Main is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Main.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

#ifndef __XUGGLER_H__
#define __XUGGLER_H__

#define MKTAG(a,b,c,d) ((a) | ((b) << 8) | ((c) << 16) | ((unsigned)(d) << 24))
#define MKBETAG(a,b,c,d) ((d) | ((c) << 8) | ((b) << 16) | ((unsigned)(a) << 24))

#include <com/xuggle/Xuggle.h>
#include <inttypes.h>

namespace com {
namespace xuggle {
/**
 * This package contains the core XUGGLER library routines
 * that deal with the manipulation of media files.
 *
 * To get started, check out Global.h and the Global object.
 */
namespace xuggler {
}
}
}
#ifndef VS_API_XUGGLER
#define VS_API_XUGGLER VS_API_EXPORT
#endif // ! VS_API_XUGGLER
#endif // ! __XUGGLER_H__
