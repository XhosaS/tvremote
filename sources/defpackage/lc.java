package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lc {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final List d = new ArrayList();
    public final transient Map e = new LinkedHashMap();
    public final Map f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public static final Integer a() {
        cus cusVar = cut.a;
        return Integer.valueOf(cut.b.b() + 65536);
    }

    public final void b(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lb] */
    public final boolean c(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        awy awyVar = (awy) this.e.get(str);
        if ((awyVar != null ? awyVar.a : null) != null) {
            List list = this.d;
            if (list.contains(str)) {
                awyVar.a.a(((le) awyVar.b).a(i2, intent));
                list.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new la(i2, intent));
        return true;
    }

    public final bub d(String str, le leVar, lb lbVar) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator itA = new cux(new cuz()).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    b(number.intValue(), str);
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new awy(lbVar, leVar, (byte[]) null));
        Map map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            lbVar.a(obj);
        }
        Bundle bundle = this.g;
        la laVar = (la) ii.O(bundle, str, la.class);
        if (laVar != null) {
            bundle.remove(str);
            lbVar.a(leVar.a(laVar.a, laVar.b));
        }
        return new bub(this, str);
    }
}
