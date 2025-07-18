package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoi implements qlz {
    private final qlz a;
    private final qok b;
    private final qom c;

    public qoi(qlz qlzVar, int i, qku qkuVar, String str) {
        this.a = qlzVar;
        this.c = new qom(qlzVar, i, qkuVar, str);
        this.b = new qok(qlzVar, i, qkuVar, str);
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return this.c.a(true);
    }

    @Override // defpackage.qlz
    public final zyd b() {
        return this.c.a(false);
    }

    @Override // defpackage.qlz
    public final void c(qly qlyVar) {
        this.a.c(qlyVar);
    }

    @Override // defpackage.qlz
    public final void d(qly qlyVar) {
        this.a.d(qlyVar);
    }

    @Override // defpackage.qlz
    public final zyd e(String str, int i) {
        return this.b.a(true, str, i);
    }

    @Override // defpackage.qlz
    public final zyd f(String str, int i) {
        return this.b.a(false, str, i);
    }
}
