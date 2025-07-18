package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        boolean zS = false;
        String strL = null;
        String strL2 = null;
        String[] strArrW = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                strArrW = kkw.w(parcel, i);
            } else if (c == 4) {
                iB = kkw.b(parcel, i);
            } else if (c == 5) {
                zS = kkw.s(parcel, i);
            } else if (c != 6) {
                kkw.r(parcel, i);
            } else {
                strL2 = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ServiceDumpRequest(strL, strL2, strArrW, iB, zS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDumpRequest[i];
    }
}
