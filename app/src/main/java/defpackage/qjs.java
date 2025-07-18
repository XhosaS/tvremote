package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjs {
    public static String a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof kej ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable b(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : b(th.getCause(), cls);
    }
}
