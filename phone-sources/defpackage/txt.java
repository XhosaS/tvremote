package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txt extends txp {
    public static final txt a = new txt();

    private txt() {
    }

    @Override // defpackage.txp
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
