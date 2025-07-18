package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eob {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(a.b(i, "Unknown enum value: "));
    }
}
