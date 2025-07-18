package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pey implements qjl {
    public static final tvn a = tvn.n("GnpSdk");
    public final yfo b;
    public final Context c;
    public final pex d;
    public final xbw e;
    public final yil f;
    private final yil g;
    private final String h;
    private final Long i;

    public pey(yfo yfoVar, Context context, pex pexVar, xbw xbwVar, osk oskVar, yil yilVar, yil yilVar2) {
        yfoVar.getClass();
        xbwVar.getClass();
        oskVar.getClass();
        this.b = yfoVar;
        this.c = context;
        this.d = pexVar;
        this.e = xbwVar;
        this.g = yilVar;
        this.f = yilVar2;
        this.h = "GK_ONEOFF_SYNC";
        this.i = pak.a();
    }

    @Override // defpackage.qjl
    public final int a() {
        return 11;
    }

    @Override // defpackage.qjl
    public final long b() {
        return 0L;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return this.i;
    }

    @Override // defpackage.qjl
    public final Object d(Bundle bundle, yih yihVar) {
        return ykr.l(this.g, new oza(this, (yih) null, 3), yihVar);
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.h;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return false;
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return true;
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
