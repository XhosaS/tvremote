package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        ServiceDumpRequest[] serviceDumpRequestArr = null;
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        boolean zS4 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    zS = kkw.s(parcel, i);
                    break;
                case 4:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 5:
                    zS3 = kkw.s(parcel, i);
                    break;
                case 6:
                    zS4 = kkw.s(parcel, i);
                    break;
                case 7:
                    serviceDumpRequestArr = (ServiceDumpRequest[]) kkw.v(parcel, i, ServiceDumpRequest.CREATOR);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new LogOptions(strL, zS, zS2, zS3, zS4, serviceDumpRequestArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }
}
