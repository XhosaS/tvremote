package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = -1;
        boolean zS = false;
        int iB = 0;
        int iB2 = 0;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zS = kkw.s(parcel, i);
            } else if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                iB = kkw.b(parcel, i);
            } else if (c == 4) {
                iB2 = kkw.b(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                jE = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new GoogleCertificatesLookupResponse(zS, strL, iB, iB2, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesLookupResponse[i];
    }
}
