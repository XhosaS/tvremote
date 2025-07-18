package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agih extends AtomicReference implements aggi {
    private static final long serialVersionUID = -2467358622224974244L;
    final agfg a;

    public agih(agfg agfgVar) {
        this.a = agfgVar;
    }

    public final void a() {
        aggi aggiVar;
        Object obj = get();
        aghd aghdVar = aghd.a;
        if (obj == aghdVar || (aggiVar = (aggi) getAndSet(aghdVar)) == aghdVar) {
            return;
        }
        try {
            this.a.a();
            if (aggiVar != null) {
                aggiVar.dispose();
            }
        } catch (Throwable th) {
            if (aggiVar != null) {
                aggiVar.dispose();
            }
            throw th;
        }
    }

    public final void b(Throwable th) {
        if (c(th)) {
            return;
        }
        agoh.e(th);
    }

    public final boolean c(Throwable th) {
        aggi aggiVar;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        aghd aghdVar = aghd.a;
        if (obj == aghdVar || (aggiVar = (aggi) getAndSet(aghdVar)) == aghdVar) {
            return false;
        }
        try {
            this.a.fg(th);
            if (aggiVar == null) {
                return true;
            }
            aggiVar.dispose();
            return true;
        } catch (Throwable th2) {
            if (aggiVar != null) {
                aggiVar.dispose();
            }
            throw th2;
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
