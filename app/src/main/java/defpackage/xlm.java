package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlm extends abxd implements abyr {
    public static final xlm a;
    private static volatile abyy i;
    public int b;
    public int e;
    public int g;
    public acjc h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public abvo f = abvo.b;

    static {
        xlm xlmVar = new xlm();
        a = xlmVar;
        xlmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xlm.class, xlmVar);
    }

    private xlm() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0005ည\u0003\b᠌\u0004\tᐉ\u0005", new Object[]{"b", "c", "d", "e", xli.a, "f", "g", xlk.a, "h"});
        }
        if (i3 == 3) {
            return new xlm();
        }
        if (i3 == 4) {
            return new xlh();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xlm.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
