package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnh {
    public static final /* synthetic */ int b = 0;
    private static final List c;
    private static final List d;
    private static final List e;
    private static final List f;
    public final int a;
    private final int g;

    static {
        List listS = yfm.s(0, 600, 840);
        c = listS;
        List listAf = yfm.af(listS, yfm.s(1200, 1600));
        d = listAf;
        List listS2 = yfm.s(0, 480, 900);
        e = listS2;
        f = listS2;
        gli.T(listS, listS2);
        gli.T(listAf, listS2);
    }

    public gnh(int i, int i2) {
        this.a = i;
        this.g = i2;
        if (i < 0) {
            throw new IllegalArgumentException("Expected minWidthDp to be at least 0, minWidthDp: " + i + '.');
        }
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException("Expected minHeightDp to be at least 0, minHeightDp: " + i2 + '.');
    }

    public final boolean a() {
        return this.a >= 600;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gnh gnhVar = (gnh) obj;
        return this.a == gnhVar.a && this.g == gnhVar.g;
    }

    public final int hashCode() {
        return (this.a * 31) + this.g;
    }

    public final String toString() {
        return "WindowSizeClass(minWidthDp=" + this.a + ", minHeightDp=" + this.g + ')';
    }
}
