package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        String strL = null;
        IBinder iBinderG = null;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                iBinderG = kkw.g(parcel, i);
            } else if (c == 3) {
                zS = kkw.s(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                zS2 = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new GoogleCertificatesQuery(strL, iBinderG, zS, zS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesQuery[i];
    }
}
