package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imr implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;
    private final Object d;

    public imr(Object obj, xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.d = obj;
        this.b = xcqVar;
        this.a = xcqVar2;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new imq((kdj) this.a.b(), (lfn) this.d.b(), ((xmu) this.b).b());
            case 1:
                return new kdj((yfo) this.d, this.a, this.b, (char[]) null);
            case 2:
                return new ini((ihq) this.d.b(), (lfn) this.a.b(), xcl.a(this.b));
            case 3:
                kdj kdjVar = (kdj) this.a.b();
                xcq xcqVar = this.b;
                iea ieaVarB = ((kqg) this.d).b();
                yow yowVarA = igh.a();
                ((ite) xcqVar).b();
                return new iom(kdjVar, ieaVarB, yowVarA);
            case 4:
                itk itkVar = (itk) this.a.b();
                itk itkVar2 = (itk) this.d.b();
                xnc xncVarB = ((xnd) this.b).b();
                itkVar.getClass();
                itkVar2.getClass();
                return xncVarB.a() ? itkVar2 : itkVar;
            case 5:
                return new kdj(((pkk) this.b).b(), ((plb) this.a).b(), ((kqg) this.d).b());
            case 6:
                ((kpw) this.a).b();
                return new kuw(((plc) this.b).b(), ((kqg) this.d).b(), (char[]) null);
            case 7:
                return new kdj((isn) this.b.b(), (lie) this.d.b(), (itk) this.a.b());
            case 8:
                irc ircVar = (irc) this.d.b();
                lie lieVar = (lie) this.b.b();
                Context contextA = ((rgq) this.a).a();
                ircVar.getClass();
                lieVar.getClass();
                return new jzs(ircVar, lieVar, contextA);
            case 9:
                xcq xcqVar2 = this.b;
                Context contextA2 = ((rgq) this.d).a();
                kdh kdhVar = (kdh) xcqVar2.b();
                gag gagVarB = ((jdk) this.a).b();
                kdhVar.getClass();
                return new euc(contextA2, new etm(kdhVar), gagVarB);
            case 10:
                return new jfq((kjc) this.d.b(), kqv.a(), ((xiy) this.a).b(), new jwj(), new jwj(), new jwj(), new jwj(), ((jwl) this.b).b());
            case 11:
                return new joc(((jwl) this.a).b(), ((jwl) this.b).b(), ((jwn) this.d).b());
            case 12:
                return new jow(((jwl) this.b).b(), ((jwl) this.a).b(), ((jwm) this.d).b());
            case 13:
                return new kdj(this.a, this.b, (yfo) this.d);
            case 14:
                return new isy((gpz) this.b.b(), ((xjm) this.d).b(), (isi) this.a.b());
            case 15:
                ((rgq) this.a).a();
                lfn lfnVar = (lfn) this.d.b();
                lkt lktVarB = ((kmz) this.b).b();
                lfnVar.getClass();
                Object obj = lktVarB.d;
                ?? r2 = lktVarB.e;
                Context contextA3 = ((rgq) obj).a();
                lfn lfnVar2 = (lfn) r2.b();
                lfnVar2.getClass();
                SharedPreferences sharedPreferences = (SharedPreferences) lktVarB.a.b();
                sharedPreferences.getClass();
                Executor executor = (Executor) lktVarB.c.b();
                executor.getClass();
                ?? r0 = lktVarB.b;
                ?? r1 = lktVarB.f;
                Object objB = r0.b();
                jah jahVar = (jah) r1.b();
                jahVar.getClass();
                return new kmy(contextA3, lfnVar2, sharedPreferences, executor, (msr) objB, jahVar);
            case 16:
                return new lyz(((rgq) this.d).a(), (lie) this.b.b(), (lfn) this.a.b());
            case 17:
                return ((kqf) this.d).C(((kqn) this.b).b(), ((rgq) this.a).a());
            case 18:
                xcq xcqVar3 = this.b;
                xbw xbwVarA = xcl.a(this.a);
                mem memVar = (mem) xcqVar3.b();
                kqv.d().booleanValue();
                kqf kqfVar = (kqf) this.d;
                return new kpy(xbwVarA, memVar, kqfVar.j, kqfVar.k);
            case 19:
                return new kdh(((rgq) this.d).a(), (lie) this.b.b(), (lfn) this.a.b());
            default:
                return ((kqf) this.d).D(((mbt) this.a).b(), (mab) this.b.b());
        }
    }

    public imr(Object obj, xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.c = i;
        this.d = obj;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    public imr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.c = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
    }

    public imr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, float[] fArr) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
    }

    public imr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, boolean[] zArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
    }

    public imr(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, byte[][] bArr) {
        this.c = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
    }
}
