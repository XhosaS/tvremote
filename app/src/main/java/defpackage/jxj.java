package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GoogleAccount;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                strL2 = kkw.l(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                strL3 = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new GoogleAccount(strL, strL2, strL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccount[i];
    }
}
