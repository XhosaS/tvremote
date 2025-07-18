package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agle extends AtomicInteger implements aggi {
    private static final long serialVersionUID = 2728361546769921047L;
    final agli a;
    final agfs b;
    Object c;
    volatile boolean d;

    public agle(agli agliVar, agfs agfsVar) {
        this.a = agliVar;
        this.b = agfsVar;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.e(this);
        this.c = null;
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
