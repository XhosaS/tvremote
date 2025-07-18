package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        byte[][] bArrX = null;
        byte[] bArrT = null;
        byte[] bArrT2 = null;
        int iB = 0;
        int iB2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB = kkw.b(parcel, i);
                    break;
                case 2:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 3:
                    strL = kkw.l(parcel, i);
                    break;
                case 4:
                    bArrX = kkw.x(parcel, i);
                    break;
                case 5:
                    bArrT = kkw.t(parcel, i);
                    break;
                case 6:
                    bArrT2 = kkw.t(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new LogAuditRecordsRequest(iB, iB2, strL, bArrX, bArrT, bArrT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }
}
