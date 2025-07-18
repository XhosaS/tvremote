package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daw extends dag {
    public daw() {
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        int length = this.a.length;
        int iA = true != z ? 3 : 4;
        for (int i = 0; i < length; i++) {
            iA += this.a[i].p().a(true);
        }
        return iA;
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.l(z, 48, this.a);
    }

    @Override // defpackage.dag
    public final cyw g() {
        return new das(o());
    }

    @Override // defpackage.dag
    public final czx i() {
        return new dav(q());
    }

    @Override // defpackage.dag
    public final dai n() {
        return new dax(this.a);
    }

    public daw(czb czbVar) {
        super(czbVar);
    }

    public daw(czc czcVar) {
        super(czcVar);
    }
}
