package androidx.compose.ui.draw;

import defpackage.bko;
import defpackage.blu;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithContentElement extends bzi<blu> {
    private final yjv a;

    public DrawWithContentElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new blu(this.a, 0);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((blu) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && this.a == ((DrawWithContentElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
