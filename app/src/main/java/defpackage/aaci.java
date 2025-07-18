package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaci extends RuntimeException {
    public aaci(String str) {
        super(str);
    }

    public static Object a(aach aachVar) {
        try {
            return aachVar.a();
        } catch (Exception e) {
            throw new aaci(e);
        }
    }

    public aaci(Throwable th) {
        super(th);
    }
}
