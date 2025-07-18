package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rta implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final xcq h;
    private final xcq i;
    private final xcq j;
    private final xcq k;
    private final /* synthetic */ int l;

    public rta(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, int i) {
        this.l = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
        this.h = xcqVar8;
        this.i = xcqVar9;
        this.j = xcqVar10;
        this.k = xcqVar11;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        if (this.l != 0) {
            Object obj = ((xcn) this.j).a;
            yyh yyhVarB = ((rqe) this.a).b();
            Context context = (Context) obj;
            Executor executor = (Executor) this.k.b();
            xcq xcqVar = this.d;
            xcq xcqVar2 = this.f;
            rrl rrlVarB = ((rrm) this.c).b();
            xbw xbwVarA = xcl.a(xcqVar2);
            rnt rntVar = (rnt) xcqVar.b();
            unc uncVar = (unc) this.i.b();
            xcq xcqVar3 = this.e;
            xcq xcqVar4 = this.b;
            return new rro(yyhVarB, context, executor, rrlVarB, this.h, xbwVarA, rntVar, uncVar, this.g, xcqVar4, xcqVar3);
        }
        xcq xcqVar5 = this.b;
        yyh yyhVarB2 = ((rqe) this.a).b();
        xcq xcqVar6 = this.e;
        Object objB = this.d.b();
        uht uhtVar = (uht) xcqVar6.b();
        xcq xcqVar7 = this.h;
        xcq xcqVar8 = this.g;
        xbw xbwVarA2 = xcl.a(this.f);
        Object objB2 = xcqVar8.b();
        return new rsz(yyhVarB2, (rsv) objB, uhtVar, xbwVarA2, (rtd) objB2, (rne) xcqVar7.b(), this.i, (Executor) this.j.b(), (tst) ((xcn) this.k).a);
    }

    public rta(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, int i, byte[] bArr) {
        this.l = i;
        this.a = xcqVar;
        this.j = xcqVar2;
        this.k = xcqVar3;
        this.c = xcqVar4;
        this.h = xcqVar5;
        this.f = xcqVar6;
        this.d = xcqVar7;
        this.i = xcqVar8;
        this.g = xcqVar9;
        this.b = xcqVar10;
        this.e = xcqVar11;
    }
}
