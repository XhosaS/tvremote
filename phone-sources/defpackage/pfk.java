package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfk implements qjl {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final yfo c;
    public final pex d;
    private final yil e;
    private final String f;
    private final long g;

    public pfk(Context context, yil yilVar, yfo yfoVar, pex pexVar) {
        yfoVar.getClass();
        this.b = context;
        this.e = yilVar;
        this.c = yfoVar;
        this.d = pexVar;
        this.f = "GNP_IN_APP_ACCOUNT_SYNC";
        this.g = pak.a().longValue();
    }

    @Override // defpackage.qjl
    public final int a() {
        return 16;
    }

    @Override // defpackage.qjl
    public final long b() {
        return 0L;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return Long.valueOf(this.g);
    }

    @Override // defpackage.qjl
    public final Object d(Bundle bundle, yih yihVar) {
        return ykr.l(this.e, new pfd(this, bundle, (yih) null, 4), yihVar);
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.f;
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

    public final Object j(Exception exc, yih yihVar) {
        return ykr.l(this.e, new kci(exc, (yih) null, 14), yihVar);
    }
}
