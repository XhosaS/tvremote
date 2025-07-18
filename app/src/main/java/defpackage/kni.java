package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kni extends kjn {
    public kni(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 319, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.kiz
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.homegraph.internal.IHgsIdService");
        return iInterfaceQueryLocalInterface instanceof knl ? (knl) iInterfaceQueryLocalInterface : new knl(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.homegraph.internal.IHgsIdService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.homegraph.service.START";
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
        return knh.c;
    }
}
