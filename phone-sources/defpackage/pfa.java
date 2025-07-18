package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfa implements qjl {
    public static final tvn a = tvn.n("GnpSdk");
    public final yfo b;
    public final Context c;
    public final pex d;
    public final yil e;
    private final yfo f;
    private final yfo g;
    private final yil h;
    private final String i;
    private final boolean j;
    private final long k;
    private final Long l;

    public pfa(yfo yfoVar, Context context, pex pexVar, yfo yfoVar2, yfo yfoVar3, yil yilVar, yil yilVar2) {
        yfoVar.getClass();
        yfoVar2.getClass();
        yfoVar3.getClass();
        this.b = yfoVar;
        this.c = context;
        this.d = pexVar;
        this.f = yfoVar2;
        this.g = yfoVar3;
        this.h = yilVar;
        this.e = yilVar2;
        this.i = "GK_PERIODIC_SYNC";
        this.j = ((qit) yfoVar3).a().booleanValue();
        this.k = ((Number) yfoVar2.b()).longValue();
        this.l = pak.a();
    }

    @Override // defpackage.qjl
    public final int a() {
        return 12;
    }

    @Override // defpackage.qjl
    public final long b() {
        return this.k;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return this.l;
    }

    @Override // defpackage.qjl
    public final Object d(Bundle bundle, yih yihVar) {
        return ykr.l(this.h, new oza(this, (yih) null, 4), yihVar);
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.i;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return this.j;
    }

    @Override // defpackage.qjl
    public final int h() {
        return 2;
    }

    @Override // defpackage.qjl
    public final int i() {
        return 1;
    }
}
