package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vnw extends ert implements vny {
    public vnw(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
    }

    @Override // defpackage.vny
    public final void c(Bundle bundle) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        J(2, parcelA);
    }

    @Override // defpackage.vny
    public final void d() {
        J(1, a());
    }
}
