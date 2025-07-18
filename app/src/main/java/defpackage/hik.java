package defpackage;

import android.content.Intent;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hik extends hkk {
    public final String a;
    private final Duration e;
    private final Intent f;
    private final int g;

    public hik(xpq xpqVar, int i) {
        super(i);
        Duration duration = Duration.ZERO;
        duration.getClass();
        this.e = duration;
        Intent intent = new Intent("com.google.android.apps.tvsearch.action.VIEW_DISCLAIMER");
        xpo xpoVar = xpqVar.c;
        Intent intentPutExtra = intent.putExtra("disclaimer_description", (xpoVar == null ? xpo.a : xpoVar).c);
        xpo xpoVar2 = xpqVar.c;
        Intent intent2 = intentPutExtra.putExtra("disclaimer_title", (xpoVar2 == null ? xpo.a : xpoVar2).b).setPackage("com.google.android.katniss");
        intent2.getClass();
        this.f = intent2;
        String str = xpqVar.b;
        str.getClass();
        this.a = str;
        this.g = 4772814;
    }

    @Override // defpackage.hkk
    public final int a() {
        return 0;
    }

    @Override // defpackage.hkk
    public final int b() {
        return 0;
    }

    @Override // defpackage.hkk
    public final int c() {
        return this.g;
    }

    @Override // defpackage.hkk
    public final Intent d() {
        return this.f;
    }

    @Override // defpackage.hkk
    public final Duration e() {
        return this.e;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String f() {
        return this.a;
    }

    @Override // defpackage.hkk
    public final String g() {
        return null;
    }

    @Override // defpackage.hkk
    public final boolean h() {
        return false;
    }
}
