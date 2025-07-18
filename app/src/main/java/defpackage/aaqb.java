package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                bundleF = kkw.f(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new RemoteMessage(bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
