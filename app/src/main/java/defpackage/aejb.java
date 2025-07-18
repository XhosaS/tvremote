package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejb {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
