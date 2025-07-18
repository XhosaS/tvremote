package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpf {
    public static String a(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void b(int i) {
        boolean z;
        if (i == 100 || i == 102 || i == 104) {
            z = true;
        } else if (i == 105) {
            i = 105;
            z = true;
        } else {
            z = false;
        }
        kkk.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }
}
