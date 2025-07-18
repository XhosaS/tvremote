package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.TriggerUriParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        long jE = 0;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                jE = kkw.e(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                iB = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new TriggerUriParcel(strL, jE, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TriggerUriParcel[i];
    }
}
