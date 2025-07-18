package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tuk extends tuy {
    public tuk(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.tuy
    public final /* bridge */ /* synthetic */ void b(Object obj, tux tuxVar) {
        tyb tybVar = (tyb) obj;
        if (tybVar == null) {
            return;
        }
        txx txxVar = new txx((txy) tybVar.c.d);
        while (txxVar.hasNext()) {
            Map.Entry entry = (Map.Entry) txxVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                tuxVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    tuxVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
