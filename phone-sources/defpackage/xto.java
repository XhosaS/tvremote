package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xto implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public xto(xtq xtqVar, xtp xtpVar, Runnable runnable, int i) {
        this.d = i;
        this.a = xtpVar;
        this.b = runnable;
        this.c = xtqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, tqt] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ((xtq) this.c).execute(this.a);
        } else {
            if (((tre) ((ylf) this.b).a) != null) {
                throw null;
            }
            ?? r0 = this.a;
            ?? r1 = this.c;
            tqt tqtVarE = tqg.e(tqg.d(), r0);
            try {
                r1.run();
            } finally {
            }
        }
    }

    public final String toString() {
        if (this.d == 0) {
            return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
        }
        return "propagating=[" + this.c + "]";
    }

    public xto(ylf ylfVar, tqt tqtVar, Runnable runnable, int i) {
        this.d = i;
        this.b = ylfVar;
        this.a = tqtVar;
        this.c = runnable;
    }
}
