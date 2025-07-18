package androidx.compose.foundation.text.handwriting;

import defpackage.ahs;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHandwritingElement extends bzi<ahs> {
    private final yjk a;

    public StylusHandwritingElement(yjk yjkVar) {
        this.a = yjkVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ahs(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((ahs) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && this.a == ((StylusHandwritingElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
