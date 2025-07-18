package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okt extends ifj implements IInterface {
    public okt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(oks oksVar, boolean z, int i, nwl nwlVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, oksVar);
        parcelK.writeInt(z ? 1 : 0);
        parcelK.writeString(null);
        parcelK.writeString(null);
        parcelK.writeInt(i);
        ifl.c(parcelK, nwlVar);
        Parcel parcelL = l(11, parcelK);
        parcelL.recycle();
    }
}
