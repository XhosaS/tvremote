package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpf extends abxd implements abyr {
    public static final adpf a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        adpf adpfVar = new adpf();
        a = adpfVar;
        adpfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpf.class, adpfVar);
    }

    private adpf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0001\u0000\u0001\b\b\u0000\u0000\u0002\u0001<\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bм\u0000", new Object[]{"c", "b", adpc.class, adox.class, adpe.class, adpa.class, adnc.class, admw.class, adna.class, admy.class});
        }
        if (i2 == 3) {
            return new adpf();
        }
        if (i2 == 4) {
            return new adoy();
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
        synchronized (adpf.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
