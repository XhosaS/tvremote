package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beq {
    public final bqn a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final Map e;

    public beq() {
        this(agre.a);
    }

    public static final Bundle a(beq beqVar) {
        agpi[] agpiVarArr;
        for (Map.Entry entry : agrj.g(beqVar.e).entrySet()) {
            beqVar.c((String) entry.getKey(), ((ahin) entry.getValue()).b());
        }
        for (Map.Entry entry2 : agrj.g(beqVar.c).entrySet()) {
            beqVar.c((String) entry2.getKey(), ((bqn) entry2.getValue()).a());
        }
        Map map = beqVar.b;
        if (map.isEmpty()) {
            agpiVarArr = new agpi[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(new agpi((String) entry3.getKey(), entry3.getValue()));
            }
            agpiVarArr = (agpi[]) arrayList.toArray(new agpi[0]);
        }
        return ado.a((agpi[]) Arrays.copyOf(agpiVarArr, agpiVarArr.length));
    }

    public final Object b(String str) {
        Object objB;
        try {
            ahin ahinVar = (ahin) this.e.get(str);
            if (ahinVar != null && (objB = ahinVar.b()) != null) {
                return objB;
            }
            return this.b.get(str);
        } catch (ClassCastException unused) {
            this.b.remove(str);
            this.d.remove(str);
            this.e.remove(str);
            return null;
        }
    }

    public final void c(String str, Object obj) {
        str.getClass();
        this.b.put(str, obj);
        ahin ahinVar = (ahin) this.d.get(str);
        if (ahinVar != null) {
            ahinVar.c(obj);
        }
        ahin ahinVar2 = (ahin) this.e.get(str);
        if (ahinVar2 != null) {
            ahinVar2.c(obj);
        }
    }

    public final void d(String str, bqn bqnVar) {
        this.c.put(str, bqnVar);
    }

    public beq(Map map) {
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.a = new bep(this);
    }
}
