package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahnr {
    private final agzy a;
    public final agzy b;
    public final agzx c;
    public final agzw d;
    public final agvc e;
    private final agzx f;

    public ahnr(int i) {
        agzz agzzVar = agzz.a;
        this.f = new agzx(0L, agzzVar);
        this.c = new agzx(0L, agzzVar);
        ahnt ahntVar = new ahnt(0L, null, 2);
        this.a = new agzy(ahntVar, agzzVar);
        this.b = new agzy(ahntVar, agzzVar);
        this.d = new agzw(1 - i, agzzVar);
        this.e = new agvc() { // from class: ahno
            @Override // defpackage.agvc
            public final Object a(Object obj, Object obj2, Object obj3) {
                this.a.f();
                return agpu.a;
            }
        };
    }

    public final void e() {
        agzw agzwVar;
        int i;
        do {
            agzwVar = this.d;
            i = agzwVar.c;
            if (i <= 1) {
                return;
            }
        } while (!agzwVar.a(i, 1));
    }

    public final void f() {
        Object objA;
        long j;
        ahnt ahntVar;
        while (true) {
            int andIncrement = agzw.a.getAndIncrement(this.d);
            if (andIncrement > 0) {
                e();
                throw new IllegalStateException("The number of released permits cannot be greater than 1");
            }
            if (andIncrement >= 0) {
                return;
            }
            agzy agzyVar = this.a;
            ahnt ahntVar2 = (ahnt) agzyVar.a;
            long andIncrement2 = agzx.a.getAndIncrement(this.f);
            long j2 = ahns.f;
            long j3 = andIncrement2 / j2;
            ahnq ahnqVar = ahnq.a;
            while (true) {
                objA = ahkw.a(ahntVar2, j3, ahnqVar);
                if (ahme.b(objA)) {
                    j = andIncrement2;
                    break;
                }
                ahmd ahmdVarA = ahme.a(objA);
                while (true) {
                    ahmd ahmdVar = (ahmd) agzyVar.a;
                    ahntVar = ahntVar2;
                    j = andIncrement2;
                    if (ahmdVar.d >= ahmdVarA.d) {
                        break;
                    }
                    if (ahmdVarA.q()) {
                        if (!agzyVar.d(ahmdVar, ahmdVarA)) {
                            if (ahmdVarA.p()) {
                                ahmdVarA.l();
                            }
                            ahntVar2 = ahntVar;
                            andIncrement2 = j;
                        } else if (ahmdVar.p()) {
                            ahmdVar.l();
                        }
                    }
                }
                ahntVar2 = ahntVar;
                andIncrement2 = j;
            }
            ahnt ahntVar3 = (ahnt) ahme.a(objA);
            ahntVar3.c.b(null);
            if (ahntVar3.d <= j3) {
                int i = (int) (j % j2);
                agzu agzuVar = ahntVar3.a;
                ahmg ahmgVar = ahns.b;
                agzy[] agzyVarArr = agzuVar.a;
                Object objA2 = agzyVarArr[i].a(ahmgVar);
                if (objA2 == null) {
                    int i2 = ahns.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (agzyVarArr[i].a == ahns.c) {
                            return;
                        }
                    }
                    if (!agzyVarArr[i].d(ahmgVar, ahns.d)) {
                        return;
                    }
                } else if (objA2 == ahns.e) {
                    continue;
                } else {
                    if (!(objA2 instanceof ahap)) {
                        if (objA2 instanceof ahnh) {
                            throw null;
                        }
                        Objects.toString(objA2);
                        throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                    }
                    ahap ahapVar = (ahap) objA2;
                    if (ahapVar.j(agpu.a, this.e) != null) {
                        ahapVar.l();
                        return;
                    }
                }
            }
        }
    }
}
