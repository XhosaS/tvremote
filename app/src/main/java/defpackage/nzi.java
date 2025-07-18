package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nzi {
    public static Map a(nzk nzkVar, dzh dzhVar) {
        ocd ocdVar;
        if (!nzkVar.b() || (ocdVar = (ocd) dzhVar.c(ocd.class)) == null) {
            return null;
        }
        HashMap map = new HashMap();
        String str = ocdVar.a;
        if (str != null) {
            map.put("CellLogId", str);
        }
        String str2 = ocdVar.c;
        if (str2 == null) {
            return map;
        }
        map.put("CELL_NODE_ID", str2);
        return map;
    }
}
