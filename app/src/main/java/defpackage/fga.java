package defpackage;

import android.content.Context;
import android.os.Messenger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fga {
    public static final ffu a = new ffu();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/controller/libas/KatnissSearchProcessServicePeer");
    public final Context c;
    public final ahbt d;
    public final agow e;
    public final agow f;
    public final iqz g;
    public final agow h;
    public final agow i;
    public final agow j;
    public final agow k;
    public final agow l;
    public final agow m;
    public final agow n;
    public final agow o;
    public final agow p;
    public final agow q;
    public final agow r;
    public final agow s;
    public final agow t;
    public final Messenger u;
    public boolean v;
    private final gph w;
    private final ffx x;

    public fga(Context context, ahbt ahbtVar, agow agowVar, gph gphVar, agow agowVar2, iqz iqzVar, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6, agow agowVar7, agow agowVar8, agow agowVar9, agow agowVar10, agow agowVar11, agow agowVar12, agow agowVar13, agow agowVar14, agow agowVar15) {
        context.getClass();
        ahbtVar.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        agowVar9.getClass();
        agowVar11.getClass();
        agowVar12.getClass();
        agowVar14.getClass();
        agowVar15.getClass();
        this.c = context;
        this.d = ahbtVar;
        this.e = agowVar;
        this.w = gphVar;
        this.f = agowVar2;
        this.g = iqzVar;
        this.h = agowVar3;
        this.i = agowVar4;
        this.j = agowVar5;
        this.k = agowVar6;
        this.l = agowVar7;
        this.m = agowVar8;
        this.n = agowVar9;
        this.o = agowVar10;
        this.p = agowVar11;
        this.q = agowVar12;
        this.r = agowVar13;
        this.s = agowVar14;
        this.t = agowVar15;
        ffx ffxVar = new ffx(this);
        this.x = ffxVar;
        this.u = new Messenger(ffxVar);
    }

    public final void a(String str) {
        if (this.w == gph.a || !agvy.c(str, fbo.Y.a()) || this.v) {
            return;
        }
        ahal.e(this.d, null, 0, new ffy(this, null), 3);
    }
}
