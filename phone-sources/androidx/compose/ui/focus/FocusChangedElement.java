package androidx.compose.ui.focus;

import defpackage.bko;
import defpackage.bly;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusChangedElement extends bzi<bly> {
    private final yjv a;

    public FocusChangedElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bly(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bly) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.a == ((FocusChangedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
