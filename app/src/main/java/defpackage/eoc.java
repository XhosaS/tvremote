package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eoc {
    public static long a(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }
}
