package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmu extends zix {
    private final zic a;

    public zmu(zic zicVar) {
        this.a = zicVar;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
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

    public zmu() {
        this.a = new zkj();
    }
}
