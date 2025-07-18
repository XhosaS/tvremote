package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acpn extends abxd implements abyr {
    public static final acpn a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        acpn acpnVar = new acpn();
        a = acpnVar;
        acpnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acpn.class, acpnVar);
    }

    private acpn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"c", "b", acpj.class, abzy.class});
        }
        if (i2 == 3) {
            return new acpn();
        }
        if (i2 == 4) {
            return new acpm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acpn.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
