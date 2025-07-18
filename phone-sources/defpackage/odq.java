package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odq extends ifj implements IInterface {
    public odq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel parcelL = l(6, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }
}
