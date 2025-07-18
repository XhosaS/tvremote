package defpackage;

import android.util.SparseBooleanArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bho {
    public static final bhl f = new bhl();
    public final List a;
    public final List b;
    public final bhn e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final wx c = new wx(0);

    public bho(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = list.size();
        bhn bhnVar = null;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            bhn bhnVar2 = (bhn) this.a.get(i2);
            int i3 = bhnVar2.b;
            bhnVar = i3 > i ? bhnVar2 : bhnVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = bhnVar;
    }

    public final int a() {
        bhn bhnVar = (bhn) this.c.get(bhp.b);
        if (bhnVar != null) {
            return bhnVar.a;
        }
        return 0;
    }
}
