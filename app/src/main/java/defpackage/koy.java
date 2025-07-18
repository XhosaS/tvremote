package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koy {
    public static void a(int i) {
        boolean z;
        if (i == 0 || i == 1) {
            z = true;
        } else if (i == 2) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        kkk.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
    }
}
