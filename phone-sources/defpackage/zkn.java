package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkn extends zjd {
    public zkn(zih zihVar) {
        super(zihVar.p().u());
    }

    static int h(int i) {
        return zjf.b(true, i);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.b.length);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 4, this.b);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public zkn(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.zjd, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjd, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
