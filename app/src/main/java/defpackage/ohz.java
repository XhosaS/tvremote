package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohz {
    public final oin a;
    public final Executor b;
    public final String c;

    public ohz(oin oinVar, Executor executor) {
        this.a = oinVar;
        this.b = executor;
        this.c = oinVar.b();
    }

    public static List a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afg afgVar = (afg) it.next();
            Object obj2 = afgVar.a;
            if (obj2 != null && (obj = afgVar.b) != null) {
                ohl ohlVar = new ohl();
                ohlVar.b(oij.NATIVE_LIBRARY_CHECK.w);
                ohlVar.c = Long.valueOf(((Long) obj).longValue() / 1000);
                oih oihVarN = oii.n();
                oihVarN.c(zcp.b);
                ohn ohnVar = (ohn) oihVarN;
                ohnVar.c = (String) obj2;
                ohnVar.b = new oif(false, 0L);
                ohlVar.d = oihVarN.a();
                arrayList.add(ohlVar);
            }
        }
        return arrayList;
    }
}
