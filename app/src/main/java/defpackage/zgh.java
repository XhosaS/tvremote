package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgh {
    private static final zgd a = new zgf();
    private static final zgc b = new zgg();

    public static zga a(Set set) {
        zga zgaVar = new zga(a);
        zgaVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zer zerVar = (zer) it.next();
            zerVar.getClass();
            if (zerVar.c) {
                Map map = zgaVar.c;
                zgc zgcVar = zga.b;
                map.remove(zerVar);
                zgaVar.d.put(zerVar, zgcVar);
            } else {
                Map map2 = zgaVar.d;
                zgd zgdVar = zga.a;
                map2.remove(zerVar);
                zgaVar.c.put(zerVar, zgdVar);
            }
        }
        return zgaVar;
    }
}
