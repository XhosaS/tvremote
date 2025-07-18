package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zny extends znt {
    public zny() {
        super(256);
    }

    @Override // defpackage.znt, defpackage.znp
    public final int a(byte[] bArr, int i) {
        h(2, 2);
        return super.a(bArr, i);
    }

    @Override // defpackage.znt, defpackage.znp
    public final String c() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zny(int i) {
        super(i);
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(a.cd(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }
}
