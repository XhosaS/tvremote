package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tqo {
    public static final sss e = new sss(null);
    private final tqo a;
    public final ko c;
    public boolean d = false;

    public tqo(tqo tqoVar, ko koVar) {
        if (tqoVar != null) {
            a.H(tqoVar.d);
        }
        this.a = tqoVar;
        this.c = koVar;
    }

    static tqo a(tqo tqoVar, tqo tqoVar2) {
        if (tqoVar.c()) {
            return tqoVar2;
        }
        if (tqoVar2.c()) {
            return tqoVar;
        }
        ImmutableSet<tqo> immutableSetOf = ImmutableSet.of(tqoVar, tqoVar2);
        if (immutableSetOf.isEmpty()) {
            return tqn.a;
        }
        if (immutableSetOf.size() == 1) {
            return (tqo) immutableSetOf.iterator().next();
        }
        int i = 0;
        for (tqo tqoVar3 : immutableSetOf) {
            do {
                i += tqoVar3.c.d;
                tqoVar3 = tqoVar3.a;
            } while (tqoVar3 != null);
        }
        if (i == 0) {
            return tqn.a;
        }
        ko koVar = new ko(i);
        for (tqo tqoVar4 : immutableSetOf) {
            do {
                int i2 = 0;
                while (true) {
                    ko koVar2 = tqoVar4.c;
                    if (i2 >= koVar2.d) {
                        break;
                    }
                    sij.s(koVar.put((sss) koVar2.d(i2), koVar2.g(i2)) == null, "Duplicate bindings: %s", koVar2.d(i2));
                    i2++;
                }
                tqoVar4 = tqoVar4.a;
            } while (tqoVar4 != null);
        }
        return new tqn(null, koVar).b();
    }

    final tqo b() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        tqo tqoVar = this.a;
        return (tqoVar == null || !this.c.isEmpty()) ? this : tqoVar;
    }

    public final boolean c() {
        return this == tqn.a;
    }

    public final Object d(sss sssVar) {
        tqo tqoVar;
        a.ab(this.d);
        Object obj = this.c.get(sssVar);
        return (obj != null || (tqoVar = this.a) == null) ? obj : tqoVar.d(sssVar);
    }

    final boolean e(sss sssVar) {
        if (this.c.containsKey(sssVar)) {
            return true;
        }
        tqo tqoVar = this.a;
        return tqoVar != null && tqoVar.e(sssVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (tqo tqoVar = this; tqoVar != null; tqoVar = tqoVar.a) {
            for (int i = 0; i < tqoVar.c.d; i++) {
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
