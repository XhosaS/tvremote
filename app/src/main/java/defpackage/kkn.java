package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        boolean zS = false;
        boolean zS2 = false;
        IBinder iBinderG = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                iBinderG = kkw.g(parcel, i);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) kkw.h(parcel, i, ConnectionResult.CREATOR);
            } else if (c == 4) {
                zS = kkw.s(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                zS2 = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ResolveAccountResponse(iB, iBinderG, connectionResult, zS, zS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
