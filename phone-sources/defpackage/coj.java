package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class coj extends coc {
    @Override // defpackage.coc
    public final void a(cok cokVar, cok cokVar2) {
        cokVar.next = cokVar2;
    }

    @Override // defpackage.coc
    public final void b(cok cokVar, Thread thread) {
        cokVar.thread = thread;
    }

    @Override // defpackage.coc
    public final boolean c(col colVar, cog cogVar, cog cogVar2) {
        synchronized (colVar) {
            if (colVar.listeners != cogVar) {
                return false;
            }
            colVar.listeners = cogVar2;
            return true;
        }
    }

    @Override // defpackage.coc
    public final boolean d(col colVar, Object obj, Object obj2) {
        synchronized (colVar) {
            if (colVar.value != obj) {
                return false;
            }
            colVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.coc
    public final boolean e(col colVar, cok cokVar, cok cokVar2) {
        synchronized (colVar) {
            if (colVar.waiters != cokVar) {
                return false;
            }
            colVar.waiters = cokVar2;
            return true;
        }
    }
}
