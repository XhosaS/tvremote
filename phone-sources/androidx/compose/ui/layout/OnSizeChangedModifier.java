package androidx.compose.ui.layout;

import defpackage.bko;
import defpackage.bwe;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnSizeChangedModifier extends bzi<bwe> {
    private final yjv a;

    public OnSizeChangedModifier(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bwe(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bwe bweVar = (bwe) bkoVar;
        bweVar.a = this.a;
        bweVar.b = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.a == ((OnSizeChangedModifier) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
