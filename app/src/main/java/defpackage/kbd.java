package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        String strL = null;
        int iB2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                iB = kkw.b(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                iB2 = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new LogErrorParcelable(strL, iB, iB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogErrorParcelable[i];
    }
}
