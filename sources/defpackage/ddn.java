package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddn extends czr {
    private final cyw a;

    public ddn(cyw cywVar) {
        this.a = cywVar;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }

    public final String toString() {
        byte[] bArrM = this.a.m();
        if (bArrM.length == 1) {
            return "KeyUsage: 0x".concat(String.valueOf(Integer.toHexString(bArrM[0] & 255)));
        }
        int i = bArrM[1] & 255;
        return "KeyUsage: 0x".concat(String.valueOf(Integer.toHexString((bArrM[0] & 255) | (i << 8))));
    }

    public ddn() {
        this.a = new dbd();
    }
}
