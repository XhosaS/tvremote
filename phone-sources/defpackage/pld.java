package defpackage;

import android.os.Build;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pld implements xcm {
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

    public pld(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6, xcq xcqVar7, xcq xcqVar8, xcq xcqVar9, xcq xcqVar10, xcq xcqVar11) {
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
    public final /* bridge */ /* synthetic */ Object b() {
        pji pjiVar = (pji) this.a.b();
        tst tstVar = (tst) ((xcn) this.b).a;
        ((pjl) this.c).b();
        tst tstVar2 = (tst) ((xcn) this.e).a;
        tst tstVar3 = (tst) ((xcn) this.f).a;
        tst tstVar4 = (tst) ((xcn) this.g).a;
        tst tstVar5 = (tst) ((xcn) this.h).a;
        tst tstVar6 = (tst) ((xcn) this.i).a;
        tst tstVar7 = (tst) ((xcn) this.j).a;
        tst tstVar8 = (tst) ((xcn) this.k).a;
        pkv pkvVar = new pkv(pjiVar);
        if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            pkvVar.e = ((Integer) tstVar2.e(500)).intValue();
        }
        if (tstVar5.g()) {
            pkvVar.g = ((Integer) tstVar5.c()).intValue();
        }
        if (tstVar3.g()) {
            pkvVar.b.f = ((Boolean) tstVar3.c()).booleanValue();
        }
        if (tstVar4.g()) {
            pkvVar.b.g = (Set) tstVar4.c();
        }
        if (tstVar6.g()) {
            pkvVar.b.h = ((Boolean) tstVar6.c()).booleanValue();
        }
        if (tstVar7.g()) {
            pkvVar.c = ((Boolean) tstVar7.c()).booleanValue();
        }
        if (tstVar8.g()) {
            pkvVar.d = ((Boolean) tstVar8.c()).booleanValue();
        }
        return pkvVar;
    }
}
