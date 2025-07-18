package androidx.compose.material3.internal;

import defpackage.ayl;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChildSemanticsNodeElement extends bzi<ayl> {
    private final yjv a;

    public ChildSemanticsNodeElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ayl(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ayl aylVar = (ayl) bkoVar;
        aylVar.a = this.a;
        cbp.M(aylVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.a == ((ChildSemanticsNodeElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
