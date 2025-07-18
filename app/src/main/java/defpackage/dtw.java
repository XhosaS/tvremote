package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtw {
    private final Map a = new HashMap();

    public final synchronized void a(dru druVar, dui duiVar, String str) {
        if (str != null) {
            dtv dtvVar = (dtv) this.a.get(str);
            if (dtvVar != null) {
                dtvVar.b = true;
                wy wyVar = dtvVar.a;
                int iC = wyVar.c();
                for (int i = 0; i < iC; i++) {
                    dtu dtuVar = (dtu) wyVar.d(i);
                    dtuVar.b = duiVar;
                    Object[] objArr = dtuVar.d;
                    if (objArr != null) {
                        objArr[0] = druVar;
                    }
                }
            }
        }
    }

    public final synchronized void b() {
        Map map = this.a;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            dtv dtvVar = (dtv) map.get(it.next());
            if (dtvVar == null || !dtvVar.b) {
                it.remove();
            } else {
                dtvVar.b = false;
            }
        }
    }

    public final synchronized void c(String str, dtu dtuVar) {
        dtu dtuVar2;
        if (str != null) {
            Map map = this.a;
            dtv dtvVar = (dtv) map.get(str);
            if (dtvVar == null) {
                dtvVar = new dtv();
                map.put(str, dtvVar);
                dtuVar2 = null;
            } else {
                dtuVar2 = (dtu) wz.a(dtvVar.a, dtuVar.c);
            }
            if (!dtuVar.a(dtuVar2)) {
                dtvVar.a.f(dtuVar.c, dtuVar);
            }
        }
    }
}
