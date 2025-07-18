package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxe {
    public static final awn e = new awn((char[]) null);
    private final bxe a;
    public final mi c;
    public boolean d = false;

    public bxe(bxe bxeVar, mi miVar) {
        if (bxeVar != null) {
            bdq.e(bxeVar.d);
        }
        this.a = bxeVar;
        this.c = miVar;
    }

    static bxe a(bxe bxeVar, bxe bxeVar2) {
        if (bxeVar.c()) {
            return bxeVar2;
        }
        if (bxeVar2.c()) {
            return bxeVar;
        }
        cab<bxe> cabVarO = cab.o(bxeVar, bxeVar2);
        if (cabVarO.isEmpty()) {
            return bxd.a;
        }
        if (cabVarO.size() == 1) {
            return (bxe) cabVarO.iterator().next();
        }
        int i = 0;
        for (bxe bxeVar3 : cabVarO) {
            do {
                i += bxeVar3.c.f;
                bxeVar3 = bxeVar3.a;
            } while (bxeVar3 != null);
        }
        if (i == 0) {
            return bxd.a;
        }
        mi miVar = new mi(i);
        for (bxe bxeVar4 : cabVarO) {
            do {
                int i2 = 0;
                while (true) {
                    mi miVar2 = bxeVar4.c;
                    if (i2 >= miVar2.f) {
                        break;
                    }
                    bdq.h(miVar.put((awn) miVar2.c(i2), miVar2.f(i2)) == null, "Duplicate bindings: %s", miVar2.c(i2));
                    i2++;
                }
                bxeVar4 = bxeVar4.a;
            } while (bxeVar4 != null);
        }
        return new bxd(null, miVar).b();
    }

    final bxe b() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        bxe bxeVar = this.a;
        return (bxeVar == null || !this.c.isEmpty()) ? this : bxeVar;
    }

    public final boolean c() {
        return this == bxd.a;
    }

    public final Object d(awn awnVar) {
        bxe bxeVar;
        bdq.j(this.d);
        Object obj = this.c.get(awnVar);
        return (obj != null || (bxeVar = this.a) == null) ? obj : bxeVar.d(awnVar);
    }

    final boolean e(awn awnVar) {
        if (this.c.containsKey(awnVar)) {
            return true;
        }
        bxe bxeVar = this.a;
        return bxeVar != null && bxeVar.e(awnVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (bxe bxeVar = this; bxeVar != null; bxeVar = bxeVar.a) {
            for (int i = 0; i < bxeVar.c.f; i++) {
                sb.append(this.c.f(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
