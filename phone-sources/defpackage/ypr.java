package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ypr extends yps {
    private final Runnable a;

    public ypr(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.yps
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
