package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceo extends ces {
    public static final ceo a = new ceo(ceu.a);
    public final AtomicReference b;

    public ceo(ces cesVar) {
        this.b = new AtomicReference(cesVar);
    }

    @Override // defpackage.ces
    public final cdh a() {
        return ((ces) this.b.get()).a();
    }

    @Override // defpackage.ces
    public final cez b() {
        return ((ces) this.b.get()).b();
    }

    @Override // defpackage.ces
    public final void c(String str, Level level, boolean z) {
        ((ces) this.b.get()).c(str, level, z);
    }
}
