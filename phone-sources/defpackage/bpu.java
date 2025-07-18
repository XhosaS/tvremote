package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpu {
    public final bpw a;
    public boolean g;
    public bpo h;
    public int i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    public bni o;
    public bni p;
    public tac r;
    private Outline t;
    private float v;
    private boe w;
    private RectF x;
    public clx b = bpp.a;
    public cmi c = cmi.a;
    public yjv d = lo.l;
    private final yjv s = new lk(this, 19);
    public boolean e = true;
    private long u = 0;
    public long f = 9205357640488583168L;
    public final xsn q = new xsn();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        yks.e(lowerCase, "robolectric");
    }

    public bpu(bpw bpwVar) {
        this.a = bpwVar;
        bpwVar.s(false);
        this.k = 0L;
        this.l = 0L;
        this.m = 9205357640488583168L;
    }

    private final Outline m() {
        Outline outline = this.t;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.t = outline2;
        return outline2;
    }

    private final void n() {
        this.i--;
        e();
    }

    private final void o() {
        this.w = null;
        this.o = null;
        this.f = 9205357640488583168L;
        this.u = 0L;
        this.v = 0.0f;
        this.e = true;
        this.g = false;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.f();
    }

    public final boe c() {
        boe bocVar;
        boe boeVar = this.w;
        bni bniVar = this.o;
        if (boeVar != null) {
            return boeVar;
        }
        if (bniVar != null) {
            bob bobVar = new bob(bniVar);
            this.w = bobVar;
            return bobVar;
        }
        long jY = clw.y(this.l);
        long j = this.u;
        long j2 = this.f;
        if (j2 != 9205357640488583168L) {
            jY = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jY & 4294967295L));
        if (this.v > 0.0f) {
            bocVar = new bod(d.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L)));
        } else {
            bocVar = new boc(new bmy(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.w = bocVar;
        return bocVar;
    }

    public final void d() {
        Outline outlineM;
        if (this.e) {
            boolean z = this.n;
            Outline outline = null;
            if (z || b() > 0.0f) {
                bni bniVar = this.o;
                if (bniVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    Path path = bniVar.a;
                    path.computeBounds(rectF, false);
                    if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
                        outlineM = m();
                        if (Build.VERSION.SDK_INT >= 30) {
                            outlineM.setPath(path);
                        } else {
                            outlineM.setConvexPath(path);
                        }
                        this.g = !outlineM.canClip();
                    } else {
                        Outline outline2 = this.t;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.g = true;
                        outlineM = null;
                    }
                    this.o = bniVar;
                    if (outlineM != null) {
                        outlineM.setAlpha(a());
                        outline = outlineM;
                    }
                    bpw bpwVar = this.a;
                    bpwVar.u(outline, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.g && this.n) {
                        bpwVar.s(false);
                        bpwVar.l();
                    } else {
                        bpwVar.s(this.n);
                    }
                } else {
                    bpw bpwVar2 = this.a;
                    bpwVar2.s(z);
                    Outline outlineM2 = m();
                    long jY = clw.y(this.l);
                    long j = this.u;
                    long j2 = this.f;
                    if (j2 != 9205357640488583168L) {
                        jY = j2;
                    }
                    long j3 = jY & 4294967295L;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineM2.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (jY >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) j3)), this.v);
                    outlineM2.setAlpha(a());
                    bpwVar2.u(outlineM2, (Math.round(Float.intBitsToFloat(r14)) & 4294967295L) | (Math.round(Float.intBitsToFloat(r9)) << 32));
                }
            } else {
                bpw bpwVar3 = this.a;
                bpwVar3.s(false);
                bpwVar3.u(null, 0L);
            }
        }
        this.e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.j
            if (r1 == 0) goto L6b
            int r1 = r0.i
            if (r1 != 0) goto L6b
            xsn r1 = r0.q
            java.lang.Object r2 = r1.d
            if (r2 == 0) goto L18
            bpu r2 = (defpackage.bpu) r2
            r2.n()
            r2 = 0
            r1.d = r2
        L18:
            java.lang.Object r1 = r1.b
            if (r1 == 0) goto L66
            kk r1 = (defpackage.kk) r1
            java.lang.Object[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L63
            r5 = 0
            r6 = r5
        L29:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5e
            int r9 = r6 - r4
            r10 = r5
        L3c:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L58
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            bpu r11 = (defpackage.bpu) r11
            r11.n()
        L58:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3c
        L5c:
            if (r11 != r12) goto L63
        L5e:
            if (r6 == r4) goto L63
            int r6 = r6 + 1
            goto L29
        L63:
            r1.d()
        L66:
            bpw r1 = r0.a
            r1.l()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpu.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.bpq r18) {
        /*
            r17 = this;
            r0 = r17
            xsn r1 = r0.q
            java.lang.Object r2 = r1.d
            r1.e = r2
            java.lang.Object r2 = r1.b
            if (r2 == 0) goto L2a
            kk r2 = (defpackage.kk) r2
            boolean r3 = r2.c()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.c
            if (r3 != 0) goto L22
            int r3 = defpackage.kl.a
            kk r3 = new kk
            r4 = 0
            r3.<init>(r4)
            r1.c = r3
        L22:
            kk r3 = (defpackage.kk) r3
            r3.f(r2)
            r2.d()
        L2a:
            r2 = 1
            r1.a = r2
            yjv r2 = r0.d
            r3 = r18
            r2.a(r3)
            r2 = 0
            r1.a = r2
            java.lang.Object r3 = r1.e
            if (r3 == 0) goto L40
            bpu r3 = (defpackage.bpu) r3
            r3.n()
        L40:
            java.lang.Object r1 = r1.c
            if (r1 == 0) goto L93
            kk r1 = (defpackage.kk) r1
            boolean r3 = r1.c()
            if (r3 == 0) goto L93
            java.lang.Object[] r3 = r1.b
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r6 = r2
        L56:
            r7 = r4[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L8b
            int r9 = r6 - r5
            r10 = r2
        L69:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L89
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L85
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            bpu r11 = (defpackage.bpu) r11
            r11.n()
        L85:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L69
        L89:
            if (r11 != r12) goto L90
        L8b:
            if (r6 == r5) goto L90
            int r6 = r6 + 1
            goto L56
        L90:
            r1.d()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpu.f(bpq):void");
    }

    public final void g() {
        this.a.n(this.b, this.c, this, this.s);
    }

    public final void h(float f) {
        bpw bpwVar = this.a;
        if (bpwVar.a() == f) {
            return;
        }
        bpwVar.o(f);
    }

    public final void i(long j) {
        if (a.s(this.m, j)) {
            return;
        }
        this.m = j;
        this.a.v(j);
    }

    public final void j(long j, long j2) {
        this.a.w(cmf.a(j), cmf.b(j), j2);
    }

    public final void k(long j, long j2, float f) {
        if (a.s(this.u, j) && a.s(this.f, j2) && this.v == f && this.o == null) {
            return;
        }
        o();
        this.u = j;
        this.f = j2;
        this.v = f;
        d();
    }

    public final void l(bni bniVar) {
        o();
        this.o = bniVar;
        d();
    }
}
