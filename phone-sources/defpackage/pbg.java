package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pbg implements pan {
    public static final tvn a = tvn.n("GnpSdk");
    public final rbi A;
    public final cb B;
    public final Context b;
    public final xbw c;
    public final xbw d;
    public final tst e;
    public final xbw f;
    public final xbw g;
    public final ozk h;
    public final Set i;
    public final xbw j;
    public final owz k;
    public final Set l;
    public final yfo m;
    public final xbw n;
    public final xbw o;
    public final xbw p;
    public final String q;
    public final xbw r;
    public final oyi s;
    public final Map t;
    public final xbw u;
    public final xbw v;
    public final xbw w;
    public final xbw x;
    public final rbi y;
    public final rbi z;

    public pbg(Context context, rbi rbiVar, xbw xbwVar, xbw xbwVar2, tst tstVar, rbi rbiVar2, rbi rbiVar3, ozk ozkVar, Set set, xbw xbwVar3, owz owzVar, Set set2, yfo yfoVar, xbw xbwVar4, xbw xbwVar5, xbw xbwVar6, String str, xbw xbwVar7, oyi oyiVar, Map map, xbw xbwVar8, xbw xbwVar9, xbw xbwVar10, cb cbVar, xbw xbwVar11, xbw xbwVar12, xbw xbwVar13) {
        this.b = context;
        this.y = rbiVar;
        this.c = xbwVar;
        this.d = xbwVar2;
        this.e = tstVar;
        this.z = rbiVar2;
        this.A = rbiVar3;
        this.h = ozkVar;
        this.i = set;
        this.j = xbwVar3;
        this.k = owzVar;
        this.l = set2;
        this.m = yfoVar;
        this.n = xbwVar4;
        this.o = xbwVar5;
        this.p = xbwVar6;
        this.q = str;
        this.r = xbwVar7;
        this.s = oyiVar;
        this.t = map;
        this.w = xbwVar9;
        this.x = xbwVar10;
        this.B = cbVar;
        this.v = xbwVar8;
        this.f = xbwVar11;
        this.g = xbwVar12;
        this.u = xbwVar13;
    }

    public static final boolean a(uwi uwiVar) {
        vwe vweVar = uwiVar.i;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        long jB = vxf.b(vweVar);
        return jB > 0 && jB < Instant.now().toEpochMilli();
    }
}
