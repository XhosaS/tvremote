package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AppRestrictionInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        byte[] bArrT = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                strL2 = kkw.l(parcel, i);
            } else if (c == 4) {
                strL3 = kkw.l(parcel, i);
            } else if (c == 5) {
                strL4 = kkw.l(parcel, i);
            } else if (c != 6) {
                kkw.r(parcel, i);
            } else {
                bArrT = kkw.t(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new AppRestrictionInfo(strL, strL2, strL3, strL4, bArrT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRestrictionInfo[i];
    }
}
