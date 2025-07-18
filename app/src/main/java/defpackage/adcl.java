package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcl extends abxd implements abyr {
    public static final adcl a;
    private static volatile abyy e;
    public int b;
    public SenderStateOuterClass$SenderState d;
    public abyl c = abyl.a;
    private byte f = 2;

    static {
        adcl adclVar = new adcl();
        a = adclVar;
        adclVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcl.class, adclVar);
    }

    private adcl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u00012\u0002ᐉ\u0000", new Object[]{"b", "c", adck.a, "d"});
        }
        if (i2 == 3) {
            return new adcl();
        }
        if (i2 == 4) {
            return new adcj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adcl.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
