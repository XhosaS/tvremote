package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpw extends zix {
    public final byte[] a;

    public zpw(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new zkn(this.a));
        return new zkq(ziiVar);
    }

    public zpw(zjm zjmVar) {
        this.a = vxr.bd(zjd.f(zjmVar.h(0)).b);
    }
}
