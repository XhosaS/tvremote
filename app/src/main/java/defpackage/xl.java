package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xl extends xd {
    @Override // defpackage.xd
    public final void a(xm xmVar, xm xmVar2) {
        xmVar.next = xmVar2;
    }

    @Override // defpackage.xd
    public final void b(xm xmVar, Thread thread) {
        xmVar.thread = thread;
    }

    @Override // defpackage.xd
    public final boolean c(xn xnVar, xh xhVar, xh xhVar2) {
        synchronized (xnVar) {
            if (xnVar.listeners != xhVar) {
                return false;
            }
            xnVar.listeners = xhVar2;
            return true;
        }
    }

    @Override // defpackage.xd
    public final boolean d(xn xnVar, Object obj, Object obj2) {
        synchronized (xnVar) {
            if (xnVar.value != obj) {
                return false;
            }
            xnVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.xd
    public final boolean e(xn xnVar, xm xmVar, xm xmVar2) {
        synchronized (xnVar) {
            if (xnVar.waiters != xmVar) {
                return false;
            }
            xnVar.waiters = xmVar2;
            return true;
        }
    }
}
