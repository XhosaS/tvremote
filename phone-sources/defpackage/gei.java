package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gei {
    public abstract String a();

    public abstract void b(ghi ghiVar, Object obj);

    public final long c(gic gicVar, Object obj) throws Exception {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a(a());
        try {
            b(ghiVarA, obj);
            ghiVarA.l();
            wef.r(ghiVarA, null);
            return gez.L(gicVar);
        } finally {
        }
    }

    public final List d(gic gicVar, Object[] objArr) throws Exception {
        gicVar.getClass();
        yhp yhpVar = new yhp((byte[]) null);
        ghi ghiVarA = gicVar.a(a());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    b(ghiVarA, obj);
                    ghiVarA.l();
                    ghiVarA.j();
                    yhpVar.add(Long.valueOf(gez.L(gicVar)));
                } else {
                    yhpVar.add(-1L);
                }
            }
            wef.r(ghiVarA, null);
            return yfm.o(yhpVar);
        } finally {
        }
    }

    public final void e(gic gicVar, Object obj) throws Exception {
        ghi ghiVarA = gicVar.a(a());
        try {
            b(ghiVarA, obj);
            ghiVarA.l();
            wef.r(ghiVarA, null);
        } finally {
        }
    }
}
