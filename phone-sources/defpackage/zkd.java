package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkd extends zjo {
    public zkd() {
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        for (zih zihVar : this.a) {
            iA += zihVar.p().a(true);
        }
        return iA;
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.l(z, 49, this.a);
    }

    public zkd(zii ziiVar) {
        super(ziiVar, false);
    }

    public zkd(zih[] zihVarArr) {
        super(false, zihVarArr);
    }
}
