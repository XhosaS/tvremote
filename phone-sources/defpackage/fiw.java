package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiw extends eho implements fiy {
    private final fji a;

    public fiw(fji fjiVar) {
        super(new fjc[2], new fjd[2]);
        p(1024);
        this.a = fjiVar;
    }

    @Override // defpackage.ehh
    public final String c() {
        throw null;
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehi h(Throwable th) {
        return new fiz(th);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehi i(ehk ehkVar, ehm ehmVar, boolean z) {
        fjc fjcVar = (fjc) ehkVar;
        fjd fjdVar = (fjd) ehmVar;
        try {
            ByteBuffer byteBuffer = fjcVar.c;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            if (z) {
                this.a.d();
            }
            fjdVar.d(fjcVar.e, this.a.b(bArrArray, 0, iLimit), fjcVar.g);
            fjdVar.shouldBeSkipped = false;
            return null;
        } catch (fiz e) {
            return e;
        }
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehk j() {
        return new fjc();
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehm l() {
        return new fiv(this);
    }

    @Override // defpackage.fiy
    public final void s(long j) {
    }
}
