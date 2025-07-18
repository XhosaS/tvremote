package androidx.compose.animation;

import defpackage.bko;
import defpackage.bzi;
import defpackage.hnj;
import defpackage.ly;
import defpackage.me;
import defpackage.mf;
import defpackage.mg;
import defpackage.pf;
import defpackage.yjk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends bzi<me> {
    private final pf a;
    private final mf b;
    private final mg c;
    private final yjk d;
    private final ly e;
    private final hnj f;
    private final hnj h;
    private final hnj i;

    public EnterExitTransitionElement(pf pfVar, hnj hnjVar, hnj hnjVar2, hnj hnjVar3, mf mfVar, mg mgVar, yjk yjkVar, ly lyVar) {
        this.a = pfVar;
        this.f = hnjVar;
        this.h = hnjVar2;
        this.i = hnjVar3;
        this.b = mfVar;
        this.c = mgVar;
        this.d = yjkVar;
        this.e = lyVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new me(this.a, this.f, this.h, this.i, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        me meVar = (me) bkoVar;
        meVar.a = this.a;
        meVar.g = this.f;
        meVar.h = this.h;
        meVar.i = this.i;
        meVar.b = this.b;
        meVar.c = this.c;
        meVar.d = this.d;
        meVar.f = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return yks.e(this.a, enterExitTransitionElement.a) && yks.e(this.f, enterExitTransitionElement.f) && yks.e(this.h, enterExitTransitionElement.h) && yks.e(this.i, enterExitTransitionElement.i) && yks.e(this.b, enterExitTransitionElement.b) && yks.e(this.c, enterExitTransitionElement.c) && yks.e(this.d, enterExitTransitionElement.d) && yks.e(this.e, enterExitTransitionElement.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hnj hnjVar = this.f;
        int iHashCode2 = (iHashCode + (hnjVar == null ? 0 : hnjVar.hashCode())) * 31;
        hnj hnjVar2 = this.h;
        int iHashCode3 = (iHashCode2 + (hnjVar2 == null ? 0 : hnjVar2.hashCode())) * 31;
        hnj hnjVar3 = this.i;
        return ((((((((iHashCode3 + (hnjVar3 != null ? hnjVar3.hashCode() : 0)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=" + this.f + ", offsetAnimation=" + this.h + ", slideAnimation=" + this.i + ", enter=" + this.b + ", exit=" + this.c + ", isEnabled=" + this.d + ", graphicsLayerBlock=" + this.e + ')';
    }
}
