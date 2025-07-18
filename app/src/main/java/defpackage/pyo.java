package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyo {
    public static final qba a(pyw pywVar, aejl aejlVar, aejl aejlVar2, aejl aejlVar3) {
        prk prkVar = (prk) aejlVar3.a();
        yqt yqtVar = pywVar.j;
        yqtVar.getClass();
        Executor executor = (Executor) aejlVar2.a();
        phg phgVar = (phg) aejlVar.a();
        if (!yqtVar.g()) {
            return new qbb();
        }
        Object objC = yqtVar.c();
        qbv qbvVar = pywVar.c;
        return new qbr(phgVar, (phd) objC, prkVar, executor);
    }

    public static final pxv b(pyl pylVar, pyw pywVar, aejl aejlVar, aejl aejlVar2, aejl aejlVar3, aejl aejlVar4, aejl aejlVar5, aejl aejlVar6, aejl aejlVar7, aejl aejlVar8, aejl aejlVar9, aejl aejlVar10, aejl aejlVar11, aejl aejlVar12, aejl aejlVar13) {
        Context context = pylVar.a;
        context.getClass();
        pkn pknVar = (pkn) aejlVar2.a();
        pxy pxyVar = (pxy) aejlVar7.a();
        ueg uegVar = (ueg) aejlVar5.a();
        context.getClass();
        qay qayVar = new qay(context, (yrp) aejlVar8.a(), (ueg) aejlVar5.a(), (qfg) aejlVar9.a(), (yqt) aejlVar10.a(), (qcf) aejlVar11.a(), (Executor) aejlVar6.a(), (phg) aejlVar4.a());
        yqt yqtVar = (yqt) aejlVar12.a();
        yqt yqtVar2 = (yqt) aejlVar10.a();
        qbv qbvVar = (qbv) aejlVar.a();
        phg phgVar = (phg) aejlVar4.a();
        yqt yqtVar3 = (yqt) aejlVar3.a();
        Executor executor = (Executor) aejlVar6.a();
        yqt yqtVar4 = pywVar.k;
        return new pxv(context, pknVar, pxyVar, uegVar, qayVar, yqtVar, yqtVar2, qbvVar, phgVar, yqtVar3, executor);
    }

    public static final prj c(pyl pylVar, pyw pywVar, aejl aejlVar, aejl aejlVar2, aejl aejlVar3, aejl aejlVar4, aejl aejlVar5, aejl aejlVar6, aejl aejlVar7, aejl aejlVar8, aejl aejlVar9, aejl aejlVar10, aejl aejlVar11, aejl aejlVar12, aejl aejlVar13, aejl aejlVar14, aejl aejlVar15, aejl aejlVar16, aejl aejlVar17) {
        Context context = pylVar.a;
        context.getClass();
        return new prj(context, (qbv) aejlVar.a(), (pkn) aejlVar2.a(), (prk) aejlVar14.a(), b(pylVar, pywVar, aejlVar, aejlVar2, aejlVar3, aejlVar4, aejlVar5, aejlVar6, aejlVar7, aejlVar8, aejlVar9, aejlVar10, aejlVar12, aejlVar13, aejlVar14), (pmq) aejlVar11.a(), (yqt) aejlVar15.a(), (Executor) aejlVar6.a(), (yqt) aejlVar3.a(), (ueg) aejlVar5.a(), (yqt) aejlVar16.a(), a(pywVar, aejlVar4, aejlVar6, aejlVar14), (phg) aejlVar4.a(), (Executor) aejlVar17.a());
    }
}
