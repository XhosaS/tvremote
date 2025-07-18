package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eph {
    public final int a;
    public final Object b;
    public final Object c;

    public eph(int i, long[] jArr, Object[] objArr) {
        this.a = i;
        this.b = jArr;
        this.c = objArr;
    }

    private static float[] H(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        return fArr;
    }

    private static int[] I(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
        return iArr;
    }

    public final int A(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.b)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 <= j ? -1 : -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.b)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final int B(Object obj) {
        jz jzVar = (jz) this.b;
        int iA = jzVar.a(obj);
        if (iA >= 0) {
            return jzVar.c[iA];
        }
        return -1;
    }

    public final Object C(int i) {
        int i2 = i - this.a;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = (Object[]) this.c;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    final zih D(int i) throws IOException {
        boolean z;
        Object obj = this.b;
        if (obj instanceof zle) {
            ((zle) obj).a(false);
        }
        InputStream inputStream = (InputStream) obj;
        int iB = zis.b(inputStream, i);
        int i2 = this.a;
        if (iB == 3 || iB == 4 || iB == 16 || iB == 17) {
            z = true;
        } else if (iB == 8) {
            iB = 8;
            z = true;
        } else {
            z = false;
        }
        int iA = zis.a(inputStream, i2, z);
        if (iA < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            int i3 = i & 192;
            eph ephVar = new eph(new zle(inputStream, i2), i2, (byte[][]) this.c);
            if (i3 != 0) {
                return new zkg(i3, iB, ephVar);
            }
            if (iB == 3) {
                return new zjz(ephVar);
            }
            if (iB == 4) {
                return new zko(ephVar, 1);
            }
            if (iB == 8) {
                return new zke(ephVar, 2);
            }
            if (iB == 16) {
                return new zke(ephVar, 1);
            }
            if (iB == 17) {
                return new zke(ephVar, 0);
            }
            throw new zil("unknown BER object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
        }
        zlc zlcVar = new zlc(inputStream, iA, i2);
        if ((i & 224) == 0) {
            if (iB == 3) {
                return new zku(zlcVar);
            }
            if (iB == 4) {
                return new zko(zlcVar, 0);
            }
            if (iB == 8) {
                throw new zil("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iB == 16) {
                throw new zil("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iB == 17) {
                throw new zil("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return zis.e(iB, zlcVar, (byte[][]) this.c);
            } catch (IllegalArgumentException e) {
                throw new zil("corrupted stream detected", e);
            }
        }
        int i4 = i & 192;
        eph ephVar2 = new eph(zlcVar, zlcVar.d, (byte[][]) this.c);
        if (i4 != 0) {
            return new zlb(i4, iB, (i & 32) != 0, ephVar2);
        }
        if (iB == 3) {
            return new zjz(ephVar2);
        }
        if (iB == 4) {
            return new zko(ephVar2, 1);
        }
        if (iB == 8) {
            return new zke(ephVar2, 2);
        }
        if (iB == 16) {
            return new zke(ephVar2, 3);
        }
        if (iB == 17) {
            return new zke(ephVar2, 4);
        }
        throw new zil("unknown DL object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
    }

    public final zih E() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i < 0) {
            return null;
        }
        return D(i);
    }

    public final zii F() throws IOException {
        InputStream inputStream = (InputStream) this.b;
        int i = inputStream.read();
        if (i < 0) {
            return new zii(0);
        }
        zii ziiVar = new zii();
        do {
            zih zihVarD = D(i);
            if (zihVarD instanceof zld) {
                ziiVar.b(((zld) zihVarD).j());
            } else {
                ziiVar.b(zihVarD.p());
            }
            i = inputStream.read();
        } while (i >= 0);
        return ziiVar;
    }

    public final zjh G(int i, int i2) throws IOException {
        zii ziiVarF = F();
        int i3 = ziiVarF.c;
        if (i3 == 1) {
            return new zkf(3, i, i2, ziiVarF.a(0));
        }
        return new zkf(4, i, i2, i3 <= 0 ? zka.a : new zkc(ziiVarF));
    }

    public final void a(ecq ecqVar) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.b;
            edt.aB((Handler) epmVar.a, new eoy(ecqVar, obj, 9, null));
        }
    }

    public final void b(evv evvVar) {
        a(new ewf(this, evvVar, 1));
    }

    public final void c(evq evqVar, int i) {
        n(evqVar, i, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final void d(evq evqVar, evv evvVar) {
        a(new ewe(this, evqVar, evvVar, 0));
    }

    public final void e(evq evqVar, int i) {
        o(evqVar, i, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    public final void f(evq evqVar, evv evvVar) {
        a(new ewe(this, evqVar, evvVar, 1));
    }

    public final void g(evq evqVar, int i, IOException iOException, boolean z) {
        p(evqVar, i, -1, null, 0, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void h(final evq evqVar, final evv evvVar, final IOException iOException, final boolean z) {
        a(new ecq() { // from class: ewd
            @Override // defpackage.ecq
            public final void a(Object obj) {
                ((ewg) obj).j(0, (evz) this.e.c, evqVar, evvVar, iOException, z);
            }
        });
    }

    public final void i(evq evqVar, int i, int i2) {
        q(evqVar, i, -1, null, 0, -9223372036854775807L, -9223372036854775807L, i2);
    }

    public final void j(final evq evqVar, final evv evvVar, final int i) {
        a(new ecq() { // from class: ewc
            @Override // defpackage.ecq
            public final void a(Object obj) {
                ((ewg) obj).k(0, (evz) this.d.c, evqVar, evvVar, i);
            }
        });
    }

    public final void k(evv evvVar) {
        Object obj = this.c;
        obj.getClass();
        a(new ewf(obj, evvVar, 0));
    }

    public final void l(int i, long j, long j2) {
        k(new evv(1, i, null, 3, edt.F(j), edt.F(j2)));
    }

    public final void m(int i, dze dzeVar, int i2, long j) {
        b(new evv(1, i, dzeVar, i2, edt.F(j), -9223372036854775807L));
    }

    public final void n(evq evqVar, int i, int i2, dze dzeVar, int i3, long j, long j2) {
        d(evqVar, new evv(i, i2, dzeVar, i3, edt.F(j), edt.F(j2)));
    }

    public final void o(evq evqVar, int i, int i2, dze dzeVar, int i3, long j, long j2) {
        f(evqVar, new evv(i, i2, dzeVar, i3, edt.F(j), edt.F(j2)));
    }

    public final void p(evq evqVar, int i, int i2, dze dzeVar, int i3, long j, long j2, IOException iOException, boolean z) {
        h(evqVar, new evv(i, i2, dzeVar, i3, edt.F(j), edt.F(j2)), iOException, z);
    }

    public final void q(evq evqVar, int i, int i2, dze dzeVar, int i3, long j, long j2, int i4) {
        j(evqVar, new evv(i, i2, dzeVar, i3, edt.F(j), edt.F(j2)), i4);
    }

    public final eph r(evz evzVar) {
        return new eph((CopyOnWriteArrayList) this.b, evzVar);
    }

    public final void s(Handler handler, eoz eozVar) {
        ((CopyOnWriteArrayList) this.b).add(new epm(handler, eozVar, (byte[]) null));
    }

    public final void t() {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new eoy(this, obj, 3, null));
        }
    }

    public final void u() {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new eoy(this, obj, 0, null));
        }
    }

    public final void v() {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new eoy(this, obj, 2, null));
        }
    }

    public final void w(int i) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new fk(this, obj, i, 5, (byte[]) null));
        }
    }

    public final void x(Exception exc) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new bd(this, obj, exc, 6, (int[]) null));
        }
    }

    public final void y() {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            Object obj = epmVar.a;
            edt.aB((Handler) epmVar.b, new eoy(this, obj, 4, null));
        }
    }

    public final eph z(evz evzVar) {
        return new eph((CopyOnWriteArrayList) this.b, evzVar);
    }

    public eph(dze dzeVar, int i, String str) {
        this.c = dzeVar;
        this.a = i;
        this.b = str;
    }

    public eph(InputStream inputStream, int i, byte[][] bArr) {
        this.b = inputStream;
        this.a = i;
        this.c = bArr;
    }

    public eph(CopyOnWriteArrayList copyOnWriteArrayList, evz evzVar) {
        this.b = copyOnWriteArrayList;
        this.a = 0;
        this.c = evzVar;
    }

    public eph(byte[] bArr, String str, int i) {
        this.b = bArr;
        this.c = str;
        this.a = i;
    }

    public eph() {
        this(new CopyOnWriteArrayList(), (evz) null);
    }

    public eph(int i) {
        this.a = i;
        this.b = H(i);
        this.c = I(i);
    }

    public eph(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.b = colorStateList;
        this.c = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public eph(ymd ymdVar, aco acoVar) {
        ybo yboVarB = acoVar.b();
        int i = ymdVar.a;
        if (i < 0) {
            wv.d("negative nearestRange.first");
        }
        int iMin = Math.min(ymdVar.b, yboVarB.b - 1);
        if (iMin < i) {
            this.b = ka.a();
            this.c = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.c = new Object[i2];
        this.a = i;
        jz jzVar = new jz(i2);
        lot lotVar = new lot(i, iMin, jzVar, this, 1);
        if (i < 0 || i >= yboVarB.b) {
            wv.e("Index " + i + ", size " + yboVarB.b);
        }
        if (iMin < 0 || iMin >= yboVarB.b) {
            wv.e("Index " + iMin + ", size " + yboVarB.b);
        }
        if (iMin < i) {
            wv.c("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        bfz bfzVar = (bfz) yboVarB.a;
        int iG = d.g(bfzVar, i);
        int i3 = ((gb) bfzVar.a[iG]).a;
        while (i3 <= iMin) {
            gb gbVar = (gb) bfzVar.a[iG];
            lotVar.a(gbVar);
            i3 += gbVar.b;
            iG++;
        }
        this.b = jzVar;
    }

    public eph(byte[] bArr) {
        this(new CopyOnWriteArrayList(), (evz) null);
    }

    public eph(byte[] bArr, String str) {
        this(bArr, str, Integer.MIN_VALUE);
    }

    public eph(int i, float[] fArr, int[] iArr) {
        this.a = i;
        this.b = fArr == null ? H(i) : fArr;
        this.c = iArr == null ? I(i) : iArr;
    }
}
