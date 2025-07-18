package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klc {
    public static final klb a;
    public static final ko b;
    public static final klc c;
    public final String d;
    public final List e;
    public final kla f;
    public final List g;
    public final klc h;
    public final ko i;
    public final int j;
    public final ImmutableMap k;
    public final Set l;
    public final List m;

    static {
        sez sezVar = new sez();
        sezVar.s("");
        sezVar.t("");
        sezVar.m("");
        sezVar.p(0);
        sezVar.o(0);
        sezVar.r("");
        sezVar.n(0);
        sezVar.q(6);
        a = sezVar.l();
        ko koVar = new ko();
        b = koVar;
        c = new klc("", ImmutableList.of(), ImmutableList.of(), kla.a, ImmutableSet.of(), ImmutableList.of(), null, koVar, ImmutableMap.of(), 0);
    }

    public klc(String str, List list, List list2, kla klaVar, Set set, List list3, klc klcVar, ko koVar, ImmutableMap immutableMap, int i) {
        this.d = str;
        this.m = list;
        this.e = list2;
        this.f = klaVar;
        this.l = new it(set);
        this.g = list3;
        this.h = klcVar;
        this.i = koVar;
        this.k = immutableMap;
        this.j = i;
    }

    private static int d(List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((klb) list.get(i)).a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int a(String str) {
        return d(this.m, str);
    }

    public final int b(String str) {
        return d(this.e, str);
    }

    public final klc c(List list, Set set) {
        List list2 = this.g;
        klc klcVar = this.h;
        ko koVar = this.i;
        ImmutableMap immutableMap = this.k;
        int i = this.j;
        return new klc(this.d, list, this.e, this.f, set, list2, klcVar, koVar, immutableMap, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof klc)) {
            klc klcVar = (klc) obj;
            if (this.m.equals(klcVar.m) && this.e.equals(klcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }
}
