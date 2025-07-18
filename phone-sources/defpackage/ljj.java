package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljj implements idf {
    private final Map a = new HashMap();

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized egc b(File file) {
        Map map = this.a;
        egc egcVar = (egc) map.get(file);
        if (egcVar != null) {
            return egcVar;
        }
        egw egwVar = new egw(file, null, true);
        map.put(file, egwVar);
        return egwVar;
    }
}
