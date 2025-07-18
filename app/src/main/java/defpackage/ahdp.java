package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahdp {
    public static final Object a(ahdl ahdlVar, agsw agswVar) {
        ahdlVar.s(null);
        Object objFz = ahdlVar.fz(agswVar);
        return objFz == agtg.a ? objFz : agpu.a;
    }

    public static final ahcn b(ahdl ahdlVar, boolean z, ahdq ahdqVar) {
        return ahdlVar instanceof ahdv ? ((ahdv) ahdlVar).G(z, ahdqVar) : ahdlVar.fA(ahdqVar.c(), z, new ahdo(ahdqVar));
    }

    public static final void c(agte agteVar, CancellationException cancellationException) {
        ahdl ahdlVar = (ahdl) agteVar.get(ahdl.c);
        if (ahdlVar != null) {
            ahdlVar.s(cancellationException);
        }
    }

    public static final void d(ahdl ahdlVar, String str, Throwable th) {
        ahdlVar.s(ahcz.a(str, th));
    }

    public static final void e(agte agteVar) {
        ahdl ahdlVar = (ahdl) agteVar.get(ahdl.c);
        if (ahdlVar != null) {
            f(ahdlVar);
        }
    }

    public static final void f(ahdl ahdlVar) {
        if (!ahdlVar.t()) {
            throw ahdlVar.o();
        }
    }
}
