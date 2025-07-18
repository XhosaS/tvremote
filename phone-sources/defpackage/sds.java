package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sds {
    public int a;
    public int b;
    public byte c;

    public final sdt a() {
        if (this.c == 3) {
            return new sdo(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" downloadFraction");
        }
        if ((this.c & 2) == 0) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public final rsf d() {
        int i;
        if (this.c == 3 && (i = this.a) != 0) {
            return new rsf(i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(boolean z) {
        this.a = true != z ? 2 : 3;
    }
}
