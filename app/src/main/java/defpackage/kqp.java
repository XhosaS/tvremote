package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqp extends kjn {
    public kqp(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 215, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kiz
    public final boolean F() {
        return true;
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 19621000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return iInterfaceQueryLocalInterface instanceof kqk ? (kqk) iInterfaceQueryLocalInterface : new kqk(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
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
        return kqe.c;
    }
}
