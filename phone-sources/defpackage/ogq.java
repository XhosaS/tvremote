package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogq extends obe {
    public ogq(Context context, Looper looper, oav oavVar, nyc nycVar, nzw nzwVar) {
        super(context, looper, 215, oavVar, nycVar, nzwVar);
    }

    @Override // defpackage.oat
    public final boolean U() {
        return true;
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 19621000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
        return iInterfaceQueryLocalInterface instanceof ogn ? (ogn) iInterfaceQueryLocalInterface : new ogn(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.mdisync.internal.IMdiSyncService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.mdisync.service.START";
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
        return ogj.c;
    }
}
