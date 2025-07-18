package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acta extends abxd implements abyr {
    public static final acta a;
    public static final abxc b;
    private static volatile abyy j;
    public int c;
    public acyb d;
    public acyb e;
    public int f;
    public int g;
    public acys h;
    public float i;

    static {
        acta actaVar = new acta();
        a = actaVar;
        actaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acta.class, actaVar);
        b = new abxc(SenderStateOuterClass$SenderState.getDefaultInstance(), actaVar, actaVar, new abxb(null, 198239242, acap.MESSAGE, false, false));
    }

    private acta() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002\u0003င\u0003\u0004ဉ\u0004\u0005ခ\u0005\u0006ဉ\u0001", new Object[]{"c", "d", "f", "g", "h", "i", "e"});
        }
        if (i2 == 3) {
            return new acta();
        }
        if (i2 == 4) {
            return new acsz();
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
        synchronized (acta.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
