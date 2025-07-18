package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfb {
    public static final sfa a;
    public static final ko b;
    public static final sfb c;
    public final String d;
    public final List e;
    public final sey f;
    public final List g;
    public final sfb h;
    public final ko i;
    public final int j;
    public final ImmutableMap k;
    public final Set l;
    public final List m;

    static {
        sez sezVar = new sez();
        sezVar.i("");
        sezVar.j("");
        sezVar.c("");
        sezVar.f(0);
        sezVar.e(0);
        sezVar.h("");
        sezVar.d(0);
        sezVar.g(6);
        a = sezVar.b();
        ko koVar = new ko();
        b = koVar;
        c = new sfb("", ImmutableList.of(), ImmutableList.of(), sey.a, ImmutableSet.of(), ImmutableList.of(), null, koVar, ImmutableMap.of(), 0);
    }

    public sfb(String str, List list, List list2, sey seyVar, Set set, List list3, sfb sfbVar, ko koVar, ImmutableMap immutableMap, int i) {
        this.d = str;
        this.m = list;
        this.e = list2;
        this.f = seyVar;
        this.l = new it(set);
        this.g = list3;
        this.h = sfbVar;
        this.i = koVar;
        this.k = immutableMap;
        this.j = i;
    }

    private static int d(List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((sfa) list.get(i)).a.equals(str)) {
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

    public final sfb c(List list, Set set) {
        List list2 = this.g;
        sfb sfbVar = this.h;
        ko koVar = this.i;
        ImmutableMap immutableMap = this.k;
        int i = this.j;
        return new sfb(this.d, list, this.e, this.f, set, list2, sfbVar, koVar, immutableMap, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof sfb)) {
            sfb sfbVar = (sfb) obj;
            if (this.m.equals(sfbVar.m) && this.e.equals(sfbVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }
}
