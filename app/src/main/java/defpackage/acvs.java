package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvs extends abxd implements abyr {
    public static final acvs a;
    public static final abxc b;
    private static volatile abyy h;
    public int c;
    public acry d;
    public int e;
    public boolean f;
    public int g;
    private byte i = 2;

    static {
        acvs acvsVar = new acvs();
        a = acvsVar;
        acvsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvs.class, acvsVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), acvsVar, acvsVar, new abxb(null, 194116769, acap.MESSAGE, false, false));
    }

    private acvs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acvs();
        }
        if (i2 == 4) {
            return new acvr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acvs.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
