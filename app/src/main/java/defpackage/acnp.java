package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnp extends abxd implements abyr {
    public static final acnp a;
    private static volatile abyy b;
    private byte c = 2;

    static {
        acnp acnpVar = new acnp();
        a = acnpVar;
        acnpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acnp.class, acnpVar);
    }

    private acnp() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new acnp();
        }
        if (i2 == 4) {
            return new acno();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acnp.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
