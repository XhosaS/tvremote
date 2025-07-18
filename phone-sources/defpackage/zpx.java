package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpx extends zix {
    public final byte[] a;
    public final byte[] b;

    public zpx(zjm zjmVar) {
        this.a = vxr.bd(zjd.f(zjmVar.h(0)).b);
        this.b = vxr.bd(zjd.f(zjmVar.h(1)).b);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        return new zkq(ziiVar);
    }
}
