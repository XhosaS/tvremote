package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akj extends acj implements IInterface {
    public akj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel parcelD = d(6, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }
}
