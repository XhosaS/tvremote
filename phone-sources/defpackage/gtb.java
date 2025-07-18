package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gtb implements gte {
    public final gtr a;

    public gtb(gtr gtrVar) {
        this.a = gtrVar;
    }

    @Override // defpackage.gte
    public final ysx a(gou gouVar) {
        gouVar.getClass();
        return new yss(new aki(this, (yih) null, 14));
    }

    @Override // defpackage.gte
    public final boolean c(guw guwVar) {
        return b(guwVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(Object obj) {
        throw null;
    }
}
