package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysh {
    static final yrp a = new yrt(new ysc());
    static final yrx b = new ysd();
    yto g;
    yto h;
    yqg k;
    yqg l;
    yrx m;
    ysg o;
    ysf p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final yrp n = a;

    public final ysm a(ysk yskVar) {
        d();
        return new yti(this, yskVar);
    }

    final yto b() {
        return (yto) yqr.c(this.g, yto.STRONG);
    }

    final yto c() {
        return (yto) yqr.c(this.h, yto.STRONG);
    }

    public final void d() {
        if (this.o == null) {
            yqw.M(this.f == -1, "maximumWeight requires weigher");
        } else if (this.c) {
            yqw.M(this.f != -1, "weigher requires maximumWeight");
        } else if (this.f == -1) {
            yse.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        int i = this.d;
        if (i != -1) {
            yqqVarB.c("concurrencyLevel", String.valueOf(i));
        }
        if (this.e != -1) {
            yqqVarB.c("maximumSize", "0");
        }
        if (this.f != -1) {
            yqqVarB.c("maximumWeight", "0");
        }
        long j = this.i;
        if (j != -1) {
            yqqVarB.b("expireAfterWrite", j + "ns");
        }
        long j2 = this.j;
        if (j2 != -1) {
            yqqVarB.b("expireAfterAccess", j2 + "ns");
        }
        yto ytoVar = this.g;
        if (ytoVar != null) {
            yqqVarB.b("keyStrength", ypx.c(ytoVar.toString()));
        }
        yto ytoVar2 = this.h;
        if (ytoVar2 != null) {
            yqqVarB.b("valueStrength", ypx.c(ytoVar2.toString()));
        }
        if (this.k != null) {
            yqqVarB.a().b = "keyEquivalence";
        }
        if (this.l != null) {
            yqqVarB.a().b = "valueEquivalence";
        }
        if (this.p != null) {
            yqqVarB.a().b = "removalListener";
        }
        return yqqVarB.toString();
    }
}
