package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqj extends zix {
    private final byte[] a;
    private final byte[] b;

    private zqj(zjm zjmVar) {
        if (!ziu.m(zjmVar.h(0)).o(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = vxr.bd(zkn.f(zjmVar.h(1)).b);
        this.b = vxr.bd(zkn.f(zjmVar.h(2)).b);
    }

    public static zqj a(Object obj) {
        if (obj != null) {
            return new zqj(zjm.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return vxr.bd(this.a);
    }

    public final byte[] c() {
        return vxr.bd(this.b);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(0L));
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        return new zkq(ziiVar);
    }

    public zqj(byte[] bArr, byte[] bArr2) {
        this.a = vxr.bd(bArr);
        this.b = vxr.bd(bArr2);
    }
}
