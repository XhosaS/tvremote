package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkc extends zjm {
    public zkc() {
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        int length = this.a.length;
        int iA = true != z ? 3 : 4;
        for (int i = 0; i < length; i++) {
            iA += this.a[i].p().a(true);
        }
        return iA;
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.l(z, 48, this.a);
    }

    @Override // defpackage.zjm
    public final zic g() {
        return new zjy(o());
    }

    @Override // defpackage.zjm
    public final zjd i() {
        return new zkb(q());
    }

    @Override // defpackage.zjm
    public final zjo n() {
        return new zkd(this.a);
    }

    public zkc(zih zihVar) {
        super(zihVar);
    }

    public zkc(zii ziiVar) {
        super(ziiVar);
    }
}
