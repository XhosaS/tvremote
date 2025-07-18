package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nid extends obe {
    public nid(Context context, Looper looper, oav oavVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 343, oavVar, nycVar, nzwVar);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return iInterfaceQueryLocalInterface instanceof nif ? (nif) iInterfaceQueryLocalInterface : new nif(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.oat
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return new nvg[]{new nvg("google_auth_api", 1L), nhb.b, nhb.c};
    }
}
