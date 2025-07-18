package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrg {
    public final Map a = new HashMap();

    public mrg(Map map) {
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            this.a.put(Integer.valueOf(((odn) entry.getValue()).a().d.b), (odn) entry.getValue());
        }
    }
}
