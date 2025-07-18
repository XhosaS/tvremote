package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ziy extends zjh {
    public final zip a;

    public ziy(zip zipVar) {
        this.a = zipVar;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return this.a.a(z);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 7);
        this.a.c(zjfVar, false);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof ziy) {
            return this.a.d(((ziy) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    @Override // defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjh
    public final zjh l() {
        return this;
    }
}
