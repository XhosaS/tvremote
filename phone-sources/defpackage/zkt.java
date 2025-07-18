package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkt extends zic {
    public static final /* synthetic */ int c = 0;

    public zkt(byte[] bArr) {
        super(bArr);
    }

    static void q(zjf zjfVar, byte b, byte[] bArr, int i, int i2) {
        zjfVar.m(true, 3);
        zjfVar.h(i2 + 1);
        zjfVar.f(b);
        zjfVar.g(bArr, i, i2);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 3, this.a);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zic, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
