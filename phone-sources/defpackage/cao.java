package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cao implements cat {
    protected String a;
    private final int[] b = new int[2];

    protected final String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        yks.c("text");
        return null;
    }

    protected final int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }
}
