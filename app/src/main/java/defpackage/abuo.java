package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abuo extends abuq {
    public static final abuo a;

    static {
        yyk yykVarQ = yyk.q(aecz.a, aecz.b, aecz.c);
        Optional optionalOf = Optional.of(aecz.b);
        Optional optionalOf2 = Optional.of(76117340);
        boolean z = true;
        yqw.B(!yqv.c("app_for_tv_android"), "`name` must be non-empty");
        if (!optionalOf.isEmpty() && !((aecz) optionalOf.get()).e.endsWith("_ANDROID_PRIMES")) {
            z = false;
        }
        yqw.A(z);
        a = new abup(yykVarQ, optionalOf, optionalOf2);
    }

    public abstract yyk a();

    public abstract Optional b();

    public abstract Optional c();

    @Override // defpackage.abuq
    public abstract String d();

    public abstract void e();
}
