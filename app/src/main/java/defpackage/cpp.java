package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpp {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static cqj a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return k(context.getAssets().open(str), str2);
            }
            return d(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new cqj((Throwable) e);
        }
    }

    public static cqj b(cwm cwmVar, String str, boolean z) throws IOException {
        cqj cqjVar;
        float f;
        HashMap map;
        ArrayList arrayList;
        wy wyVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        try {
            try {
                cwk cwkVar = cvs.a;
                float fA = cwy.a();
                wr wrVar = new wr(10);
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                ArrayList arrayList3 = new ArrayList();
                wy wyVar2 = new wy(10);
                cph cphVar = new cph();
                cwmVar.i();
                float fA2 = 0.0f;
                float fA3 = 0.0f;
                float fA4 = 0.0f;
                int iB = 0;
                int iB2 = 0;
                while (cwmVar.o()) {
                    switch (cwmVar.c(cvs.a)) {
                        case 0:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            iB = cwmVar.b();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 1:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            iB2 = cwmVar.b();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 2:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            fA2 = (float) cwmVar.a();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 3:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f3 = fA4;
                            fA3 = ((float) cwmVar.a()) - 0.01f;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 4:
                            f = fA;
                            fA4 = (float) cwmVar.a();
                            fA3 = fA3;
                            arrayList3 = arrayList3;
                            map4 = map4;
                            wyVar2 = wyVar2;
                            break;
                        case 5:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            String[] strArrSplit = cwmVar.g().split("\\.");
                            int i = Integer.parseInt(strArrSplit[0]);
                            int i2 = Integer.parseInt(strArrSplit[1]);
                            int i3 = Integer.parseInt(strArrSplit[2]);
                            if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                                cphVar.c("Lottie only supports bodymovin >= 4.4.0");
                            }
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 6:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            cwmVar.h();
                            int i4 = 0;
                            while (cwmVar.o()) {
                                cuk cukVarA = cvr.a(cwmVar, cphVar);
                                if (cukVarA.w == 3) {
                                    i4++;
                                }
                                arrayList2.add(cukVarA);
                                wrVar.i(cukVarA.d, cukVarA);
                                if (i4 > 4) {
                                    ((cwq) cwr.a).a("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.", null);
                                }
                            }
                            cwmVar.j();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 7:
                            f = fA;
                            arrayList = arrayList3;
                            cwmVar.h();
                            while (cwmVar.o()) {
                                ArrayList arrayList4 = new ArrayList();
                                wr wrVar2 = new wr(10);
                                cwmVar.i();
                                HashMap map5 = map4;
                                String strG = null;
                                String strG2 = null;
                                int iB3 = 0;
                                int iB4 = 0;
                                while (cwmVar.o()) {
                                    wy wyVar3 = wyVar2;
                                    int iC = cwmVar.c(cvs.b);
                                    if (iC != 0) {
                                        f5 = fA4;
                                        if (iC != 1) {
                                            if (iC == 2) {
                                                iB3 = cwmVar.b();
                                            } else if (iC == 3) {
                                                iB4 = cwmVar.b();
                                            } else if (iC != 4) {
                                                if (iC != 5) {
                                                    cwmVar.m();
                                                    cwmVar.n();
                                                } else {
                                                    cwmVar.g();
                                                }
                                                f4 = fA3;
                                            } else {
                                                strG = cwmVar.g();
                                            }
                                            wyVar2 = wyVar3;
                                            fA4 = f5;
                                        } else {
                                            cwmVar.h();
                                            while (cwmVar.o()) {
                                                cuk cukVarA2 = cvr.a(cwmVar, cphVar);
                                                wrVar2.i(cukVarA2.d, cukVarA2);
                                                arrayList4.add(cukVarA2);
                                                fA3 = fA3;
                                            }
                                            f4 = fA3;
                                            cwmVar.j();
                                        }
                                    } else {
                                        f4 = fA3;
                                        f5 = fA4;
                                        strG2 = cwmVar.g();
                                    }
                                    fA3 = f4;
                                    wyVar2 = wyVar3;
                                    fA4 = f5;
                                }
                                wy wyVar4 = wyVar2;
                                float f7 = fA3;
                                float f8 = fA4;
                                cwmVar.k();
                                if (strG != null) {
                                    cqe cqeVar = new cqe(iB3, iB4, strG2, strG);
                                    map3.put(cqeVar.c, cqeVar);
                                } else {
                                    map2.put(strG2, arrayList4);
                                }
                                fA3 = f7;
                                map4 = map5;
                                wyVar2 = wyVar4;
                                fA4 = f8;
                            }
                            map = map4;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            cwmVar.j();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 8:
                            f = fA;
                            cwmVar.i();
                            while (cwmVar.o()) {
                                if (cwmVar.c(cvs.c) != 0) {
                                    cwmVar.m();
                                    cwmVar.n();
                                } else {
                                    cwmVar.h();
                                    while (cwmVar.o()) {
                                        cwk cwkVar2 = cvj.a;
                                        cwmVar.i();
                                        String strG3 = null;
                                        String strG4 = null;
                                        String strG5 = null;
                                        while (cwmVar.o()) {
                                            ArrayList arrayList5 = arrayList3;
                                            int iC2 = cwmVar.c(cvj.a);
                                            if (iC2 == 0) {
                                                strG3 = cwmVar.g();
                                            } else if (iC2 == 1) {
                                                strG4 = cwmVar.g();
                                            } else if (iC2 == 2) {
                                                strG5 = cwmVar.g();
                                            } else if (iC2 != 3) {
                                                cwmVar.m();
                                                cwmVar.n();
                                            } else {
                                                cwmVar.a();
                                            }
                                            arrayList3 = arrayList5;
                                        }
                                        cwmVar.k();
                                        csq csqVar = new csq(strG3, strG4, strG5);
                                        map4.put(csqVar.b, csqVar);
                                        arrayList3 = arrayList3;
                                    }
                                    cwmVar.j();
                                    arrayList3 = arrayList3;
                                }
                            }
                            arrayList = arrayList3;
                            cwmVar.k();
                            map = map4;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 9:
                            cwmVar.h();
                            while (cwmVar.o()) {
                                cwk cwkVar3 = cvi.a;
                                ArrayList arrayList6 = new ArrayList();
                                cwmVar.i();
                                double dA = 0.0d;
                                char cCharAt = 0;
                                String strG6 = null;
                                String strG7 = null;
                                while (cwmVar.o()) {
                                    int iC3 = cwmVar.c(cvi.a);
                                    if (iC3 != 0) {
                                        f6 = fA;
                                        if (iC3 == 1) {
                                            cwmVar.a();
                                        } else if (iC3 == 2) {
                                            dA = cwmVar.a();
                                        } else if (iC3 == 3) {
                                            strG6 = cwmVar.g();
                                        } else if (iC3 == 4) {
                                            strG7 = cwmVar.g();
                                        } else if (iC3 != 5) {
                                            cwmVar.m();
                                            cwmVar.n();
                                        } else {
                                            cwmVar.i();
                                            while (cwmVar.o()) {
                                                if (cwmVar.c(cvi.b) != 0) {
                                                    cwmVar.m();
                                                    cwmVar.n();
                                                } else {
                                                    cwmVar.h();
                                                    while (cwmVar.o()) {
                                                        arrayList6.add((ctz) cvd.a(cwmVar, cphVar));
                                                    }
                                                    cwmVar.j();
                                                }
                                            }
                                            cwmVar.k();
                                        }
                                    } else {
                                        f6 = fA;
                                        cCharAt = cwmVar.g().charAt(0);
                                    }
                                    fA = f6;
                                }
                                cwmVar.k();
                                csr csrVar = new csr(arrayList6, cCharAt, dA, strG6, strG7);
                                wyVar2.f(csrVar.hashCode(), csrVar);
                                fA = fA;
                            }
                            f = fA;
                            cwmVar.j();
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        case 10:
                            cwmVar.h();
                            while (cwmVar.o()) {
                                cwmVar.i();
                                while (cwmVar.o()) {
                                    int iC4 = cwmVar.c(cvs.d);
                                    if (iC4 == 0) {
                                        cwmVar.g();
                                    } else if (iC4 == 1) {
                                        cwmVar.a();
                                    } else if (iC4 != 2) {
                                        cwmVar.m();
                                        cwmVar.n();
                                    } else {
                                        cwmVar.a();
                                    }
                                }
                                cwmVar.k();
                                arrayList3.add(new csv());
                            }
                            cwmVar.j();
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                        default:
                            f = fA;
                            map = map4;
                            arrayList = arrayList3;
                            wyVar = wyVar2;
                            f2 = fA3;
                            f3 = fA4;
                            cwmVar.m();
                            cwmVar.n();
                            fA3 = f2;
                            arrayList3 = arrayList;
                            map4 = map;
                            wyVar2 = wyVar;
                            fA4 = f3;
                            break;
                    }
                    fA = f;
                }
                float f9 = fA;
                cphVar.h = new Rect(0, 0, (int) (iB * f9), (int) (iB2 * f9));
                cphVar.i = fA2;
                cphVar.j = fA3;
                cphVar.k = fA4;
                cphVar.g = arrayList2;
                cphVar.f = wrVar;
                cphVar.b = map2;
                cphVar.c = map3;
                cphVar.e = wyVar2;
                cphVar.d = map4;
                if (str != null) {
                    csu.a.b.f(str, cphVar);
                }
                cqjVar = new cqj(cphVar);
            } catch (Exception e) {
                cqjVar = new cqj((Throwable) e);
            }
            if (z) {
                cwy.e(cwmVar);
            }
            return cqjVar;
        } catch (Throwable th) {
            if (z) {
                cwy.e(cwmVar);
            }
            throw th;
        }
    }

    public static cqj c(Context context, int i, String str) {
        try {
            ahxk ahxkVar = new ahxk(ahxd.b(context.getResources().openRawResource(i)));
            return m(ahxkVar).booleanValue() ? d(context, new ZipInputStream(new ahxj(ahxkVar)), str) : k(new ahxj(ahxkVar), str);
        } catch (Resources.NotFoundException e) {
            return new cqj((Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026a A[Catch: all -> 0x02ac, TryCatch #5 {all -> 0x02ac, blocks: (B:2:0x0000, B:3:0x000a, B:6:0x0013, B:8:0x001f, B:54:0x0122, B:9:0x0024, B:11:0x0030, B:12:0x0035, B:14:0x0041, B:15:0x0059, B:18:0x0064, B:20:0x006c, B:22:0x0074, B:25:0x007e, B:27:0x0086, B:30:0x008f, B:31:0x0094, B:49:0x00e4, B:51:0x00ee, B:52:0x010f, B:48:0x00d7, B:53:0x0113, B:57:0x012a, B:58:0x0138, B:59:0x0140, B:61:0x0146, B:62:0x015f, B:64:0x0165, B:69:0x0177, B:70:0x0188, B:71:0x0190, B:73:0x0197, B:74:0x01ab, B:76:0x01b1, B:78:0x01c3, B:80:0x01cf, B:81:0x01f3, B:83:0x01f9, B:84:0x0206, B:86:0x020c, B:89:0x021c, B:91:0x0231, B:94:0x023b, B:95:0x0248, B:97:0x0251, B:98:0x0257, B:99:0x0264, B:101:0x026a, B:103:0x027a, B:105:0x0295, B:106:0x029c, B:108:0x02a3), top: B:124:0x0000, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0293 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cqj d(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpp.d(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):cqj");
    }

    public static cqm e(final String str, Callable callable) {
        final cph cphVar = str == null ? null : (cph) csu.a.b.e(str);
        if (cphVar != null) {
            return new cqm(new Callable() { // from class: cpm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map map = cpp.a;
                    return new cqj(cphVar);
                }
            }, false);
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (cqm) map.get(str);
            }
        }
        cqm cqmVar = new cqm(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            cqmVar.e(new cqf() { // from class: cpn
                @Override // defpackage.cqf
                public final void a(Object obj) {
                    Map map2 = cpp.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        cpp.l();
                    }
                }
            });
            cqmVar.d(new cqf() { // from class: cpo
                @Override // defpackage.cqf
                public final void a(Object obj) {
                    Map map2 = cpp.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        cpp.l();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, cqmVar);
                if (map2.size() == 1) {
                    l();
                }
            }
        }
        return cqmVar;
    }

    public static cqm f(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return e(str2, new Callable() { // from class: cpl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cpp.a(applicationContext, str, str2);
            }
        });
    }

    public static cqm g(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return e(str, new Callable() { // from class: cpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = cpp.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return cpp.c(context2, i, str);
            }
        });
    }

    public static cqm h(Context context, String str) {
        return i(context, str, "url_".concat(String.valueOf(str)));
    }

    public static cqm i(final Context context, final String str, final String str2) {
        return e(str2, new Callable() { // from class: cpi
            /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 646
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cpi.call():java.lang.Object");
            }
        });
    }

    public static String j(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static cqj k(InputStream inputStream, String str) throws IOException {
        try {
            ahxk ahxkVar = new ahxk(ahxd.b(inputStream));
            String[] strArr = cwm.a;
            return b(new cwn(ahxkVar), str, true);
        } finally {
            cwy.e(inputStream);
        }
    }

    public static void l() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((cqn) arrayList.get(i)).a();
        }
    }

    private static Boolean m(ahwz ahwzVar) {
        try {
            ahxk ahxkVar = new ahxk(new ahxh(ahwzVar));
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (ahxkVar.c() != bArr[i]) {
                    return false;
                }
            }
            ahxkVar.close();
            return true;
        } catch (Exception unused) {
            cqg cqgVar = cwr.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
