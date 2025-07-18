package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class dza implements eai {
    final /* synthetic */ dzc a;
    private final ArrayList b = new ArrayList();

    public dza(dzc dzcVar) {
        this.a = dzcVar;
    }

    @Override // defpackage.eai
    public final void a(eah eahVar) {
        e(eahVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [elq, java.lang.Object] */
    @Override // defpackage.eai
    public final void b(eah eahVar) {
        dzc dzcVar = this.a;
        List<eao> list = (List) dzcVar.a.get(eahVar);
        if (list != null && dzcVar.l != null) {
            for (eao eaoVar : list) {
                ?? A = eahVar.a();
                if (A != 0) {
                    String str = eaoVar.a.b;
                    eaf eafVar = eaoVar.b;
                    A.d(new dyu());
                }
            }
        }
        e(eahVar);
    }

    @Override // defpackage.eai
    public final void c(eah eahVar) {
        ArrayList arrayList = this.b;
        eahVar.c(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ean eanVar = (ean) arrayList.get(i);
            eao eaoVar = eanVar.a;
            dyx dyxVar = (dyx) this.a.b.a(eaoVar.a);
            if (dyxVar != null) {
                dyy dyyVar = (dyy) dyxVar.a.get(eaoVar.b);
                dyyVar.c = Float.valueOf(eanVar.b);
                dyyVar.b = eahVar;
            }
        }
        arrayList.clear();
        dzc dzcVar = this.a;
        if (TextUtils.isEmpty((String) wz.a(dzcVar.c, eahVar.hashCode()))) {
            return;
        }
        eahVar.hashCode();
        emc emcVar = emd.a;
        boolean z = ema.a;
    }

    @Override // defpackage.eai
    public final boolean d(eah eahVar) {
        Float f;
        ArrayList arrayList = this.b;
        eahVar.c(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ean eanVar = (ean) arrayList.get(i);
            eao eaoVar = eanVar.a;
            dyv dyvVar = eaoVar.a;
            dzc dzcVar = this.a;
            dyx dyxVar = (dyx) dzcVar.b.a(dyvVar);
            dyy dyyVar = dyxVar != null ? (dyy) dyxVar.a.get(eaoVar.b) : null;
            String str = dzcVar.j;
            if (str != null) {
                String strValueOf = String.valueOf(dyvVar);
                eaf eafVar = eaoVar.b;
                float f2 = eanVar.b;
                Log.d(str, "Trying to start animation on " + strValueOf + "#" + eafVar.b() + " to " + f2 + ":");
            }
            if (dyyVar == null) {
                if (str != null) {
                    Log.d(str, " - Canceling animation, transitionId not found in the AnimationState. It has been probably cancelled already.");
                }
                z = false;
            }
            if (z && (f = dyyVar.d) != null) {
                float f3 = eanVar.b;
                if (f.floatValue() != f3) {
                    if (str != null) {
                        Log.d(str, " - Canceling animation, last mounted value does not equal animation target: " + dyyVar.d + " != " + f3);
                    }
                    z = false;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    public final void e(eah eahVar) {
        boolean z;
        List list;
        String str;
        dzc dzcVar = this.a;
        List list2 = (List) dzcVar.a.remove(eahVar);
        if (list2 == null) {
            return;
        }
        int size = list2.size();
        int i = 0;
        while (i < size) {
            eao eaoVar = (eao) list2.get(i);
            dyv dyvVar = eaoVar.a;
            dyw dywVar = dzcVar.b;
            dyx dyxVar = (dyx) dywVar.a(dyvVar);
            eaf eafVar = eaoVar.b;
            if (dyxVar.c == 2) {
                Map map = dyxVar.a;
                if (((dyy) map.get(eafVar)) == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                r7.e--;
                if (dyxVar.c != 2) {
                    throw new RuntimeException("This should only be checked for disappearing animations");
                }
                Iterator it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (((dyy) it.next()).e > 0) {
                        z = false;
                        break;
                    }
                }
                if (z && dyxVar.b != null) {
                    Iterator it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        dzc.e((eaf) it2.next(), dyxVar.b);
                    }
                }
            } else {
                Map map2 = dyxVar.a;
                dyy dyyVar = (dyy) map2.get(eafVar);
                if (dyyVar == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                int i2 = dyyVar.e - 1;
                dyyVar.e = i2;
                if (i2 <= 0) {
                    map2.remove(eafVar);
                    boolean zIsEmpty = map2.isEmpty();
                    if (dyxVar.b != null) {
                        dzc.h(eafVar, eafVar.e((dvi) dyxVar.e.b()), dyxVar.b);
                    }
                    z = zIsEmpty;
                }
                list = list2;
                i++;
                list2 = list;
            }
            if (z) {
                String str2 = dzcVar.j;
                if (str2 != null) {
                    Log.d(str2, "Finished all animations for transition id ".concat(String.valueOf(String.valueOf(dyvVar))));
                }
                dxa dxaVar = dyxVar.b;
                if (dxaVar != null) {
                    dzcVar.d(dxaVar, true);
                }
                dze dzeVar = dzcVar.l;
                if (dzeVar != null) {
                    dzf dzfVar = dzeVar.b;
                    dxa dxaVar2 = (dxa) dzfVar.a.remove(dyvVar);
                    if (dxaVar2 != null) {
                        dzg.e(dzeVar.a, dxaVar2);
                    } else {
                        if (!dzfVar.f.remove(dyvVar) && (str = ((dzf) dzeVar.a.c).j) != null) {
                            Log.e(str, a.o(dyvVar, "Ending animation for id ", " but it wasn't recorded as animating!"));
                        }
                        enb enbVar = dzfVar.i;
                        dxa dxaVarF = enbVar != null ? enbVar.f(dyvVar) : null;
                        if (dxaVarF != null) {
                            short s = dxaVarF.b;
                            int i3 = 0;
                            while (i3 < s) {
                                dzg.j(dzeVar.a, dzfVar.i, dzfVar.i.b(((dvi) dxaVarF.a[dxaVarF.a(i3)]).a), false);
                                i3++;
                                list2 = list2;
                            }
                        }
                    }
                }
                list = list2;
                dywVar.d(dyvVar);
                dzc.b(dyxVar);
            } else {
                list = list2;
            }
            i++;
            list2 = list;
        }
        wy wyVar = dzcVar.c;
        if (TextUtils.isEmpty((String) wz.a(wyVar, eahVar.hashCode()))) {
            return;
        }
        eahVar.hashCode();
        emc emcVar = emd.a;
        boolean z2 = ema.a;
        wz.b(wyVar, eahVar.hashCode());
    }
}
