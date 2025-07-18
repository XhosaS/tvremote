package defpackage;

import java.util.List;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sbx {
    protected static final void m(ids idsVar) {
        idsVar.getClass();
        sbu sbuVarP = sfy.p();
        if (sbuVarP == null) {
            throw new IllegalStateException("Can't access current node.");
        }
        sbuVarP.a(idsVar);
    }

    protected static final void n(Observable observable) {
        observable.getClass();
        sbu sbuVarP = sfy.p();
        if (sbuVarP == null) {
            throw new IllegalStateException("Can't access current node.");
        }
        sbuVarP.a(observable);
    }

    protected static final void o(yva yvaVar) {
        sbu sbuVarP = sfy.p();
        if (sbuVarP == null) {
            throw new IllegalStateException("Can't access current node.");
        }
        sbuVarP.a(yvaVar);
    }

    protected static final Object p(rrx rrxVar) {
        Object obj;
        sbu sbuVarP = sfy.p();
        if (sbuVarP == null) {
            throw new IllegalStateException("Can't access current node.");
        }
        while (true) {
            if (sbuVarP != null) {
                Object obj2 = sbuVarP.n.get(rrxVar);
                obj = obj2 != null ? obj2 : null;
                if (obj != null) {
                    break;
                }
                sbuVarP = sbuVarP.a;
            } else {
                break;
            }
        }
        return obj;
    }

    protected static final void q(rrx rrxVar, Object obj) {
        rrxVar.getClass();
        obj.getClass();
        sbu sbuVarP = sfy.p();
        if (sbuVarP == null) {
            throw new IllegalStateException("Can't access current node.");
        }
        sbuVarP.n.put(rrxVar, obj);
    }

    protected static final ulp r() {
        sbu sbuVarP = sfy.p();
        if (sbuVarP != null) {
            return new ulp(sbuVarP);
        }
        throw new IllegalStateException("Can't access current node.");
    }

    protected Object C() {
        throw new yfv("Must implement either createViewModel or createViewModel(model)");
    }

    public Object a(Object obj) {
        return C();
    }

    public abstract void c(Object obj, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(Object obj) {
        obj.getClass();
        Object[] objArr = {obj, this};
        qaz qazVar = new qaz(this, obj, 19, null);
        sfy.o();
        sby sbyVar = sby.a;
        if (sbyVar == null) {
            throw new UnsupportedOperationException("Reoc.using must be called within a Scope");
        }
        sbu sbuVarA = sbyVar.a();
        if (sbuVarA == null) {
            throw new UnsupportedOperationException("Reoc.using must be called within a Node");
        }
        List listAX = yfm.aX(objArr);
        sbu sbuVar = null;
        for (sbu sbuVar2 : sbuVarA.h) {
            if (yks.e(sbuVar2.c, listAX)) {
                sbuVar2.getClass();
                sbuVarA.g.add(sbuVar2);
                sbuVar = sbuVar2;
            }
        }
        if (sbuVar == null) {
            sbuVar = new sbu(sbuVarA, yfm.aX(objArr), new xa(qazVar, 20));
        }
        sbyVar.c(sbuVar);
        Object obj2 = sbuVar.f;
        byte[] bArr = obj2 != 0 ? obj2 : null;
        if (bArr != null) {
            return bArr;
        }
        throw new UnsupportedOperationException("Reoc.using output must not be empty");
    }
}
