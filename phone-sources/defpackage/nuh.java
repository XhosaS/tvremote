package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nuh {
    private static volatile nuh d;
    public int a;
    public final Object b;
    public final Object c;

    public nuh(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }

    public static nuh c(Context context) {
        if (d == null) {
            synchronized (nuh.class) {
                if (d == null) {
                    d = new nuh(context);
                }
            }
        }
        return d;
    }

    public static final float i(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    public static String v(String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    final synchronized nug a() {
        return (nug) this.c.peek();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized nug b() {
        ?? r0 = this.c;
        nug nugVar = (nug) r0.peek();
        if (nugVar != null) {
            int i = nugVar.b + 1;
            nugVar.b = i;
            if (i >= xeh.a.get().c((Context) this.b)) {
                return (nug) r0.poll();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    final synchronized boolean d(ntk ntkVar) {
        byte[] bArr = ntkVar.b;
        bArr.getClass();
        int length = bArr.length;
        ?? r1 = this.c;
        long size = r1.size();
        xeh xehVar = xeh.a;
        xei xeiVarA = xehVar.get();
        Object obj = this.b;
        if (size < xeiVarA.a((Context) obj)) {
            if (this.a + length < xehVar.get().b((Context) obj)) {
                r1.add(new nug(ntkVar));
                this.a += length;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    final synchronized void e() {
        nug nugVar = (nug) this.c.poll();
        if (nugVar != null) {
            byte[] bArr = ((ntk) nugVar.c).b;
            bArr.getClass();
            this.a -= bArr.length;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void f(iea ieaVar, ifc ifcVar) {
        this.c.add(new ifa(ieaVar, ifcVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void g(ids idsVar) {
        idsVar.getClass();
        this.b.add(idsVar);
    }

    public final void h(long j, float f) {
        int i = (this.a + 1) % 20;
        this.a = i;
        ((long[]) this.c)[i] = j;
        ((float[]) this.b)[i] = f;
    }

    public final Object j(int i) {
        SparseArray sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= ((SparseArray) this.b).keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (true) {
            int i3 = this.a;
            sparseArray = (SparseArray) this.b;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.a + 1)) {
                break;
            }
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }

    public final Object k() {
        return ((SparseArray) this.b).valueAt(r0.size() - 1);
    }

    public final boolean l() {
        return ((SparseArray) this.b).size() == 0;
    }

    public final void m(int i) {
        synchronized (this.c) {
            ((PriorityQueue) this.b).add(Integer.valueOf(i));
            this.a = Math.max(this.a, i);
        }
    }

    public final void n(int i) {
        Object obj = this.c;
        synchronized (obj) {
            while (this.a != i) {
                obj.wait();
            }
        }
    }

    public final void o(int i) {
        synchronized (this.c) {
            int i2 = this.a;
            if (i2 != i) {
                throw new eap(i, i2);
            }
        }
    }

    public final void p(int i) {
        int iIntValue;
        Object obj = this.c;
        synchronized (obj) {
            Object obj2 = this.b;
            ((PriorityQueue) obj2).remove(Integer.valueOf(i));
            if (((PriorityQueue) obj2).isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Integer num = (Integer) ((PriorityQueue) obj2).peek();
                String str = edt.a;
                iIntValue = num.intValue();
            }
            this.a = iIntValue;
            obj.notifyAll();
        }
    }

    public final boolean q() {
        return this.b != null;
    }

    public final boolean r() {
        Object obj;
        return this.b == null && (obj = this.c) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean s(int[] iArr) {
        if (!r()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.a) {
            return false;
        }
        this.a = colorForState;
        return true;
    }

    public final boolean t() {
        return q() || this.a != 0;
    }

    public final boolean u() {
        return ((LinkedHashMap) this.b).isEmpty();
    }

    public final void w(pjv pjvVar) {
        ((ntp) this.c).v(pjvVar);
    }

    public final void x(pjt pjtVar) {
        ((vty) this.b).bL(pjtVar.b, pjtVar.a);
    }

    public final pkg y() {
        sij.x(this.a != 0, "Semantic events must have a semantic ID.");
        vtw vtwVarM = ucy.a.m();
        int i = this.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ucy ucyVar = (ucy) vtwVarM.b;
        ucyVar.b |= 8;
        ucyVar.d = i;
        ucy ucyVar2 = (ucy) vtwVarM.r();
        Object obj = this.b;
        vtw vtwVar = (vtw) obj;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        pka pkaVar = (pka) ((vty) obj).b;
        pka pkaVar2 = pka.a;
        ucyVar2.getClass();
        pkaVar.d = ucyVar2;
        pkaVar.b |= 1;
        return new pkg((pka) vtwVar.r(), ((ntp) this.c).u(), (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void z(zuw zuwVar) {
        this.c.add(new iew(this.a, zuwVar));
        this.a++;
    }

    public nuh(String str, Locale locale) {
        this.b = str;
        this.c = locale;
    }

    private nuh(Context context) {
        this.a = 0;
        this.c = new ArrayDeque();
        this.b = context;
    }

    public nuh(char[] cArr) {
        this.c = new Object();
        this.b = new PriorityQueue(10, Collections.reverseOrder());
        this.a = Integer.MIN_VALUE;
    }

    public nuh(ecq ecqVar) {
        this.b = new SparseArray();
        this.c = ecqVar;
        this.a = -1;
    }

    public nuh(short[] sArr) {
        this.c = new ntp(2);
        this.b = (vty) pka.a.m();
    }

    public nuh(byte[] bArr) {
        long[] jArr = new long[20];
        this.c = jArr;
        this.b = new float[20];
        this.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public nuh(hni hniVar) {
        this.b = hww.a(150, new hnh(this, 1));
        this.c = hniVar;
    }

    public nuh() {
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.a = 0;
    }

    public nuh(int i) {
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.b = new Path();
    }

    public nuh(PackageManager packageManager) {
        this.b = new HashMap();
        this.a = 0;
        this.c = packageManager;
    }

    public nuh(Object obj, int i) {
        this.b = new LinkedHashMap();
        this.c = obj;
        this.a = i;
    }
}
