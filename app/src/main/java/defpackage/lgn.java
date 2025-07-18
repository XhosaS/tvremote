package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgn implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ lgo b;

    public lgn(lgo lgoVar, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.b.c;
        lgpVar.b = null;
        if (this.a.c != 7777) {
            lgpVar.l();
            return;
        }
        if (lgpVar.d == null) {
            lgpVar.d = Executors.newScheduledThreadPool(1);
        }
        lgpVar.d.schedule(new Runnable() { // from class: lgm
            @Override // java.lang.Runnable
            public final void run() {
                final lgp lgpVar2 = this.a.b.c;
                lbk lbkVar = lgpVar2.y;
                lbh lbhVar = lbkVar.g;
                lbkVar.o(lbhVar);
                lbhVar.h(new Runnable() { // from class: lgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        lgpVar2.j();
                    }
                });
            }
        }, ((Long) kzg.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
