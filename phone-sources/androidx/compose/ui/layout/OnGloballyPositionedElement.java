package androidx.compose.ui.layout;

import defpackage.bko;
import defpackage.bwb;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends bzi<bwb> {
    private final yjv a;

    public OnGloballyPositionedElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bwb(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bwb) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
