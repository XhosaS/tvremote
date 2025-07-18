package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.ahh;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextContextMenuGestureElement extends bzi<ahh> {
    private final yjv a;

    public TextContextMenuGestureElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ahh(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((ahh) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextContextMenuGestureElement) && this.a == ((TextContextMenuGestureElement) obj).a;
    }

    public final int hashCode() {
        yjv yjvVar = this.a;
        if (yjvVar != null) {
            return yjvVar.hashCode();
        }
        return 0;
    }
}
