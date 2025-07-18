package defpackage;

import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vua implements vtz {
    private final ccs a;

    public vua(ccs ccsVar) {
        this.a = ccsVar;
    }

    @Override // defpackage.vtz
    public final zyd a(String str) {
        return vty.a(((ccg) this.a.a(str)).c);
    }

    @Override // defpackage.vtz
    public final zyd b(String str) {
        return vty.a(((ccg) this.a.b(str)).c);
    }

    @Override // defpackage.vtz
    public final zyd c(UUID uuid) {
        return vty.a(((ccg) this.a.c(uuid)).c);
    }

    @Override // defpackage.vtz
    public final zyd d(ccw ccwVar) {
        return vty.a(((ccg) this.a.d(ccwVar)).c);
    }

    @Override // defpackage.vtz
    public final zyd e(ccu ccuVar) {
        return this.a.g(ccuVar);
    }

    @Override // defpackage.vtz
    public final zyd f() {
        return vty.a(((ccg) this.a.f()).c);
    }

    @Override // defpackage.vtz
    public final zyd g(String str, int i, ccl cclVar) {
        return vty.a(((ccg) this.a.h(str, i, cclVar)).c);
    }

    @Override // defpackage.vtz
    public final /* synthetic */ zyd h(String str, int i, cca ccaVar) {
        return vty.b(this, str, i, ccaVar);
    }

    @Override // defpackage.vtz
    public final zyd i(String str, int i, List list) {
        return vty.a(((ccg) this.a.i(str, i, list)).c);
    }
}
