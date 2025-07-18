package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvd {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public vvd() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void f(rjg rjgVar, View view) {
        if (view instanceof rji) {
            ((rji) view).b(rjgVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                f(rjgVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void h(rjg rjgVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                h(rjgVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof rji) {
            ((rji) view).e(rjgVar);
        }
    }

    private static void n(View view, riw riwVar) {
        view.setTag(R.id.view_bound_account_tag, riwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pnl] */
    public final void o(View view, int i, ucf ucfVar, View.OnClickListener onClickListener) {
        pke pkeVarB = this.b.b();
        pjr pjrVarJ = j(i, ucfVar);
        pju pjuVarC = pkd.c(view);
        if (pjuVarC == null) {
            pkeVarB.e(view, pjrVarJ);
        } else {
            long j = pjuVarC.a().h;
            vty vtyVar = pjrVarJ.b;
            if (j != ((pka) vtyVar.b).h) {
                throw new IllegalArgumentException("Disallowed Difference in CVE");
            }
            if (pjuVarC.a().g != ((pka) vtyVar.b).g) {
                pkg pkgVar = pkeVarB.a;
                pkg pkgVar2 = pjuVarC.f;
                new pkf(pkgVar2.f()).b(pjuVarC);
                boolean zN = pjuVarC.c.n();
                if (zN) {
                    pkgVar2.d(pjuVarC);
                }
                vty vtyVar2 = pjuVarC.e;
                if (vtyVar2.a.A()) {
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                vtyVar2.b = vtyVar2.q();
                if (zN) {
                    pkgVar2.c(pjuVarC);
                }
                pjuVarC.b(pjrVarJ.g(pkeVarB.b));
            }
        }
        Object obj = this.c;
        ntp ntpVar = new ntp(5);
        rjj rjjVar = (rjj) ((xwk) obj).g().f();
        if (rjjVar != null) {
            ntpVar.v(rjjVar.b());
        }
        view.setOnClickListener(new iwv(this, ntpVar, view, onClickListener, 3));
    }

    public final int a() {
        return ((vub) this.c).a;
    }

    public final vwo b() {
        return ((vub) this.c).b;
    }

    public final void c(Object obj) {
        if (((vub) this.c).a() != vwp.ENUM) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    public final xpz d(uqs uqsVar) {
        String str = uqsVar.b().a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        xpz xpzVar = (xpz) concurrentHashMap.get(uqsVar);
        if (xpzVar != null) {
            return xpzVar;
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.a;
        xpz xpzVarZ = (xpz) concurrentHashMap2.get(str);
        final int i = 1;
        final int i2 = 0;
        if (xpzVarZ == null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.add((ImmutableList.Builder) sij.ad(new lii(this, 17)));
            uqh uqhVar = (uqh) this.d;
            if (uqhVar.g != null) {
                builder.add((ImmutableList.Builder) new utc(0));
            }
            if (uqhVar.f == null) {
                builder.add((ImmutableList.Builder) new utd(0));
            } else {
                builder.add((ImmutableList.Builder) new utd(1));
                builder.add((ImmutableList.Builder) sij.ad(new yfo() { // from class: uta
                    @Override // defpackage.yfo, defpackage.yfn
                    public final Object b() {
                        return i != 0 ? ImmutableList.of(new usw()) : ImmutableList.of((uua) new uub(), new uua());
                    }
                }));
            }
            builder.add((ImmutableList.Builder) new usz());
            builder.add((ImmutableList.Builder) sij.ad(new yfo() { // from class: uta
                @Override // defpackage.yfo, defpackage.yfn
                public final Object b() {
                    return i2 != 0 ? ImmutableList.of(new usw()) : ImmutableList.of((uua) new uub(), new uua());
                }
            }));
            builder.add((ImmutableList.Builder) sij.ad(new lii(this, 15)));
            xpzVarZ = wbb.z(new uti(str, uqhVar), builder.build());
            xpz xpzVar2 = (xpz) concurrentHashMap2.putIfAbsent(str, xpzVarZ);
            if (xpzVar2 != null) {
                xpzVarZ = xpzVar2;
            }
        }
        xpz xpzVarZ2 = wbb.z(xpzVarZ, Arrays.asList(sij.ad(new lii(uqsVar, 16))));
        xpz xpzVar3 = (xpz) concurrentHashMap.putIfAbsent(uqsVar, xpzVarZ2);
        return xpzVar3 != null ? xpzVar3 : xpzVarZ2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rjk] */
    public final uhp e(tsl tslVar) {
        return szg.m(this.d.a(), new pap(this, tslVar, 8, null), ugk.a);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rjg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qth] */
    public final void g(View view, int i, Object obj) {
        riw riwVar;
        if (obj == null) {
            riwVar = new riw(2, null);
        } else {
            ?? r2 = this.c;
            r2.j(obj);
            String strD = r2.d(obj);
            riwVar = (strD == null || !strD.contains("@")) ? new riw(2, null) : new riw(1, strD);
        }
        riw riwVar2 = (riw) view.getTag(R.id.view_bound_account_tag);
        if (riwVar.equals(riwVar2)) {
            return;
        }
        if (riwVar2 == null) {
            ((tko) this.b).d(view, i, riwVar);
            n(view, riwVar);
            return;
        }
        int[] iArr = cww.a;
        if (view.isAttachedToWindow()) {
            ?? r0 = this.a;
            h(r0, view);
            tko tkoVar = (tko) this.b;
            ((rjh) tkoVar.a).e(view);
            tkoVar.d(view, i, riwVar);
            f(r0, view);
            n(view, riwVar);
        }
    }

    public final void i(View view, int i, vrp vrpVar, ucf ucfVar) {
        o(view, i, ucfVar, new kaj((Object) this, (Object) vrpVar, (Object) view, 6, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pnl] */
    public final pjr j(int i, ucf ucfVar) {
        pjr pjrVarA = this.b.c().a(i);
        if (ucfVar != null) {
            vvd vvdVar = rjd.a;
            vtw vtwVarM = rjf.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            rjf rjfVar = (rjf) vtwVarM.b;
            rjfVar.c = ucfVar;
            rjfVar.b |= 1;
            pjrVarA.d(new pjs(vvdVar, vtwVarM.r()));
        }
        rjj rjjVar = (rjj) ((xwk) this.c).g().f();
        if (rjjVar != null) {
            pjrVarA.d(rjjVar.a());
        }
        return pjrVarA;
    }

    public final void k(ysn ysnVar) {
        ysnVar.b(rdd.g((qwn) this.d));
    }

    public vvd(View view, ImageView imageView, unx unxVar, FrameLayout frameLayout) {
        this.b = view;
        this.c = imageView;
        this.a = unxVar;
        this.d = frameLayout;
    }

    public vvd(ViewGroup viewGroup, ViewGroup viewGroup2, goe goeVar, goe goeVar2) {
        this.d = viewGroup;
        this.c = viewGroup2;
        this.a = goeVar;
        this.b = goeVar2;
    }

    public vvd(cr crVar, qwn qwnVar, by byVar, qxn qxnVar) {
        this.b = crVar;
        this.c = qwnVar;
        this.d = byVar;
        this.a = qxnVar;
    }

    public vvd(Certificate certificate, Certificate certificate2, InputStream inputStream, OutputStream outputStream) {
        this.c = certificate;
        this.d = certificate2;
        this.a = inputStream;
        this.b = outputStream;
    }

    public vvd(rbg rbgVar, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3) {
        this.d = rbgVar;
        this.a = materialButton;
        this.b = materialButton2;
        this.c = materialButton3;
    }

    public vvd(rjg rjgVar, tko tkoVar, qth qthVar, qvh qvhVar) {
        this.a = rjgVar;
        this.b = tkoVar;
        this.c = qthVar;
        this.d = qvhVar;
    }

    public vvd(tst tstVar, ImmutableList immutableList, ImmutableList immutableList2, zuw zuwVar) {
        this.b = tstVar;
        this.c = immutableList;
        this.d = immutableList2;
        this.a = zuwVar;
    }

    public vvd(ulp ulpVar, yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        this.b = ulpVar;
        this.a = yfoVar;
        this.d = yfoVar2;
        this.c = yfoVar3;
    }

    public vvd(vwo vwoVar, Object obj, vwo vwoVar2, Object obj2) {
        this.c = vwoVar;
        this.a = obj;
        this.d = vwoVar2;
        this.b = obj2;
    }

    public vvd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4) {
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    public vvd(xsq xsqVar, xpy xpyVar, xsm xsmVar, String str) {
        this.d = xpyVar;
        this.a = xsqVar;
        this.b = xsmVar;
        this.c = str;
    }

    public vvd(Context context, riv rivVar, rjk rjkVar, tst tstVar) {
        this.c = rivVar;
        this.d = rjkVar;
        this.b = tstVar;
        this.a = context.getPackageName();
    }

    public vvd(pnl pnlVar, xzg xzgVar, xwk xwkVar, vrs vrsVar) {
        pnlVar.getClass();
        this.b = pnlVar;
        this.d = xzgVar;
        this.c = xwkVar;
        this.a = vrsVar;
    }

    public vvd(qwn qwnVar) {
        this.d = qwnVar;
        qwo qwoVar = qwnVar.b;
        qwoVar.getClass();
        this.c = qwoVar;
        this.a = null;
        this.b = new yss(new kim(this, (yih) null, 4));
    }

    public vvd(uqh uqhVar, List list) {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.d = uqhVar;
        this.c = list;
    }

    public vvd(vvj vvjVar, Object obj, vvj vvjVar2, vub vubVar) {
        if (vvjVar != null) {
            if (vubVar.b == vwo.MESSAGE && vvjVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.d = vvjVar;
            this.b = obj;
            this.a = vvjVar2;
            this.c = vubVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public vvd(tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = new AtomicBoolean(false);
        this.c = tstVar;
        this.d = tstVar2;
        this.b = tstVar3;
    }
}
