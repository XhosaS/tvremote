package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rny implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final /* synthetic */ int f;

    public rny(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        ImmutableSet immutableSetOf;
        int i = this.f;
        if (i == 0) {
            xcq xcqVar = this.e;
            return new rnx(this.b, this.c, this.d, xcqVar);
        }
        if (i == 1) {
            Executor executor = (Executor) this.e.b();
            xcq xcqVar2 = this.a;
            xcq xcqVar3 = this.d;
            Set setB = ((xcs) this.c).b();
            rvg rvgVarB = ((rnq) xcqVar3).b();
            return new rnt(executor, setB, rvgVarB, this.b);
        }
        if (i == 2) {
            xcq xcqVar4 = this.d;
            xcq xcqVar5 = this.c;
            String strA = ((ldb) this.b).a();
            rzy rzyVarB = ((rpu) xcqVar5).b();
            osk oskVar = (osk) xcqVar4.b();
            return new rsh(strA, rzyVarB, oskVar, this.e);
        }
        if (i == 3) {
            Context context = (Context) ((xcn) this.a).a;
            rzy rzyVar = (rzy) this.c.b();
            return new rtd(this.e, context, this.b, this.d, rzyVar);
        }
        if (i == 4) {
            return new rwb(((rqe) this.c).b(), (uht) this.d.b(), (Executor) this.e.b(), xcl.a(this.a), this.b);
        }
        boolean zG = ((tst) ((xcn) this.c).a).g();
        tst tstVar = (tst) ((xcn) this.d).a;
        tst tstVarB = ((rur) this.e).b();
        if (zG) {
            immutableSetOf = ImmutableSet.of((tstVar.g() && tstVarB.g()) ? (rqf) this.b.b() : (rqf) this.a.b());
        } else {
            immutableSetOf = ImmutableSet.of();
        }
        immutableSetOf.getClass();
        return immutableSetOf;
    }

    public rny(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[] bArr) {
        this.f = i;
        this.e = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
    }

    public rny(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, char[] cArr) {
        this.f = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
        this.e = xcqVar4;
        this.a = xcqVar5;
    }

    public rny(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[] iArr) {
        this.f = i;
        this.c = xcqVar;
        this.d = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
    }

    public rny(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, short[] sArr) {
        this.f = i;
        this.e = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
    }
}
