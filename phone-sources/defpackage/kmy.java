package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmy {
    public final Context a;
    public final lfn b;
    public final SharedPreferences c;
    public final Executor d;
    public final msr e;
    public boolean f;
    public final boolean j;
    public final idr k;
    public final jah l;
    private List n;
    private Map o;
    private final Handler m = new Handler(Looper.getMainLooper());
    public final idr g = new idz(ieg.a);
    public final kmx h = new kmx(this, 0);
    public final kmw i = new kmw(this);

    public kmy(Context context, lfn lfnVar, SharedPreferences sharedPreferences, Executor executor, msr msrVar, jah jahVar) {
        this.a = context;
        this.b = lfnVar;
        this.c = sharedPreferences;
        this.d = executor;
        this.e = msrVar;
        this.l = jahVar;
        yhb yhbVar = yhb.a;
        this.n = yhbVar;
        this.o = yhc.a;
        this.j = true;
        this.k = new idz(yhbVar);
    }

    public static final String e() {
        nmj nmjVarF;
        nmg nmgVarC = nmg.c();
        if (nmgVarC == null || (nmjVarF = nmgVarC.f()) == null) {
            return null;
        }
        return nmjVarF.d;
    }

    public final String a(String str) {
        String str2 = (String) Map.EL.getOrDefault(this.o, str, "");
        krd.b(a.cz(str2, str, "Package name: ", ", app id: "));
        return str2;
    }

    public final void b(int i) {
        if (i != 2160) {
            this.m.post(new jlr(this, 8));
        }
    }

    public final void c() {
        Object objA = this.l.e.a();
        objA.getClass();
        ArrayList<wnc> arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            String str = ((wnc) obj).f;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(arrayList, 10)), 16));
        for (wnc wncVar : arrayList) {
            yfw yfwVar = new yfw(wncVar.e, wncVar.f);
            linkedHashMap.put(yfwVar.a, yfwVar.b);
        }
        this.o = linkedHashMap;
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wnc) it.next()).f);
        }
        this.n = arrayList2;
        lfn lfnVar = this.b;
        List listT = yfm.t(lfnVar.bg(), lfnVar.bq());
        listT.addAll(this.n);
        nmg nmgVarC = nmg.c();
        if (nmgVarC != null) {
            nmgVarC.f.n = listT;
            nmgVarC.k();
        }
    }

    public final boolean d(fux fuxVar, wpm wpmVar) {
        nmg nmgVarC;
        Set setI;
        Set setI2;
        int i = wpmVar.b;
        if ((i & 4) != 0) {
            String strBg = this.b.bg();
            nmg nmgVarC2 = nmg.c();
            if (nmgVarC2 == null || (setI2 = nmgVarC2.i(strBg)) == null) {
                return false;
            }
            return setI2.contains(fuxVar);
        }
        if ((i & 8) == 0) {
            return false;
        }
        wld wldVar = wpmVar.h;
        if (wldVar == null) {
            wldVar = wld.a;
        }
        String str = wldVar.b;
        str.getClass();
        String strA = a(str);
        if (strA == null || strA.length() == 0 || (nmgVarC = nmg.c()) == null || (setI = nmgVarC.i(strA)) == null) {
            return false;
        }
        return setI.contains(fuxVar);
    }
}
