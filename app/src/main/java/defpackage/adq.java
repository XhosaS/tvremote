package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adq extends AtomicBoolean implements OutcomeReceiver {
    private final agsw a;

    public adq(agsw agswVar) {
        super(false);
        this.a = agswVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.a.e(agpl.a(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
