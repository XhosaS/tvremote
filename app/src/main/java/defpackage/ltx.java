package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ltx extends kjn implements keg {
    public final kjd t;
    public final Integer u;
    private final boolean v;
    private final Bundle w;

    public ltx(Context context, Looper looper, kjd kjdVar, Bundle bundle, ket ketVar, keu keuVar) {
        super(context, looper, 44, kjdVar, ketVar, keuVar);
        this.v = true;
        this.t = kjdVar;
        this.w = bundle;
        this.u = kjdVar.g;
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ltv ? (ltv) iInterfaceQueryLocalInterface : new ltv(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.kiz, defpackage.keg
    public final boolean o() {
        return this.v;
    }

    @Override // defpackage.kiz
    protected final Bundle u() {
        kjd kjdVar = this.t;
        String packageName = this.b.getPackageName();
        String str = kjdVar.d;
        if (!packageName.equals(str)) {
            this.w.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.w;
    }
}
