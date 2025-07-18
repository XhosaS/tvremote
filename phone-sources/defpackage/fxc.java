package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fxc {
    public final String a;
    private final fxo d;
    public final Map b = new LinkedHashMap();
    public final List c = new ArrayList();
    private final Map e = new LinkedHashMap();

    public fxc(fxo fxoVar, String str) {
        this.d = fxoVar;
        this.a = str;
    }

    public fxb a() {
        fxb fxbVarB = b();
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            fwq fwqVar = (fwq) entry.getValue();
            str.getClass();
            fwqVar.getClass();
            fxbVarB.b.c.put(str, fwqVar);
        }
        for (fwy fwyVar : this.c) {
            fwyVar.getClass();
            fys fysVar = fxbVarB.b;
            List listC = fus.c(fysVar.c, new fyq(fwyVar, 3));
            if (!listC.isEmpty()) {
                throw new IllegalArgumentException("Deep link " + fwyVar.c + " can't be used to open destination " + fysVar.a + ".\nFollowing required arguments are missing: " + listC);
            }
            fysVar.b.add(fwyVar);
        }
        for (Map.Entry entry2 : this.e.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            fwp fwpVar = (fwp) entry2.getValue();
            fwpVar.getClass();
            if (!fxbVarB.a()) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + fxbVarB + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            fxbVarB.d.h(iIntValue, fwpVar);
        }
        String str2 = this.a;
        if (str2 == null) {
            return fxbVarB;
        }
        fys fysVar2 = fxbVarB.b;
        if (ylh.L(str2)) {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        String strG = fus.g(str2);
        List listC2 = fus.c(fysVar2.c, new fyq(new fwy(strG), 4));
        if (listC2.isEmpty()) {
            fysVar2.f = new yga(new ddd(strG, 17));
            fysVar2.d = strG.hashCode();
            fysVar2.e = str2;
            return fxbVarB;
        }
        throw new IllegalArgumentException("Cannot set route \"" + str2 + "\" for destination " + fysVar2.a + ". Following required arguments are missing: " + listC2);
    }

    protected fxb b() {
        return this.d.a();
    }
}
