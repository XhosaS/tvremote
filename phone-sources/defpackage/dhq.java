package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.widget.TextView;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhq {
    public final Object a;

    public dhq(Object obj) {
        this.a = obj;
    }

    public static final String a(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public static dhq u(edi ediVar) {
        String str;
        ediVar.L(2);
        int iJ = ediVar.j();
        int i = iJ >> 1;
        int i2 = iJ & 1;
        int iJ2 = ediVar.j() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = iJ2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new dhq(sb.toString());
    }

    public final void A(ele eleVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ft ftVar = (ft) it.next();
            if (ftVar.a == eleVar) {
                ftVar.b = true;
                copyOnWriteArrayList.remove(ftVar);
            }
        }
    }

    public final void B() {
        ((SparseArray) this.a).clear();
    }

    public final gze C() {
        return ((gze[]) this.a)[0];
    }

    public final ead D(fdq fdqVar, fki fkiVar) {
        ead eadVarC = null;
        int i = 0;
        while (true) {
            try {
                Object obj = this.a;
                fdqVar.i(((edi) obj).a, 0, 10);
                edi ediVar = (edi) obj;
                ediVar.K(0);
                if (ediVar.l() != 4801587) {
                    break;
                }
                ediVar.L(3);
                int i2 = ediVar.i();
                int i3 = i2 + 10;
                if (eadVarC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(ediVar.a, 0, bArr, 0, 10);
                    fdqVar.i(bArr, 10, i2);
                    eadVarC = new fgh(fkiVar).c(bArr, i3);
                } else {
                    fdqVar.g(i2);
                }
                i += i3;
            } catch (EOFException unused) {
            }
        }
        fdqVar.k();
        fdqVar.g(i);
        return eadVarC;
    }

    public final void b(int i, boolean z) {
        ((dot) this.a).k(i, z);
    }

    public final void c(int i, dol dolVar) {
        ((dot) this.a).l(i, dolVar);
    }

    public final void d(int i, double d) {
        ((dot) this.a).ab(i, d);
    }

    public final void e(int i, int i2) {
        ((dot) this.a).q(i, i2);
    }

    public final void f(int i, int i2) {
        ((dot) this.a).m(i, i2);
    }

    public final void g(int i, long j) {
        ((dot) this.a).o(i, j);
    }

    public final void h(int i, float f) {
        ((dot) this.a).ad(i, f);
    }

    public final void i(int i, Object obj, dqk dqkVar) {
        dot dotVar = (dot) this.a;
        dotVar.x(i, 3);
        dqkVar.i((dqa) obj, dotVar.f);
        dotVar.x(i, 4);
    }

    public final void j(int i, int i2) {
        ((dot) this.a).q(i, i2);
    }

    public final void k(int i, long j) {
        ((dot) this.a).A(i, j);
    }

    public final void l(int i, Object obj, dqk dqkVar) {
        ((dot) this.a).s(i, (dqa) obj, dqkVar);
    }

    public final void m(int i, int i2) {
        ((dot) this.a).m(i, i2);
    }

    public final void n(int i, long j) {
        ((dot) this.a).o(i, j);
    }

    public final void o(int i, int i2) {
        ((dot) this.a).af(i, i2);
    }

    public final void p(int i, long j) {
        ((dot) this.a).ah(i, j);
    }

    public final void q(int i, int i2) {
        ((dot) this.a).y(i, i2);
    }

    public final void r(int i, long j) {
        ((dot) this.a).A(i, j);
    }

    public final eke[] s() {
        ekc[] ekcVarArr = (ekc[]) this.a;
        eke[] ekeVarArr = new eke[ekcVarArr.length];
        for (int i = 0; i < ekcVarArr.length; i++) {
            ekeVarArr[i] = ekcVarArr[i].k();
        }
        return ekeVarArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Object t(cyg cygVar) {
        Object obj = this.a.get(cygVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void v(fdg fdgVar) {
        long[] jArr = fdgVar.e;
        if (jArr.length > 0) {
            ?? r1 = this.a;
            if (r1.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            r1.put(Long.valueOf(jArr[0]), fdgVar);
        }
    }

    public final int w() {
        return ((gze[]) this.a).length;
    }

    public final ebn x(Context context, dyt dytVar, dyw dywVar, fbr fbrVar, Executor executor, ebj ebjVar, List list) {
        try {
            return ((dhq) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(ebl.class).newInstance(this.a)).x(context, dytVar, dywVar, fbrVar, executor, ebjVar, list);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public final void y(int i, long j, long j2) {
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            ft ftVar = (ft) it.next();
            if (!ftVar.b) {
                ((Handler) ftVar.c).post(new ezl(ftVar, i, j, j2, 0));
            }
        }
    }

    public final void z(Handler handler, ele eleVar) {
        eleVar.getClass();
        A(eleVar);
        ((CopyOnWriteArrayList) this.a).add(new ft(handler, eleVar));
    }

    public dhq(TextView textView) {
        crl.k(textView, "textView cannot be null");
        this.a = new dhp(textView);
    }

    public dhq(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq() {
        this.a = new LinkedHashMap();
    }

    public dhq(yfo yfoVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(dot dotVar) {
        byte[] bArr = dpk.b;
        this.a = dotVar;
        dotVar.f = this;
    }

    public dhq(yfo yfoVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(yfo yfoVar, short[] sArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public dhq(yfo yfoVar, char[] cArr, char[] cArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(ekc[] ekcVarArr) {
        this.a = (ekc[]) Arrays.copyOf(ekcVarArr, ekcVarArr.length);
        for (int i = 0; i < ekcVarArr.length; i++) {
            ((ekc[]) this.a)[i].t(i, elk.a, edl.a);
        }
    }

    public dhq(yfo yfoVar, byte[] bArr, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new SparseArray();
    }

    public dhq(yfo yfoVar, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new CopyOnWriteArrayList();
    }

    public dhq(yfo yfoVar, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(char[] cArr, byte[] bArr) {
        this.a = new fbp();
    }

    public dhq(yfo yfoVar, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashMap();
    }

    public dhq(yfo yfoVar, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(char[] cArr) {
        this.a = new edi(10);
    }

    public dhq(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public dhq(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }
}
