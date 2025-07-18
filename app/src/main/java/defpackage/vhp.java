package defpackage;

import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhp implements vxo {
    public final vib a;
    private final vhq b;

    public vhp(vhq vhqVar, vib vibVar) {
        this.b = vhqVar;
        this.a = vibVar;
    }

    @Override // defpackage.vxo
    public final zwc a() {
        final zyd zydVarC = this.a.c.c();
        final zyd zydVarE = this.b.e();
        return new zwc(zxn.d(zydVarC, zydVarE).a(wyo.i(new Callable() { // from class: vho
            @Override // java.util.concurrent.Callable
            public final Object call() {
                vii viiVar = (vii) zxn.o(zydVarC);
                return (viiVar.b & 1) != 0 ? vxn.a((List) zxn.o(zydVarE), Instant.ofEpochMilli(viiVar.c)) : vxn.a;
            }
        }), zwk.a));
    }

    @Override // defpackage.vxo
    public final zyd b() {
        return this.a.a();
    }

    @Override // defpackage.vxo
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
