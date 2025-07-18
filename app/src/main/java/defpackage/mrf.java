package defpackage;

import android.util.Pair;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrf {
    public final Map a;
    public final Map b;
    public final oco c;

    public mrf(Map map, Map map2, oco ocoVar) {
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            yynVar.c(Integer.valueOf(((odl) entry.getValue()).b().a), (odl) entry.getValue());
        }
        this.a = yynVar.a(true);
        yyn yynVar2 = new yyn(4);
        for (Map.Entry entry2 : ((yyr) map2).entrySet()) {
            yynVar2.c(Integer.valueOf(((odk) ((Pair) entry2.getValue()).first).a().a()), (Pair) entry2.getValue());
        }
        this.b = yynVar2.a(true);
        this.c = ocoVar;
    }
}
