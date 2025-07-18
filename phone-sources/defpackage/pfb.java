package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfb implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;

    public pfb(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pfa b() {
        Context contextA = ((rgq) this.b).a();
        pfh pfhVarB = ((pfi) this.c).b();
        yil yilVarA = ((mdx) this.f).a();
        yil yilVarA2 = ((mdx) this.g).a();
        return new pfa(this.a, contextA, pfhVarB, this.d, this.e, yilVarA, yilVarA2);
    }
}
