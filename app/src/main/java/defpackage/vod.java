package defpackage;

import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vod extends wzk {
    public xo a;

    @Override // defpackage.wzk
    public final void a() {
        wvx wvxVarF = wzg.f("onNullBinding", wwb.a, true);
        try {
            this.a.d(new voc());
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wzk
    public final void b(IBinder iBinder) {
        wvx wvxVarF = wzg.f("onServiceConnected", wwb.a, true);
        try {
            xo xoVar = this.a;
            iBinder.getClass();
            xoVar.b(iBinder);
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wzk
    public final void c() {
        wvx wvxVarF = wzg.f("onServiceDisconnected", wwb.a, true);
        try {
            this.a.d(new voe());
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
