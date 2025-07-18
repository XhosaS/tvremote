package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbn extends cyw {
    public static final /* synthetic */ int c = 0;

    public dbn(byte[] bArr) {
        super(bArr);
    }

    static void q(czz czzVar, byte b, byte[] bArr, int i, int i2) {
        czzVar.m(true, 3);
        czzVar.h(i2 + 1);
        czzVar.f(b);
        czzVar.g(bArr, i, i2);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.a.length);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 3, this.a);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    @Override // defpackage.cyw, defpackage.dab
    public final dab l() {
        return this;
    }
}
