package androidx.compose.ui.layout;

import defpackage.bko;
import defpackage.bvf;
import defpackage.bzi;
import defpackage.yka;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutElement extends bzi<bvf> {
    private final yka a;

    public LayoutElement(yka ykaVar) {
        this.a = ykaVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bvf(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bvf) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.a == ((LayoutElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
