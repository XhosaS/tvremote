package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpu extends zix {
    private final byte[] a;

    public zpu(byte[] bArr) {
        this.a = bArr;
    }

    public static zpu a(Object obj) {
        if (obj instanceof zpu) {
            return (zpu) obj;
        }
        if (obj != null) {
            return new zpu(zjm.j(obj));
        }
        return null;
    }

    public final byte[] b() {
        return vxr.bd(this.a);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new zkn(this.a));
        return new zkq(ziiVar);
    }

    public zpu(zjm zjmVar) {
        this.a = vxr.bd(zjd.f(zjmVar.h(0)).b);
    }
}
