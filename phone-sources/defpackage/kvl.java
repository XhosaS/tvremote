package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvl {
    private String a;
    private ieg b;
    private int c;
    private int d;
    private long e;
    private long f;
    private String g;
    private kvm h;
    private kvn i;
    private String j;
    private String k;
    private boolean l;
    private int m;
    private ieg n;
    private byte o;

    public final kvo a() {
        String str;
        ieg iegVar;
        String str2;
        kvm kvmVar;
        kvn kvnVar;
        String str3;
        String str4;
        ieg iegVar2;
        if (this.o == 63 && (str = this.a) != null && (iegVar = this.b) != null && (str2 = this.g) != null && (kvmVar = this.h) != null && (kvnVar = this.i) != null && (str3 = this.j) != null && (str4 = this.k) != null && (iegVar2 = this.n) != null) {
            return new kts(str, iegVar, this.c, this.d, this.e, this.f, str2, kvmVar, kvnVar, str3, str4, this.l, this.m, iegVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" offerId");
        }
        if (this.b == null) {
            sb.append(" rentalPolicy");
        }
        if ((this.o & 1) == 0) {
            sb.append(" rentalLongTimerSec");
        }
        if ((this.o & 2) == 0) {
            sb.append(" rentalShortTimerSec");
        }
        if ((this.o & 4) == 0) {
            sb.append(" rentalExpirationTimestampSec");
        }
        if ((this.o & 8) == 0) {
            sb.append(" priceMicros");
        }
        if (this.g == null) {
            sb.append(" currencyCode");
        }
        if (this.h == null) {
            sb.append(" offerType");
        }
        if (this.i == null) {
            sb.append(" quality");
        }
        if (this.j == null) {
            sb.append(" formattedAmount");
        }
        if (this.k == null) {
            sb.append(" formattedFullAmount");
        }
        if ((this.o & 16) == 0) {
            sb.append(" isPreorder");
        }
        if ((this.o & 32) == 0) {
            sb.append(" ageGate");
        }
        if (this.n == null) {
            sb.append(" subscriptionDetails");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.m = i;
        this.o = (byte) (this.o | 32);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.g = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null formattedAmount");
        }
        this.j = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null formattedFullAmount");
        }
        this.k = str;
    }

    public final void f(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 16);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null offerId");
        }
        this.a = str;
    }

    public final void h(kvm kvmVar) {
        if (kvmVar == null) {
            throw new NullPointerException("Null offerType");
        }
        this.h = kvmVar;
    }

    public final void i(long j) {
        this.f = j;
        this.o = (byte) (this.o | 8);
    }

    public final void j(kvn kvnVar) {
        if (kvnVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.i = kvnVar;
    }

    public final void k(long j) {
        this.e = j;
        this.o = (byte) (this.o | 4);
    }

    public final void l(int i) {
        this.c = i;
        this.o = (byte) (this.o | 1);
    }

    public final void m(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null rentalPolicy");
        }
        this.b = iegVar;
    }

    public final void n(int i) {
        this.d = i;
        this.o = (byte) (this.o | 2);
    }

    public final void o(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null subscriptionDetails");
        }
        this.n = iegVar;
    }
}
