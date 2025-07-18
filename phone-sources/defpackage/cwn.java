package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn {
    public static cyh a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        cyh cyhVarO = cyh.o(rootWindowInsets);
        cyhVarO.s(cyhVarO);
        cyhVarO.q(view.getRootView());
        return cyhVarO;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static void c(Window window, boolean z) {
        int i;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
            return;
        }
        View decorView2 = window.getDecorView();
        int systemUiVisibility2 = decorView2.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility2 & (-257);
            z2 = true;
        } else {
            i = systemUiVisibility2 | 256;
            z2 = false;
        }
        decorView2.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z2);
    }

    public static final File d(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static int e(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static int f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = s(r9, r10, r11)
            boolean r1 = s(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L77
            if (r0 != 0) goto Lf
            goto L77
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L76
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L76
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L76
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L76
        L43:
            if (r9 == r5) goto L76
            if (r9 != r4) goto L48
            goto L76
        L48:
            int r11 = f(r9, r10, r11)
            if (r9 == r5) goto L69
            if (r9 == r3) goto L64
            if (r9 == r4) goto L5f
            if (r9 != r1) goto L59
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L6d
        L59:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L5f:
            int r9 = r12.right
            int r10 = r10.right
            goto L6d
        L64:
            int r9 = r10.top
            int r10 = r12.top
            goto L6d
        L69:
            int r9 = r10.left
            int r10 = r12.left
        L6d:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L75
            return r6
        L75:
            return r2
        L76:
            return r6
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwn.h(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static final boolean j(djh djhVar) {
        return djhVar.d(new cjp(12));
    }

    public static final djh k(List list) {
        djh djhVarA;
        djf djfVar = djh.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            djh djhVar = (djh) it.next();
            if (djhVar != null && (djhVarA = djfVar.a(djhVar)) != null) {
                djfVar = djhVarA;
            }
        }
        return djfVar;
    }

    public static final Map l(djd djdVar) {
        yfw yfwVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : djdVar.d) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            diz dizVar = (diz) obj;
            djh djhVarB = dizVar.b();
            yfw yfwVar2 = djhVarB.d(abo.d) ? (yfw) djhVarB.b(new yfw(null, djh.b), dme.c) : new yfw(null, djhVarB);
            djp djpVar = (djp) yfwVar2.a;
            djh djhVar = (djh) yfwVar2.b;
            djo djoVar = djpVar != null ? djpVar.a : null;
            if (djoVar instanceof djt) {
                yfwVar = new yfw(djoVar, djhVar);
            } else {
                if (djoVar instanceof dmz) {
                    throw null;
                }
                yfwVar = new yfw(null, djhVar);
            }
            Object obj2 = yfwVar.b;
            djt djtVar = (djt) yfwVar.a;
            djh djhVar2 = (djh) obj2;
            if (djtVar != null && !(dizVar instanceof dkz) && !(dizVar instanceof djc)) {
                String str = djtVar.a + '+' + i;
                djt djtVar2 = new djt(str, djtVar.b);
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(djtVar2);
                dizVar.c(djhVar2.a(new djp(djtVar2)));
            }
            if (dizVar instanceof djd) {
                for (Map.Entry entry : l((djd) dizVar).entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str2, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static final void m(djd djdVar) {
        List<diz> list = djdVar.d;
        for (diz dizVar : list) {
            if (dizVar instanceof djd) {
                m((djd) dizVar);
            }
        }
        dry dryVar = (dry) djdVar.b().b(null, dme.d);
        if (((dryVar != null ? dryVar.a : duk.a) instanceof duk) && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dry dryVar2 = (dry) ((diz) it.next()).b().b(null, dme.f);
                if ((dryVar2 != null ? dryVar2.a : null) instanceof dui) {
                    djdVar.c(cyg.i(djdVar.b()));
                    break;
                }
            }
        }
        dsf dsfVar = (dsf) djdVar.b().b(null, dme.e);
        if (!((dsfVar != null ? dsfVar.a : duk.a) instanceof duk) || list.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dsf dsfVar2 = (dsf) ((diz) it2.next()).b().b(null, dme.g);
            if ((dsfVar2 != null ? dsfVar2.a : null) instanceof dui) {
                djdVar.c(cyg.k(djdVar.b()));
                return;
            }
        }
    }

    public static final void n(djd djdVar, yjv yjvVar) {
        List list = djdVar.d;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            Object objA = yjvVar.a((diz) obj);
            list.set(i, objA);
            if (objA instanceof djd) {
                n((djd) objA, yjvVar);
            }
            i = i2;
        }
    }

    public static final boolean o(diz dizVar) {
        if ((dizVar instanceof dla) || (dizVar instanceof dky) || (dizVar instanceof dku)) {
            return true;
        }
        return (dizVar instanceof dja) && Build.VERSION.SDK_INT >= 31;
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "MatchParent" : "Expand" : "Fixed" : "Wrap";
    }

    public static final void r(Context context, djz djzVar) {
        if ((djzVar instanceof djz) && cwk.s(djzVar)) {
            try {
                d(context, cwp.p(djzVar.a)).delete();
            } catch (Exception unused) {
                Objects.toString(djzVar);
            }
        }
    }

    private static boolean s(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(android.content.Context r8, int r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dmb
            if (r0 == 0) goto L13
            r0 = r10
            dmb r0 = (defpackage.dmb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dmb r0 = new dmb
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            java.lang.String r3 = "GlanceAppWidget"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            int r9 = r0.b
            java.lang.Object r8 = r0.a
            defpackage.ybn.f(r10)     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            goto L53
        L2d:
            r0 = move-exception
            r10 = r0
            goto L56
        L30:
            r0 = move-exception
            r10 = r0
            goto L62
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.ybn.f(r10)
            dts r10 = defpackage.dts.a     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            dtu r2 = defpackage.dtu.b     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            java.lang.String r5 = defpackage.cwp.p(r9)     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            r0.a = r8     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            r0.b = r9     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            r0.d = r4     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            java.lang.Object r10 = r10.a(r8, r2, r5, r0)     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            if (r10 != r1) goto L53
            return r1
        L53:
            dnv r10 = (defpackage.dnv) r10     // Catch: java.io.IOException -> L2d defpackage.dav -> L30
            goto L6f
        L56:
            java.lang.String r0 = "I/O error reading set of layout structures for App Widget id "
            java.lang.String r0 = defpackage.a.cf(r9, r0)
            android.util.Log.e(r3, r0, r10)
            dnv r10 = defpackage.dnv.DEFAULT_INSTANCE
            goto L6f
        L62:
            java.lang.String r0 = "Set of layout structures for App Widget id "
            java.lang.String r1 = " is corrupted"
            java.lang.String r0 = defpackage.a.cd(r9, r0, r1)
            android.util.Log.e(r3, r0, r10)
            dnv r10 = defpackage.dnv.DEFAULT_INSTANCE
        L6f:
            r4 = r9
            dpj<dnw> r9 = r10.layout_
            r0 = 10
            int r0 = defpackage.yfm.z(r9, r0)
            int r0 = defpackage.yfm.e(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 16
            int r0 = defpackage.ykn.j(r0, r2)
            r1.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L8b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r9.next()
            dnw r0 = (defpackage.dnw) r0
            dnx r2 = r0.layout_
            if (r2 != 0) goto L9d
            dnx r2 = defpackage.dnx.DEFAULT_INSTANCE
        L9d:
            int r0 = r0.layoutIndex_
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            yfw r0 = new yfw
            r0.<init>(r2, r3)
            java.lang.Object r2 = r0.a
            java.lang.Object r0 = r0.b
            r1.put(r2, r0)
            goto L8b
        Lb1:
            java.util.Map r2 = defpackage.yfm.m(r1)
            dmc r0 = new dmc
            int r3 = r10.nextIndex_
            java.util.Collection r9 = r2.values()
            java.util.Set r6 = defpackage.yfm.ap(r9)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwn.q(android.content.Context, int, yih):java.lang.Object");
    }
}
