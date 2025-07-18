package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ang {
    public static final long b;
    public static final os c;
    public static final nb a = new nb(Float.NaN, Float.NaN);
    public static final bhi d = new bhi(new afh(12), new afh(13));

    static {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        b = jFloatToRawIntBits;
        c = new os(new bmx(jFloatToRawIntBits), 3);
    }
}
