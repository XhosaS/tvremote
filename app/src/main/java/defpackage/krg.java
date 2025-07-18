package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krg extends ert implements krh {
    public krg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.krh
    public final int e() {
        Parcel parcelB = b(2, a());
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    @Override // defpackage.krh
    public final void f(String str, String str2, Bundle bundle, long j) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        erv.b(parcelA, bundle);
        parcelA.writeLong(j);
        J(1, parcelA);
    }
}
