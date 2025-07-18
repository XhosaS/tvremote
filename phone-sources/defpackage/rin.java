package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rin {
    public boolean a;
    public final Object b;

    public rin(hwx hwxVar) {
        this.a = false;
        this.b = hwxVar;
    }

    public static boolean c(List list, hwx hwxVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hwx hwxVar2 = (hwx) it.next();
            if (hwxVar2 == hwx.all || hwxVar2 == hwxVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(hxa hxaVar, int i, List list, int i2, hyn hynVar) {
        hxb hxbVarB = hxaVar.b(i);
        if (!e(hxbVarB, list, i2, hynVar)) {
            return false;
        }
        int i3 = hxbVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return q(hxaVar, i - 1, list, i2);
            }
            int iP = p(list, i2, hynVar);
            if (iP <= 0) {
                return false;
            }
            return d(hxaVar, i - 1, list, i2, (hyn) hynVar.u.n().get(iP - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (q(hxaVar, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public static boolean e(hxb hxbVar, List list, int i, hyn hynVar) {
        List list2;
        String str = hxbVar.a;
        if (str != null) {
            if (str.equalsIgnoreCase("G")) {
                if (!(hynVar instanceof hxo)) {
                    return false;
                }
            } else if (!str.equals(hynVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        List<rza> list3 = hxbVar.b;
        if (list3 != null) {
            for (rza rzaVar : list3) {
                Object obj = rzaVar.b;
                if (obj == "id") {
                    if (!((String) rzaVar.c).equals(hynVar.o)) {
                        return false;
                    }
                } else if (obj != "class" || (list2 = hynVar.s) == null || !list2.contains(rzaVar.c)) {
                    return false;
                }
            }
        }
        List list4 = hxbVar.c;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((String) it.next()).equals("first-child") || p(list, i, hynVar) != 0) {
                return false;
            }
        }
        return true;
    }

    public static List g(hzz hzzVar) throws SAXException {
        ArrayList arrayList = new ArrayList();
        while (!hzzVar.n()) {
            try {
                arrayList.add((hwx) Enum.valueOf(hwx.class, hzzVar.j(',')));
                if (!hzzVar.p()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    public static Bitmap m(rin rinVar) {
        if (rinVar == null) {
            return null;
        }
        return rinVar.a();
    }

    public static void n(rin rinVar) {
        if (rinVar != null) {
            rinVar.b();
        }
    }

    public static boolean o(rin rinVar, rin rinVar2) {
        if (rinVar == rinVar2) {
            return true;
        }
        if (m(rinVar) != m(rinVar2)) {
            return false;
        }
        rinVar2.b();
        return true;
    }

    private static int p(List list, int i, hyn hynVar) {
        if (i < 0) {
            return -1;
        }
        Object obj = list.get(i);
        hyl hylVar = hynVar.u;
        if (obj != hylVar) {
            return -1;
        }
        Iterator it = hylVar.n().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((hyp) it.next()) == hynVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean q(hxa hxaVar, int i, List list, int i2) {
        hxb hxbVarB = hxaVar.b(i);
        hyn hynVar = (hyn) list.get(i2);
        if (!e(hxbVarB, list, i2, hynVar)) {
            return false;
        }
        int i3 = hxbVarB.d;
        if (i3 != 1) {
            if (i3 == 2) {
                return q(hxaVar, i - 1, list, i2 - 1);
            }
            int iP = p(list, i2, hynVar);
            if (iP <= 0) {
                return false;
            }
            return d(hxaVar, i - 1, list, i2, (hyn) hynVar.u.n().get(iP - 1));
        }
        if (i == 0) {
            return true;
        }
        while (i2 > 0) {
            i2--;
            if (q(hxaVar, i - 1, list, i2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized Bitmap a() {
        a.ah(!this.a, "Cannot reuse a released BitmapReference");
        return ((lek) this.b).b;
    }

    public final void b() {
        boolean z;
        synchronized (this) {
            if (this.a) {
                z = false;
            } else {
                z = true;
                this.a = true;
            }
        }
        if (z) {
            lek lekVar = (lek) this.b;
            lekVar.e.d(lekVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0251, code lost:
    
        if (r7 == 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0255, code lost:
    
        if (r11.a != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0257, code lost:
    
        r11.a = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025e, code lost:
    
        r11.a.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0267, code lost:
    
        if (r19.p() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0269, code lost:
    
        r3.add(r11);
        r11 = new defpackage.hxa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0271, code lost:
    
        r7 = r16;
        r8 = 0;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0279, code lost:
    
        r19.b = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0379 A[EDGE_INSN: B:235:0x0379->B:213:0x0379 BREAK  A[LOOP:1: B:161:0x029d->B:244:?, LOOP_LABEL: LOOP:0: B:3:0x0009->B:238:0x0009], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0251 A[EDGE_INSN: B:263:0x0251->B:142:0x0251 BREAK  A[LOOP:6: B:71:0x012f->B:268:0x012f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [hxb] */
    /* JADX WARN: Type inference failed for: r7v16, types: [hxb] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [hxb] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hwz f(defpackage.hzz r19) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rin.f(hzz):hwz");
    }

    public final synchronized void h(hnv hnvVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            hnvVar.e();
            this.a = false;
            return;
        }
        ((Handler) this.b).obtainMessage(1, hnvVar).sendToTarget();
    }

    public final dzb i() {
        a.ab(!this.a);
        this.a = true;
        return new dzb((SparseBooleanArray) this.b);
    }

    public final void j(int i) {
        a.ab(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public final void k(dzb dzbVar) {
        for (int i = 0; i < dzbVar.b(); i++) {
            j(dzbVar.a(i));
        }
    }

    public final void l(int... iArr) {
        for (int i : iArr) {
            j(i);
        }
    }

    public rin(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = true;
    }

    public rin(lek lekVar) {
        this.b = lekVar;
    }

    public rin() {
        this.b = new dvv(false);
    }

    public rin(byte[] bArr, byte[] bArr2) {
        this.b = new SparseBooleanArray();
    }

    public rin(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new hny());
    }
}
