package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onp implements ooa {
    public final ono a;
    public final ooe b;
    private final Executor c;

    public onp(Executor executor, ono onoVar, ooe ooeVar) {
        this.c = executor;
        this.a = onoVar;
        this.b = ooeVar;
    }

    @Override // defpackage.ooa
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ooa
    public final void b(onz onzVar) {
        this.c.execute(new non(this, onzVar, 12, (short[]) null));
    }
}
