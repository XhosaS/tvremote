package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsb implements xcm {
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
    private final xcq l;
    private final xcq m;
    private final /* synthetic */ int n;
    private final Object o;

    public rsb(kqf kqfVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, xcq xcqVar12, xcq xcqVar13, int i) {
        this.n = i;
        this.o = kqfVar;
        this.i = xcqVar;
        this.a = xcqVar2;
        this.m = xcqVar3;
        this.c = xcqVar4;
        this.h = xcqVar5;
        this.e = xcqVar6;
        this.j = xcqVar7;
        this.k = xcqVar8;
        this.b = xcqVar9;
        this.g = xcqVar10;
        this.f = xcqVar11;
        this.d = xcqVar12;
        this.l = xcqVar13;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xcq] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        kqf kqfVar;
        if (this.n == 0) {
            Object obj = ((xcn) this.b).a;
            yyh yyhVarB = ((rqe) this.a).b();
            Context context = (Context) obj;
            cb cbVar = (cb) this.c.b();
            xcq xcqVar = this.g;
            ?? r2 = this.o;
            xbw xbwVarA = xcl.a(this.d);
            Object objB = r2.b();
            Executor executor = (Executor) xcqVar.b();
            xcq xcqVar2 = this.j;
            rzy rzyVarB = ((rso) this.h).b();
            ((rsg) xcqVar2).b();
            Object obj2 = ((xcn) this.l).a;
            rsh rshVarB = ((rsi) this.k).b();
            tst tstVar = (tst) obj2;
            xcq xcqVar3 = this.m;
            xcq xcqVar4 = this.i;
            return new rsa(yyhVarB, context, cbVar, xbwVarA, (rrv) objB, this.e, this.f, executor, rzyVarB, xcqVar4, rshVarB, tstVar, xcqVar3);
        }
        ((rgq) this.i).a();
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.b();
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.m.b();
        ldv ldvVar = (ldv) this.c.b();
        xcq xcqVar5 = this.j;
        xbw xbwVarA2 = xcl.a(this.e);
        ExecutorService executorService = (ExecutorService) xcqVar5.b();
        Executor executor2 = (Executor) this.k.b();
        lfn lfnVar = (lfn) this.b.b();
        lyz lyzVar = (lyz) this.g.b();
        idr idrVar = (idr) this.f.b();
        ((kpw) this.d).b();
        lie lieVar = (lie) this.l.b();
        kqv.d().booleanValue();
        kqf kqfVar2 = (kqf) this.o;
        if (kqfVar2.m == null) {
            xcq xcqVar6 = this.h;
            ldvVar.f();
            kqfVar2.m = new lfz(sharedPreferences, xbwVarA2, idrVar, executorService);
            lfz lfzVar = kqfVar2.m;
            kqfVar = kqfVar2;
            kqfVar.s(executorService, executor2, lfnVar, ldvVar, lyzVar, xcqVar6, lfzVar, sharedPreferences2, lieVar);
            lfzVar.k();
        } else {
            kqfVar = kqfVar2;
        }
        lfz lfzVar2 = kqfVar.m;
        lfzVar2.getClass();
        return lfzVar2;
    }

    public rsb(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11, xcq xcqVar12, xcq xcqVar13, xcq xcqVar14, int i) {
        this.n = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.o = xcqVar5;
        this.e = xcqVar6;
        this.f = xcqVar7;
        this.g = xcqVar8;
        this.h = xcqVar9;
        this.i = xcqVar10;
        this.j = xcqVar11;
        this.k = xcqVar12;
        this.l = xcqVar13;
        this.m = xcqVar14;
    }
}
