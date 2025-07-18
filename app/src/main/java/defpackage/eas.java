package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eas extends eaj {
    public final ebl a;

    public eas(ebl eblVar) {
        this.a = eblVar;
        ear earVar = new ear(this);
        if (eblVar.f != null) {
            throw new RuntimeException("Overriding existing listener!");
        }
        eblVar.f = earVar;
    }

    @Override // defpackage.eah
    public final void f() {
        ebl eblVar = this.a;
        if (eblVar.d) {
            eblVar.c();
        }
    }

    @Override // defpackage.eah
    public final boolean g() {
        return this.a.d;
    }

    @Override // defpackage.eah
    public final void h(dzb dzbVar) {
        if (!l()) {
            i();
            return;
        }
        k();
        m(dzbVar);
        ebl eblVar = this.a;
        int i = 0;
        while (true) {
            ebk ebkVar = eblVar.b;
            ArrayList arrayList = ebkVar.a;
            if (i >= arrayList.size()) {
                eblVar.e = true;
                eblVar.d = true;
                eblVar.a.b(eblVar);
                return;
            }
            ebr ebrVar = (ebr) arrayList.get(i);
            ebr ebrVar2 = (ebr) ebkVar.b.get(i);
            String str = (String) ebkVar.c.get(i);
            ebr ebrVarG = ebrVar2.g(str);
            if (ebrVarG != null) {
                ebrVarG.j(ebrVar2);
                ebrVar2.i(str);
            }
            if (ebrVar.b == null) {
                ebrVar.b = new ArrayList();
            }
            ebrVar.b.add(ebrVar2);
            if (ebrVar2.a == null) {
                ebrVar2.a = new LinkedHashMap();
            }
            ebrVar2.a.put(str, ebrVar);
            i++;
        }
    }

    protected abstract void m(dzb dzbVar);
}
