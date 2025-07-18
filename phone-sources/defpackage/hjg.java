package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjg extends hiz {
    @Override // defpackage.hiz
    public final void a(hjh hjhVar, hjh hjhVar2) {
        hjhVar.c = hjhVar2;
    }

    @Override // defpackage.hiz
    public final void b(hjh hjhVar, Thread thread) {
        hjhVar.b = thread;
    }

    @Override // defpackage.hiz
    public final boolean c(hji hjiVar, hjd hjdVar, hjd hjdVar2) {
        synchronized (hjiVar) {
            if (hjiVar.d != hjdVar) {
                return false;
            }
            hjiVar.d = hjdVar2;
            return true;
        }
    }

    @Override // defpackage.hiz
    public final boolean d(hji hjiVar, Object obj, Object obj2) {
        synchronized (hjiVar) {
            if (hjiVar.c != obj) {
                return false;
            }
            hjiVar.c = obj2;
            return true;
        }
    }

    @Override // defpackage.hiz
    public final boolean e(hji hjiVar, hjh hjhVar, hjh hjhVar2) {
        synchronized (hjiVar) {
            if (hjiVar.e != hjhVar) {
                return false;
            }
            hjiVar.e = hjhVar2;
            return true;
        }
    }
}
