package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnc {
    public int a;
    public int b;
    public boolean c;
    public byte d;

    public final rnd a() {
        if (this.d == 7) {
            rnd rndVar = new rnd(this.a, this.b, this.c);
            sij.y(rndVar.b > 0, "Thread pool size must be less than or equal to %s", 2);
            return rndVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.d & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.d & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
