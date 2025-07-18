package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpl {
    public static final Object a(Throwable th) {
        th.getClass();
        return new agpj(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof agpj) {
            throw ((agpj) obj).a;
        }
    }
}
