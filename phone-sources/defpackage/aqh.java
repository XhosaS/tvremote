package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqh extends bko implements bxu, byc, byk {
    public final boolean a;
    public final yjk b;
    public aqj c;
    public float d;
    public boolean f;
    public final kw h;
    private final float i;
    private final bns j;
    private aqe k;
    private aqf l;
    public long e = 0;
    public final kc g = new kc((byte[]) null);

    public aqh(kw kwVar, boolean z, float f, bns bnsVar, yjk yjkVar) {
        this.h = kwVar;
        this.a = z;
        this.i = f;
        this.j = bnsVar;
        this.b = yjkVar;
    }

    private final void m(aqf aqfVar) {
        this.l = aqfVar;
        fh.D(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    @Override // defpackage.byc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bU(defpackage.byu r15) {
        /*
            r14 = this;
            r15.r()
            aqj r0 = r14.c
            if (r0 == 0) goto L78
            float r4 = r14.d
            long r1 = r14.e()
            mr r3 = r0.c
            java.lang.Object r3 = r3.d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L78
            long r2 = defpackage.bnq.h(r1, r3)
            boolean r0 = r0.a
            if (r0 == 0) goto L6e
            long r0 = r15.n()
            float r8 = defpackage.bna.c(r0)
            long r0 = r15.n()
            float r9 = defpackage.bna.a(r0)
            bpn r11 = r15.p()
            long r12 = r11.a()
            bnp r0 = r11.b()
            r0.g()
            pku r5 = r11.c     // Catch: java.lang.Throwable -> L61
            r7 = 0
            r10 = 1
            r6 = 0
            r5.v(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L61
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r5 = 0
            r1 = r15
            defpackage.brx.F(r1, r2, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L61
            bnp r15 = r11.b()
            r15.e()
            r11.h(r12)
            goto L79
        L61:
            r0 = move-exception
            r15 = r0
            bnp r0 = r11.b()
            r0.e()
            r11.h(r12)
            throw r15
        L6e:
            r1 = r15
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r5 = 0
            defpackage.brx.F(r1, r2, r4, r5, r7, r8)
            goto L79
        L78:
            r1 = r15
        L79:
            bpn r15 = r1.p()
            bnp r15 = r15.b()
            aqf r0 = r14.l
            if (r0 == 0) goto La5
            long r1 = r14.e
            float r3 = r14.d
            int r3 = defpackage.yln.v(r3)
            long r4 = r14.e()
            yjk r6 = r14.b
            java.lang.Object r6 = r6.a()
            aqd r6 = (defpackage.aqd) r6
            float r6 = r6.d
            r0.b(r1, r3, r4, r6)
            android.graphics.Canvas r15 = defpackage.bnc.a(r15)
            r0.draw(r15)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqh.bU(byu):void");
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        float fCr;
        this.f = true;
        clx clxVarL = fh.L(this);
        this.e = clw.y(j);
        float f = this.i;
        if (Float.isNaN(f)) {
            boolean z = this.a;
            long j2 = this.e;
            fCr = bmx.a(a.j(bna.c(j2), bna.a(j2))) / 2.0f;
            if (z) {
                fCr += clxVarL.cr(10.0f);
            }
        } else {
            fCr = clxVarL.cr(f);
        }
        this.d = fCr;
        kc kcVar = this.g;
        Object[] objArr = kcVar.a;
        int i = kcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            f((wu) objArr[i2]);
        }
        kcVar.k();
    }

    @Override // defpackage.bko
    public final void cd() {
        ykr.q(F(), null, 0, new aki(this, (yih) null, 2), 3);
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.bko
    public final void ch() {
        aqe aqeVar = this.k;
        if (aqeVar != null) {
            g();
            bhi bhiVar = aqeVar.e;
            aqf aqfVarG = bhiVar.g(this);
            if (aqfVarG != null) {
                aqfVarG.a();
                bhiVar.h(this);
                aqeVar.c.add(aqfVarG);
            }
        }
    }

    public final long e() {
        return this.j.a();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public final void f(wu wuVar) {
        if (!(wuVar instanceof ws)) {
            if (wuVar instanceof wt) {
                ws wsVar = ((wt) wuVar).a;
                l();
                return;
            } else {
                if (wuVar instanceof wr) {
                    ws wsVar2 = ((wr) wuVar).a;
                    l();
                    return;
                }
                return;
            }
        }
        ws wsVar3 = (ws) wuVar;
        long j = this.e;
        float f = this.d;
        aqe aqeVar = this.k;
        if (aqeVar == null) {
            Object obj = (View) fh.P(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(a.cj(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    aqe aqeVar2 = new aqe(viewGroup.getContext());
                    viewGroup.addView(aqeVar2);
                    aqeVar = aqeVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof aqe) {
                        aqeVar = (aqe) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.k = aqeVar;
            aqeVar.getClass();
        }
        bhi bhiVar = aqeVar.e;
        aqf aqfVarG = bhiVar.g(this);
        if (aqfVarG == null) {
            List list = aqeVar.c;
            list.getClass();
            aqfVarG = (aqf) (list.isEmpty() ? null : list.remove(0));
            if (aqfVarG == null) {
                int i2 = aqeVar.d;
                List list2 = aqeVar.b;
                if (i2 > yfm.q(list2)) {
                    aqfVarG = new aqf(aqeVar.getContext());
                    aqeVar.addView(aqfVarG);
                    list2.add(aqfVarG);
                } else {
                    aqfVarG = (aqf) list2.get(aqeVar.d);
                    aqh aqhVar = (aqh) bhiVar.b.get(aqfVarG);
                    if (aqhVar != null) {
                        aqhVar.g();
                        bhiVar.h(aqhVar);
                        aqfVarG.a();
                    }
                }
                int i3 = aqeVar.d;
                if (i3 < aqeVar.a - 1) {
                    aqeVar.d = i3 + 1;
                } else {
                    aqeVar.d = 0;
                }
            }
            bhiVar.a.put(this, aqfVarG);
            bhiVar.b.put(aqfVarG, this);
        }
        boolean z = this.a;
        int iV = yln.v(f);
        long jE = e();
        float f2 = ((aqd) this.b.a()).d;
        aoe aoeVar = new aoe(this, 6);
        if (aqfVarG.b == null || !yks.e(Boolean.valueOf(z), aqfVarG.c)) {
            aqk aqkVar = new aqk(z);
            aqfVarG.setBackground(aqkVar);
            aqfVarG.b = aqkVar;
            aqfVarG.c = Boolean.valueOf(z);
        }
        aqk aqkVar2 = aqfVarG.b;
        aqkVar2.getClass();
        aqfVarG.e = aoeVar;
        aqf aqfVar = aqfVarG;
        aqfVar.b(j, iV, jE, f2);
        if (z) {
            long j2 = wsVar3.a;
            aqkVar2.setHotspot(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            aqkVar2.setHotspot(aqkVar2.getBounds().centerX(), aqkVar2.getBounds().centerY());
        }
        aqfVar.c(true);
        m(aqfVar);
    }

    public final void g() {
        m(null);
    }

    public final void l() {
        aqf aqfVar = this.l;
        if (aqfVar != null) {
            aqfVar.c(false);
        }
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }

    @Override // defpackage.byk
    public final /* synthetic */ void cj(bvc bvcVar) {
    }
}
