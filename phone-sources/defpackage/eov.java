package defpackage;

import android.net.Uri;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eov implements epe {
    private final Object a = new Object();
    private dzq b;
    private epd c;

    @Override // defpackage.epe
    public final epd a(dzy dzyVar) {
        epd epdVar;
        dzt dztVar = dzyVar.c;
        dztVar.getClass();
        dzq dzqVar = dztVar.k;
        if (dzqVar == null) {
            return epd.l;
        }
        synchronized (this.a) {
            if (!Objects.equals(dzqVar, this.b)) {
                this.b = dzqVar;
                efb efbVar = new efb();
                String string = null;
                efbVar.a = null;
                Uri uri = dzqVar.j;
                if (uri != null) {
                    string = uri.toString();
                }
                eps epsVar = new eps(string, dzqVar.n, efbVar);
                UnmodifiableIterator it = dzqVar.k.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    str.getClass();
                    str2.getClass();
                    Map map = epsVar.a;
                    synchronized (map) {
                        map.put(str, str2);
                    }
                }
                eop eopVar = new eop();
                eopVar.c(dzqVar.i, epr.a);
                eopVar.a = dzqVar.l;
                eopVar.b = dzqVar.m;
                eopVar.b(sfy.ae(dzqVar.o));
                eou eouVarA = eopVar.a(epsVar);
                eouVarA.e(0, dzqVar.a());
                this.c = eouVarA;
            }
            epdVar = this.c;
            epdVar.getClass();
        }
        return epdVar;
    }
}
