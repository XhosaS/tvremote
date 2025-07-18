package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdo extends kdp {
    private final Callable e;

    public kdo(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.kdp
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
