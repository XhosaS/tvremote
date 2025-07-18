package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csu implements Serializable, cta {
    private final cta a;
    private final csy b;

    public csu(cta ctaVar, csy csyVar) {
        ctaVar.getClass();
        this.a = ctaVar;
        this.b = csyVar;
    }

    private final int a() {
        int i = 2;
        csu csuVar = this;
        while (true) {
            cta ctaVar = csuVar.a;
            csuVar = ctaVar instanceof csu ? (csu) ctaVar : null;
            if (csuVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(csy csyVar) {
        return dnx.aB(get(csyVar.getKey()), csyVar);
    }

    private final Object writeReplace() {
        int iA = a();
        final cta[] ctaVarArr = new cta[iA];
        final cul culVar = new cul();
        fold(cse.a, new cty() { // from class: css
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cty
            public final Object a(Object obj, Object obj2) {
                ((cse) obj).getClass();
                cul culVar2 = culVar;
                int i = culVar2.a;
                culVar2.a = i + 1;
                ctaVarArr[i] = obj2;
                return cse.a;
            }
        });
        if (culVar.a == iA) {
            return new cst(ctaVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof csu) {
            csu csuVar = (csu) obj;
            if (csuVar.a() == a()) {
                csu csuVar2 = this;
                while (true) {
                    if (!csuVar.b(csuVar2.b)) {
                        break;
                    }
                    cta ctaVar = csuVar2.a;
                    if (ctaVar instanceof csu) {
                        csuVar2 = (csu) ctaVar;
                    } else if (csuVar.b((csy) ctaVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cta
    public final Object fold(Object obj, cty ctyVar) {
        return ctyVar.a(this.a.fold(obj, ctyVar), this.b);
    }

    @Override // defpackage.cta
    public final csy get(csz cszVar) {
        cszVar.getClass();
        csu csuVar = this;
        while (true) {
            csy csyVar = csuVar.b.get(cszVar);
            if (csyVar != null) {
                return csyVar;
            }
            cta ctaVar = csuVar.a;
            if (!(ctaVar instanceof csu)) {
                return ctaVar.get(cszVar);
            }
            csuVar = (csu) ctaVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.cta
    public final cta minusKey(csz cszVar) {
        cszVar.getClass();
        csy csyVar = this.b;
        if (csyVar.get(cszVar) != null) {
            return this.a;
        }
        cta ctaVar = this.a;
        cta ctaVarMinusKey = ctaVar.minusKey(cszVar);
        return ctaVarMinusKey != ctaVar ? ctaVarMinusKey == ctb.a ? csyVar : new csu(ctaVarMinusKey, csyVar) : this;
    }

    @Override // defpackage.cta
    public final cta plus(cta ctaVar) {
        return dnx.aE(this, ctaVar);
    }

    public final String toString() {
        return "[" + fold("", new csx(1)) + "]";
    }
}
