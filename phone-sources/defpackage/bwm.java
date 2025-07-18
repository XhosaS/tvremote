package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwm implements bwl {
    private final String a;
    private final bxb b;
    private final but c;
    private final bxb d;
    private final but e;
    private final /* synthetic */ int f;

    public bwm(String str, int i) {
        this.f = i;
        this.a = str;
        this.b = new bxb();
        this.c = new but();
        this.d = new bxb();
        this.e = new but();
    }

    @Override // defpackage.bwl
    public final bxb c() {
        return this.f != 0 ? this.b : this.b;
    }

    @Override // defpackage.bwl
    public final bxb d() {
        return this.f != 0 ? this.d : this.d;
    }

    @Override // defpackage.bwl
    public final but e() {
        return this.f != 0 ? this.e : this.e;
    }

    @Override // defpackage.bwl
    public final but f() {
        return this.f != 0 ? this.c : this.c;
    }

    public final String toString() {
        if (this.f != 0) {
            return this.a;
        }
        return "RectRulers(" + this.a + ')';
    }

    public bwm(String str, int i, byte[] bArr) {
        this.f = i;
        this.a = str;
        this.b = new bxb(new lr(5));
        this.c = new but(new lr(7));
        this.d = new bxb(new lr(6));
        this.e = new but(new lr(4));
    }
}
