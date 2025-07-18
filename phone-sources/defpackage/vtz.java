package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vtz extends vuc implements vua {
    public vtr l = vtr.a;

    @Override // defpackage.vua
    public final Object bI(vvd vvdVar) {
        throw null;
    }

    @Override // defpackage.vua
    public final boolean bJ(vvd vvdVar) {
        throw null;
    }

    public final vtr c() {
        vtr vtrVar = this.l;
        if (vtrVar.c) {
            this.l = vtrVar.clone();
        }
        return this.l;
    }

    public final void i(vvd vvdVar) {
        if (vvdVar.d != ((vuc) a(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
