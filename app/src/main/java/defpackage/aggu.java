package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggu extends IllegalStateException {
    private static final long serialVersionUID = 1644750035281290266L;

    public aggu(Throwable th) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ".concat(th.toString()), th);
    }
}
