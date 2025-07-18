package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqp implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final /* synthetic */ int h;

    public rqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i) {
        this.h = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.h;
        if (i == 0) {
            Object obj = ((xcn) this.b).a;
            yyh yyhVarB = ((rqe) this.a).b();
            Context context = (Context) obj;
            uht uhtVar = (uht) this.c.b();
            xcq xcqVar = this.f;
            xbw xbwVarA = xcl.a(this.d);
            return new rqm(yyhVarB, context, uhtVar, xbwVarA, this.e, this.g);
        }
        if (i == 1) {
            rnt rntVar = (rnt) this.a.b();
            tst tstVar = (tst) ((xcn) this.b).a;
            xcq xcqVar2 = this.d;
            xcq xcqVar3 = this.e;
            return new unc(rntVar, tstVar, this.c, this.g, xcqVar3, xcqVar2);
        }
        if (i == 2) {
            Object obj2 = ((xcn) this.f).a;
            return new rue(((rqe) this.a).b(), (Context) obj2, (rou) this.c.b(), (Executor) this.d.b(), xcl.a(this.b), ((rvh) this.e).b(), this.g);
        }
        xcq xcqVar4 = this.b;
        yyh yyhVarB2 = ((rqe) this.f).b();
        uht uhtVar2 = (uht) xcqVar4.b();
        xcq xcqVar5 = this.c;
        xcq xcqVar6 = this.d;
        xcq xcqVar7 = this.g;
        return new rva(yyhVarB2, uhtVar2, xcl.a(this.e), xcl.a(xcqVar7), this.a, ((rvj) xcqVar6).b(), ((rvn) xcqVar5).b());
    }

    public rqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, byte[] bArr) {
        this.h = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.f = xcqVar3;
        this.c = xcqVar4;
        this.g = xcqVar5;
        this.e = xcqVar6;
        this.d = xcqVar7;
    }

    public rqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, char[] cArr) {
        this.h = i;
        this.a = xcqVar;
        this.f = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.b = xcqVar5;
        this.e = xcqVar6;
        this.g = xcqVar7;
    }

    public rqp(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, int i, short[] sArr) {
        this.h = i;
        this.f = xcqVar;
        this.b = xcqVar2;
        this.e = xcqVar3;
        this.g = xcqVar4;
        this.a = xcqVar5;
        this.d = xcqVar6;
        this.c = xcqVar7;
    }
}
