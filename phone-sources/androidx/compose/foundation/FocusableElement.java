package androidx.compose.foundation;

import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.rf;
import defpackage.yjv;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusableElement extends bzi<rf> {
    private final kw a;

    public FocusableElement(kw kwVar) {
        this.a = kwVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new rf(this.a, (yjv) null, 6);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((rf) bkoVar).m(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && yks.e(this.a, ((FocusableElement) obj).a);
    }

    public final int hashCode() {
        kw kwVar = this.a;
        if (kwVar != null) {
            return kwVar.hashCode();
        }
        return 0;
    }
}
