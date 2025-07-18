package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UploadBatchParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        byte[] bArrT = null;
        String strL = null;
        Bundle bundleF = null;
        String strL2 = null;
        long jE = 0;
        long jE2 = 0;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jE = kkw.e(parcel, i);
                    break;
                case 2:
                    bArrT = kkw.t(parcel, i);
                    break;
                case 3:
                    strL = kkw.l(parcel, i);
                    break;
                case 4:
                    bundleF = kkw.f(parcel, i);
                    break;
                case 5:
                    iB = kkw.b(parcel, i);
                    break;
                case 6:
                    jE2 = kkw.e(parcel, i);
                    break;
                case 7:
                    strL2 = kkw.l(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new UploadBatchParcel(jE, bArrT, strL, bundleF, iB, jE2, strL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UploadBatchParcel[i];
    }
}
