package defpackage;

import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtw implements vtz {
    private final cot a;
    private final ccs b;

    public vtw(cot cotVar, ccs ccsVar) {
        this.a = cotVar;
        this.b = ccsVar;
    }

    @Override // defpackage.vtz
    public final zyd a(String str) {
        return this.a.a();
    }

    @Override // defpackage.vtz
    public final zyd b(String str) {
        return this.a.b();
    }

    @Override // defpackage.vtz
    public final zyd c(UUID uuid) {
        return this.a.c();
    }

    @Override // defpackage.vtz
    public final zyd d(ccw ccwVar) {
        return this.a.d();
    }

    @Override // defpackage.vtz
    public final zyd e(ccu ccuVar) {
        return this.a.g();
    }

    @Override // defpackage.vtz
    public final zyd f() {
        return vty.a(((ccg) this.b.f()).c);
    }

    @Override // defpackage.vtz
    public final zyd g(String str, int i, ccl cclVar) {
        return this.a.e();
    }

    @Override // defpackage.vtz
    public final /* synthetic */ zyd h(String str, int i, cca ccaVar) {
        return vty.b(this, str, i, ccaVar);
    }

    @Override // defpackage.vtz
    public final zyd i(String str, int i, List list) {
        return this.a.f();
    }
}
