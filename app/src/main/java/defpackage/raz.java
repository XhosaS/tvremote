package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raz extends rbb {
    public yqt a = ypv.a;
    public byte b;
    public int c;

    @Override // defpackage.rbb
    public final rbc a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new rba(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
