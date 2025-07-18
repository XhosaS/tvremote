package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxk {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public zxk(byte[] bArr) {
    }

    private static void h(zxj[] zxjVarArr, int i, int i2) {
        zxj zxjVar = zxjVarArr[i];
        zxjVarArr[i] = zxjVarArr[i2];
        zxjVarArr[i2] = zxjVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final zcj a() {
        Map mapUnmodifiableMap;
        Object obj = this.d;
        if (obj == null) {
            throw new IllegalStateException("url == null");
        }
        Object obj2 = this.a;
        zcc zccVarT = ((upq) this.c).t();
        ?? r3 = this.b;
        byte[] bArr = zcr.a;
        r3.getClass();
        if (r3.isEmpty()) {
            mapUnmodifiableMap = yhc.a;
        } else {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap((Map) r3));
            mapUnmodifiableMap.getClass();
        }
        return new zcj((zce) obj, (String) obj2, zccVarT, mapUnmodifiableMap);
    }

    public final void b(zbm zbmVar) {
        zbmVar.getClass();
        String string = zbmVar.toString();
        if (string.length() == 0) {
            e("Cache-Control");
        } else {
            c("Cache-Control", string);
        }
    }

    public final void c(String str, String str2) {
        ((upq) this.c).w(str, str2);
    }

    public final void d(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (yks.e(str, "POST") || yks.e(str, "PUT") || yks.e(str, "PATCH") || yks.e(str, "PROPPATCH") || yks.e(str, "REPORT")) {
            throw new IllegalArgumentException(a.cg(str, "method ", " must have a request body."));
        }
        this.a = str;
    }

    public final void e(String str) {
        ((upq) this.c).x(str);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xri] */
    public final xra f() {
        this.d.getClass();
        this.a.getClass();
        this.c.getClass();
        sij.x(true, "at least one of channelRef and subchannelRef must be null");
        Object obj = this.d;
        return new xra((String) obj, (xqz) this.a, ((Long) this.c).longValue(), this.b);
    }

    public final void g(long j) {
        this.c = Long.valueOf(j);
    }

    public zxk() {
        this.b = new LinkedHashMap();
        this.a = "GET";
        this.c = new upq((byte[]) null, (byte[]) null);
    }

    public zxk(zcj zcjVar) {
        Object objM;
        this.b = new LinkedHashMap();
        this.d = zcjVar.a;
        this.a = zcjVar.b;
        if (zcjVar.d.isEmpty()) {
            objM = new LinkedHashMap();
        } else {
            objM = yfm.m(zcjVar.d);
        }
        this.b = objM;
        this.c = zcjVar.c.f();
    }

    public zxk(zxf zxfVar, zxj zxjVar) {
        int i;
        int iB;
        int[] iArr;
        this.a = zxfVar;
        this.b = zxjVar;
        int iC = zxjVar.c();
        this.c = new zxj[iC];
        int i2 = 0;
        while (true) {
            i = iC >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3 + 1];
            iArr2[i3] = 1;
            ((zxj[]) this.c)[i2] = new zxj((zxf) this.a, iArr2);
            i2++;
        }
        while (i < iC) {
            int i4 = i + i;
            int[] iArr3 = new int[i4 + 1];
            iArr3[i4] = 1;
            zxj zxjVar2 = new zxj((zxf) this.a, iArr3);
            Object obj = this.c;
            Object obj2 = this.b;
            int[] iArr4 = zxjVar2.c;
            int[] iArr5 = ((zxj) obj2).c;
            int iA = zxj.a(iArr5);
            if (iA != -1) {
                int length = iArr4.length;
                int[] iArrI = new int[length];
                int iA2 = zxjVar2.a.a(zxj.d(iArr5));
                System.arraycopy(iArr4, 0, iArrI, 0, length);
                while (iA <= zxj.a(iArrI)) {
                    int iB2 = zxjVar2.a.b(zxj.d(iArrI), iA2);
                    int iA3 = zxj.a(iArrI) - iA;
                    int iA4 = zxj.a(iArr5);
                    if (iA4 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr6 = new int[iA4 + iA3 + 1];
                        System.arraycopy(iArr5, 0, iArr6, iA3, iA4 + 1);
                        iArr = iArr6;
                    }
                    iArrI = zxj.i(zxjVar2.h(iArr, iB2), iArrI);
                }
                ((zxj[]) obj)[i] = new zxj(zxjVar2.a, iArrI);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int iC2 = ((zxj) this.b).c();
        zxj[] zxjVarArr = new zxj[iC2];
        int i5 = iC2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            zxjVarArr[i6] = new zxj(((zxj[]) this.c)[i6]);
        }
        this.d = new zxj[iC2];
        while (i5 >= 0) {
            ((zxj[]) this.d)[i5] = new zxj((zxf) this.a, i5);
            i5--;
        }
        int i7 = 0;
        while (i7 < iC2) {
            int i8 = i7 + 1;
            if (zxjVarArr[i7].b(i7) == 0) {
                boolean z = false;
                int i9 = i8;
                while (i9 < iC2) {
                    if (zxjVarArr[i9].b(i7) != 0) {
                        h(zxjVarArr, i7, i9);
                        h((zxj[]) this.d, i7, i9);
                        i9 = iC2;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iA5 = ((zxf) this.a).a(zxjVarArr[i7].b(i7));
            zxjVarArr[i7].g(iA5);
            ((zxj[]) this.d)[i7].g(iA5);
            for (int i10 = 0; i10 < iC2; i10++) {
                if (i10 != i7 && (iB = zxjVarArr[i10].b(i7)) != 0) {
                    zxj zxjVarE = zxjVarArr[i7].e(iB);
                    zxj zxjVarE2 = ((zxj[]) this.d)[i7].e(iB);
                    zxjVarArr[i10].f(zxjVarE);
                    ((zxj[]) this.d)[i10].f(zxjVarE2);
                }
            }
            i7 = i8;
        }
    }
}
