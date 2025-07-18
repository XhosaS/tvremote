package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erl extends ern {
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final int g;
    public final long h;
    public final int i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final dza n;
    public final List o;
    public final List p;
    public final Map q;
    public final long r;
    public final erk s;
    public final ImmutableList t;

    public erl(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, dza dzaVar, List list2, List list3, erk erkVar, Map map, List list4) {
        long j6;
        super(str, list, z3);
        this.a = i;
        this.e = j2;
        this.d = z;
        this.f = z2;
        this.g = i2;
        this.h = j3;
        this.i = i3;
        this.j = j4;
        this.k = j5;
        this.l = z4;
        this.m = z5;
        this.n = dzaVar;
        this.o = ImmutableList.copyOf((Collection) list2);
        this.p = ImmutableList.copyOf((Collection) list3);
        this.q = ImmutableMap.copyOf(map);
        this.t = ImmutableList.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            erg ergVar = (erg) Iterables.getLast(list3);
            j6 = ergVar.g + ergVar.e;
            this.r = j6;
        } else if (list2.isEmpty()) {
            this.r = 0L;
            j6 = 0;
        } else {
            eri eriVar = (eri) Iterables.getLast(list2);
            j6 = eriVar.g + eriVar.e;
            this.r = j6;
        }
        this.b = j != -9223372036854775807L ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : -9223372036854775807L;
        this.c = j >= 0;
        this.s = erkVar;
    }

    public final long a() {
        return this.e + this.r;
    }

    @Override // defpackage.eum
    public final /* bridge */ /* synthetic */ Object e(List list) {
        return this;
    }
}
