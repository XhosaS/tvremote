package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class otk implements zxe {
    final /* synthetic */ lvj a;
    final /* synthetic */ zyd b;
    final /* synthetic */ lui c;

    public otk(lvj lvjVar, zyd zydVar, lui luiVar) {
        this.a = lvjVar;
        this.b = zydVar;
        this.c = luiVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        if (this.b.isCancelled()) {
            this.c.a.a.s(null);
            return;
        }
        if (th instanceof Exception) {
            this.a.a.o((Exception) th);
        } else {
            lvj lvjVar = this.a;
            lvjVar.a.o(new ExecutionException(th));
        }
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        this.a.a.p(obj);
    }
}
