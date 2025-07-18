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
public final class hbp {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};

    public static hcb a(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return b(context.getAssets().open(str), str2);
            }
            return d(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new hcb((Throwable) e);
        }
    }

    public static hcb b(InputStream inputStream, String str) throws IOException {
        try {
            zhi zhiVar = new zhi(zhb.c(inputStream));
            String[] strArr = hhf.a;
            return j(new hhg(zhiVar), str, true);
        } finally {
            hhr.e(inputStream);
        }
    }

    public static hcb c(Context context, int i, String str) {
        try {
            zhi zhiVar = new zhi(zhb.c(context.getResources().openRawResource(i)));
            return l(zhiVar).booleanValue() ? d(context, new ZipInputStream(new zhh(zhiVar)), str) : b(new zhh(zhiVar), str);
        } catch (Resources.NotFoundException e) {
            return new hcb((Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0262 A[Catch: all -> 0x02a5, TryCatch #1 {all -> 0x02a5, blocks: (B:2:0x0000, B:3:0x000a, B:6:0x0013, B:8:0x001f, B:54:0x011e, B:9:0x0024, B:11:0x0030, B:12:0x0035, B:14:0x0041, B:15:0x0059, B:18:0x0064, B:20:0x006c, B:22:0x0074, B:25:0x007e, B:27:0x0086, B:30:0x008f, B:31:0x0094, B:49:0x00e4, B:51:0x00ee, B:52:0x010b, B:48:0x00d7, B:53:0x010f, B:57:0x0126, B:58:0x0134, B:59:0x013c, B:61:0x0142, B:62:0x015b, B:64:0x0161, B:69:0x0173, B:70:0x0184, B:71:0x018c, B:73:0x0193, B:74:0x01a7, B:76:0x01ad, B:78:0x01bf, B:80:0x01cb, B:81:0x01eb, B:83:0x01f1, B:84:0x01fe, B:86:0x0204, B:89:0x0214, B:91:0x0229, B:94:0x0233, B:95:0x0240, B:97:0x0249, B:98:0x024f, B:99:0x025c, B:101:0x0262, B:103:0x0272, B:105:0x028d, B:106:0x0295, B:108:0x029c), top: B:116:0x0000, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.hcb d(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbp.d(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):hcb");
    }

    public static hcd e(Context context, String str, String str2) {
        return k(str2, new hbn(context.getApplicationContext(), str, str2, 0));
    }

    public static hcd f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return k(str, new Callable() { // from class: hbm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = hbp.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return hbp.c(context2, i, str);
            }
        });
    }

    public static hcd g(final Context context, final String str, final String str2) {
        return k(str2, new Callable() { // from class: hbl
            /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hbl.call():java.lang.Object");
            }
        });
    }

    public static String h(Context context, int i) {
        return "rawRes" + (true != a.Z(context) ? "_day_" : "_night_") + i;
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((hce) arrayList.get(i)).a();
        }
    }

    private static hcb j(hhf hhfVar, String str, boolean z) throws IOException {
        hcb hcbVar;
        jn jnVar;
        ArrayList arrayList;
        HashMap map;
        ArrayList arrayList2;
        kp kpVar;
        float f;
        float f2;
        jn jnVar2;
        ArrayList arrayList3;
        float f3;
        kp kpVar2;
        ArrayList arrayList4;
        try {
            try {
                ghd ghdVar = hgq.a;
                float fA = hhr.a();
                jn jnVar3 = new jn();
                ArrayList arrayList5 = new ArrayList();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                ArrayList arrayList6 = new ArrayList();
                kp kpVar3 = new kp();
                hbk hbkVar = new hbk();
                hhfVar.h();
                float fA2 = 0.0f;
                float fA3 = 0.0f;
                float fA4 = 0.0f;
                int iB = 0;
                int iB2 = 0;
                while (hhfVar.n()) {
                    float f4 = fA;
                    switch (hhfVar.q(hgq.a)) {
                        case 0:
                            ArrayList arrayList7 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList7;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            iB = hhfVar.b();
                            jn jnVar4 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar4;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 1:
                            ArrayList arrayList8 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList8;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            iB2 = hhfVar.b();
                            jn jnVar42 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar42;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 2:
                            ArrayList arrayList9 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList9;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            fA2 = (float) hhfVar.a();
                            jn jnVar422 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar422;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 3:
                            arrayList2 = arrayList6;
                            fA3 = ((float) hhfVar.a()) - 0.01f;
                            arrayList5 = arrayList5;
                            jnVar3 = jnVar3;
                            fA = f4;
                            kpVar3 = kpVar3;
                            map4 = map4;
                            fA4 = fA4;
                            break;
                        case 4:
                            arrayList2 = arrayList6;
                            f = fA3;
                            fA4 = (float) hhfVar.a();
                            arrayList5 = arrayList5;
                            jnVar3 = jnVar3;
                            fA = f4;
                            kpVar3 = kpVar3;
                            map4 = map4;
                            fA3 = f;
                            break;
                        case 5:
                            ArrayList arrayList10 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList10;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            String[] strArrSplit = hhfVar.f().split("\\.");
                            int i = Integer.parseInt(strArrSplit[0]);
                            int i2 = Integer.parseInt(strArrSplit[1]);
                            int i3 = Integer.parseInt(strArrSplit[2]);
                            if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                                hbkVar.d("Lottie only supports bodymovin >= 4.4.0");
                            }
                            jn jnVar4222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar4222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 6:
                            jn jnVar5 = jnVar3;
                            ArrayList arrayList11 = arrayList5;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            hhfVar.g();
                            int i4 = 0;
                            while (hhfVar.n()) {
                                hfn hfnVarA = hgp.a(hhfVar, hbkVar);
                                if (hfnVarA.t == 3) {
                                    i4++;
                                }
                                ArrayList arrayList12 = arrayList11;
                                arrayList12.add(hfnVarA);
                                jn jnVar6 = jnVar5;
                                jnVar6.j(hfnVarA.d, hfnVarA);
                                if (i4 > 4) {
                                    hhk.a("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                }
                                arrayList11 = arrayList12;
                                jnVar5 = jnVar6;
                            }
                            jnVar = jnVar5;
                            arrayList = arrayList11;
                            hhfVar.i();
                            jn jnVar42222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar42222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 7:
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            hhfVar.g();
                            while (hhfVar.n()) {
                                ArrayList arrayList13 = new ArrayList();
                                jn jnVar7 = new jn();
                                hhfVar.h();
                                HashMap map5 = map4;
                                String strF = null;
                                String strF2 = null;
                                int iB3 = 0;
                                int iB4 = 0;
                                while (hhfVar.n()) {
                                    float f5 = fA4;
                                    int iQ = hhfVar.q(hgq.b);
                                    if (iQ != 0) {
                                        f3 = fA3;
                                        if (iQ != 1) {
                                            if (iQ == 2) {
                                                iB3 = hhfVar.b();
                                            } else if (iQ == 3) {
                                                iB4 = hhfVar.b();
                                            } else if (iQ != 4) {
                                                if (iQ != 5) {
                                                    hhfVar.l();
                                                    hhfVar.m();
                                                } else {
                                                    hhfVar.f();
                                                }
                                                jnVar2 = jnVar3;
                                                arrayList3 = arrayList5;
                                            } else {
                                                strF2 = hhfVar.f();
                                            }
                                            fA4 = f5;
                                            fA3 = f3;
                                        } else {
                                            hhfVar.g();
                                            while (hhfVar.n()) {
                                                hfn hfnVarA2 = hgp.a(hhfVar, hbkVar);
                                                jnVar7.j(hfnVarA2.d, hfnVarA2);
                                                arrayList13.add(hfnVarA2);
                                                jnVar3 = jnVar3;
                                                arrayList5 = arrayList5;
                                            }
                                            jnVar2 = jnVar3;
                                            arrayList3 = arrayList5;
                                            hhfVar.i();
                                        }
                                    } else {
                                        jnVar2 = jnVar3;
                                        arrayList3 = arrayList5;
                                        f3 = fA3;
                                        strF = hhfVar.f();
                                    }
                                    jnVar3 = jnVar2;
                                    fA4 = f5;
                                    fA3 = f3;
                                    arrayList5 = arrayList3;
                                }
                                jn jnVar8 = jnVar3;
                                ArrayList arrayList14 = arrayList5;
                                float f6 = fA3;
                                float f7 = fA4;
                                hhfVar.j();
                                if (strF2 != null) {
                                    hbw hbwVar = new hbw(iB3, iB4, strF, strF2);
                                    map3.put(hbwVar.c, hbwVar);
                                } else {
                                    map2.put(strF, arrayList13);
                                }
                                jnVar3 = jnVar8;
                                map4 = map5;
                                fA4 = f7;
                                fA3 = f6;
                                arrayList5 = arrayList14;
                            }
                            ArrayList arrayList15 = arrayList5;
                            map = map4;
                            f = fA3;
                            f2 = fA4;
                            hhfVar.i();
                            jnVar = jnVar3;
                            arrayList = arrayList15;
                            jn jnVar422222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar422222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 8:
                            arrayList2 = arrayList6;
                            hhfVar.h();
                            while (hhfVar.n()) {
                                if (hhfVar.q(hgq.c) != 0) {
                                    hhfVar.l();
                                    hhfVar.m();
                                } else {
                                    hhfVar.g();
                                    while (hhfVar.n()) {
                                        ghd ghdVar2 = hgi.a;
                                        hhfVar.h();
                                        String strF3 = null;
                                        String strF4 = null;
                                        String strF5 = null;
                                        while (hhfVar.n()) {
                                            int iQ2 = hhfVar.q(hgi.a);
                                            if (iQ2 != 0) {
                                                kpVar2 = kpVar3;
                                                if (iQ2 == 1) {
                                                    strF4 = hhfVar.f();
                                                } else if (iQ2 == 2) {
                                                    strF5 = hhfVar.f();
                                                } else if (iQ2 != 3) {
                                                    hhfVar.l();
                                                    hhfVar.m();
                                                } else {
                                                    hhfVar.a();
                                                }
                                            } else {
                                                kpVar2 = kpVar3;
                                                strF3 = hhfVar.f();
                                            }
                                            kpVar3 = kpVar2;
                                        }
                                        hhfVar.j();
                                        heb hebVar = new heb(strF3, strF4, strF5);
                                        map4.put(hebVar.b, hebVar);
                                        kpVar3 = kpVar3;
                                    }
                                    hhfVar.i();
                                    kpVar3 = kpVar3;
                                }
                            }
                            kpVar = kpVar3;
                            hhfVar.j();
                            ArrayList arrayList16 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList16;
                            map = map4;
                            f = fA3;
                            f2 = fA4;
                            jn jnVar4222222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar4222222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 9:
                            hhfVar.g();
                            while (hhfVar.n()) {
                                ghd ghdVar3 = hgh.a;
                                ArrayList arrayList17 = new ArrayList();
                                hhfVar.h();
                                String strF6 = null;
                                String strF7 = null;
                                double dA = 0.0d;
                                char cCharAt = 0;
                                while (hhfVar.n()) {
                                    int iQ3 = hhfVar.q(hgh.a);
                                    if (iQ3 != 0) {
                                        arrayList4 = arrayList6;
                                        if (iQ3 == 1) {
                                            hhfVar.a();
                                        } else if (iQ3 == 2) {
                                            dA = hhfVar.a();
                                        } else if (iQ3 == 3) {
                                            strF6 = hhfVar.f();
                                        } else if (iQ3 == 4) {
                                            strF7 = hhfVar.f();
                                        } else if (iQ3 != 5) {
                                            hhfVar.l();
                                            hhfVar.m();
                                        } else {
                                            hhfVar.h();
                                            while (hhfVar.n()) {
                                                if (hhfVar.q(hgh.b) != 0) {
                                                    hhfVar.l();
                                                    hhfVar.m();
                                                } else {
                                                    hhfVar.g();
                                                    while (hhfVar.n()) {
                                                        arrayList17.add((hff) hgd.a(hhfVar, hbkVar));
                                                    }
                                                    hhfVar.i();
                                                }
                                            }
                                            hhfVar.j();
                                        }
                                    } else {
                                        arrayList4 = arrayList6;
                                        cCharAt = hhfVar.f().charAt(0);
                                    }
                                    arrayList6 = arrayList4;
                                }
                                hhfVar.j();
                                hec hecVar = new hec(arrayList17, cCharAt, dA, strF6, strF7);
                                kpVar3.h(hecVar.hashCode(), hecVar);
                                arrayList6 = arrayList6;
                            }
                            arrayList2 = arrayList6;
                            hhfVar.i();
                            ArrayList arrayList18 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList18;
                            map = map4;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            jn jnVar42222222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar42222222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        case 10:
                            hhfVar.g();
                            while (hhfVar.n()) {
                                hhfVar.h();
                                while (hhfVar.n()) {
                                    int iQ4 = hhfVar.q(hgq.d);
                                    if (iQ4 == 0) {
                                        hhfVar.f();
                                    } else if (iQ4 == 1) {
                                        hhfVar.a();
                                    } else if (iQ4 != 2) {
                                        hhfVar.l();
                                        hhfVar.m();
                                    } else {
                                        hhfVar.a();
                                    }
                                }
                                hhfVar.j();
                                arrayList6.add(new hjs());
                            }
                            hhfVar.i();
                            ArrayList arrayList19 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList19;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            jn jnVar422222222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar422222222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                        default:
                            ArrayList arrayList20 = arrayList5;
                            jnVar = jnVar3;
                            arrayList = arrayList20;
                            map = map4;
                            arrayList2 = arrayList6;
                            kpVar = kpVar3;
                            f = fA3;
                            f2 = fA4;
                            hhfVar.l();
                            hhfVar.m();
                            jn jnVar4222222222 = jnVar;
                            arrayList5 = arrayList;
                            jnVar3 = jnVar4222222222;
                            fA = f4;
                            kpVar3 = kpVar;
                            map4 = map;
                            fA4 = f2;
                            fA3 = f;
                            break;
                    }
                    arrayList6 = arrayList2;
                }
                float f8 = fA;
                hbkVar.g = new Rect(0, 0, (int) (iB * f8), (int) (iB2 * f8));
                hbkVar.h = fA2;
                hbkVar.i = fA3;
                hbkVar.j = fA4;
                hbkVar.f = arrayList5;
                hbkVar.e = jnVar3;
                hbkVar.a = map2;
                hbkVar.b = map3;
                hbkVar.d = kpVar3;
                hbkVar.c = map4;
                if (str != null) {
                    hef.a.a(str, hbkVar);
                }
                hcbVar = new hcb(hbkVar);
            } catch (Exception e) {
                hcbVar = new hcb((Throwable) e);
            }
            if (z) {
                hhr.e(hhfVar);
            }
            return hcbVar;
        } catch (Throwable th) {
            if (z) {
                hhr.e(hhfVar);
            }
            throw th;
        }
    }

    private static hcd k(final String str, Callable callable) {
        hbk hbkVar = str == null ? null : (hbk) hef.a.b.get(str);
        if (hbkVar != null) {
            return new hcd(new eet(hbkVar, 6));
        }
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                return (hcd) map.get(str);
            }
        }
        hcd hcdVar = new hcd(callable);
        if (str != null) {
            final int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i2 = 1;
            hcdVar.e(new hbx() { // from class: hbo
                @Override // defpackage.hbx
                public final void a(Object obj) {
                    if (i2 != 0) {
                        Map map2 = hbp.a;
                        map2.remove(str);
                        atomicBoolean.set(true);
                        if (map2.size() == 0) {
                            hbp.i();
                            return;
                        }
                        return;
                    }
                    Map map3 = hbp.a;
                    map3.remove(str);
                    atomicBoolean.set(true);
                    if (map3.size() == 0) {
                        hbp.i();
                    }
                }
            });
            hcdVar.d(new hbx() { // from class: hbo
                @Override // defpackage.hbx
                public final void a(Object obj) {
                    if (i != 0) {
                        Map map2 = hbp.a;
                        map2.remove(str);
                        atomicBoolean.set(true);
                        if (map2.size() == 0) {
                            hbp.i();
                            return;
                        }
                        return;
                    }
                    Map map3 = hbp.a;
                    map3.remove(str);
                    atomicBoolean.set(true);
                    if (map3.size() == 0) {
                        hbp.i();
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = a;
                map2.put(str, hcdVar);
                if (map2.size() == 1) {
                    i();
                }
            }
        }
        return hcdVar;
    }

    private static Boolean l(zgm zgmVar) {
        try {
            zgm zgmVarR = zgmVar.r();
            byte[] bArr = c;
            int length = bArr.length;
            for (int i = 0; i < 4; i++) {
                if (zgmVarR.d() != bArr[i]) {
                    return false;
                }
            }
            zgmVarR.close();
            return true;
        } catch (Exception unused) {
            int i2 = hhk.a;
            return false;
        } catch (NoSuchMethodError unused2) {
            return false;
        }
    }
}
