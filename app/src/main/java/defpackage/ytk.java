package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytk extends ysl implements Serializable {
    private static final long serialVersionUID = 1;
    final yto b;
    final yto c;
    final yqg d;
    final yqg e;
    final long f;
    final long g;
    final long h;
    final int i;
    final yrx j;
    final ysk k;
    transient ysb l;
    final ysg m;
    final ysf n;

    public ytk(yug yugVar) {
        yto ytoVar = yugVar.j;
        yto ytoVar2 = yugVar.k;
        yqg yqgVar = yugVar.h;
        yqg yqgVar2 = yugVar.i;
        long j = yugVar.n;
        long j2 = yugVar.m;
        long j3 = yugVar.l;
        ysg ysgVar = yugVar.v;
        int i = yugVar.g;
        ysf ysfVar = yugVar.w;
        yrx yrxVar = yugVar.p;
        ysk yskVar = yugVar.r;
        this.b = ytoVar;
        this.c = ytoVar2;
        this.d = yqgVar;
        this.e = yqgVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.m = ysgVar;
        this.i = i;
        this.n = ysfVar;
        this.j = (yrxVar == yrx.b || yrxVar == ysh.b) ? null : yrxVar;
        this.k = yskVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ysh yshVarA = a();
        yshVarA.d();
        yqw.M(true, "refreshAfterWrite requires a LoadingCache");
        this.l = new ytj(yshVarA);
    }

    private Object readResolve() {
        return this.l;
    }

    final ysh a() {
        ysh yshVar = new ysh();
        yto ytoVar = yshVar.g;
        yqw.R(ytoVar == null, "Key strength was already set to %s", ytoVar);
        yto ytoVar2 = this.b;
        ytoVar2.getClass();
        yshVar.g = ytoVar2;
        yto ytoVar3 = yshVar.h;
        yqw.R(ytoVar3 == null, "Value strength was already set to %s", ytoVar3);
        yto ytoVar4 = this.c;
        ytoVar4.getClass();
        yshVar.h = ytoVar4;
        yqg yqgVar = yshVar.k;
        yqw.R(yqgVar == null, "key equivalence was already set to %s", yqgVar);
        yqg yqgVar2 = this.d;
        yqgVar2.getClass();
        yshVar.k = yqgVar2;
        yqg yqgVar3 = yshVar.l;
        yqw.R(yqgVar3 == null, "value equivalence was already set to %s", yqgVar3);
        yqg yqgVar4 = this.e;
        yqgVar4.getClass();
        yshVar.l = yqgVar4;
        int i = yshVar.d;
        yqw.P(i == -1, "concurrency level was already set to %s", i);
        int i2 = this.i;
        yqw.A(i2 > 0);
        yshVar.d = i2;
        yqw.L(yshVar.p == null);
        ysf ysfVar = this.n;
        ysfVar.getClass();
        yshVar.p = ysfVar;
        yshVar.c = false;
        long j = this.f;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = yshVar.i;
            yqw.Q(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
            yqw.H(true, "duration cannot be negative: %s %s", j, timeUnit);
            yshVar.i = timeUnit.toNanos(j);
        }
        long j3 = this.g;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = yshVar.j;
            yqw.Q(j4 == -1, "expireAfterAccess was already set to %s ns", j4);
            yqw.H(true, "duration cannot be negative: %s %s", j3, timeUnit2);
            yshVar.j = timeUnit2.toNanos(j3);
        }
        ysg ysgVar = this.m;
        if (ysgVar != ysg.a) {
            yqw.L(yshVar.o == null);
            if (yshVar.c) {
                long j5 = yshVar.e;
                yqw.Q(j5 == -1, "weigher can not be combined with maximum size (%s provided)", j5);
            }
            ysgVar.getClass();
            yshVar.o = ysgVar;
            if (this.h != -1) {
                long j6 = yshVar.f;
                yqw.Q(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = yshVar.e;
                yqw.Q(j7 == -1, "maximum size was already set to %s", j7);
                yshVar.f = 0L;
            }
        } else if (this.h != -1) {
            long j8 = yshVar.e;
            yqw.Q(j8 == -1, "maximum size was already set to %s", j8);
            long j9 = yshVar.f;
            yqw.Q(j9 == -1, "maximum weight was already set to %s", j9);
            yqw.M(yshVar.o == null, "maximum size can not be combined with weigher");
            yshVar.e = 0L;
        }
        yrx yrxVar = this.j;
        if (yrxVar != null) {
            yqw.L(yshVar.m == null);
            yshVar.m = yrxVar;
        }
        return yshVar;
    }

    @Override // defpackage.ysl, defpackage.yxq
    protected final /* synthetic */ Object f() {
        return this.l;
    }
}
