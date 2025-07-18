package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = Long.MAX_VALUE;
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        boolean zS4 = false;
        LocationRequest locationRequest = null;
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                locationRequest = (LocationRequest) kkw.h(parcel, i, LocationRequest.CREATOR);
            } else if (c == 5) {
                arrayListO = kkw.o(parcel, i, ClientIdentity.CREATOR);
            } else if (c == '\b') {
                zS = kkw.s(parcel, i);
            } else if (c != '\t') {
                switch (c) {
                    case 11:
                        zS3 = kkw.s(parcel, i);
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        zS4 = kkw.s(parcel, i);
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        kkw.l(parcel, i);
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        jE = kkw.e(parcel, i);
                        break;
                    default:
                        kkw.r(parcel, i);
                        break;
                }
            } else {
                zS2 = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new LocationRequestInternal(locationRequest, arrayListO, zS, zS2, zS3, zS4, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
