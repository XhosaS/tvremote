package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xu {
    public static final ye a = new xt();
    public static final ye b = new xt();
    public static final ye c = new xt();

    public static final void a(abk abkVar) {
        abj abjVar;
        xb xbVar = abkVar.m().a;
        if (xbVar != xb.b && xbVar != xb.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object obj = abkVar.J().a;
        synchronized (((abn) obj).f) {
            Iterator it = ((abn) obj).b.entrySet().iterator();
            do {
                abjVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                abj abjVar2 = (abj) entry.getValue();
                if (true == dnx.aB(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    abjVar = abjVar2;
                }
            } while (abjVar == null);
        }
        if (abjVar == null) {
            xv xvVar = new xv(abkVar.J(), (yc) abkVar);
            abkVar.J().d("androidx.lifecycle.internal.SavedStateHandlesProvider", xvVar);
            abkVar.m().a(new xr(xvVar, 0));
        }
    }
}
