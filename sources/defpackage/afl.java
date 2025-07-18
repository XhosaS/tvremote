package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afl extends afm {
    private final Callable e;

    public afl(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.afm
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
