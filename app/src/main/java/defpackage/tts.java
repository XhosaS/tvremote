package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tts extends abxd implements abyr {
    public static final tts a;
    private static volatile abyy i;
    public int b;
    public int c;
    public abxs d = abzb.b;
    public int e;
    public int f;
    public int g;
    public boolean h;

    static {
        tts ttsVar = new tts();
        a = ttsVar;
        ttsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tts.class, ttsVar);
    }

    private tts() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002\u0005᠌\u0003\u0006ဇ\u0004", new Object[]{"b", "c", adoh.a, "d", "e", "f", "g", adol.a, "h"});
        }
        if (i3 == 3) {
            return new tts();
        }
        if (i3 == 4) {
            return new ttr();
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
        synchronized (tts.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
