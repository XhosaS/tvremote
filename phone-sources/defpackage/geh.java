package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class geh {
    protected abstract String a();

    protected abstract void b(ghi ghiVar, Object obj);

    public final int c(gic gicVar, Object obj) throws Exception {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(a());
        try {
            b(ghiVarA, obj);
            ghiVarA.l();
            wef.r(ghiVarA, null);
            return gez.K(gicVar);
        } finally {
        }
    }

    public final int d(gic gicVar, Iterable iterable) throws Exception {
        gicVar.getClass();
        int iK = 0;
        if (iterable == null) {
            return 0;
        }
        ghi ghiVarA = gicVar.a(a());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    b(ghiVarA, obj);
                    ghiVarA.l();
                    ghiVarA.j();
                    iK += gez.K(gicVar);
                }
            }
            wef.r(ghiVarA, null);
            return iK;
        } finally {
        }
    }

    public final void e(gic gicVar, Object[] objArr) throws Exception {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(a());
        try {
            Iterator itE = ykn.e(objArr);
            while (itE.hasNext()) {
                Object next = itE.next();
                if (next != null) {
                    b(ghiVarA, next);
                    ghiVarA.l();
                    ghiVarA.j();
                    gez.K(gicVar);
                }
            }
            wef.r(ghiVarA, null);
        } finally {
        }
    }
}
