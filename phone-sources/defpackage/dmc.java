package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmc {
    public static final cwn c = new cwn();
    public final Map a;
    public final Set b;
    private final Context d;
    private int e;
    private final int f;
    private final Set g;

    public dmc(Context context, Map map, int i, int i2, Set set, Set set2) {
        this.d = context;
        this.a = map;
        this.e = i;
        this.f = i2;
        this.b = set;
        this.g = set2;
    }

    public final int a(diz dizVar) {
        dnx dnxVarO = cwp.o(this.d, dizVar);
        synchronized (this) {
            Map map = this.a;
            Integer num = (Integer) map.get(dnxVarO);
            if (num != null) {
                int iIntValue = num.intValue();
                this.b.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i = this.e;
            do {
                Set set = this.g;
                Integer numValueOf = Integer.valueOf(i);
                int i2 = i + 1;
                if (!set.contains(numValueOf)) {
                    this.e = i2 % dmf.a;
                    this.b.add(numValueOf);
                    set.add(numValueOf);
                    map.put(dnxVarO, numValueOf);
                    return i;
                }
                i = i2 % dmf.a;
            } while (i != this.e);
            throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
        }
    }

    public final Object b(yih yihVar) {
        Object objC = dts.a.c(this.d, dtu.b, cwp.p(this.f), new ale(this, (yih) null, 3), yihVar);
        return objC == yio.a ? objC : ygi.a;
    }
}
