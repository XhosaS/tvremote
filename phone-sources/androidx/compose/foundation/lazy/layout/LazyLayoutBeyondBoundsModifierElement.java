package androidx.compose.foundation.lazy.layout;

import defpackage.acl;
import defpackage.acm;
import defpackage.bko;
import defpackage.bzi;
import defpackage.kw;
import defpackage.uv;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends bzi<acl> {
    private final acm a;
    private final boolean b = false;
    private final uv c;
    private final kw d;

    public LazyLayoutBeyondBoundsModifierElement(acm acmVar, kw kwVar, uv uvVar) {
        this.a = acmVar;
        this.d = kwVar;
        this.c = uvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new acl(this.a, this.d, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        acl aclVar = (acl) bkoVar;
        aclVar.b = this.a;
        aclVar.d = this.d;
        aclVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        if (!yks.e(this.a, lazyLayoutBeyondBoundsModifierElement.a) || !yks.e(this.d, lazyLayoutBeyondBoundsModifierElement.d)) {
            return false;
        }
        boolean z = lazyLayoutBeyondBoundsModifierElement.b;
        return this.c == lazyLayoutBeyondBoundsModifierElement.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }
}
