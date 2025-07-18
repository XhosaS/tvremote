package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgk {
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(de deVar) {
        try {
            deVar.ad(null);
            List<bq> listI = deVar.b.i();
            listI.getClass();
            if (listI.isEmpty()) {
                return;
            }
            ab abVar = new ab(deVar);
            for (bq bqVar : listI) {
                if (bqVar instanceof aeiz) {
                    Object objDN = ((aeiz) bqVar).dN();
                    objDN.getClass();
                    if (objDN instanceof vgg) {
                        abVar.k(bqVar);
                    }
                }
                de deVarEg = bqVar.eg();
                deVarEg.getClass();
                deVarEg.ac();
                a(deVarEg);
            }
            if (abVar.d.isEmpty()) {
                return;
            }
            abVar.s = true;
            abVar.e();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            deVar.A("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((zdv) ((zdv) vgl.b.c()).p(e).q("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked$Companion", "clearFragments", 327, "ActivityAccountStateViewModelBacked.kt")).x("popBackStackImmediate failure, fragment state %s", new aawt(aaws.NO_USER_DATA, stringWriter.toString()));
            throw e;
        }
    }
}
