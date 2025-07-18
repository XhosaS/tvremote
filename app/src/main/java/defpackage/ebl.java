package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebl {
    public final ebi a;
    public final ebk b = new ebk();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;
    public ear f;

    private ebl(ebi ebiVar) {
        this.a = ebiVar;
    }

    public static ebl a() {
        ebi ebiVar = ebi.a;
        if (ebiVar == null) {
            ebf ebfVar = new ebf();
            ebi.a = new ebi(ebfVar);
            ebi ebiVar2 = ebi.a;
            ebfVar.c = ebiVar2;
            ebiVar = ebiVar2;
        }
        return new ebl(ebiVar);
    }

    public final void b(ebr ebrVar, ebr ebrVar2, String str) {
        if (this.e) {
            throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
        }
        ebk ebkVar = this.b;
        ebkVar.a.add(ebrVar);
        ebkVar.b.add(ebrVar2);
        ebkVar.c.add(str);
        ArrayList arrayList = this.c;
        arrayList.add(ebrVar);
        arrayList.add(ebrVar2);
    }

    public final void c() {
        if (!this.d) {
            return;
        }
        int i = 0;
        this.d = false;
        this.a.c(this);
        ebk ebkVar = this.b;
        while (true) {
            ArrayList arrayList = ebkVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            ebr ebrVar = (ebr) arrayList.get(i);
            ebr ebrVar2 = (ebr) ebkVar.b.get(i);
            String str = (String) ebkVar.c.get(i);
            if (ebrVar2.g(str) == ebrVar) {
                ebrVar.j(ebrVar2);
                ebrVar2.i(str);
            }
            i++;
        }
    }
}
