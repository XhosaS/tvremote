package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbg extends rbj {
    public float a;
    public yqt b = ypv.a;
    public byte c;
    public int d;
    private int e;

    @Override // defpackage.rbj
    public final rbk a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            return new rbh(i, this.e, this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rbj
    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 1);
    }
}
