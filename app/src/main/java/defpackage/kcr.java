package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        PendingIntent pendingIntent = null;
        int iB = 0;
        int iB2 = 0;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                iB2 = kkw.b(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) kkw.h(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                strL = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ConnectionResult(iB, iB2, pendingIntent, strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
