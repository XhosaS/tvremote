package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cas extends cao {
    public static cas b;

    private final boolean e(int i) {
        if (i <= 0 || a().charAt(i - 1) == '\n') {
            return false;
        }
        return i == a().length() || a().charAt(i) == '\n';
    }

    private final boolean f(int i) {
        if (a().charAt(i) != '\n') {
            return i == 0 || a().charAt(i + (-1)) == '\n';
        }
        return false;
    }

    @Override // defpackage.cat
    public final int[] c(int i) {
        int length = a().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && a().charAt(i) == '\n' && !f(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !e(i2)) {
            i2++;
        }
        return b(i, i2);
    }

    @Override // defpackage.cat
    public final int[] d(int i) {
        int length = a().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (a().charAt(i2) != '\n' || e(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !f(i3)) {
            i3--;
        }
        return b(i3, i);
    }
}
