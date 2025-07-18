package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@fxn(a = "navigation")
/* loaded from: classes.dex */
public class fxf extends fxo<fxd> {
    private final fxp c;

    public fxf(fxp fxpVar) {
        fxpVar.getClass();
        this.c = fxpVar;
    }

    @Override // defpackage.fxo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public fxd a() {
        return new fxd(this);
    }

    @Override // defpackage.fxo
    public final void e(List list, fxh fxhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fwr fwrVar = (fwr) it.next();
            fxb fxbVar = fwrVar.a;
            fxbVar.getClass();
            fxd fxdVar = (fxd) fxbVar;
            ylf ylfVar = new ylf();
            ylfVar.a = fwrVar.a();
            int iH = fxdVar.h();
            String strM = fxdVar.m();
            if (iH == 0) {
                if (strM == null) {
                    String strValueOf = String.valueOf(fxdVar.b());
                    strValueOf.getClass();
                    if (fxdVar.f.a.b() == 0) {
                        strValueOf = "the root navigation";
                    }
                    throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf));
                }
                iH = 0;
            }
            fxb fxbVarA = strM != null ? fxdVar.f.a(strM, false) : (fxb) kq.a(fxdVar.i(), iH);
            if (fxbVarA == null) {
                fyu fyuVar = fxdVar.f;
                if (fyuVar.d == null) {
                    String strValueOf2 = fyuVar.e;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(fyuVar.c);
                    }
                    fyuVar.d = strValueOf2;
                }
                String str = fyuVar.d;
                str.getClass();
                throw new IllegalArgumentException(a.cg(str, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            if (strM != null) {
                if (!yks.e(strM, fxbVarA.f())) {
                    fxa fxaVarE = fxbVarA.e(strM);
                    Bundle bundle = fxaVarE != null ? fxaVarE.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        bundleJ.putAll(bundle);
                        Bundle bundle2 = (Bundle) ylfVar.a;
                        if (bundle2 != null) {
                            bundleJ.putAll(bundle2);
                        }
                        ylfVar.a = bundleJ;
                    }
                }
                if (fxbVarA.g().isEmpty()) {
                    continue;
                } else {
                    List listC = fus.c(fxbVarA.g(), new bap(ylfVar, 18));
                    if (!listC.isEmpty()) {
                        throw new IllegalArgumentException("Cannot navigate to startDestination " + fxbVarA + ". Missing required arguments [" + listC + ']');
                    }
                }
            }
            this.c.b(fxbVarA.a).e(yfm.p(f().a(fxbVarA, fxbVarA.c((Bundle) ylfVar.a))), fxhVar);
        }
    }
}
