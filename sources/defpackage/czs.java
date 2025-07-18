package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czs extends dab {
    public final czj a;

    public czs(czj czjVar) {
        this.a = czjVar;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return this.a.a(z);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 7);
        this.a.c(czzVar, false);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof czs) {
            return this.a.d(((czs) dabVar).a);
        }
        return false;
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    @Override // defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.dab
    public final dab l() {
        return this;
    }
}
