package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aadl extends aacs {
    public static final aadl o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        aadl aadlVar = new aadl(aadj.H);
        o = aadlVar;
        concurrentHashMap.put(aabs.b, aadlVar);
    }

    private aadl(aabk aabkVar) {
        super(aabkVar, null);
    }

    public static aadl P() {
        return Q(aabs.n());
    }

    public static aadl Q(aabs aabsVar) {
        if (aabsVar == null) {
            aabsVar = aabs.n();
        }
        ConcurrentHashMap concurrentHashMap = p;
        aadl aadlVar = (aadl) concurrentHashMap.get(aabsVar);
        if (aadlVar != null) {
            return aadlVar;
        }
        aadl aadlVar2 = new aadl(aadp.P(o, aabsVar));
        aadl aadlVar3 = (aadl) concurrentHashMap.putIfAbsent(aabsVar, aadlVar2);
        return aadlVar3 == null ? aadlVar2 : aadlVar3;
    }

    private Object writeReplace() {
        return new aadk(z());
    }

    @Override // defpackage.aacs
    protected final void O(aacr aacrVar) {
        if (this.a.z() == aabs.b) {
            aacrVar.H = new aadv(aadm.a, aabo.d);
            aacrVar.k = aacrVar.H.s();
            aacrVar.G = new aaed((aadv) aacrVar.H, aabo.e);
            aacrVar.C = new aaed((aadv) aacrVar.H, aacrVar.h, aabo.j);
        }
    }

    @Override // defpackage.aabk
    public final aabk a() {
        return o;
    }

    @Override // defpackage.aabk
    public final aabk b(aabs aabsVar) {
        return aabsVar == z() ? this : Q(aabsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aadl) {
            return z().equals(((aadl) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        aabs aabsVarZ = z();
        if (aabsVarZ == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + aabsVarZ.e + "]";
    }
}
