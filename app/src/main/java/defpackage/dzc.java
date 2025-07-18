package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzc {
    public eah i;
    public final String j;
    public final dze l;
    public final Map a = new HashMap();
    public final dyw b = new dyw();
    public final wy c = new wy(10);
    public final Map d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final dza f = new dza(this);
    public final dyz g = new dyz(this);
    public final dzb h = new dzb(this);
    public final Map k = new LinkedHashMap();

    public dzc(dze dzeVar, String str) {
        this.l = dzeVar;
        this.j = str;
    }

    public static void b(dyx dyxVar) {
        if (dyxVar.d != null) {
            dyxVar.d = null;
        }
        if (dyxVar.e != null) {
            dyxVar.e = null;
        }
    }

    public static void e(eaf eafVar, dxa dxaVar) {
        short s = dxaVar.b;
        for (int i = 0; i < s; i++) {
            eafVar.c(dxaVar.a[dxaVar.a(i)]);
        }
    }

    public static void h(eaf eafVar, float f, dxa dxaVar) {
        short s = dxaVar.b;
        for (int i = 0; i < s; i++) {
            eafVar.d(dxaVar.a[dxaVar.a(i)], f);
        }
    }

    private static String i(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "DISAPPEARED" : "CHANGED" : "APPEARED" : "UNSET";
    }

    private final void j(View view, boolean z) {
        if ((view instanceof elr) && !(view instanceof emi)) {
            if (z) {
                Map map = this.k;
                if (map.containsKey(view)) {
                    ((elr) view).setClipChildren(((Boolean) map.remove(view)).booleanValue());
                }
            } else {
                Map map2 = this.k;
                if (!map2.containsKey(view)) {
                    elr elrVar = (elr) view;
                    map2.put(elrVar, Boolean.valueOf(elrVar.getClipChildren()));
                }
                ((elr) view).setClipChildren(false);
            }
        }
        Object parent = view.getParent();
        if (!(parent instanceof elr) || (parent instanceof emi)) {
            return;
        }
        j((View) parent, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Type inference failed for: r0v7, types: [eaf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eah a(defpackage.dyt r14) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzc.a(dyt):eah");
    }

    public final void c(dyv dyvVar, dxa dxaVar, dxa dxaVar2) {
        dyw dywVar = this.b;
        dyx dyxVar = (dyx) dywVar.a(dyvVar);
        if (dyxVar == null) {
            dyxVar = new dyx();
            if (dywVar.d.put(dyvVar, dyxVar) == null) {
                int i = dyvVar.a;
                if (i == 1) {
                    dywVar.a.put(dyvVar.b, dyvVar);
                } else if (i != 2) {
                    dywVar.c.put(dyvVar.b, dyvVar);
                } else {
                    String str = dyvVar.c;
                    Map map = dywVar.b;
                    Map linkedHashMap = (Map) map.get(str);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        map.put(str, linkedHashMap);
                    }
                    linkedHashMap.put(dyvVar.b, dyvVar);
                }
            }
        }
        if (dxaVar == null && dxaVar2 == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (dxaVar == null) {
            dyxVar.c = 0;
        } else if (dxaVar2 != null) {
            dyxVar.c = 1;
        } else {
            int i2 = dyxVar.c;
            if ((i2 == 0 || i2 == 1) && !dyxVar.h) {
                dyxVar.g = true;
            }
            dyxVar.c = 2;
        }
        dyxVar.d = dxaVar;
        dyxVar.e = dxaVar2;
        dxa dxaVar3 = dyxVar.e;
        dvi dviVar = dxaVar3 != null ? (dvi) dxaVar3.b() : null;
        Map map2 = dyxVar.a;
        for (eaf eafVar : map2.keySet()) {
            dyy dyyVar = (dyy) map2.get(eafVar);
            if (dviVar == null) {
                dyyVar.d = null;
            } else {
                dyyVar.d = Float.valueOf(eafVar.e(dviVar));
            }
        }
        dyxVar.f = true;
        String str2 = this.j;
        if (str2 != null) {
            Log.d(str2, "Saw transition id " + String.valueOf(dyvVar) + " which is " + i(dyxVar.c));
        }
    }

    public final void d(dxa dxaVar, boolean z) {
        Object obj = dxaVar.a[3];
        if (obj instanceof View) {
            j((View) obj, z);
        }
    }

    final void f(dyv dyvVar, dxa dxaVar) {
        dyx dyxVar = (dyx) this.b.a(dyvVar);
        if (dyxVar != null) {
            g(dyvVar, dyxVar, dxaVar);
        }
    }

    public final void g(dyv dyvVar, dyx dyxVar, dxa dxaVar) {
        dxa dxaVar2 = dyxVar.b;
        if (dxaVar2 == null && dxaVar == null) {
            return;
        }
        if (dxaVar2 == null || !dxaVar2.equals(dxaVar)) {
            String str = this.j;
            if (str != null) {
                Log.d(str, "Setting mount content for " + String.valueOf(dyvVar) + " to " + String.valueOf(dxaVar));
            }
            Map map = dyxVar.a;
            if (dyxVar.b != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    e((eaf) it.next(), dyxVar.b);
                }
                d(dyxVar.b, true);
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                eag eagVar = ((dyy) it2.next()).a;
                eagVar.b(dxaVar);
                eagVar.c(eagVar.c);
            }
            if (dxaVar != null) {
                d(dxaVar, false);
            }
            dyxVar.b = dxaVar;
        }
    }
}
