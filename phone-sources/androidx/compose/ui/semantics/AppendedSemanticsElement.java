package androidx.compose.ui.semantics;

import defpackage.a;
import defpackage.bkn;
import defpackage.bko;
import defpackage.bzi;
import defpackage.ceu;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends bzi<ceu> implements bkn {
    public final boolean a;
    public final yjv b;

    public AppendedSemanticsElement(boolean z, yjv yjvVar) {
        this.a = z;
        this.b = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ceu(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ceu ceuVar = (ceu) bkoVar;
        ceuVar.a = this.a;
        ceuVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    public final int hashCode() {
        return (a.q(this.a) * 31) + this.b.hashCode();
    }
}
