package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahct extends ahcu {
    private final Runnable a;

    public ahct(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.ahcu
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
