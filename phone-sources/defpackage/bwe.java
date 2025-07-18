package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwe extends bko implements byk {
    public yjv a;
    public long b = -9223372034707292160L;

    public bwe(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        if (a.s(this.b, j)) {
            return;
        }
        this.a.a(new cmh(j));
        this.b = j;
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return true;
    }

    @Override // defpackage.byk
    public final /* synthetic */ void cj(bvc bvcVar) {
    }
}
