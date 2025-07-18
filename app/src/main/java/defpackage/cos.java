package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cos {
    public static final String a = cbx.d("DiagnosticsWrkr");

    public static final String a(ckr ckrVar, cmm cmmVar, ckg ckgVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cld cldVar = (cld) it.next();
            ckf ckfVarA = ckgVar.a(cmk.a(cldVar));
            Integer numValueOf = ckfVarA != null ? Integer.valueOf(ckfVarA.c) : null;
            String str = cldVar.c;
            sb.append("\n" + str + "\t " + cldVar.e + "\t " + numValueOf + "\t " + cldVar.d.name() + "\t " + agqq.G(ckrVar.a(str), ",", null, null, null, 62) + "\t " + agqq.G(cmmVar.a(str), ",", null, null, null, 62) + '\t');
        }
        return sb.toString();
    }
}
