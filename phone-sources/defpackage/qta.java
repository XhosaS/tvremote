package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qta implements qjl {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final yil c;
    public final pvg d;
    public final qpr e;
    public final qoj f;
    public final qsx g;
    public final String h;
    private final yil i;
    private final int j;

    public qta(Context context, yil yilVar, yil yilVar2, pvg pvgVar, qpr qprVar, qoj qojVar, qsx qsxVar, String str, int i) {
        this.b = context;
        this.i = yilVar;
        this.c = yilVar2;
        this.d = pvgVar;
        this.e = qprVar;
        this.f = qojVar;
        this.g = qsxVar;
        this.h = str;
        this.j = i;
    }

    @Override // defpackage.qjl
    public final int a() {
        return this.j;
    }

    @Override // defpackage.qjl
    public final long b() {
        return this.g.a();
    }

    @Override // defpackage.qjl
    public final Long c() {
        return null;
    }

    @Override // defpackage.qjl
    public final Object d(Bundle bundle, yih yihVar) {
        return ykr.l(this.i, new pfd(this, bundle, (yih) null, 20, (byte[]) null), yihVar);
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.h;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return this.g.e();
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return true;
    }

    @Override // defpackage.qjl
    public final int h() {
        return 0;
    }

    @Override // defpackage.qjl
    public final int i() {
        return 1;
    }
}
