package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayc {
    public byg a;
    public byte b;
    public int c;

    public ayc() {
        throw null;
    }

    public final ayd a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new ayd(i, this.a);
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

    public ayc(byte[] bArr) {
        this.a = bxw.a;
    }
}
