package androidx.compose.material3.internal;

import defpackage.ayd;
import defpackage.ayp;
import defpackage.bko;
import defpackage.bzi;
import defpackage.uv;
import defpackage.yjz;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableAnchorsElement<T> extends bzi<ayp<T>> {
    private final ayd a;
    private final yjz b;
    private final uv c;

    public DraggableAnchorsElement(ayd aydVar, yjz yjzVar, uv uvVar) {
        this.a = aydVar;
        this.b = yjzVar;
        this.c = uvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ayp(this.a, this.b, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ayp aypVar = (ayp) bkoVar;
        aypVar.a = this.a;
        aypVar.b = this.b;
        aypVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return yks.e(this.a, draggableAnchorsElement.a) && this.b == draggableAnchorsElement.b && this.c == draggableAnchorsElement.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
