package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kui {
    private float a;
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private byte h;

    public final kuj a() {
        if (this.h == Byte.MAX_VALUE) {
            return new kuj(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" downloadFraction");
        }
        if ((this.h & 2) == 0) {
            sb.append(" state");
        }
        if ((this.h & 4) == 0) {
            sb.append(" downloadSize");
        }
        if ((this.h & 8) == 0) {
            sb.append(" bytesDownloaded");
        }
        if ((this.h & 16) == 0) {
            sb.append(" drmErrorCode");
        }
        if ((this.h & 32) == 0) {
            sb.append(" reason");
        }
        if ((this.h & 64) == 0) {
            sb.append(" pinningStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.d = j;
        this.h = (byte) (this.h | 8);
    }

    public final void c(float f) {
        this.a = f;
        this.h = (byte) (this.h | 1);
    }

    public final void d(long j) {
        this.c = j;
        this.h = (byte) (this.h | 4);
    }

    public final void e(int i) {
        this.e = i;
        this.h = (byte) (this.h | 16);
    }

    public final void f(int i) {
        this.g = i;
        this.h = (byte) (this.h | 64);
    }

    public final void g(int i) {
        this.f = i;
        this.h = (byte) (this.h | 32);
    }

    public final void h(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }
}
