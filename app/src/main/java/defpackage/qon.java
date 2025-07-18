package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qon extends qpt {
    public zyh a;
    public int b;
    public int c;
    public byte d;
    private boolean e;

    @Override // defpackage.qpt
    public final qpu a() {
        if (this.d == 7) {
            return new qoo(this.a, this.b, this.c, this.e);
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

    @Override // defpackage.qpt
    public final void b() {
        this.e = true;
        this.d = (byte) (this.d | 4);
    }
}
