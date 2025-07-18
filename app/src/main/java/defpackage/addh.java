package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addh extends abxd implements abyr {
    public static final addh a;
    public static final abxc b;
    private static volatile abyy h;
    public int c;
    public boolean d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    private byte i = 2;
    public String g = "";

    static {
        addh addhVar = new addh();
        a = addhVar;
        addhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(addh.class, addhVar);
        b = new abxc(acyd.a, addhVar, addhVar, new abxb(null, 276131502, acap.MESSAGE, false, false));
    }

    private addh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new addh();
        }
        if (i2 == 4) {
            return new addg();
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
        synchronized (addh.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
