package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quh extends qup {
    public String a;
    public ahvw b;
    public ahqu c;
    public String d;
    public Long e;
    public qxk f;
    public Predicate g;
    public qry h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte n;

    @Override // defpackage.qup
    public final quq a() {
        ahvw ahvwVar;
        Predicate predicate;
        if (this.n == 31 && (ahvwVar = this.b) != null && (predicate = this.g) != null) {
            return new qui(this.a, this.i, ahvwVar, this.c, this.d, this.e, this.j, this.f, this.k, this.l, predicate, this.h, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.b == null) {
            sb.append(" metric");
        }
        if ((this.n & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.n & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.n & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.g == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.n & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.qup
    public final void b(int i) {
        this.m = i;
        this.n = (byte) (this.n | 16);
    }

    @Override // defpackage.qup
    public final void c(boolean z) {
        this.i = z;
        this.n = (byte) (this.n | 1);
    }

    @Override // defpackage.qup
    public final void d(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 2);
    }

    @Override // defpackage.qup
    public final void e(int i) {
        this.l = i;
        this.n = (byte) (this.n | 8);
    }

    @Override // defpackage.qup
    public final void f(ahvw ahvwVar) {
        if (ahvwVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.b = ahvwVar;
    }

    @Override // defpackage.qup
    public final void g(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 4);
    }
}
