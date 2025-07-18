package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpz extends zix {
    public final int a;
    public final int b;
    public final zmd c;
    public final zxh d;

    public zpz(int i, int i2, zxh zxhVar, zmd zmdVar) {
        this.a = i;
        this.b = i2;
        this.d = new zxh(zxhVar.a());
        this.c = zmdVar;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(this.a));
        ziiVar.b(new ziu(this.b));
        ziiVar.b(new zkn(this.d.a()));
        ziiVar.b(this.c);
        return new zkq(ziiVar);
    }

    public zpz(zjm zjmVar) {
        this.a = ((ziu) zjmVar.h(0)).f();
        this.b = ((ziu) zjmVar.h(1)).f();
        this.d = new zxh(((zjd) zjmVar.h(2)).b);
        this.c = zmd.a(zjmVar.h(3));
    }
}
