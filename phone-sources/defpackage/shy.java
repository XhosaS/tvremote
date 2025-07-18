package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shy {
    public final boolean a;

    public shy(shx shxVar) {
        this.a = shxVar.a;
    }

    public final rvl a(yfo yfoVar) {
        if (this.a) {
            yfoVar = new pep(18);
        }
        return new rvl(yfoVar);
    }

    public final rvl b(final int i) {
        return a(new yfo() { // from class: rvm
            @Override // defpackage.yfo, defpackage.yfn
            public final Object b() {
                return Integer.valueOf(i);
            }
        });
    }

    public shy(tst tstVar) {
        this.a = tstVar.g();
    }

    public shy(boolean z) {
        this.a = z;
    }

    public shy(byte[] bArr) {
        this.a = true;
    }

    public shy() {
        rwz rwzVar = rxa.a;
        this.a = false;
    }
}
