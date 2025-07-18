package defpackage;

import com.google.apps.tiktok.account.AccountId;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhe extends vhb {
    public static final /* synthetic */ int c = 0;
    public final vhq a;
    public final vhn b;
    private final agow d;

    static {
        Duration.ofDays(365L);
    }

    public vhe(vhq vhqVar, vhn vhnVar, agow agowVar) {
        this.a = vhqVar;
        this.b = vhnVar;
        this.d = agowVar;
    }

    @Override // defpackage.vhb
    public final zyd b(AccountId accountId) {
        zyd zydVarC = this.a.c(accountId);
        yqi yqiVar = new yqi() { // from class: vhc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                vha vhaVar = (vha) obj;
                int i = vhe.c;
                int iC = vhaVar.c();
                yqw.F(iC == 2, "Account must be in ENABLED state, but was %s.", iC != 1 ? iC != 2 ? "DISABLED" : "ENABLED" : "UNSPECIFIED");
                return vhaVar;
            }
        };
        return zuz.g(zydVarC, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.vhb
    public final zyd c() {
        return this.a.f();
    }

    @Override // defpackage.vhb
    public final zyd d() {
        return this.b.a();
    }

    @Override // defpackage.vhb
    public final zyd e(AccountId accountId) {
        zyd zydVarC = this.a.c(accountId);
        yqi yqiVar = new yqi() { // from class: vhd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = vhe.c;
                return Boolean.valueOf(((vha) obj).c() == 2);
            }
        };
        return zuz.g(zydVarC, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.vhb
    public final vha f(AccountId accountId) {
        return this.a.i(accountId);
    }

    @Override // defpackage.vhb
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final vhp a() {
        return (vhp) this.d.a();
    }
}
