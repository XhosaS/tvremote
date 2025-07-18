package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inc implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;
    private final Object c;

    public inc(Object obj, xcq xcqVar, int i) {
        this.b = i;
        this.c = obj;
        this.a = xcqVar;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                vvd vvdVar = (vvd) this.a.b();
                iea ieaVarB = ((kqg) this.c).b();
                vvdVar.getClass();
                wek wekVar = new wek(vvdVar.d(wen.g), xpy.a);
                ldy ldyVar = (ldy) ieaVarB;
                return ldyVar.a().m() ? (wek) wekVar.M(uqx.a, new uqx(((ksn) ldyVar.a().g()).a)) : wekVar;
            case 1:
                moz mozVarB = ((ihr) this.c).b();
                yow yowVar = (yow) this.a.b();
                yowVar.getClass();
                Object obj = mozVarB.b;
                ?? r2 = mozVarB.a;
                iea ieaVarB2 = ((kqg) obj).b();
                ijj ijjVar = (ijj) r2.b();
                ijjVar.getClass();
                lfn lfnVar = (lfn) mozVarB.c.b();
                lfnVar.getClass();
                mdw mdwVar = (mdw) mozVarB.g.b();
                mdwVar.getClass();
                ikt iktVar = (ikt) mozVarB.h.b();
                iktVar.getClass();
                Runnable runnable = (Runnable) mozVarB.e.b();
                runnable.getClass();
                return new ihq(ieaVarB2, ijjVar, lfnVar, mdwVar, iktVar, runnable, ((rgq) mozVarB.f).a(), yowVar);
            case 2:
                return new irc((gpz) this.a.b(), (lfn) this.c.b());
            case 3:
                return new irc(((rgq) this.c).a(), ((xjy) this.a).b(), (byte[]) null);
            case 4:
                ?? r0 = ((iqz) this.c).b().b;
                yil yilVarA = ((mdx) this.a).a();
                kdj kdjVar = (kdj) r0.b();
                kdjVar.getClass();
                return new irc(kdjVar, yilVarA, (byte[]) null);
            case 5:
                return new irc((kdj) this.c.b(), ((ite) this.a).b());
            case 6:
                xcq xcqVar = this.a;
                Context contextA = ((rgq) this.c).a();
                itk itkVar = (itk) xcqVar.b();
                itkVar.getClass();
                return new gag(contextA, itkVar);
            case 7:
                return new irc(xcl.a(this.c), ((plb) this.a).b());
            case 8:
                return new jzs(((xco) this.c).b(), xcl.a(this.a));
            case 9:
                Context contextA2 = ((rgq) this.c).a();
                kdj kdjVarB = ((iza) this.a).b();
                return new iyz(((rgq) kdjVarB.c).a(), ((xjy) kdjVarB.a).b(), ((kqw) kdjVarB.b).b(), new File(contextA2.getFilesDir(), "offline_images"));
            case 10:
                return new kuw(((rgq) this.a).a(), ((xif) this.c).b(), (char[]) null);
            case 11:
                return new jfc(((jwl) this.c).b(), ((jwl) this.a).b());
            case 12:
                return new jwd(((jwl) this.a).b(), ((jwn) this.c).b());
            case 13:
                return new hfw(this.c);
            case 14:
                ((rgq) this.c).a();
                return new kcz(((kdc) this.a).b());
            case 15:
                return new kmg((mab) this.a.b(), (izo) this.c.b());
            case 16:
                Object obj2 = this.c;
                return ((Boolean) xly.a.et(((xlz) this.a).b().b)).booleanValue() ? ((kmu) obj2).b() : new kmn();
            case 17:
                Object libVar = TextUtils.isEmpty(((kwy) this.c.b()).l()) ? new lib() : (lhz) xcl.a(this.a).b();
                libVar.getClass();
                return libVar;
            case 18:
                return ((kqf) this.c).e((iea) this.a.b());
            case 19:
                return ((kqf) this.c).c(((rgq) this.a).a());
            default:
                return new mel(((rgq) this.c).a(), xcl.a(this.a));
        }
    }

    public inc(xcq xcqVar, xcq xcqVar2, int i) {
        this.b = i;
        this.a = xcqVar;
        this.c = xcqVar2;
    }
}
