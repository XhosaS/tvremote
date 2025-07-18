package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zqh extends zix {
    private final byte[] a;
    private final byte[] b;

    public zqh(byte[] bArr, byte[] bArr2) {
        this.a = vxr.bd(bArr);
        this.b = vxr.bd(bArr2);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii();
        ziiVar.b(new ziu(0L));
        ziiVar.b(new zkn(this.a));
        ziiVar.b(new zkn(this.b));
        return new zkq(ziiVar);
    }
}
