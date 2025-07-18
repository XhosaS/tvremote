package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epu extends eqt {
    private final eqi b;

    public epu(eqi eqiVar) {
        this.b = eqiVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.eqt, defpackage.eqw
    public final eqw cK(String str, epp eppVar, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    epq.g("getEventName", 0, list);
                    return new era(this.b.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    epq.g("getTimestamp", 0, list);
                    return new eqo(Double.valueOf(this.b.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    epq.g("getParamValue", 1, list);
                    return epr.b(this.b.b.b(eppVar.b.a(eppVar, (eqw) list.get(0)).i()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    epq.g("getParams", 0, list);
                    Map map = this.b.b.c;
                    eqt eqtVar = new eqt();
                    for (String str2 : map.keySet()) {
                        eqtVar.q(str2, epr.b(map.get(str2)));
                    }
                    return eqtVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    epq.g("setParamValue", 2, list);
                    eqw eqwVar = (eqw) list.get(0);
                    ere ereVar = eppVar.b;
                    String strI = ereVar.a(eppVar, eqwVar).i();
                    eqw eqwVarA = ereVar.a(eppVar, (eqw) list.get(1));
                    eqh eqhVar = this.b.b;
                    Object objE = epq.e(eqwVarA);
                    if (objE == null) {
                        eqhVar.c.remove(strI);
                        return eqwVarA;
                    }
                    Map map2 = eqhVar.c;
                    map2.put(strI, eqh.c(strI, map2.get(strI), objE));
                    return eqwVarA;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    epq.g("setEventName", 1, list);
                    eqw eqwVarA2 = eppVar.b.a(eppVar, (eqw) list.get(0));
                    if (f.equals(eqwVarA2) || g.equals(eqwVarA2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.b.b.a = eqwVarA2.i();
                    return new era(eqwVarA2.i());
                }
                break;
        }
        return super.cK(str, eppVar, list);
    }
}
