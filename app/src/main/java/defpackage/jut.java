package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
class jut implements zxe {
    final /* synthetic */ juv a;
    final /* synthetic */ jux b;

    public jut(jux juxVar, juv juvVar) {
        this.a = juvVar;
        this.b = juxVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        yyk yykVarJ;
        if (th instanceof TimeoutException) {
            jux juxVar = this.b;
            juxVar.i.a("Timed out waiting for connectivity change", new Object[0]);
            juxVar.d(this.a);
            return;
        }
        if (th instanceof CancellationException) {
            this.b.c();
            return;
        }
        jux juxVar2 = this.b;
        ((zdv) ((zdv) ((zdv) jva.a.c()).p(th)).q("com/google/android/downloader/FloggerDownloaderLogger", "logError", 48, "FloggerDownloaderLogger.java")).M("Error observing connectivity changes", new Object[0]);
        synchronized (juxVar2.f) {
            List list = juxVar2.d;
            yykVarJ = yyk.j(list);
            list.clear();
        }
        zxn.e(yykVarJ).cancel(true);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        jux juxVar = this.b;
        juxVar.i.a("Connectivity changed, running queued requests", new Object[0]);
        juxVar.d(this.a);
    }
}
