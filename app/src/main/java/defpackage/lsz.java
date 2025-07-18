package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lsz extends kjn {
    public lsz(Context context, Looper looper, kjd kjdVar, kgd kgdVar, khm khmVar) {
        super(context, looper, 293, kjdVar, kgdVar, khmVar);
    }

    @Override // defpackage.kjn, defpackage.kiz, defpackage.keg
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.kiz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportService");
        return iInterfaceQueryLocalInterface instanceof lsu ? (lsu) iInterfaceQueryLocalInterface : new lsu(iBinder);
    }

    @Override // defpackage.kiz
    protected final String c() {
        return "com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportService";
    }

    @Override // defpackage.kiz
    protected final String d() {
        return "com.google.android.gms.presencemanager.service.PRESENCE_REPORT";
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
        return new Feature[]{lsp.a, lsp.b, lsp.c};
    }
}
