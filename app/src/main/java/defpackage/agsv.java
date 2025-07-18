package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsv implements Serializable, agte {
    private final agte a;
    private final agtc b;

    public agsv(agte agteVar, agtc agtcVar) {
        agteVar.getClass();
        this.a = agteVar;
        this.b = agtcVar;
    }

    private final int a() {
        int i = 2;
        agsv agsvVar = this;
        while (true) {
            agte agteVar = agsvVar.a;
            agsvVar = agteVar instanceof agsv ? (agsv) agteVar : null;
            if (agsvVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(agtc agtcVar) {
        return agvy.c(get(agtcVar.getKey()), agtcVar);
    }

    private final Object writeReplace() {
        int iA = a();
        final agte[] agteVarArr = new agte[iA];
        final agwg agwgVar = new agwg();
        fold(agpu.a, new agvb() { // from class: agss
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                agtc agtcVar = (agtc) obj2;
                ((agpu) obj).getClass();
                agtcVar.getClass();
                agwg agwgVar2 = agwgVar;
                int i = agwgVar2.a;
                agwgVar2.a = i + 1;
                agteVarArr[i] = agtcVar;
                return agpu.a;
            }
        });
        if (agwgVar.a == iA) {
            return new agsu(agteVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agsv) {
            agsv agsvVar = (agsv) obj;
            if (agsvVar.a() == a()) {
                agsv agsvVar2 = this;
                while (true) {
                    if (!agsvVar.b(agsvVar2.b)) {
                        break;
                    }
                    agte agteVar = agsvVar2.a;
                    if (agteVar instanceof agsv) {
                        agsvVar2 = (agsv) agteVar;
                    } else if (agsvVar.b((agtc) agteVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agvbVar.a(this.a.fold(obj, agvbVar), this.b);
    }

    @Override // defpackage.agte
    public final agtc get(agtd agtdVar) {
        agtdVar.getClass();
        agsv agsvVar = this;
        while (true) {
            agtc agtcVar = agsvVar.b.get(agtdVar);
            if (agtcVar != null) {
                return agtcVar;
            }
            agte agteVar = agsvVar.a;
            if (!(agteVar instanceof agsv)) {
                return agteVar.get(agtdVar);
            }
            agsvVar = (agsv) agteVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        agtdVar.getClass();
        agtc agtcVar = this.b;
        if (agtcVar.get(agtdVar) != null) {
            return this.a;
        }
        agte agteVar = this.a;
        agte agteVarMinusKey = agteVar.minusKey(agtdVar);
        return agteVarMinusKey != agteVar ? agteVarMinusKey == agtf.a ? agtcVar : new agsv(agteVarMinusKey, agtcVar) : this;
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        return agta.a(this, agteVar);
    }

    public final String toString() {
        return "[" + fold("", new agvb() { // from class: agst
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                String str = (String) obj;
                agtc agtcVar = (agtc) obj2;
                str.getClass();
                agtcVar.getClass();
                if (str.length() == 0) {
                    return agtcVar.toString();
                }
                return str + ", " + agtcVar;
            }
        }) + "]";
    }
}
