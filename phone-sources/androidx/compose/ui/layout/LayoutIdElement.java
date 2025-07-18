package androidx.compose.ui.layout;

import defpackage.bko;
import defpackage.bvd;
import defpackage.bzi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutIdElement extends bzi<bvd> {
    private final Object a;

    public LayoutIdElement(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bvd(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((bvd) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && yks.e(this.a, ((LayoutIdElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
