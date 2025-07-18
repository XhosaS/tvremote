package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vx {
    public vs a;
    public uv b;
    public boolean c;
    public bse d;
    public final yjk e;
    public boolean f;
    public qj j;
    public ybo k;
    private final vr m;
    public int g = 1;
    public vc h = vk.b;
    public final pku l = new pku(this);
    public final yjv i = new kb(this, 17);

    public vx(vs vsVar, qj qjVar, ybo yboVar, uv uvVar, boolean z, bse bseVar, vr vrVar, yjk yjkVar) {
        this.a = vsVar;
        this.j = qjVar;
        this.k = yboVar;
        this.b = uvVar;
        this.c = z;
        this.d = bseVar;
        this.m = vrVar;
        this.e = yjkVar;
    }

    public final float a(float f) {
        return this.c ? -f : f;
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.b == uv.b ? j >> 32 : j & 4294967295L));
    }

    public final long c(vc vcVar, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jB = this.d.b(j, i);
        long jAt = a.at(j, jB);
        long jD = d(f(vcVar.a(b(d(e(jAt))))));
        vr vrVar = this.m;
        if (vrVar.A) {
            ViewTreeObserver viewTreeObserver = ((cbc) fh.K(vrVar)).getViewTreeObserver();
            try {
                if (cbc.e == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    cbc.e = declaredMethod;
                }
                Method method = cbc.e;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return a.D(a.D(jB, jD), this.d.a(jD, a.at(jAt, jD), i));
    }

    public final long d(long j) {
        return this.c ? bmx.c(j, -1.0f) : j;
    }

    public final long e(long j) {
        return bmx.e(j, 0.0f, this.b == uv.b ? 1 : 2);
    }

    public final long f(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.b == uv.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r12, defpackage.yih r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.vt
            if (r0 == 0) goto L13
            r0 = r14
            vt r0 = (defpackage.vt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vt r0 = new vt
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            yle r12 = r0.d
            defpackage.ybn.f(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.ybn.f(r14)
            yle r7 = new yle
            r7.<init>()
            r7.a = r12
            r11.f = r4
            rv r14 = defpackage.rv.a     // Catch: java.lang.Throwable -> L65
            vv r5 = new vv     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r12 = r11.i(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r12 == r1) goto L62
            r12 = r7
        L58:
            r6.f = r3
            long r12 = r12.a
            cmm r14 = new cmm
            r14.<init>(r12)
            return r14
        L62:
            return r1
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r6 = r11
        L67:
            r12 = r0
        L68:
            r6.f = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.g(long, yih):java.lang.Object");
    }

    public final Object h(long j, boolean z, yih yihVar) {
        if (!z) {
            long jE = cmm.e(j, 0.0f, 0.0f, this.b == uv.b ? 1 : 2);
            vw vwVar = new vw(this, null);
            qj qjVar = this.j;
            if (qjVar == null || !j()) {
                Object objA = vwVar.a(new cmm(jE), yihVar);
                if (objA == yio.a) {
                    return objA;
                }
            } else {
                Object objF = qjVar.f(jE, vwVar, yihVar);
                if (objF == yio.a) {
                    return objF;
                }
            }
        }
        return ygi.a;
    }

    public final Object i(rv rvVar, yjz yjzVar, yih yihVar) {
        Object objD = this.a.d(rvVar, new uc(this, yjzVar, (yih) null, 3), yihVar);
        return objD == yio.a ? objD : ygi.a;
    }

    public final boolean j() {
        return this.a.i() || this.a.h();
    }

    public final boolean k() {
        return this.b == uv.a;
    }
}
