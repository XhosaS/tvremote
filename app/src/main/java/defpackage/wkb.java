package defpackage;

import android.content.ComponentCallbacks2;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkb implements wkf {
    public final bq a;
    public final wkg b;

    public wkb(bq bqVar, wkg wkgVar) {
        this.a = bqVar;
        this.b = wkgVar;
    }

    @Override // defpackage.wkf
    public final void a(wke wkeVar) {
        bq bqVar = this.a;
        bw bwVarEe = bqVar.ee();
        bwVarEe.getClass();
        ComponentCallbacks2 componentCallbacks2 = wkeVar.c;
        bwVarEe.registerComponentCallbacks(componentCallbacks2);
        Map map = this.b.a;
        Set set = (Set) map.get(bwVarEe);
        if (set != null) {
            set.add(wkeVar);
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(wkeVar);
            map.put(bwVarEe, hashSet);
        }
        bqVar.ek().b(new wka(this, bwVarEe, wkeVar, componentCallbacks2));
    }
}
