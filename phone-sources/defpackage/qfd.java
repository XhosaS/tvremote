package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfd implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final /* synthetic */ int d;

    public qfd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    public static qfx a(yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        yfoVar.getClass();
        yfoVar2.getClass();
        yfoVar3.getClass();
        return ((qfy) yfoVar2).b();
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.d) {
            case 0:
                this.a.getClass();
                xcq xcqVar = this.b;
                xcqVar.getClass();
                this.c.getClass();
                return ((qfg) xcqVar).b();
            case 1:
                this.a.getClass();
                xcq xcqVar2 = this.b;
                xcqVar2.getClass();
                this.c.getClass();
                return ((qex) xcqVar2).b();
            case 2:
                return a(this.a, this.b, this.c);
            case 3:
                this.a.getClass();
                xcq xcqVar3 = this.b;
                xcqVar3.getClass();
                this.c.getClass();
                return ((qge) xcqVar3).b();
            case 4:
                this.a.getClass();
                xcq xcqVar4 = this.b;
                xcqVar4.getClass();
                this.c.getClass();
                return ((qgh) xcqVar4).b();
            case 5:
                xcq xcqVar5 = this.a;
                return new qgi(((rgq) this.b).a(), ((qib) this.c).a(), xcl.a(xcqVar5));
            case 6:
                this.a.getClass();
                xcq xcqVar6 = this.b;
                xcqVar6.getClass();
                this.c.getClass();
                return ((qgl) xcqVar6).b();
            case 7:
                this.a.getClass();
                xcq xcqVar7 = this.b;
                xcqVar7.getClass();
                this.c.getClass();
                return ((qgo) xcqVar7).b();
            case 8:
                return new qgs(((rgq) this.c).a(), (ExecutorService) this.b.b(), (ScheduledExecutorService) this.a.b());
            case 9:
                return new qjt(((rgq) this.c).a(), (qei) this.a.b(), (ntp) this.b.b());
            case 10:
                xcq xcqVar8 = this.a;
                return new qkd(((rgq) this.c).a(), xcl.a(this.b), (qjq) xcqVar8.b());
            case 11:
                xcq xcqVar9 = this.a;
                return new raf(((ral) this.c).b(), ((ram) this.b).b(), ((mii) xcqVar9).b());
            default:
                qwn qwnVar = (qwn) this.c.b();
                tst tstVar = (tst) ((xcn) this.b).a;
                return new rgn(qwnVar.b, (rjq) this.a.b(), (rgm) tstVar.e(new rgo()));
        }
    }

    public qfd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
    }

    public qfd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
    }

    public qfd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
    }
}
