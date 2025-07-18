package defpackage;

import android.content.Intent;
import j$.time.Duration;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hly extends hkk {
    public final int a;
    public final String e;
    public final abvo f;
    private final String g;
    private final Duration h;
    private final String i;
    private final boolean j;
    private final List k;
    private final String l;
    private final int m;
    private final acjc n;
    private final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hly(int i, xpk xpkVar, String str, int i2) {
        abvo abvoVar;
        super(i);
        xpkVar.getClass();
        this.g = str;
        this.a = i2;
        xal xalVar = xpkVar.b;
        String str2 = (xalVar == null ? xal.a : xalVar).e;
        str2.getClass();
        this.e = str2;
        Duration duration = Duration.ZERO;
        duration.getClass();
        this.h = duration;
        xal xalVar2 = xpkVar.b;
        String str3 = (xalVar2 == null ? xal.a : xalVar2).c;
        str3.getClass();
        this.i = str3;
        this.j = str3.length() > 0;
        xal xalVar3 = xpkVar.b;
        if ((xalVar3 == null ? xal.a : xalVar3).d.A()) {
            abvoVar = null;
        } else {
            xal xalVar4 = xpkVar.b;
            abvoVar = (xalVar4 == null ? xal.a : xalVar4).d;
        }
        this.f = abvoVar;
        this.o = 2;
        List listSingletonList = Collections.singletonList(str2);
        listSingletonList.getClass();
        this.k = listSingletonList;
        this.l = "";
        this.m = 85950;
        acjc acjcVar = xpkVar.c;
        acjcVar = acjcVar == null ? acjc.a : acjcVar;
        acjcVar.getClass();
        this.n = acjcVar;
    }

    @Override // defpackage.hkk
    public final int C() {
        return this.o;
    }

    @Override // defpackage.hkk
    public final int a() {
        return this.a;
    }

    @Override // defpackage.hkk
    public final int b() {
        return 0;
    }

    @Override // defpackage.hkk
    public final int c() {
        return this.m;
    }

    @Override // defpackage.hkk
    public final Intent d() {
        return null;
    }

    @Override // defpackage.hkk
    public final Duration e() {
        return this.h;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String f() {
        return this.l;
    }

    @Override // defpackage.hkk
    public final String g() {
        return this.i;
    }

    @Override // defpackage.hkk
    public final boolean h() {
        return this.j;
    }

    @Override // defpackage.hkk
    public final pan i() {
        pan panVarI = super.i();
        panVarI.d(this.n);
        return panVarI;
    }

    @Override // defpackage.hkk, defpackage.gki
    public final String l() {
        return this.g;
    }

    @Override // defpackage.hkk
    public final List v() {
        return this.k;
    }
}
