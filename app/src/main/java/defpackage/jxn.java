package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jxn extends kjn {
    public jxn(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 343, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return iInterfaceQueryLocalInterface instanceof jxq ? (jxq) iInterfaceQueryLocalInterface : new jxq(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.kiz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.kiz
    protected final boolean f() {
        return true;
    }

    @Override // defpackage.kiz
    public final Feature[] g() {
        return new Feature[]{new Feature("google_auth_api", 1L), jwf.h, jwf.i};
    }
}
