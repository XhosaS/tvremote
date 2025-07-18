package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eil {
    final Context a;
    final ecn b;
    final ttm c;
    final ttm d;
    public ttm e;
    public ttm f;
    public ttm g;
    public tsl h;
    final Looper i;
    final int j;
    public dyo k;
    public boolean l;
    final int m;
    final boolean n;
    final ekj o;
    final eki p;
    public long q;
    public long r;
    final long s;
    final long t;
    final long u;
    final boolean v;
    public boolean w;
    final String x;
    final ehy y;
    public nuh z;

    public eil(Context context, ttm ttmVar, ttm ttmVar2) {
        eij eijVar = new eij(context, 7);
        eik eikVar = new eik(0);
        eij eijVar2 = new eij(context, 8);
        dzc dzcVar = new dzc(12);
        this.a = context;
        this.c = ttmVar;
        this.d = ttmVar2;
        this.e = eijVar;
        this.f = eikVar;
        this.g = eijVar2;
        this.h = dzcVar;
        this.i = edt.N();
        this.k = dyo.a;
        this.m = 1;
        this.n = true;
        this.o = ekj.b;
        this.q = 5000L;
        this.r = 15000L;
        this.s = 3000L;
        this.p = eki.a;
        this.y = new ehy(edt.y(20L), edt.y(500L));
        this.b = ecn.a;
        this.t = 500L;
        this.u = 2000L;
        this.v = true;
        this.x = "";
        this.j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = eih.a;
        }
    }

    public final ExoPlayer a() {
        a.ab(!this.w);
        this.w = true;
        return new eiz(this);
    }
}
