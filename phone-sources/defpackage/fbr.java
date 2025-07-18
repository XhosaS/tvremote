package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbr {
    public final Context a;
    public final SparseArray b;
    public final boolean c;
    public final fcj d;
    public final ecn e;
    public final CopyOnWriteArraySet f;
    public edn g = new edn();
    public final dze h;
    public final ebj i;
    public final ImmutableList j;
    public ecu k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;
    public final dhq q;

    public fbr(fbn fbnVar) {
        this.a = fbnVar.a;
        dhq dhqVar = fbnVar.f;
        eci.e(dhqVar);
        this.q = dhqVar;
        this.b = new SparseArray();
        this.j = ImmutableList.of();
        this.i = ebj.a;
        this.c = fbnVar.c;
        ecn ecnVar = fbnVar.d;
        this.e = ecnVar;
        this.d = new fbd(fbnVar.b, ecnVar);
        this.f = new CopyOnWriteArraySet();
        this.h = new dze(new dzd());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }

    public static final dyt b(dyt dytVar) {
        return (dytVar == null || !dytVar.g()) ? dyt.a : dytVar;
    }

    public final void a() {
        this.d.b();
    }
}
