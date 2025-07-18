package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actc extends abxd implements abyr {
    public static final actc a;
    public static final abxc b;
    private static volatile abyy j;
    public int c;
    public int d;
    public float e;
    public int g;
    public acsy i;
    public boolean f = true;
    public String h = "";

    static {
        actc actcVar = new actc();
        a = actcVar;
        actcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(actc.class, actcVar);
        b = new abxc(CommandOuterClass$Command.getDefaultInstance(), actcVar, actcVar, new abxb(null, 281539545, acap.MESSAGE, false, false));
    }

    private actc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", actd.a, "h", "i"});
        }
        if (i2 == 3) {
            return new actc();
        }
        if (i2 == 4) {
            return new actb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (actc.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
