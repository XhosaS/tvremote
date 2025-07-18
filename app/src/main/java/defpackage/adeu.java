package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeu extends abxd implements abyr {
    public static final adeu a;
    public static final abxc b;
    private static volatile abyy i;
    public float d;
    public int e;
    public float f;
    public float g;
    private int j;
    public String c = "";
    public int h = 255;

    static {
        adeu adeuVar = new adeu();
        a = adeuVar;
        adeuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adeu.class, adeuVar);
        b = new abxc(aczf.a, adeuVar, adeuVar, new abxb(null, 460629484, acap.MESSAGE, false, false));
    }

    private adeu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006င\u0005", new Object[]{"j", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new adeu();
        }
        if (i3 == 4) {
            return new adet();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adeu.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
