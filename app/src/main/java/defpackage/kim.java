package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kim implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String[] strArrW = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleF = null;
        int iB = 0;
        int iB2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strArrW = kkw.w(parcel, i);
            } else if (c == 2) {
                cursorWindowArr = (CursorWindow[]) kkw.v(parcel, i, CursorWindow.CREATOR);
            } else if (c == 3) {
                iB2 = kkw.b(parcel, i);
            } else if (c == 4) {
                bundleF = kkw.f(parcel, i);
            } else if (c != 1000) {
                kkw.r(parcel, i);
            } else {
                iB = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        DataHolder dataHolder = new DataHolder(iB, strArrW, cursorWindowArr, iB2, bundleF);
        dataHolder.c = new Bundle();
        int i2 = 0;
        while (true) {
            String[] strArr = dataHolder.b;
            if (i2 >= strArr.length) {
                break;
            }
            dataHolder.c.putInt(strArr[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr2 = dataHolder.d;
        dataHolder.g = new int[cursorWindowArr2.length];
        int numRows = 0;
        for (int i3 = 0; i3 < cursorWindowArr2.length; i3++) {
            dataHolder.g[i3] = numRows;
            numRows += cursorWindowArr2[i3].getNumRows() - (numRows - cursorWindowArr2[i3].getStartPosition());
        }
        dataHolder.h = numRows;
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
