package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbv extends rcd {
    public float a;
    public byte b;
    public int c;

    @Override // defpackage.rcd
    public final rce a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new rbw(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
