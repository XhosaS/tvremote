package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yry {
    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new yrz(yro.a(str, obj));
        }
    }

    public static void b(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new yrz(yro.a("expected a non-null reference", objArr));
        }
    }
}
