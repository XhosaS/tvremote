package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        IBinder iBinderG = null;
        IBinder iBinderG2 = null;
        PendingIntent pendingIntent = null;
        String strL = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                iBinderG = kkw.g(parcel, i);
            } else if (c == 3) {
                iBinderG2 = kkw.g(parcel, i);
            } else if (c == 4) {
                pendingIntent = (PendingIntent) kkw.h(parcel, i, PendingIntent.CREATOR);
            } else if (c != 6) {
                kkw.r(parcel, i);
            } else {
                strL = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new LocationReceiver(iB, iBinderG, iBinderG2, pendingIntent, strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationReceiver[i];
    }
}
