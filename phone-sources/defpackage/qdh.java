package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qdh {
    public Long a;
    private long b;
    private byte c;

    public final qdo a() {
        if (this.c == 1) {
            return new qdo(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: startTime");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
