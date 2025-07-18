package defpackage;

import android.os.ConditionVariable;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfl implements idy {
    private final ConditionVariable a = new ConditionVariable(false);
    private volatile ieg b = ieg.a;

    @Deprecated
    public final ieg a() {
        return b(30000L);
    }

    public final ieg b(long j) {
        return !this.a.block(j) ? ieg.b(new TimeoutException()) : this.b;
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.b = (ieg) obj;
        this.a.open();
    }
}
