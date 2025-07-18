package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blj implements View.OnAttachStateChangeListener, duv {
    public final cbc a;
    public boolean d;
    public dhk h;
    private final yjk i;
    private long m;
    private dhk n;
    private final List j = new ArrayList();
    public int g = 1;
    public boolean b = true;
    private final yrz k = vyf.R(1, 0, 6);
    public final Handler c = new Handler(Looper.getMainLooper());
    private jc l = jd.a();
    public final jc f = new jc((byte[]) null);
    public final Runnable e = new Runnable() { // from class: blh
        @Override // java.lang.Runnable
        public final void run() {
            char c;
            long j;
            long j2;
            long j3;
            jc jcVar;
            int[] iArr;
            long[] jArr;
            jc jcVar2;
            int[] iArr2;
            long[] jArr2;
            long j4;
            int i;
            int i2;
            long[] jArr3;
            long j5;
            char c2;
            long j6;
            blj bljVar = this.a;
            if (bljVar.i()) {
                Trace.beginSection("ContentCapture:changeChecker");
                try {
                    cbc cbcVar = bljVar.a;
                    cbcVar.q(true);
                    jc jcVar3 = bljVar.f;
                    int[] iArr3 = jcVar3.b;
                    long[] jArr4 = jcVar3.a;
                    int length = jArr4.length - 2;
                    char c3 = 7;
                    long j7 = -9187201950435737472L;
                    int i3 = 8;
                    if (length >= 0) {
                        int i4 = 0;
                        j2 = 128;
                        while (true) {
                            long j8 = jArr4[i4];
                            j3 = 255;
                            if ((((~j8) << c3) & j8 & j7) != j7) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j8 & 255) < 128) {
                                        c2 = c3;
                                        int i7 = iArr3[(i4 << 3) + i6];
                                        j6 = j7;
                                        if (!bljVar.a().b(i7)) {
                                            bljVar.c(i7);
                                            bljVar.d();
                                        }
                                    } else {
                                        c2 = c3;
                                        j6 = j7;
                                    }
                                    j8 >>= 8;
                                    i6++;
                                    c3 = c2;
                                    j7 = j6;
                                }
                                c = c3;
                                j = j7;
                                if (i5 != 8) {
                                    break;
                                }
                            } else {
                                c = c3;
                                j = j7;
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                            c3 = c;
                            j7 = j;
                        }
                    } else {
                        c = 7;
                        j = -9187201950435737472L;
                        j2 = 128;
                        j3 = 255;
                    }
                    Trace.beginSection("ContentCapture:sendAppearEvents");
                    bljVar.m(cbcVar.U.e(), bljVar.h);
                    Trace.endSection();
                    jc jcVarA = bljVar.a();
                    int[] iArr4 = jcVarA.b;
                    long[] jArr5 = jcVarA.a;
                    int length2 = jArr5.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j9 = jArr5[i8];
                            if ((((~j9) << c) & j9 & j) != j) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j9 & j3) < j2) {
                                        int i11 = iArr4[(i8 << 3) + i10];
                                        dhk dhkVar = (dhk) bljVar.f.a(i11);
                                        dhk dhkVar2 = (dhk) jcVarA.a(i11);
                                        Object obj = dhkVar2 != null ? dhkVar2.b : null;
                                        if (obj == null) {
                                            bty.a("no value for specified key");
                                            throw new yfs();
                                        }
                                        if (dhkVar == null) {
                                            cfc cfcVar = ((cff) obj).c;
                                            ki kiVar = cfcVar.c;
                                            Object[] objArr = kiVar.b;
                                            long[] jArr6 = kiVar.a;
                                            int i12 = i3;
                                            int length3 = jArr6.length - 2;
                                            jcVar2 = jcVarA;
                                            iArr2 = iArr4;
                                            if (length3 >= 0) {
                                                int i13 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i13];
                                                    j4 = j9;
                                                    if ((((~j10) << c) & j10 & j) != j) {
                                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                        for (int i15 = 0; i15 < i14; i15++) {
                                                            if ((j10 & j3) < j2) {
                                                                j5 = j10;
                                                                cfm cfmVar = (cfm) objArr[(i13 << 3) + i15];
                                                                cfm cfmVar2 = cfi.A;
                                                                if (yks.e(cfmVar, cfmVar2)) {
                                                                    List list = (List) ccf.t(cfcVar, cfmVar2);
                                                                    bljVar.g(((cff) obj).e, String.valueOf(list != null ? (cfy) yfm.U(list) : null));
                                                                }
                                                            } else {
                                                                j5 = j10;
                                                            }
                                                            j10 = j5 >> i12;
                                                        }
                                                        i = i12;
                                                        if (i14 != i) {
                                                            jArr2 = jArr5;
                                                            break;
                                                        }
                                                    }
                                                    if (i13 == length3) {
                                                        break;
                                                    }
                                                    i13++;
                                                    j9 = j4;
                                                    i12 = 8;
                                                }
                                            } else {
                                                j4 = j9;
                                            }
                                            jArr2 = jArr5;
                                        } else {
                                            jcVar2 = jcVarA;
                                            iArr2 = iArr4;
                                            j4 = j9;
                                            cfc cfcVar2 = ((cff) obj).c;
                                            ki kiVar2 = cfcVar2.c;
                                            Object[] objArr2 = kiVar2.b;
                                            long[] jArr7 = kiVar2.a;
                                            int length4 = jArr7.length - 2;
                                            if (length4 >= 0) {
                                                int i16 = 0;
                                                while (true) {
                                                    long j11 = jArr7[i16];
                                                    long[] jArr8 = jArr7;
                                                    Object[] objArr3 = objArr2;
                                                    if ((((~j11) << c) & j11 & j) != j) {
                                                        int i17 = 8 - ((~(i16 - length4)) >>> 31);
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            if ((j11 & j3) < j2) {
                                                                i2 = i18;
                                                                cfm cfmVar3 = (cfm) objArr3[(i16 << 3) + i18];
                                                                jArr3 = jArr5;
                                                                cfm cfmVar4 = cfi.A;
                                                                if (yks.e(cfmVar3, cfmVar4)) {
                                                                    List list2 = (List) ccf.t((cfc) dhkVar.a, cfmVar4);
                                                                    cfy cfyVar = list2 != null ? (cfy) yfm.U(list2) : null;
                                                                    List list3 = (List) ccf.t(cfcVar2, cfmVar4);
                                                                    cfy cfyVar2 = list3 != null ? (cfy) yfm.U(list3) : null;
                                                                    if (!yks.e(cfyVar, cfyVar2)) {
                                                                        bljVar.g(((cff) obj).e, String.valueOf(cfyVar2));
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = i18;
                                                                jArr3 = jArr5;
                                                            }
                                                            j11 >>= 8;
                                                            i18 = i2 + 1;
                                                            jArr5 = jArr3;
                                                        }
                                                        jArr2 = jArr5;
                                                        if (i17 != 8) {
                                                            i = 8;
                                                            break;
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                    }
                                                    if (i16 == length4) {
                                                        break;
                                                    }
                                                    i16++;
                                                    objArr2 = objArr3;
                                                    jArr7 = jArr8;
                                                    jArr5 = jArr2;
                                                }
                                            } else {
                                                jArr2 = jArr5;
                                            }
                                        }
                                        i = 8;
                                    } else {
                                        jcVar2 = jcVarA;
                                        iArr2 = iArr4;
                                        jArr2 = jArr5;
                                        j4 = j9;
                                        i = i3;
                                    }
                                    j9 = j4 >> i;
                                    i10++;
                                    i3 = i;
                                    jcVarA = jcVar2;
                                    iArr4 = iArr2;
                                    jArr5 = jArr2;
                                }
                                jcVar = jcVarA;
                                iArr = iArr4;
                                jArr = jArr5;
                                if (i9 != i3) {
                                    break;
                                }
                            } else {
                                jcVar = jcVarA;
                                iArr = iArr4;
                                jArr = jArr5;
                            }
                            if (i8 == length2) {
                                break;
                            }
                            i8++;
                            jcVarA = jcVar;
                            iArr4 = iArr;
                            jArr5 = jArr;
                            i3 = 8;
                        }
                    }
                    jc jcVar4 = bljVar.f;
                    jcVar4.e();
                    jc jcVarA2 = bljVar.a();
                    int[] iArr5 = jcVarA2.b;
                    Object[] objArr4 = jcVarA2.c;
                    long[] jArr9 = jcVarA2.a;
                    int length5 = jArr9.length - 2;
                    if (length5 >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j12 = jArr9[i19];
                            if ((((~j12) << c) & j12 & j) != j) {
                                int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                for (int i21 = 0; i21 < i20; i21++) {
                                    if ((j12 & j3) < j2) {
                                        int i22 = (i19 << 3) + i21;
                                        jcVar4.f(iArr5[i22], new dhk((cff) ((dhk) objArr4[i22]).b, bljVar.a()));
                                    }
                                    j12 >>= 8;
                                }
                                if (i20 != 8) {
                                    break;
                                }
                            }
                            if (i19 == length5) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    bljVar.h = new dhk(bljVar.a.U.e(), bljVar.a());
                    bljVar.d = false;
                } catch (Throwable th) {
                    throw th;
                } finally {
                    Trace.endSection();
                }
            }
        }
    };

    public blj(cbc cbcVar, yjk yjkVar) {
        this.a = cbcVar;
        this.i = yjkVar;
        this.h = new dhk(cbcVar.U.e(), jd.a());
    }

    private final void n(cff cffVar, yjz yjzVar) {
        List listJ = cffVar.j();
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (a().b(((cff) obj).e)) {
                yjzVar.a(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void o() {
        dhk dhkVar = this.n;
        if (dhkVar != null && Build.VERSION.SDK_INT >= 29) {
            List list = this.j;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                blk blkVar = (blk) list.get(i);
                if (blkVar.b - 1 != 0) {
                    AutofillId autofillIdC = dhkVar.c(blkVar.a);
                    if (autofillIdC != null && Build.VERSION.SDK_INT >= 29) {
                        abh$$ExternalSyntheticApiModelOutline0.m23m(dhkVar.a).notifyViewDisappeared(autofillIdC);
                    }
                } else {
                    cvw cvwVar = blkVar.c;
                    if (cvwVar != null && Build.VERSION.SDK_INT >= 29) {
                        abh$$ExternalSyntheticApiModelOutline0.m23m(dhkVar.a).notifyViewAppeared((ViewStructure) cvwVar.a);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Object obj = dhkVar.a;
                cvw cvwVarX = cbp.x((View) dhkVar.b);
                cvwVarX.getClass();
                abh$$ExternalSyntheticApiModelOutline0.m23m(obj).notifyViewsDisappeared(bb$$ExternalSyntheticApiModelOutline1.m(cvwVarX.a), new long[]{Long.MIN_VALUE});
            }
            list.clear();
        }
    }

    private final void p(cff cffVar) {
        if (i()) {
            c(cffVar.e);
            List listJ = cffVar.j();
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                p((cff) listJ.get(i));
            }
        }
    }

    public final jc a() {
        if (this.b) {
            this.b = false;
            this.l = cfg.c(this.a.U);
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0078 -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bli
            if (r0 == 0) goto L13
            r0 = r8
            bli r0 = (defpackage.bli) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bli r0 = new bli
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yrr r2 = r0.d
            defpackage.ybn.f(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yrr r2 = r0.d
            defpackage.ybn.f(r8)
            goto L4d
        L3a:
            defpackage.ybn.f(r8)
            yrz r8 = r7.k
            yrr r2 = r8.C()
        L43:
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L7e
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            r2.b()
            boolean r8 = r7.i()
            if (r8 == 0) goto L61
            r7.o()
        L61:
            boolean r8 = r7.d
            if (r8 != 0) goto L6e
            r7.d = r4
            android.os.Handler r8 = r7.c
            java.lang.Runnable r5 = r7.e
            r8.post(r5)
        L6e:
            r0.d = r2
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = defpackage.yoz.f(r5, r0)
            if (r8 != r1) goto L43
            goto L7e
        L7b:
            ygi r8 = defpackage.ygi.a
            return r8
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blj.b(yih):java.lang.Object");
    }

    public final void c(int i) {
        this.j.add(new blk(i, this.m, 2, null));
    }

    public final void d() {
        this.k.b(ygi.a);
    }

    @Override // defpackage.duv
    public final void f(dvk dvkVar) {
        this.n = (dhk) this.i.a();
        h(-1, this.a.U.e());
        o();
    }

    public final void g(int i, String str) {
        dhk dhkVar;
        if (Build.VERSION.SDK_INT >= 29 && (dhkVar = this.n) != null) {
            AutofillId autofillIdC = dhkVar.c(i);
            if (autofillIdC == null) {
                bty.a("Invalid content capture ID");
                throw new yfs();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                abh$$ExternalSyntheticApiModelOutline0.m23m(dhkVar.a).notifyViewTextChanged(autofillIdC, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r18, defpackage.cff r19) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blj.h(int, cff):void");
    }

    public final boolean i() {
        return this.n != null;
    }

    @Override // defpackage.duv
    public final void l() {
        p(this.a.U.e());
        o();
        this.n = null;
    }

    public final void m(cff cffVar, dhk dhkVar) {
        n(cffVar, new bvo(dhkVar, this, 1, null));
        List listJ = cffVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cff cffVar2 = (cff) listJ.get(i);
            jc jcVarA = a();
            int i2 = cffVar2.e;
            if (jcVarA.b(i2)) {
                jc jcVar = this.f;
                if (jcVar.b(i2)) {
                    Object objA = jcVar.a(i2);
                    if (objA == null) {
                        bty.a("node not present in pruned tree before this change");
                        throw new yfs();
                    }
                    m(cffVar2, (dhk) objA);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.removeCallbacks(this.e);
        this.n = null;
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
