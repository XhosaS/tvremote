package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vnq extends ert implements vns {
    public vnq(IBinder iBinder) {
        super(iBinder, "com.google.apps.tiktok.account.data.manager.IAccountSyncService");
    }

    @Override // defpackage.vns
    public final void c(Bundle bundle, vnv vnvVar, boolean z) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        erv.c(parcelA, vnvVar);
        parcelA.writeInt(z ? 1 : 0);
        K(5, parcelA);
    }

    @Override // defpackage.vns
    public final void d(int i, vny vnyVar) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        erv.c(parcelA, vnyVar);
        K(2, parcelA);
    }

    @Override // defpackage.vns
    public final void e(int i, vny vnyVar) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        erv.c(parcelA, vnyVar);
        K(1, parcelA);
    }

    @Override // defpackage.vns
    public final void f(int[] iArr, vny vnyVar, boolean z) {
        Parcel parcelA = a();
        parcelA.writeIntArray(iArr);
        erv.c(parcelA, vnyVar);
        parcelA.writeInt(z ? 1 : 0);
        K(6, parcelA);
    }

    @Override // defpackage.vns
    public final void g(Bundle bundle, vny vnyVar) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        erv.c(parcelA, vnyVar);
        K(3, parcelA);
    }

    @Override // defpackage.vns
    public final void h(Bundle bundle, vny vnyVar) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        erv.c(parcelA, vnyVar);
        K(4, parcelA);
    }
}
