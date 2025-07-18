package defpackage;

import android.os.Build;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.WindowInsets;
import android.widget.RemoteViews;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyg {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static final void b(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setImageAlpha", i2);
    }

    public static final void c(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setGravity", i2);
    }

    public static final void d(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setHeight", i2);
    }

    public static final void e(RemoteViews remoteViews, int i, int i2) {
        remoteViews.setInt(i, "setWidth", i2);
    }

    public static final void f(int i, String str) {
        if (Build.VERSION.SDK_INT >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " is only available on SDK " + i + " and higher");
    }

    public static String g(dds ddsVar) {
        StringBuilder sb = new StringBuilder(ddsVar.c());
        for (int i = 0; i < ddsVar.c(); i++) {
            byte bA = ddsVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:12:0x002d, B:20:0x0068, B:22:0x0070, B:18:0x0055, B:17:0x004f), top: B:37:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:24:0x0080, B:33:0x008f, B:34:0x0092, B:12:0x002d, B:20:0x0068, B:22:0x0070, B:18:0x0055, B:17:0x004f, B:31:0x008d), top: B:37:0x0021, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0066 -> B:20:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.yih r9) {
        /*
            boolean r0 = r9 instanceof defpackage.dsi
            if (r0 == 0) goto L13
            r0 = r9
            dsi r0 = (defpackage.dsi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsi r0 = new dsi
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            yrr r2 = r0.f
            java.lang.Object r6 = r0.b
            bis r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L8c
            goto L68
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            defpackage.ybn.f(r9)
            r9 = 6
            yrz r6 = defpackage.vyf.R(r5, r4, r9)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r4)
            bct r7 = new bct
            r7.<init>(r2, r6, r9, r3)
            biq r7 = defpackage.bcm.y(r7)
            yrr r9 = r6.C()     // Catch: java.lang.Throwable -> L8c
            r8 = r2
            r2 = r9
        L55:
            r0.a = r8     // Catch: java.lang.Throwable -> L8c
            r9 = r7
            bis r9 = (defpackage.bis) r9     // Catch: java.lang.Throwable -> L8c
            r0.e = r9     // Catch: java.lang.Throwable -> L8c
            r0.b = r6     // Catch: java.lang.Throwable -> L8c
            r0.f = r2     // Catch: java.lang.Throwable -> L8c
            r0.d = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L8c
            if (r9 == r1) goto L8b
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r9 == 0) goto L80
            java.lang.Object r9 = r2.b()     // Catch: java.lang.Throwable -> L8c
            ygi r9 = (defpackage.ygi) r9     // Catch: java.lang.Throwable -> L8c
            r9 = r8
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9     // Catch: java.lang.Throwable -> L8c
            r9.set(r4)     // Catch: java.lang.Throwable -> L8c
            defpackage.bcm.A()     // Catch: java.lang.Throwable -> L8c
            goto L55
        L80:
            defpackage.vyf.Q(r6, r3)     // Catch: java.lang.Throwable -> L89
            r7.a()
            ygi r9 = defpackage.ygi.a
            return r9
        L89:
            r9 = move-exception
            goto L93
        L8b:
            return r1
        L8c:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.vyf.Q(r6, r9)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L93:
            r7.a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyg.h(yih):java.lang.Object");
    }

    public static final djh i(djh djhVar) {
        return djhVar.a(new dry(dui.a));
    }

    public static final djh j(djh djhVar) {
        return i(k(djhVar));
    }

    public static final djh k(djh djhVar) {
        return djhVar.a(new dsf(dui.a));
    }

    public static final djh l(djh djhVar) {
        return djhVar.a(new dry(duk.a));
    }

    public static final djh m() {
        return crp.i(new dsf(new dug(24.0f)), new dry(new dug(24.0f)));
    }

    public static final void n(djh djhVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1208072102);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i4 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.y(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = dsd.a;
                basVar.ae(objT);
            }
            basVar.aa();
            yjk yjkVar = (yjk) ((ymj) objT);
            baoVarD.y(-683746039);
            baoVarD.y(-548224868);
            if (!(basVar.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, djhVar, new diw(20));
            beb.a(baoVarD, new drn(0), new dsc(i3));
            beb.a(baoVarD, new drm(0), new dsc(0));
            ykaVar.a(dse.a, baoVarD, Integer.valueOf(((i4 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            baoVarD.o();
            basVar.aa();
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(djhVar, ykaVar, i, 3);
        }
    }
}
