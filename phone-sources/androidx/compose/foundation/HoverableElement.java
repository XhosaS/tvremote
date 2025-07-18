package androidx.compose.foundation;

import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.rl;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HoverableElement extends bzi<rl> {
    private final kw a;

    public HoverableElement(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new rl(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        rl rlVar = (rl) bkoVar;
        kw kwVar = rlVar.a;
        kw kwVar2 = this.a;
        if (yks.e(kwVar, kwVar2)) {
            return;
        }
        rlVar.f();
        rlVar.a = kwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && yks.e(((HoverableElement) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
