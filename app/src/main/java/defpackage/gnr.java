package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnr implements gnj {
    public static final gnn a = new gnn();
    public final gmy b;
    public final gni c;
    public final ztw d;
    public final String e;
    private final ahbt f;
    private final ahbt g;

    public gnr(gmy gmyVar, Context context, ahbt ahbtVar, ahbt ahbtVar2, gni gniVar, ztw ztwVar) {
        context.getClass();
        ahbtVar.getClass();
        ahbtVar2.getClass();
        gniVar.getClass();
        ztwVar.getClass();
        this.b = gmyVar;
        this.f = ahbtVar;
        this.g = ahbtVar2;
        this.c = gniVar;
        this.d = ztwVar;
        this.e = context.getPackageName();
    }

    private final double g(Instant instant) {
        this.d.a().getClass();
        return Math.exp(-fep.a(instant, r0).toHours());
    }

    private final void h(String str, int i) {
        ahal.e(this.g, null, 0, new gno(this, str, i, null), 3).w(new agux() { // from class: gnl
            @Override // defpackage.agux
            public final Object a(Object obj) {
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gnj
    public final double a(String str) {
        if (str == null) {
            return 0.0d;
        }
        gmy gmyVar = this.b;
        return a.a(g(gmyVar.a(str)), ((gnd) gmyVar).a.a(str, 3));
    }

    @Override // defpackage.gnj
    public final double b(String str) {
        if (str == null) {
            return 0.0d;
        }
        gmy gmyVar = this.b;
        return a.a(g(gmyVar.a(str)), ((gnd) gmyVar).a.a(str, 2));
    }

    @Override // defpackage.gnj
    public final void c(String str) {
        str.getClass();
        h(str, 3);
    }

    @Override // defpackage.gnj
    public final void d() {
        ahal.e(this.g, null, 0, new gnp(this, null), 3).w(new agux() { // from class: gnm
            @Override // defpackage.agux
            public final Object a(Object obj) {
                return agpu.a;
            }
        });
    }

    @Override // defpackage.gnj
    public final void e(String str) {
        str.getClass();
        h(str, 2);
    }

    @Override // defpackage.gnj
    public final void f(String str, String str2, int i) {
        str.getClass();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        ahal.e(this.f, null, 0, new gnq(this, str, str2, i, null), 3).w(new agux() { // from class: gnk
            @Override // defpackage.agux
            public final Object a(Object obj) {
                return agpu.a;
            }
        });
    }
}
