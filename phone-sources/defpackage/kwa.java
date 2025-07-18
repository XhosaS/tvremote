package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwa {
    public String a;
    public kvm b;
    public kvn c;
    public kwb d;
    public boolean e;
    public boolean f;
    public kwc g;
    public vwe h;
    public vwe i;
    public tst j;
    public tst k;
    public boolean l;
    public tst m;
    public byte n;
    public int o;

    public kwa() {
        throw null;
    }

    public final void a(kvm kvmVar) {
        if (kvmVar == null) {
            throw new NullPointerException("Null offerType");
        }
        this.b = kvmVar;
    }

    public final void b(vwe vweVar) {
        this.j = tst.i(vweVar);
    }

    public final void c(boolean z) {
        this.l = z;
        this.n = (byte) (this.n | 4);
    }

    public kwa(byte[] bArr) {
        trk trkVar = trk.a;
        this.j = trkVar;
        this.k = trkVar;
        this.m = trkVar;
    }
}
