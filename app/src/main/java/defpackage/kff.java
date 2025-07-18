package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kff implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        ConnectionResult connectionResult = null;
        int iB = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) kkw.h(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                connectionResult = (ConnectionResult) kkw.h(parcel, i, ConnectionResult.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new Status(iB, strL, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
