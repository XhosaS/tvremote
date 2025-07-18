package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iar implements icj, ics, ick, icl {
    public static final yzq a = yye.b(icg.v);
    public final icp b;
    public final SharedPreferences c;
    private final ahbt d;
    private final Map e;

    public iar(ahbt ahbtVar, icp icpVar, SharedPreferences sharedPreferences) {
        ahbtVar.getClass();
        icpVar.getClass();
        this.d = ahbtVar;
        this.b = icpVar;
        this.c = sharedPreferences;
        this.e = new LinkedHashMap();
        icpVar.d = this;
    }

    private final void n(icg icgVar) {
        Set set;
        Map map = this.e;
        if (map.containsKey(icgVar) && (set = (Set) map.get(icgVar)) != null) {
            synchronized (set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ich) it.next()).b(icgVar);
                }
            }
        }
    }

    @Override // defpackage.icl
    public final zyd a() {
        return ahkr.c(this.d, 0, new iaq(this, null), 3);
    }

    @Override // defpackage.icj
    public final String b(icg icgVar) {
        icgVar.getClass();
        icg.a.b(icgVar, 3);
        String string = this.c.getString(icgVar.w, "");
        return string == null ? "" : string;
    }

    @Override // defpackage.icj
    public final Collection c(icg icgVar) {
        icgVar.getClass();
        icg.a.b(icgVar, 4);
        SharedPreferences sharedPreferences = this.c;
        String str = icgVar.w;
        agrf agrfVar = agrf.a;
        Set<String> stringSet = sharedPreferences.getStringSet(str, agrfVar);
        return stringSet == null ? agrfVar : stringSet;
    }

    @Override // defpackage.ick
    public final void d(ich ichVar, icg... icgVarArr) {
        icgVarArr.getClass();
        List<icg> listD = agqq.d(Arrays.copyOf(icgVarArr, icgVarArr.length));
        Map map = this.e;
        synchronized (map) {
            for (icg icgVar : listD) {
                Object linkedHashSet = map.get(icgVar);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(icgVar, linkedHashSet);
                }
                ((Collection) linkedHashSet).add(ichVar);
            }
        }
    }

    @Override // defpackage.ics
    public final void e(icg icgVar, boolean z) {
        icgVar.getClass();
        icg.a.b(icgVar, 1);
        SharedPreferences sharedPreferences = this.c;
        String str = icgVar.w;
        boolean zContains = sharedPreferences.contains(str);
        boolean zI = i(icgVar, false);
        sharedPreferences.edit().putBoolean(str, z).apply();
        if (zContains && zI == z) {
            return;
        }
        n(icgVar);
    }

    @Override // defpackage.ics
    public final void f(icg icgVar, int i) {
        icgVar.getClass();
        icg.a.b(icgVar, 2);
        SharedPreferences sharedPreferences = this.c;
        String str = icgVar.w;
        boolean zContains = sharedPreferences.contains(str);
        int iM = m(icgVar);
        sharedPreferences.edit().putInt(str, i).apply();
        if (zContains && iM == i) {
            return;
        }
        n(icgVar);
    }

    @Override // defpackage.ics
    public final void g(icg icgVar, String str) {
        icgVar.getClass();
        icg.a.b(icgVar, 3);
        String strB = b(icgVar);
        this.c.edit().putString(icgVar.w, str).apply();
        if (TextUtils.equals(str, strB)) {
            return;
        }
        n(icgVar);
    }

    @Override // defpackage.ics
    public final void h(icg icgVar, Collection collection) {
        icgVar.getClass();
        collection.getClass();
        icg.a.b(icgVar, 4);
        Collection collectionC = c(icgVar);
        this.c.edit().putStringSet(icgVar.w, new HashSet(collection)).apply();
        if (agvy.c(yxu.k(collection), yxu.k(collectionC))) {
            return;
        }
        n(icgVar);
    }

    @Override // defpackage.icj
    public final boolean i(icg icgVar, boolean z) {
        icgVar.getClass();
        icg.a.b(icgVar, 1);
        return this.c.getBoolean(icgVar.w, z);
    }

    @Override // defpackage.icl
    public final boolean j() {
        return this.b.g == 2;
    }

    @Override // defpackage.icl
    public final boolean k() {
        return this.b.g == 3;
    }

    @Override // defpackage.icl
    public final boolean l() {
        return this.c.contains("interactor_settings_initialized");
    }

    @Override // defpackage.icj
    public final int m(icg icgVar) {
        icgVar.getClass();
        icg.a.b(icgVar, 2);
        return this.c.getInt(icgVar.w, 0);
    }
}
