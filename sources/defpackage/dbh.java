package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbh extends czx {
    public dbh(czb czbVar) {
        super(czbVar.p().u());
    }

    static int h(int i) {
        return czz.b(true, i);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, this.b.length);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.j(z, 4, this.b);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    public dbh(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.czx, defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.czx, defpackage.dab
    public final dab l() {
        return this;
    }
}
