package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvf implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final /* synthetic */ int e;

    public rvf(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.e;
        if (i == 0) {
            return new rvt((Random) ((tst) ((xcn) this.a).a).e((Random) this.b.b()), (rvd) this.c.b(), (uep) this.d.b());
        }
        if (i == 1) {
            Object ruhVar = ((tst) ((xcn) this.a).a).g() ? (ruf) (((rur) this.b).b().g() ? this.d : this.c).b() : new ruh();
            ruhVar.getClass();
            return ruhVar;
        }
        unx unxVar = (unx) this.c.b();
        xcq xcqVar = this.a;
        Context contextA = ((rgq) this.b).a();
        Set<shc> set = (Set) xcqVar.b();
        tst tstVar = (tst) ((xcn) this.d).a;
        shc shcVar = null;
        for (shc shcVar2 : set) {
            if (true == (shcVar2 instanceof shc)) {
                shcVar = shcVar2;
            }
        }
        return new she(unxVar, contextA, shcVar, (shd) tstVar.f());
    }

    public rvf(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
    }

    public rvf(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[] cArr) {
        this.e = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
    }
}
