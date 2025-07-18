package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.videos.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivx {
    public final Object a;
    public final Object b;
    public Object c;

    public ivx(MediaRouter.RouteInfo routeInfo, String str) {
        this.a = routeInfo;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [itk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, lfn] */
    public final void a(Context context, Menu menu, MenuInflater menuInflater, yjv yjvVar) {
        context.getClass();
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.media_device_cast_menu, menu);
        this.c = new iui(this.b.cJ() ? new ContextThemeWrapper(context, R.style.Theme_GoogleTv_Light) : new ContextThemeWrapper(context, R.style.Theme_GoogleTv_Dark), this.a, yjvVar, null, 52);
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            ((iui) obj).a();
        }
    }

    public final boolean c(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_media_device_cast) {
            return false;
        }
        Object obj = this.c;
        if (obj == null) {
            return true;
        }
        ((iui) obj).i();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.yqe r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gbw
            if (r0 == 0) goto L13
            r0 = r6
            gbw r0 = (defpackage.gbw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gbw r0 = new gbw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yyk r5 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ybn.f(r6)
            java.lang.Object r6 = r4.b
            r0.a = r5
            r2 = r6
            yyk r2 = (defpackage.yyk) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 == r1) goto L5f
        L49:
            java.lang.Object r0 = r4.c     // Catch: java.lang.Throwable -> L58
            if (r5 != r0) goto L50
            r5 = 0
            r4.c = r5     // Catch: java.lang.Throwable -> L58
        L50:
            yyk r6 = (defpackage.yyk) r6
            r6.d()
            ygi r5 = defpackage.ygi.a
            return r5
        L58:
            r5 = move-exception
            yyk r6 = (defpackage.yyk) r6
            r6.d()
            throw r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivx.d(yqe, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r2.p(r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yqe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yqe r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.gbx
            if (r0 == 0) goto L13
            r0 = r10
            gbx r0 = (defpackage.gbx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gbx r0 = new gbx
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yyk r9 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r10)     // Catch: java.lang.Throwable -> L2e
            goto L7e
        L2e:
            r10 = move-exception
            goto L8e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yyk r9 = r0.d
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r10)
            r10 = r9
            r9 = r2
            goto L56
        L42:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r8.b
            r0.a = r9
            r2 = r10
            yyk r2 = (defpackage.yyk) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L94
        L56:
            java.lang.Object r2 = r8.c     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L5d
            r2.u()     // Catch: java.lang.Throwable -> L8a
        L5d:
            if (r2 == 0) goto L6b
            gbv r5 = new gbv     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = r8.a     // Catch: java.lang.Throwable -> L8a
            cb r6 = (defpackage.cb) r6     // Catch: java.lang.Throwable -> L8a
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8a
            r2.t(r5)     // Catch: java.lang.Throwable -> L8a
        L6b:
            if (r2 == 0) goto L7c
            r0.a = r9     // Catch: java.lang.Throwable -> L8a
            r5 = r10
            yyk r5 = (defpackage.yyk) r5     // Catch: java.lang.Throwable -> L8a
            r0.d = r5     // Catch: java.lang.Throwable -> L8a
            r0.c = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r2.p(r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r1) goto L94
        L7c:
            r0 = r9
            r9 = r10
        L7e:
            r8.c = r0     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            yyk r9 = (defpackage.yyk) r9
            r9.d()
            return r10
        L8a:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L8e:
            yyk r9 = (defpackage.yyk) r9
            r9.d()
            throw r10
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivx.e(yqe, yih):java.lang.Object");
    }

    public final String f() {
        if (!g()) {
            throw new NoSuchElementException();
        }
        Object obj = this.c;
        this.c = null;
        return (String) obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final boolean g() throws IOException {
        String strTrim;
        if (this.c != null) {
            return true;
        }
        ?? r0 = this.b;
        if (!r0.isEmpty()) {
            String str = (String) r0.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.a).readLine();
            this.c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public final Object h() {
        long jBL = a.bL();
        if (jBL == bhz.a) {
            return this.c;
        }
        eph ephVar = (eph) ((AtomicReference) this.b).get();
        int iA = ephVar.A(jBL);
        if (iA >= 0) {
            return ((Object[]) ephVar.c)[iA];
        }
        return null;
    }

    public final void i(Object obj) {
        long jBL = a.bL();
        if (jBL == bhz.a) {
            this.c = obj;
            return;
        }
        synchronized (this.a) {
            Object obj2 = this.b;
            eph ephVar = (eph) ((AtomicReference) obj2).get();
            int iA = ephVar.A(jBL);
            if (iA >= 0) {
                ((Object[]) ephVar.c)[iA] = obj;
                return;
            }
            int i = ephVar.a;
            Object obj3 = ephVar.c;
            int length = ((Object[]) obj3).length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (((Object[]) obj3)[i4] != null) {
                    i3++;
                }
            }
            int i5 = i3 + 1;
            long[] jArr = new long[i5];
            Object[] objArr = new Object[i5];
            if (i5 > 1) {
                int i6 = 0;
                while (true) {
                    if (i2 >= i5 || i6 >= i) {
                        break;
                    }
                    long j = ((long[]) ephVar.b)[i6];
                    Object obj4 = ((Object[]) obj3)[i6];
                    if (j > jBL) {
                        jArr[i2] = jBL;
                        objArr[i2] = obj;
                        i2++;
                        break;
                    } else {
                        if (obj4 != null) {
                            jArr[i2] = j;
                            objArr[i2] = obj4;
                            i2++;
                        }
                        i6++;
                    }
                }
                if (i6 == i) {
                    jArr[i3] = jBL;
                    objArr[i3] = obj;
                } else {
                    while (i2 < i5) {
                        long j2 = ((long[]) ephVar.b)[i6];
                        Object obj5 = ((Object[]) obj3)[i6];
                        if (obj5 != null) {
                            jArr[i2] = j2;
                            objArr[i2] = obj5;
                            i2++;
                        }
                        i6++;
                    }
                }
            } else {
                jArr[0] = jBL;
                objArr[0] = obj;
            }
            ((AtomicReference) obj2).set(new eph(i5, jArr, objArr));
        }
    }

    public final void j(dvc dvcVar) {
        Object obj = this.c;
        if (obj != null) {
            ((dws) obj).run();
        }
        dws dwsVar = new dws((dvl) this.a, dvcVar);
        this.c = dwsVar;
        ((Handler) this.b).postAtFrontOfQueue(dwsVar);
    }

    public ivx(itk itkVar, lfn lfnVar) {
        this.a = itkVar;
        this.b = lfnVar;
    }

    public ivx(Queue queue, BufferedReader bufferedReader) {
        this.b = queue;
        this.a = bufferedReader;
    }

    public ivx(byte[] bArr) {
        this.b = new zlj(null, null, null);
        this.a = new zlj(null, null, null);
        this.c = new coy[32];
    }

    public ivx(byte[] bArr, byte[] bArr2) {
        this.b = new nue(null, null, null);
        this.a = new nue(null, null, null);
        this.c = new ak[32];
    }

    public ivx() {
        this.b = new AtomicReference(bhy.a);
        this.a = new Object();
    }

    public ivx(cb cbVar) {
        this.a = cbVar;
        this.b = new yyk();
    }

    public ivx(dvk dvkVar) {
        this.a = new dvl(dvkVar);
        this.b = new Handler(Looper.getMainLooper());
    }

    public ivx(hfx hfxVar, irc ircVar) {
        this.a = hfxVar;
        this.b = ircVar;
        iai iaiVar = ial.a;
        this.c = ial.a;
    }
}
