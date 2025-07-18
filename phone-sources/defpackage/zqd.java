package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqd extends zix {
    private final byte[] a;
    private final byte[] b;

    public zqd(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return vxr.bd(this.b);
    }

    public final byte[] b() {
        return vxr.bd(this.a);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        return new zkq(ziiVar);
    }

    public zqd(zjm zjmVar) {
        this.a = vxr.bd(zjd.f(zjmVar.h(0)).b);
        this.b = vxr.bd(zjd.f(zjmVar.h(1)).b);
    }
}
