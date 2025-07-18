package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.SafetyOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        boolean zS2 = false;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                zS = kkw.s(parcel, i);
            } else if (c == 3) {
                zS2 = kkw.s(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                iB = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new SafetyOptions(zS, zS2, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafetyOptions[i];
    }
}
