package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.GroupContactOrder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        String strL = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                int iC = kkw.c(parcel, i);
                int iDataPosition = parcel.dataPosition();
                if (iC == 0) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = parcel.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList2.add(Long.valueOf(parcel.readLong()));
                    }
                    parcel.setDataPosition(iDataPosition + iC);
                    arrayList = arrayList2;
                }
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                jE = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new GroupContactOrder(strL, arrayList, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupContactOrder[i];
    }
}
