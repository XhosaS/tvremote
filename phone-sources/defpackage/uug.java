package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uug {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final uuh a() {
        if (this.d == 7) {
            return new uuh(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" enableCelLogsiteMetadata");
        }
        if ((this.d & 2) == 0) {
            sb.append(" enableSafeFormatArgs");
        }
        if ((this.d & 4) == 0) {
            sb.append(" includeSuppressedExceptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final ksx e() {
        if (this.d == 7) {
            return new ksx(this.b, this.a, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" thumbsUpRestricted");
        }
        if ((this.d & 2) == 0) {
            sb.append(" thumbsDownRestricted");
        }
        if ((this.d & 4) == 0) {
            sb.append(" watchlistRestricted");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 2);
    }

    public final void g(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
    }

    public final void h(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }
}
