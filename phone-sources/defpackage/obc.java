package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obc extends ocg {
    public static final Parcelable.Creator<obc> CREATOR = new obd(0);
    static final Scope[] a = new Scope[0];
    static final nvg[] b = new nvg[0];
    final int c;
    final int d;
    final int e;
    String f;
    IBinder g;
    Scope[] h;
    Bundle i;
    Account j;
    nvg[] k;
    nvg[] l;
    boolean m;
    int n;
    boolean o;
    public String p;

    public obc(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, nvg[] nvgVarArr, nvg[] nvgVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        nvgVarArr = nvgVarArr == null ? b : nvgVarArr;
        nvgVarArr2 = nvgVarArr2 == null ? b : nvgVarArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obm obmVar = iInterfaceQueryLocalInterface instanceof obm ? (obm) iInterfaceQueryLocalInterface : new obm(iBinder);
                if (obmVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Parcel parcelL = obmVar.l(2, obmVar.k());
                            Account account3 = (Account) ifl.a(parcelL, Account.CREATOR);
                            parcelL.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = nvgVarArr;
        this.l = nvgVarArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        obd.a(this, parcel, i);
    }
}
