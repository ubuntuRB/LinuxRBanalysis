//rbAPPmit: An Android front-end for the Certified Reduced Basis Method
//Copyright (C) 2010 David J. Knezevic and Phuong Huynh
//
//This file is part of rbAPPmit
//
//rbAPPmit is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//rbAPPmit is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with rbAPPmit.  If not, see <http://www.gnu.org/licenses/>. 

package rb.app;
import android.content.Context;
import android.widget.SeekBar;


public class IndexedSeekBar extends SeekBar {

private int mIndex;

public IndexedSeekBar(Context c) {
	super(c);
	
	mIndex = 0;
}

public void setIndex(int index_in) {
	mIndex = index_in;
}

public int getIndex() {
	return mIndex;
}
}
