package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqv extends eqp implements eqs {
    protected final List a;
    protected final List b;
    protected epp c;

    private eqv(eqv eqvVar) {
        super(eqvVar.d);
        ArrayList arrayList = new ArrayList(eqvVar.a.size());
        this.a = arrayList;
        arrayList.addAll(eqvVar.a);
        ArrayList arrayList2 = new ArrayList(eqvVar.b.size());
        this.b = arrayList2;
        arrayList2.addAll(eqvVar.b);
        this.c = eqvVar.c;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        epp eppVarA = this.c.a();
        int i = 0;
        while (true) {
            List list2 = this.a;
            if (i >= list2.size()) {
                break;
            }
            if (i < list.size()) {
                eppVarA.d((String) list2.get(i), eppVar.b.a(eppVar, (eqw) list.get(i)));
            } else {
                eppVarA.d((String) list2.get(i), f);
            }
            i++;
        }
        for (eqw eqwVar : this.b) {
            ere ereVar = eppVarA.b;
            eqw eqwVarA = ereVar.a(eppVarA, eqwVar);
            if (eqwVarA instanceof eqx) {
                eqwVarA = ereVar.a(eppVarA, eqwVar);
            }
            if (eqwVarA instanceof eqn) {
                return ((eqn) eqwVarA).a;
            }
        }
        return eqw.f;
    }

    @Override // defpackage.eqp, defpackage.eqw
    public final eqw d() {
        return new eqv(this);
    }

    public eqv(String str, List list, List list2, epp eppVar) {
        super(str);
        this.a = new ArrayList();
        this.c = eppVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.add(((eqw) it.next()).i());
            }
        }
        this.b = new ArrayList(list2);
    }
}
