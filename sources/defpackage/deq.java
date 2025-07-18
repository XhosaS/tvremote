package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deq extends del {
    public deq() {
        super(256);
    }

    @Override // defpackage.del, defpackage.deh
    public final int a(byte[] bArr, int i) {
        h(2, 2);
        return super.a(bArr, i);
    }

    @Override // defpackage.del, defpackage.deh
    public final String c() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deq(int i) {
        super(i);
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(b.h(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }
}
