package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        boolean zS4 = false;
        boolean zS5 = false;
        String strL = null;
        IBinder iBinderG = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strL = kkw.l(parcel, i);
                    break;
                case 2:
                    zS = kkw.s(parcel, i);
                    break;
                case 3:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 4:
                    iBinderG = kkw.g(parcel, i);
                    break;
                case 5:
                    zS3 = kkw.s(parcel, i);
                    break;
                case 6:
                    zS4 = kkw.s(parcel, i);
                    break;
                case 7:
                default:
                    kkw.r(parcel, i);
                    break;
                case '\b':
                    zS5 = kkw.s(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new GoogleCertificatesLookupQuery(strL, zS, zS2, iBinderG, zS3, zS4, zS5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesLookupQuery[i];
    }
}
