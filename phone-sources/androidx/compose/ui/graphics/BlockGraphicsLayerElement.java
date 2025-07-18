package androidx.compose.ui.graphics;

import defpackage.bko;
import defpackage.bnm;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends bzi<bnm> {
    private final yjv a;

    public BlockGraphicsLayerElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new bnm(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        bnm bnmVar = (bnm) bkoVar;
        bnmVar.a = this.a;
        bnmVar.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.a == ((BlockGraphicsLayerElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
