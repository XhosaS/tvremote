package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vau {
    public static boolean a(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }
}
