package androidx.compose.foundation.text.input.internal;

import defpackage.a;
import defpackage.aea;
import defpackage.afw;
import defpackage.ajy;
import defpackage.akb;
import defpackage.bko;
import defpackage.bzi;
import defpackage.chc;
import defpackage.lhr;
import defpackage.yjz;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends bzi<ajy> {
    private final akb a;
    private final chc b;
    private final boolean c;
    private final yjz d = null;
    private final afw e;
    private final lhr f;

    public TextFieldTextLayoutModifier(lhr lhrVar, akb akbVar, chc chcVar, boolean z, afw afwVar) {
        this.f = lhrVar;
        this.a = akbVar;
        this.b = chcVar;
        this.c = z;
        this.e = afwVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ajy(this.f, this.a, this.b, this.c);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ajy ajyVar = (ajy) bkoVar;
        lhr lhrVar = ajyVar.c;
        lhr lhrVar2 = this.f;
        ajyVar.c = lhrVar2;
        boolean z = this.c;
        ajyVar.a = z;
        ajyVar.c.n(this.a, this.b, z, !z);
        if (yks.e(lhrVar, lhrVar2)) {
            return;
        }
        ajyVar.b.b((aea) lhrVar2.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        if (this.c != textFieldTextLayoutModifier.c || !yks.e(this.f, textFieldTextLayoutModifier.f) || !yks.e(this.a, textFieldTextLayoutModifier.a) || !yks.e(this.b, textFieldTextLayoutModifier.b)) {
            return false;
        }
        yjz yjzVar = textFieldTextLayoutModifier.d;
        return yks.e(this.e, textFieldTextLayoutModifier.e);
    }

    public final int hashCode() {
        return (((((((a.q(this.c) * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 961) + this.e.hashCode();
    }
}
