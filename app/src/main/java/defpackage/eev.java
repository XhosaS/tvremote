package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eev {
    private static final yyn a = new yyn(4);
    private final String b;

    public eev(String str) {
        this.b = str;
    }

    public static Map a(dru druVar) {
        dzh dzhVar = druVar.g;
        if (dzhVar == null) {
            return a.a(true);
        }
        eev eevVar = (eev) dzhVar.c(eev.class);
        if (eevVar == null) {
            return a.a(true);
        }
        yyn yynVar = new yyn(4);
        yynVar.c("Component name", eevVar.b);
        return yynVar.a(true);
    }

    public static void b(dru druVar, String str) {
        dzh dzhVar = druVar.g;
        eev eevVar = new eev(str);
        if (dzhVar == null) {
            dzh dzhVar2 = new dzh();
            dzhVar2.d(eev.class, eevVar);
            druVar.g = dzhVar2;
            return;
        }
        eev eevVar2 = (eev) dzhVar.c(eev.class);
        if (eevVar2 == null) {
            dzhVar.d(eev.class, eevVar);
            return;
        }
        dzhVar.d(eev.class, new eev(eevVar2.b + "|" + str));
    }
}
