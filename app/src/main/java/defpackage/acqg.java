package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqg extends abxd implements abyr {
    public static final acqg a;
    private static volatile abyy o;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public long f;
    public long g;
    public int h;
    public abxj i;
    public abxj j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;

    static {
        acqg acqgVar = new acqg();
        a = acqgVar;
        acqgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acqg.class, acqgVar);
    }

    private acqg() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
        abxe abxeVar2 = abxe.a;
        this.i = abxeVar2;
        this.j = abxeVar2;
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0000\u0002\u0005ȯ\u000b\u0000\u0002\u0000\u0005᠌\u000e\tဂ\u000f\u008cဃ\u0010Ċဈ\bųင,ſ'ƀ,Ƅဇ2Ɠဇ4ƹဇ0ȯ᠌1", new Object[]{"b", "c", "e", abrs.a, "f", "g", "d", "h", "i", "j", "m", "n", "k", "l", abtl.a});
        }
        if (i2 == 3) {
            return new acqg();
        }
        if (i2 == 4) {
            return new acqf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = o;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acqg.class) {
            abwxVar = o;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                o = abwxVar;
            }
        }
        return abwxVar;
    }
}
