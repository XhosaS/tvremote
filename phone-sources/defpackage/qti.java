package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qti {
    private boolean a;
    private byte b;
    private int c;

    public final qtj a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new qtj(this.a, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" isG1User");
        }
        if (this.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null isUnicornUser");
        }
        this.c = i;
    }

    public final llv d() {
        if (this.b == 3) {
            return new llo(this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" maxHeight");
        }
        if ((this.b & 2) == 0) {
            sb.append(" allowHdr");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 2);
    }

    public final void f(int i) {
        this.c = i;
        this.b = (byte) (this.b | 1);
    }
}
