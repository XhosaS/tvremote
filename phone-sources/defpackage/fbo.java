package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbo implements fcj {
    final /* synthetic */ fbr a;
    private ImmutableList b;
    private dze c;
    private long d;
    private long e;

    public fbo(fbr fbrVar, Context context) {
        this.a = fbrVar;
        edt.al(context);
        this.b = ImmutableList.of();
        this.e = -9223372036854775807L;
    }

    private static final void y(dze dzeVar) {
        dzd dzdVar = new dzd(dzeVar);
        dzdVar.C = fbr.b(dzeVar.ao);
        new dze(dzdVar);
        throw null;
    }

    @Override // defpackage.fcj
    public final Surface a() {
        a.ab(false);
        throw null;
    }

    @Override // defpackage.fcj
    public final void b() {
        fbr fbrVar = this.a;
        if (fbrVar.g.a() == 0) {
            fbrVar.a();
            return;
        }
        edn ednVar = new edn();
        boolean z = true;
        while (fbrVar.g.a() > 0) {
            fbq fbqVar = (fbq) fbrVar.g.c();
            fbqVar.getClass();
            if (z) {
                int i = fbqVar.b;
                if (i == 0 || i == 1) {
                    fbqVar = new fbq(fbqVar.a, 0, fbqVar.c);
                } else {
                    fbrVar.a();
                }
            }
            ednVar.e(fbqVar.c, fbqVar);
            z = false;
        }
        fbrVar.g = ednVar;
    }

    @Override // defpackage.fcj
    public final void c() {
        edk edkVar = edk.a;
        int i = edkVar.b;
        int i2 = edkVar.c;
        this.a.l = null;
    }

    @Override // defpackage.fcj
    public final void d(boolean z) {
        this.e = -9223372036854775807L;
        fbr fbrVar = this.a;
        if (fbrVar.n == 1) {
            fbrVar.m++;
            fcj fcjVar = fbrVar.d;
            fcjVar.d(z);
            while (fbrVar.g.a() > 1) {
                fbrVar.g.c();
            }
            if (fbrVar.g.a() == 1) {
                fbq fbqVar = (fbq) fbrVar.g.c();
                fbqVar.getClass();
                fcjVar.v(fbrVar.h, fbqVar.a, fbqVar.b, ImmutableList.of());
            }
            fbrVar.o = -9223372036854775807L;
            ecu ecuVar = fbrVar.k;
            eci.e(ecuVar);
            ecuVar.d(new emy(fbrVar, 18));
        }
    }

    @Override // defpackage.fcj
    public final void e(boolean z) {
        fbr fbrVar = this.a;
        if (fbrVar.c) {
            fbrVar.d.e(z);
        }
    }

    @Override // defpackage.fcj
    public final void g() {
        fbr fbrVar = this.a;
        if (fbrVar.n == 2) {
            return;
        }
        ecu ecuVar = fbrVar.k;
        if (ecuVar != null) {
            ecuVar.e();
        }
        fbrVar.l = null;
        fbrVar.n = 2;
    }

    @Override // defpackage.fcj
    public final void h(long j, long j2) {
        this.a.d.h(j + this.d, j2);
    }

    @Override // defpackage.fcj
    public final void i(long j) {
        this.d = j;
    }

    @Override // defpackage.fcj
    public final void j(int i) {
        this.a.d.j(i);
    }

    @Override // defpackage.fcj
    public final void l(Surface surface, edk edkVar) {
        fbr fbrVar = this.a;
        Pair pair = fbrVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((edk) fbrVar.l.second).equals(edkVar)) {
            return;
        }
        fbrVar.l = Pair.create(surface, edkVar);
        int i = edkVar.b;
        int i2 = edkVar.c;
    }

    @Override // defpackage.fcj
    public final void m(float f) {
        this.a.d.m(f);
    }

    @Override // defpackage.fcj
    public final void n(List list) {
        if (this.b.equals(list)) {
            return;
        }
        this.b = ImmutableList.copyOf((Collection) list);
        dze dzeVar = this.c;
        if (dzeVar != null) {
            y(dzeVar);
        }
    }

    @Override // defpackage.fcj
    public final void o(fbu fbuVar) {
        ((fbd) this.a.d).e = fbuVar;
    }

    @Override // defpackage.fcj
    public final void p() {
        fbr fbrVar = this.a;
        if (fbrVar.o >= this.e) {
            fbrVar.d.p();
        }
    }

    @Override // defpackage.fcj
    public final void q() {
        fbr fbrVar = this.a;
        if (fbrVar.c) {
            fbrVar.d.q();
        }
    }

    @Override // defpackage.fcj
    public final void r() {
        fbr fbrVar = this.a;
        if (fbrVar.c) {
            fbrVar.d.r();
        }
    }

    @Override // defpackage.fcj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.fcj
    public final boolean t() {
        return false;
    }

    @Override // defpackage.fcj
    public final boolean u(boolean z) {
        return this.a.d.u(false);
    }

    @Override // defpackage.fcj
    public final void v(dze dzeVar, long j, int i, List list) {
        a.ab(false);
        this.b = ImmutableList.copyOf((Collection) list);
        this.c = dzeVar;
        y(dzeVar);
        long j2 = this.e;
        fbr fbrVar = this.a;
        long j3 = -4611686018427387904L;
        if (fbrVar.c) {
            if (j2 != -9223372036854775807L) {
                j3 = 1 + j2;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        fbrVar.g.e(j4, new fbq(j + this.d, i, j4));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // defpackage.fcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.dze r14) throws defpackage.fci {
        /*
            r13 = this;
            r0 = 1
            defpackage.a.ab(r0)
            fbr r5 = r13.a
            int r1 = r5.n
            r2 = 0
            if (r1 != 0) goto Ld
            r1 = r0
            goto Le
        Ld:
            r1 = r2
        Le:
            defpackage.a.ab(r1)
            dyt r1 = r14.ao
            dyt r1 = defpackage.fbr.b(r1)
            int r3 = r1.j
            r4 = 7
            if (r3 != r4) goto L3c
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r3 >= r6) goto L3b
            boolean r3 = defpackage.clw.U()
            if (r3 != 0) goto L29
            goto L3b
        L29:
            int r7 = r1.h
            int r8 = r1.i
            byte[] r10 = r1.k
            int r11 = r1.l
            int r12 = r1.m
            dyt r6 = new dyt
            r9 = 6
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3 = r6
            goto L6a
        L3b:
            r3 = r4
        L3c:
            r6 = 6
            if (r3 != r6) goto L44
            boolean r4 = defpackage.clw.U()
            goto L4c
        L44:
            if (r3 != r4) goto L69
            java.lang.String r4 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r4 = defpackage.clw.V(r4)
        L4c:
            if (r4 != 0) goto L69
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L69
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            java.lang.String r1 = "Color transfer %d is not supported. Falling back to OpenGl tone mapping."
            java.lang.String r0 = defpackage.edt.R(r1, r0)
            java.lang.String r1 = "PlaybackVidGraphWrapper"
            defpackage.edb.e(r1, r0)
            dyt r1 = defpackage.dyt.a
        L69:
            r3 = r1
        L6a:
            ecn r0 = r5.e
            android.os.Looper r1 = android.os.Looper.myLooper()
            defpackage.eci.e(r1)
            r9 = 0
            ecu r0 = r0.b(r1, r9)
            r5.k = r0
            dhq r1 = r5.q     // Catch: defpackage.ebk -> L93
            android.content.Context r2 = r5.a     // Catch: defpackage.ebk -> L93
            dyw r4 = defpackage.dyw.a     // Catch: defpackage.ebk -> L93
            ecu r0 = r5.k     // Catch: defpackage.ebk -> L93
            r0.getClass()     // Catch: defpackage.ebk -> L93
            emk r6 = new emk     // Catch: defpackage.ebk -> L93
            r7 = 3
            r6.<init>(r0, r7)     // Catch: defpackage.ebk -> L93
            ebj r7 = r5.i     // Catch: defpackage.ebk -> L93
            com.google.common.collect.ImmutableList r8 = r5.j     // Catch: defpackage.ebk -> L93
            r1.x(r2, r3, r4, r5, r6, r7, r8)     // Catch: defpackage.ebk -> L93
            throw r9     // Catch: defpackage.ebk -> L93
        L93:
            r0 = move-exception
            fci r1 = new fci
            r1.<init>(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbo.w(dze):void");
    }

    @Override // defpackage.fcj
    public final boolean x(long j, uru uruVar) {
        a.ab(false);
        int i = this.a.p;
        if (i == -1 || i != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.fcj
    public final void f() {
    }

    @Override // defpackage.fcj
    public final void k(fch fchVar, Executor executor) {
    }
}
