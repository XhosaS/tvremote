package defpackage;

import android.util.Log;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wax implements wav, way {
    private final agow a;
    private final Map b;
    private final Map c;
    private final waw d;
    private final wbt e;

    public wax(yqt yqtVar, wbt wbtVar, agow agowVar, Map map, Map map2) {
        wbtVar.getClass();
        agowVar.getClass();
        map2.getClass();
        this.e = wbtVar;
        this.a = agowVar;
        this.b = map;
        this.c = map2;
        this.d = (waw) ((yqz) yqtVar).a;
    }

    private final zyd h(String str, boolean z) {
        vzs vzsVar = (vzs) this.c.get(str);
        if (vzsVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(String.valueOf(str)));
            return zxy.a;
        }
        int iOrdinal = vzsVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new agpg();
                    }
                }
            }
            return this.d.b(str, z);
        }
        return ((wcj) this.a.a()).a(str, z);
    }

    private final zyd i(boolean z) {
        yzq yzqVarKeySet = ((yyr) this.b).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : yzqVarKeySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(agqq.i(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(h((String) it2.next(), z));
        }
        return wco.a(arrayList3);
    }

    private final zyd j(String str, AccountId accountId) {
        wbt wbtVar = this.e;
        Map map = this.c;
        String strA = wbtVar.a(str);
        vzs vzsVar = (vzs) map.get(strA);
        if (vzsVar == vzs.d || vzsVar == vzs.b) {
            return this.d.c(strA, accountId);
        }
        throw new IllegalStateException(a.h(vzsVar, strA, "Package ", " was not a user package. Instead was "));
    }

    private final void k() {
        Boolean bool = true;
        bool.getClass();
    }

    @Override // defpackage.wav
    public final zyd a(String str) {
        str.getClass();
        Map map = this.c;
        String strA = this.e.a(str);
        vzs vzsVar = (vzs) map.get(strA);
        if (vzsVar == vzs.c || vzsVar == vzs.a) {
            return ((wcj) this.a.a()).a(strA, true);
        }
        throw new IllegalStateException(a.h(vzsVar, strA, "Package ", " was not a device package. Instead was "));
    }

    @Override // defpackage.wav
    public final zyd b(String str, AccountId accountId) {
        return j(str, accountId);
    }

    @Override // defpackage.wav
    public final zyd c(String str) {
        return h(this.e.a(str), true);
    }

    @Override // defpackage.wav
    public final zyd d(AccountId accountId) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((yyr) this.b).entrySet()) {
            vzs vzsVar = (vzs) entry.getValue();
            if (vzsVar == vzs.d || vzsVar == vzs.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(agqq.i(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(j((String) it2.next(), accountId));
        }
        return wco.a(arrayList3);
    }

    @Override // defpackage.wav
    public final zyd e() {
        return i(true);
    }

    @Override // defpackage.way
    public final zyd f(String str) {
        return h(this.e.a(str), false);
    }

    @Override // defpackage.way
    public final zyd g() {
        return i(false);
    }
}
