package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwg {
    public static final /* synthetic */ int a = 0;

    static {
        gpn.a("DiagnosticsWrkr");
    }

    public static final void a(guo guoVar, gvg gvgVar, guk gukVar, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            guw guwVar = (guw) it.next();
            guj gujVarA = gukVar.a(fki.aM(guwVar));
            Integer numValueOf = gujVarA != null ? Integer.valueOf(gujVarA.c) : null;
            String str = guwVar.b;
            yfm.ax(guoVar.a(str), ",", null, null, null, 62);
            yfm.ax(gvgVar.a(str), ",", null, null, null, 62);
            String str2 = guwVar.d;
            Objects.toString(numValueOf);
            guwVar.c.name();
        }
    }
}
