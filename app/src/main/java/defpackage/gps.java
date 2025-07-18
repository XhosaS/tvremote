package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gps implements gyi {
    public final ahbt a;
    private final Context b;
    private final agow c;
    private final agow d;
    private final agow e;
    private final agow f;
    private final gyx g;
    private final Set h;
    private final Set i;
    private final int j;

    public gps(Context context, ahbt ahbtVar, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4) {
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        agowVar4.getClass();
        this.b = context;
        this.a = ahbtVar;
        this.c = agowVar;
        this.d = agowVar2;
        this.e = agowVar3;
        this.f = agowVar4;
        this.g = gyx.L;
        this.h = agqj.p(new hag[]{hag.d, hag.g});
        this.i = agrf.a;
        this.j = (((Boolean) agowVar4.a()).booleanValue() && ((Boolean) agowVar.a()).booleanValue()) ? 1 : 3;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        abs.c(this.b, new gpr(this), gpx.a, null, 2);
        Object objG = g(agswVar);
        return objG == agtg.a ? objG : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.i;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.h;
    }

    @Override // defpackage.gyi
    public final int f() {
        return this.j;
    }

    public final Object g(agsw agswVar) {
        Object objA = this.e.a();
        objA.getClass();
        gpx gpxVar = (gpx) objA;
        List listE = gpxVar.e();
        Object objA2 = this.d.a();
        objA2.getClass();
        hag hagVar = (hag) objA2;
        if (hagVar == hag.d) {
            Object objD = gpxVar.d(listE, agswVar);
            if (objD == agtg.a) {
                return objD;
            }
        } else if (hagVar == hag.g) {
            gpxVar.f(listE);
        }
        return agpu.a;
    }
}
