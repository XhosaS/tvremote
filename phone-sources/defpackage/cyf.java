package defpackage;

import android.content.res.Resources;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyf {
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
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static void b(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static final dfb c(Object obj) {
        return (dfb) ((cxe) obj).a;
    }

    public static final Object d(Object obj, Object obj2) {
        dfc dfcVarA = (dfc) obj;
        dfc dfcVar = (dfc) obj2;
        if (!dfcVar.isEmpty()) {
            if (!dfcVarA.b) {
                dfcVarA = dfcVarA.a();
            }
            dfcVarA.b();
            if (!dfcVar.isEmpty()) {
                dfcVarA.putAll(dfcVar);
            }
        }
        return dfcVarA;
    }

    public static final Object e() {
        return dfc.a.a();
    }

    public static deo f(Object obj, long j) {
        return (deo) dgf.f(obj, j);
    }

    public static final List g(Object obj, long j) {
        deo deoVarF = f(obj, j);
        if (deoVarF.c()) {
            return deoVarF;
        }
        int size = deoVarF.size();
        deo deoVarD = deoVarF.d(size == 0 ? 10 : size + size);
        dgf.r(obj, j, deoVarD);
        return deoVarD;
    }

    public static final float h(List list, Resources resources) {
        Iterator it = list.iterator();
        float dimension = 0.0f;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final djh i(djh djhVar, float f, float f2) {
        int i = 2;
        return djhVar.a(new dsb(new drz(f, i), new drz(f2, i), new drz(f, i), new drz(f2, i), 9));
    }

    public static /* synthetic */ djh j(djh djhVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return i(djhVar, f, f2);
    }

    public static /* synthetic */ djh k(djh djhVar, float f, float f2, float f3, float f4, int i) {
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        int i2 = 2;
        drz drzVar = new drz(f, i2);
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drz drzVar2 = new drz(f2, i2);
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        drz drzVar3 = new drz(f3, i2);
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return djhVar.a(new dsb(drzVar, drzVar2, drzVar3, new drz(f4, i2), 9));
    }

    public static final djh l(djh djhVar) {
        drz drzVar = new drz(8.0f, 2);
        return djhVar.a(new dsb(drzVar, drzVar, drzVar, drzVar, 9));
    }

    public static final void m(djh djhVar, int i, int i2, final yka ykaVar, bao baoVar, final int i3, final int i4) {
        int i5;
        final int i6;
        int i7 = i4 & 1;
        bao baoVarD = baoVar.d(-474572032);
        if (i7 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (true != baoVarD.F(djhVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i8 = i4 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= true != baoVarD.D(i) ? 16 : 32;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= true != baoVarD.D(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != baoVarD.H(ykaVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i5 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            i6 = i2;
        } else {
            if (i7 != 0) {
                djhVar = djh.b;
            }
            i &= i8 != 0 ? 0 : 1;
            int i10 = (i9 != 0 ? 0 : 1) & i2;
            baoVarD.y(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = drr.a;
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
            beb.a(baoVarD, djhVar, new diw(17));
            beb.a(baoVarD, new drm(i10), new diw(18));
            beb.a(baoVarD, new drn(i), new diw(19));
            ykaVar.a(drs.a, baoVarD, Integer.valueOf(((i5 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            baoVarD.o();
            basVar.aa();
            basVar.aa();
            i6 = i10;
        }
        final djh djhVar2 = djhVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            final int i11 = i;
            bcrVarM.d = new yjz() { // from class: drq
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djh djhVar3 = djhVar2;
                    int i12 = i11;
                    int i13 = i6;
                    cyf.m(djhVar3, i12, i13, ykaVar, (bao) obj, bdi.n(i3 | 1), i4);
                    return ygi.a;
                }
            };
        }
    }

    public static final void n(djh djhVar, dro droVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(227045628);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(droVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.y(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = drp.a;
                basVar.ae(objT);
            }
            basVar.aa();
            yjk yjkVar = (yjk) ((ymj) objT);
            int i5 = (i2 & 896) | 6;
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
            beb.a(baoVarD, djhVar, new diw(15));
            beb.a(baoVarD, droVar, new diw(i4));
            yjzVar.a(baoVarD, Integer.valueOf((((i5 & 896) | 6) >> 6) & 14));
            baoVarD.o();
            basVar.aa();
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(djhVar, droVar, yjzVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(android.widget.RemoteViews r17, defpackage.dmw r18, int r19, java.lang.String r20, defpackage.due r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyf.o(android.widget.RemoteViews, dmw, int, java.lang.String, due, int, int):void");
    }
}
