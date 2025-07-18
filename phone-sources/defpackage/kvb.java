package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvb {
    private boolean a;
    private long b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private int m;
    private long n;
    private long o;
    private int p;
    private short q;

    public final kvc a() {
        if (this.q == -1) {
            return new kvc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.q & 1) == 0) {
            sb.append(" isPurchased");
        }
        if ((this.q & 2) == 0) {
            sb.append(" expirationTimestamp");
        }
        if ((this.q & 4) == 0) {
            sb.append(" resumeTime");
        }
        if ((this.q & 8) == 0) {
            sb.append(" isRental");
        }
        if ((this.q & 16) == 0) {
            sb.append(" isPreordered");
        }
        if ((this.q & 32) == 0) {
            sb.append(" isHd");
        }
        if ((this.q & 64) == 0) {
            sb.append(" isUhd");
        }
        if ((this.q & 128) == 0) {
            sb.append(" isFormat3D");
        }
        if ((this.q & 256) == 0) {
            sb.append(" rentalShortTimerSeconds");
        }
        if ((this.q & 512) == 0) {
            sb.append(" purchaseTimeSec");
        }
        if ((this.q & 1024) == 0) {
            sb.append(" addToLibraryTimeSec");
        }
        if ((this.q & 2048) == 0) {
            sb.append(" isBonusContent");
        }
        if ((this.q & 4096) == 0) {
            sb.append(" purchaseSource");
        }
        if ((this.q & 8192) == 0) {
            sb.append(" purchase4kUpgradeTimestampSeconds");
        }
        if ((this.q & 16384) == 0) {
            sb.append(" purchase4kUpgradeNotificationTimestampSeconds");
        }
        if ((this.q & 32768) == 0) {
            sb.append(" visibility");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.k = j;
        this.q = (short) (this.q | 1024);
    }

    public final void c(long j) {
        this.b = j;
        this.q = (short) (this.q | 2);
    }

    public final void d(boolean z) {
        this.l = z;
        this.q = (short) (this.q | 2048);
    }

    public final void e(boolean z) {
        this.h = z;
        this.q = (short) (this.q | 128);
    }

    public final void f(boolean z) {
        this.f = z;
        this.q = (short) (this.q | 32);
    }

    public final void g(boolean z) {
        this.e = z;
        this.q = (short) (this.q | 16);
    }

    public final void h(boolean z) {
        this.a = z;
        this.q = (short) (this.q | 1);
    }

    public final void i(boolean z) {
        this.d = z;
        this.q = (short) (this.q | 8);
    }

    public final void j(boolean z) {
        this.g = z;
        this.q = (short) (this.q | 64);
    }

    public final void k(long j) {
        this.o = j;
        this.q = (short) (this.q | 16384);
    }

    public final void l(long j) {
        this.n = j;
        this.q = (short) (this.q | 8192);
    }

    public final void m(int i) {
        this.m = i;
        this.q = (short) (this.q | 4096);
    }

    public final void n(long j) {
        this.j = j;
        this.q = (short) (this.q | 512);
    }

    public final void o(long j) {
        this.i = j;
        this.q = (short) (this.q | 256);
    }

    public final void p(int i) {
        this.c = i;
        this.q = (short) (this.q | 4);
    }

    public final void q(int i) {
        this.p = i;
        this.q = (short) (this.q | Short.MIN_VALUE);
    }
}
