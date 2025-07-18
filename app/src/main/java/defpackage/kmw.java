package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kmw extends ert implements IInterface {
    public kmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel parcelB = b(6, a());
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }
}
