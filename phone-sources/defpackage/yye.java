package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yye extends yyd {
    public final Runnable a;

    public yye(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String strA = yoz.a(runnable);
        String strB = yoz.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = yyf.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
