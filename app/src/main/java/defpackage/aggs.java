package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggs extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public aggs(Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(String.valueOf(th))), th == null ? new NullPointerException() : th);
    }
}
