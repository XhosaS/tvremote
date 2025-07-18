package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alt extends aij implements afx {
    public final aid t;
    public final Integer u;
    private final boolean v;
    private final Bundle w;

    public alt(Context context, Looper looper, aid aidVar, Bundle bundle, agc agcVar, agd agdVar) {
        super(context, looper, 44, aidVar, agcVar, agdVar);
        this.v = true;
        this.t = aidVar;
        this.w = bundle;
        this.u = aidVar.g;
    }

    @Override // defpackage.aij, defpackage.aib, defpackage.afx
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.aib
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof alr ? (alr) iInterfaceQueryLocalInterface : new alr(iBinder);
    }

    @Override // defpackage.aib
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.aib
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.aib, defpackage.afx
    public final boolean l() {
        return this.v;
    }

    @Override // defpackage.aib
    protected final Bundle s() {
        aid aidVar = this.t;
        String packageName = this.b.getPackageName();
        String str = aidVar.d;
        if (!packageName.equals(str)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.w;
    }
}
