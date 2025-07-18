package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhn extends abxd implements abyr {
    public static final abhn a;
    private static volatile abyy f;
    public abxs d;
    public abxs e;
    private int g;
    private abhr h;
    private byte i = 2;
    public String b = "";
    public String c = "";

    static {
        abhn abhnVar = new abhn();
        a = abhnVar;
        abhnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abhn.class, abhnVar);
    }

    private abhn() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0002\u0001\u0001Ȉ\u0002Ȉ\u0006\u001b\u0007\u001b\u000fᐉ\u0007", new Object[]{"g", "b", "c", "d", abhh.class, "e", abft.class, "h"});
        }
        if (i2 == 3) {
            return new abhn();
        }
        if (i2 == 4) {
            return new abhm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abhn.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
