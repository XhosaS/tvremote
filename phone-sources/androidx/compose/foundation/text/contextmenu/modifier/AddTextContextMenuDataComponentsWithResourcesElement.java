package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.ahc;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yjz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AddTextContextMenuDataComponentsWithResourcesElement extends bzi<ahc> {
    private final yjz a;

    public AddTextContextMenuDataComponentsWithResourcesElement(yjz yjzVar) {
        this.a = yjzVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ahc(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((ahc) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsWithResourcesElement) && this.a == ((AddTextContextMenuDataComponentsWithResourcesElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
