package defpackage;

import j$.util.Optional;
import java.text.DecimalFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfo {
    public final wfs a;
    public final boolean b;
    public final double c;
    public final wfv d;
    public final wfv e;
    public final wfv f;
    public final wfv g;
    public final wfv h;
    public final wfv i;
    public final int j;
    public final int k;
    public final int l;

    public wfo(wfs wfsVar, int i, boolean z, int i2, wfv wfvVar, wfv wfvVar2, wfv wfvVar3, wfv wfvVar4, wfv wfvVar5, Optional optional) {
        this.a = wfsVar;
        this.j = i;
        this.b = z;
        this.c = 0.0d;
        this.k = 1;
        this.l = i2;
        this.d = wfvVar;
        this.e = wfvVar2;
        this.f = wfvVar3;
        this.g = wfvVar4;
        this.h = wfvVar5;
        this.i = (wfv) optional.orElse(wfv.b(25.0d, 84.0d));
    }

    public static double a(wfs wfsVar, double[] dArr, double[] dArr2) {
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        int i = 0;
        while (true) {
            double d = wfsVar.a;
            if (i >= iMin) {
                return d;
            }
            int i2 = i + 1;
            if (d >= dArr[i] && d < dArr[i2]) {
                return vyf.g(dArr2[i]);
            }
            i = i2;
        }
    }

    public final int b() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "inverse_on_surface";
        wfmVar.b = new wfe(14);
        int i = 0;
        wfmVar.f = new wff(wcqVar, i);
        wfmVar.h = new wfe(15);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "inverse_on_surface";
        wfmVar2.b = new wey(1);
        wfmVar2.c = new wey(i);
        wfmVar2.f = new ssj(wcqVar, 12);
        wfmVar2.h = new wey(2);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int c() {
        return wfp.a.h().c(this);
    }

    public final int d() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "on_primary";
        wfmVar.b = new wfe(3);
        int i = 16;
        wfmVar.f = new wfb(wcqVar, i);
        wfmVar.h = new wfe(4);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "on_primary";
        wfmVar2.b = new wez(15);
        wfmVar2.c = new wez(i);
        wfmVar2.f = new ssj(wcqVar, 18);
        wfmVar2.h = new wez(17);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int e() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "on_primary_container";
        wfmVar.b = new wfd(4);
        wfmVar.f = new wfb(wcqVar, 11);
        wfmVar.h = new wfd(5);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "on_primary_container";
        wfmVar2.b = new wex(1);
        wfmVar2.c = new wex(0);
        wfmVar2.f = new ssj(wcqVar, 8);
        wfmVar2.h = new wex(2);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int f() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "on_secondary_container";
        int i = 3;
        wfmVar.b = new wfc(i);
        wfmVar.f = new wfb(wcqVar, i);
        wfmVar.h = new wfc(4);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "on_secondary_container";
        wfmVar2.b = new wex(18);
        wfmVar2.c = new wex(19);
        wfmVar2.f = new ssj(wcqVar, 11);
        wfmVar2.h = new wex(20);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int g() {
        return wfp.a.i().c(this);
    }

    public final int h() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "on_surface_variant";
        wfmVar.b = new wfc(8);
        wfmVar.e = new wfc(9);
        wfmVar.f = new wfb(wcqVar, 5);
        wfmVar.h = new wfc(10);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "on_surface_variant";
        wfmVar2.b = new wew(2);
        int i = 3;
        wfmVar2.c = new wew(i);
        wfmVar2.f = new ssj(wcqVar, i);
        wfmVar2.h = new wew(4);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int i() {
        wcq wcqVar = wfp.a;
        wfm wfmVar = new wfm();
        wfmVar.a = "outline_variant";
        wfmVar.b = new wfg(15);
        wfmVar.e = new wfg(16);
        wfmVar.f = new wff(wcqVar, 6);
        wfmVar.h = new wfg(17);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "outline_variant";
        wfmVar2.b = new wew(12);
        wfmVar2.c = new wew(13);
        wfmVar2.f = new ssj(wcqVar, 3);
        wfmVar2.h = new wew(14);
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int j() {
        return wfp.a.j().c(this);
    }

    public final int k() {
        return wfp.a.k().c(this);
    }

    public final int l() {
        return wfp.a.l().c(this);
    }

    public final int m() {
        return wfp.a.m().c(this);
    }

    public final int n() {
        return wfp.a.n().c(this);
    }

    public final int o() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_container";
        wfmVar.b = new wfd(9);
        wfmVar.c = new wfd(16);
        wfmVar.d = true;
        wfmVar.e = new wfe(2);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "surface_container";
        wfmVar2.b = new wey(6);
        wfmVar2.c = new wey(7);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int p() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_container_high";
        wfmVar.b = new wfc(12);
        wfmVar.c = new wfc(13);
        wfmVar.d = true;
        wfmVar.e = new wfc(14);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "surface_container_high";
        wfmVar2.b = new wey(17);
        wfmVar2.c = new wez(2);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int q() {
        return wfp.a.p().c(this);
    }

    public final int r() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_container_low";
        wfmVar.b = new wfe(16);
        wfmVar.c = new wfe(17);
        wfmVar.d = true;
        wfmVar.e = new wfe(18);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "surface_container_low";
        wfmVar2.b = new wex(5);
        wfmVar2.c = new wex(7);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a().c(this);
    }

    public final int s() {
        return wfp.a.q().c(this);
    }

    public final String toString() {
        return String.format("Scheme: variant=%s, mode=%s, platform=%s, contrastLevel=%s, seed=%s, specVersion=%s", a.f(this.j), true != this.b ? "light" : "dark", "PHONE".toLowerCase(Locale.ENGLISH), new DecimalFormat("0.0").format(0.0d), this.a, wcq.C(this.l));
    }

    public wfo(wfs wfsVar, boolean z) {
        this(wfsVar, 3, z, 1, wfi.a(1).y(wfsVar, z), wfi.a(1).z(wfsVar), wfi.a(1).A(wfsVar), wfi.a(1).w(wfsVar), wfi.a(1).x(wfsVar), wfi.a(1).v(wfsVar));
    }
}
