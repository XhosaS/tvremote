package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtl implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;
    private final xcq g;
    private final xcq h;
    private final xcq i;
    private final /* synthetic */ int j;

    public rtl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i) {
        this.j = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
        this.g = xcqVar7;
        this.h = xcqVar8;
        this.i = xcqVar9;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        if (this.j == 0) {
            Object obj = ((xcn) this.b).a;
            yyh yyhVarB = ((rqe) this.a).b();
            Context context = (Context) obj;
            rou rouVar = (rou) this.c.b();
            uht uhtVar = (uht) this.d.b();
            xcq xcqVar = this.h;
            xcq xcqVar2 = this.f;
            return new rtk(yyhVarB, context, rouVar, uhtVar, xcl.a(this.e), xcl.a(xcqVar2), this.g, (Executor) xcqVar.b(), (rzy) this.i.b());
        }
        Context context2 = (Context) ((xcn) this.b).a;
        tst tstVar = (tst) this.h.b();
        Object obj2 = ((xcn) this.a).a;
        xcq xcqVar3 = this.d;
        return new rqg(context2, tstVar, ((ldb) this.g).a(), this.f, ((rpw) xcqVar3).b(), (tst) obj2, (tst) ((xcn) this.e).a, (tst) ((xcn) this.c).a, this.i);
    }

    public rtl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, int i, byte[] bArr) {
        this.j = i;
        this.b = xcqVar;
        this.h = xcqVar2;
        this.g = xcqVar3;
        this.f = xcqVar4;
        this.d = xcqVar5;
        this.a = xcqVar6;
        this.e = xcqVar7;
        this.c = xcqVar8;
        this.i = xcqVar9;
    }
}
