package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecd {
    public static final List a = new ArrayList();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ejm f;
    public final List g;
    public final List h;
    public final List i;

    public ecd(int i, int i2, int i3, int i4, ejm ejmVar, List list, List list2, List list3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ejmVar == null ? efk.n() : ejmVar;
        if (list == null) {
            this.g = a;
        } else {
            int size = list.size();
            this.g = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                ejm ejmVarN = (ejm) list.get(i5);
                List list4 = this.g;
                if (ejmVarN == null) {
                    ejmVarN = efk.n();
                }
                list4.add(ejmVarN);
            }
        }
        this.h = list2 != null ? DesugarCollections.unmodifiableList(list2) : null;
        this.i = list3 != null ? DesugarCollections.unmodifiableList(list3) : null;
    }

    public static ecd a(int i, int i2, Object obj) {
        List listSingletonList = obj != null ? Collections.singletonList(obj) : null;
        return new ecd(0, i, i2, 1, null, null, listSingletonList, listSingletonList);
    }

    public static ecd b(int i, int i2, ejm ejmVar, Object obj, Object obj2) {
        return new ecd(i, i2, -1, 1, ejmVar, null, obj != null ? Collections.singletonList(obj) : null, obj2 != null ? Collections.singletonList(obj2) : null);
    }

    public static ecd c(int i, Object obj) {
        return b(3, i, efk.n(), obj, null);
    }
}
