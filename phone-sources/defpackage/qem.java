package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qem {
    public String a;
    public String b;
    public String c;
    public String d;
    public ImmutableSet e;
    public String f;
    public String g;
    private long h;
    private String i;
    private int j;
    private long k;
    private long l;
    private int m;
    private long n;
    private long o;
    private byte p;
    private int q;

    public qem() {
    }

    public final qen a() {
        String str;
        int i;
        if (this.p == Byte.MAX_VALUE && (str = this.i) != null && (i = this.q) != 0) {
            return new qen(this.h, str, i, this.a, this.b, this.c, this.j, this.d, this.e, this.f, this.k, this.l, this.m, this.n, this.g, this.o);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.p & 1) == 0) {
            sb.append(" id");
        }
        if (this.i == null) {
            sb.append(" accountSpecificId");
        }
        if (this.q == 0) {
            sb.append(" accountType");
        }
        if ((this.p & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.p & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.p & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.p & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.p & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        if ((this.p & 64) == 0) {
            sb.append(" fitbitDecodedId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(qpv qpvVar) {
        k(osk.ag(qpvVar));
        c(qpvVar.a());
        if (qpvVar instanceof qpw) {
            this.a = ((qpw) qpvVar).a;
        } else if (qpvVar instanceof qpx) {
            e(((qpx) qpvVar).b);
        }
    }

    protected final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountSpecificId");
        }
        this.i = str;
    }

    public final void d(long j) {
        this.n = j;
        this.p = (byte) (this.p | 32);
    }

    public final void e(long j) {
        this.o = j;
        this.p = (byte) (this.p | 64);
    }

    public final void f(long j) {
        this.h = j;
        this.p = (byte) (this.p | 1);
    }

    public final void g(int i) {
        this.m = i;
        this.p = (byte) (this.p | 16);
    }

    public final void h(long j) {
        this.l = j;
        this.p = (byte) (this.p | 8);
    }

    public final void i(int i) {
        this.j = i;
        this.p = (byte) (this.p | 2);
    }

    public final void j(long j) {
        this.k = j;
        this.p = (byte) (this.p | 4);
    }

    protected final void k(int i) {
        this.q = i;
    }

    public qem(qen qenVar) {
        this.h = qenVar.a;
        this.i = qenVar.b;
        this.q = qenVar.p;
        this.a = qenVar.c;
        this.b = qenVar.d;
        this.c = qenVar.e;
        this.j = qenVar.f;
        this.d = qenVar.g;
        this.e = qenVar.h;
        this.f = qenVar.i;
        this.k = qenVar.j;
        this.l = qenVar.k;
        this.m = qenVar.l;
        this.n = qenVar.m;
        this.g = qenVar.n;
        this.o = qenVar.o;
        this.p = Byte.MAX_VALUE;
    }
}
