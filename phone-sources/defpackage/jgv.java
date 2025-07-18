package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import com.google.android.videos.R;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgv extends sbx {
    private final cvw A;
    private final cxe B;
    private final cxe C;
    public final Context a;
    public final jaf b;
    public final ixb c;
    public final ihi d;
    public final ino e;
    public final iof f;
    public wlx g;
    public Context h;
    public final jan i;
    public final isf j;
    public final iyz k;
    public final irc l;
    private final lgi m;
    private final itk n;
    private final xjf o;
    private final yow p;
    private final ihg q;
    private final kja r;
    private wni s;
    private jaa t;
    private final wls u;
    private final cvw v;
    private final cvw w;
    private final cvw x;
    private final cvw y;
    private final cvw z;

    public jgv(Context context, jan janVar, cvw cvwVar, lgi lgiVar, jaf jafVar, ixb ixbVar, irc ircVar, itk itkVar, cvw cvwVar2, cvw cvwVar3, cxe cxeVar, cvw cvwVar4, cxe cxeVar2, cvw cvwVar5, cvw cvwVar6, ihi ihiVar, xjf xjfVar, jwq jwqVar, ino inoVar, iof iofVar, isf isfVar, iyz iyzVar, yow yowVar, ihg ihgVar, kja kjaVar) {
        janVar.getClass();
        lgiVar.getClass();
        jafVar.getClass();
        ixbVar.getClass();
        ircVar.getClass();
        itkVar.getClass();
        jwqVar.getClass();
        inoVar.getClass();
        iofVar.getClass();
        isfVar.getClass();
        iyzVar.getClass();
        yowVar.getClass();
        kjaVar.getClass();
        this.a = context;
        this.i = janVar;
        this.A = cvwVar;
        this.m = lgiVar;
        this.b = jafVar;
        this.c = ixbVar;
        this.l = ircVar;
        this.n = itkVar;
        this.y = cvwVar2;
        this.x = cvwVar3;
        this.C = cxeVar;
        this.v = cvwVar4;
        this.B = cxeVar2;
        this.w = cvwVar5;
        this.z = cvwVar6;
        this.d = ihiVar;
        this.o = xjfVar;
        this.e = inoVar;
        this.f = iofVar;
        this.j = isfVar;
        this.k = iyzVar;
        this.p = yowVar;
        this.q = ihgVar;
        this.r = kjaVar;
        this.u = ihz.S(R.string.details_watch_now, context);
    }

    private static final boolean A(joz jozVar) {
        int iAU;
        wni wniVarU = u(jozVar);
        return (wniVarU == null || (iAU = a.aU(wniVarU.c)) == 0 || iAU != 4) ? false : true;
    }

    private static final boolean B(joz jozVar) {
        return z(jozVar) && ihz.G(jozVar.i());
    }

    public static final wll g(joz jozVar) {
        wll wllVar = ((wum) jozVar.b).c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        return wllVar;
    }

    public static final wpm h(joz jozVar) {
        return ihz.t(jozVar.i());
    }

    public static final wpm i(joz jozVar) {
        return ihz.u(jozVar.i());
    }

    public static /* synthetic */ void j(jgv jgvVar, View view, joz jozVar, wpm wpmVar, boolean z, int i) {
        int i2;
        wni wniVar = null;
        if ((i & 4) != 0) {
            wpmVar = null;
        }
        if (wpmVar == null) {
            wpmVar = jgvVar.e(jozVar);
        }
        wpm wpmVar2 = wpmVar;
        if (wpmVar2 == null) {
            wni wniVarU = u(jozVar);
            if (wniVarU == null && (wniVarU = jgvVar.s) == null) {
                yks.c("pagePlayId");
            } else {
                wniVar = wniVarU;
            }
            jan janVar = jgvVar.i;
            Context contextAj = a.aj(view);
            wll wllVarG = g(jozVar);
            wniVar.getClass();
            if (!hju.u(wllVarG)) {
                janVar.g.b(wllVarG, "play-movies");
            }
            hju.G(contextAj).g(hju.F(contextAj), wniVar.b, "details");
            janVar.c.am(hju.s(wllVarG, wniVar), contextAj.getPackageName(), "play-movies", null, null, janVar.d.e());
            return;
        }
        lid lidVarA = lid.a();
        int iS = 8;
        if (jozVar.i() != null) {
            boolean z2 = (i & 8) == 0;
            jan janVar2 = jgvVar.i;
            Context contextAj2 = a.aj(view);
            wll wllVarG2 = g(jozVar);
            wnp wnpVarI = jozVar.i();
            wnpVarI.getClass();
            iS = janVar2.s(contextAj2, wllVarG2, wnpVarI, wpmVar2, z2 & z);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (iS == 2) {
                i2 = iS;
            } else if (iS == 1) {
                i2 = 1;
            }
            int i3 = iS != 1 ? 3 : 2;
            if (i2 != 1) {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                if (jgvVar.t != null && ihz.N(view) != null) {
                    by byVarN = ihz.N(view);
                    byVarN.getClass();
                    czi.f(byVarN, jgvVar.t, intentFilter, 4);
                }
            }
            jgvVar.b.d(view, hju.y(lidVarA, i3));
            return;
        }
        jgvVar.b.d(view, hju.x(lidVarA));
    }

    public static final String k(joz jozVar) {
        String str;
        wno wnoVarW = w(jozVar);
        return (wnoVarW == null || (str = wnoVarW.b) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0166  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.jhf s(defpackage.joz r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.s(joz):jhf");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(defpackage.jgy r5, defpackage.joz r6, java.util.List r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.t(jgy, joz, java.util.List):void");
    }

    private static final wni u(joz jozVar) {
        wni wniVarO;
        wnp wnpVarI = jozVar.i();
        return (wnpVarI == null || (wniVarO = ihz.o(wnpVarI)) == null) ? ihz.p(jozVar.j()) : wniVarO;
    }

    private static final List v(joz jozVar) {
        wnp wnpVarI = jozVar.i();
        if (wnpVarI != null) {
            return ihz.x(wnpVarI);
        }
        return null;
    }

    private static final wno w(joz jozVar) {
        wnp wnpVarI = jozVar.i();
        if (wnpVarI == null) {
            return null;
        }
        wno wnoVar = wnpVarI.b;
        return wnoVar == null ? wno.a : wnoVar;
    }

    private static final String x(joz jozVar) {
        wni wniVarU = u(jozVar);
        if (wniVarU != null) {
            return wniVarU.b;
        }
        return null;
    }

    private static final wlx y(joz jozVar) {
        wno wnoVarW = w(jozVar);
        if (wnoVarW == null) {
            return null;
        }
        wlx wlxVar = wnoVarW.e;
        return wlxVar == null ? wlx.a : wlxVar;
    }

    private static final boolean z(joz jozVar) {
        int iAU;
        wni wniVarU = u(jozVar);
        return (wniVarU == null || (iAU = a.aU(wniVarU.c)) == 0 || iAU != 3) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        joz jozVar = (joz) obj;
        jgy jgyVar = new jgy(this.A.a);
        jgyVar.a = new jeu(this, jozVar, 7);
        jgyVar.b = new jev(this, jozVar, 6);
        return jgyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r3v9, types: [iof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(java.lang.Object r20, java.lang.Object r21) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.c(java.lang.Object, java.lang.Object):void");
    }

    public final long d(wlx wlxVar) {
        File fileA;
        if (wlxVar == null || (fileA = this.k.a(wlxVar)) == null) {
            return 4279899936L;
        }
        return ((Number) yfm.S(kpt.a.a(BitmapFactory.decodeFile(fileA.getPath()), true))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wpm e(defpackage.joz r6) {
        /*
            r5 = this;
            wnp r0 = r6.i()
            if (r0 == 0) goto L58
            vun r0 = r0.c
            if (r0 == 0) goto L58
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            goto L58
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            wpm r1 = (defpackage.wpm) r1
            int r2 = r1.c
            r3 = 4
            if (r2 != r3) goto L2b
            java.lang.Object r1 = r1.d
            woz r1 = (defpackage.woz) r1
            goto L2d
        L2b:
            woz r1 = defpackage.woz.a
        L2d:
            vun r1 = r1.c
            r1.getClass()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L15
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L15
            java.lang.Object r2 = r1.next()
            wnt r2 = (defpackage.wnt) r2
            int r3 = r2.c
            r4 = 2
            if (r3 != r4) goto L3c
            java.lang.Object r2 = r2.d
            wnr r2 = (defpackage.wnr) r2
            int r2 = r2.b
            r2 = r2 & 1
            if (r2 != 0) goto L3c
            goto L90
        L58:
            wnp r0 = r6.i()
            boolean r0 = defpackage.ihz.I(r0)
            if (r0 != 0) goto L90
            boolean r0 = B(r6)
            if (r0 == 0) goto L69
            goto L90
        L69:
            wnp r0 = r6.i()
            boolean r0 = defpackage.ihz.C(r0)
            if (r0 == 0) goto L7c
            wnp r6 = r6.i()
            wpm r6 = defpackage.ihz.w(r6)
            return r6
        L7c:
            wnp r6 = r6.i()
            r0 = 0
            if (r6 == 0) goto L8f
            vun r6 = r6.c
            if (r6 != 0) goto L88
            return r0
        L88:
            java.lang.Object r6 = defpackage.yfm.U(r6)
            wpm r6 = (defpackage.wpm) r6
            return r6
        L8f:
            return r0
        L90:
            wnp r6 = r6.i()
            wpm r6 = defpackage.ihz.v(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgv.e(joz):wpm");
    }

    public final boolean f(joz jozVar) {
        if (!this.o.a() || (((wum) jozVar.b).b & 32) == 0) {
            return false;
        }
        Context context = this.a;
        return (jwq.g(context) || jwq.e(context)) ? false : true;
    }
}
