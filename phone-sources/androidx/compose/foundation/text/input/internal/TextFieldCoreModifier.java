package androidx.compose.foundation.text.input.internal;

import defpackage.a;
import defpackage.ajk;
import defpackage.akb;
import defpackage.akg;
import defpackage.alg;
import defpackage.bko;
import defpackage.bnn;
import defpackage.bzi;
import defpackage.cbp;
import defpackage.lhr;
import defpackage.nxb;
import defpackage.sj;
import defpackage.uof;
import defpackage.uv;
import defpackage.yks;
import defpackage.yqe;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends bzi<ajk> {
    private final boolean a;
    private final boolean b;
    private final akb c;
    private final alg d;
    private final bnn e;
    private final boolean f;
    private final sj h;
    private final uv i;
    private final lhr j;
    private final nxb k;

    public TextFieldCoreModifier(boolean z, boolean z2, lhr lhrVar, akb akbVar, alg algVar, bnn bnnVar, boolean z3, sj sjVar, uv uvVar, nxb nxbVar) {
        this.a = z;
        this.b = z2;
        this.j = lhrVar;
        this.c = akbVar;
        this.d = algVar;
        this.e = bnnVar;
        this.f = z3;
        this.h = sjVar;
        this.i = uvVar;
        this.k = nxbVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ajk(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.h, this.i, this.k);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yqe yqeVar;
        ajk ajkVar = (ajk) bkoVar;
        boolean zM = ajkVar.m();
        boolean z = ajkVar.a;
        akb akbVar = ajkVar.c;
        lhr lhrVar = ajkVar.k;
        alg algVar = ajkVar.d;
        sj sjVar = ajkVar.g;
        boolean z2 = this.a;
        ajkVar.a = z2;
        boolean z3 = this.b;
        ajkVar.b = z3;
        lhr lhrVar2 = this.j;
        ajkVar.k = lhrVar2;
        akb akbVar2 = this.c;
        ajkVar.c = akbVar2;
        alg algVar2 = this.d;
        ajkVar.d = algVar2;
        ajkVar.e = this.e;
        ajkVar.f = this.f;
        sj sjVar2 = this.h;
        ajkVar.g = sjVar2;
        ajkVar.h = this.i;
        ajkVar.m = this.k;
        akg akgVar = ajkVar.j;
        boolean z4 = true;
        if (!z2 && !z3) {
            z4 = false;
        }
        akgVar.f(akbVar2, algVar2, lhrVar2, z4);
        if (!ajkVar.m()) {
            yqe yqeVar2 = ajkVar.i;
            if (yqeVar2 != null) {
                yqeVar2.t(null);
            }
            ajkVar.i = null;
            uof uofVar = ajkVar.l;
            if (uofVar != null && (yqeVar = (yqe) ((AtomicReference) uofVar.c).getAndSet(null)) != null) {
                yqeVar.t(null);
            }
        } else if (!z || !yks.e(akbVar, akbVar2) || !zM) {
            ajkVar.i();
        }
        if (yks.e(akbVar, akbVar2) && yks.e(lhrVar, lhrVar2) && yks.e(algVar, algVar2) && yks.e(sjVar, sjVar2)) {
            return;
        }
        cbp.Y(ajkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.a == textFieldCoreModifier.a && this.b == textFieldCoreModifier.b && yks.e(this.j, textFieldCoreModifier.j) && yks.e(this.c, textFieldCoreModifier.c) && yks.e(this.d, textFieldCoreModifier.d) && yks.e(this.e, textFieldCoreModifier.e) && this.f == textFieldCoreModifier.f && yks.e(this.h, textFieldCoreModifier.h) && this.i == textFieldCoreModifier.i && yks.e(this.k, textFieldCoreModifier.k);
    }

    public final int hashCode() {
        return (((((((((((((((((a.q(this.a) * 31) + a.q(this.b)) * 31) + this.j.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a.q(this.f)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.a + ", isDragHovered=" + this.b + ", textLayoutState=" + this.j + ", textFieldState=" + this.c + ", textFieldSelectionState=" + this.d + ", cursorBrush=" + this.e + ", writeable=" + this.f + ", scrollState=" + this.h + ", orientation=" + this.i + ", toolbarRequester=" + this.k + ')';
    }
}
