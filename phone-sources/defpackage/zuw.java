package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zuw {
    public final int a;
    public final Object b;

    public zuw(int i) {
        this.b = null;
        this.a = i;
    }

    public static zuw c(int i, xtk xtkVar) {
        if (i != 4) {
            i = 5;
        }
        a.ab(true);
        xtkVar.getClass();
        return new zuw(i, xtkVar);
    }

    public static zuw d(int i) {
        a.ab(true);
        return new zuw(i, (Object) null);
    }

    private final boolean m(int i) {
        return (i & this.a) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private final List n(maj majVar) {
        String str;
        int i;
        List listSingletonList;
        if (m(32)) {
            return this.b;
        }
        edi ediVar = new edi((byte[]) majVar.c);
        ?? arrayList = this.b;
        while (ediVar.a() > 0) {
            int iJ = ediVar.j();
            int iJ2 = ediVar.b + ediVar.j();
            if (iJ == 134) {
                arrayList = new ArrayList();
                int iJ3 = ediVar.j() & 31;
                for (int i2 = 0; i2 < iJ3; i2++) {
                    String strY = ediVar.y(3);
                    int iJ4 = ediVar.j();
                    boolean z = (iJ4 & 128) != 0;
                    if (z) {
                        i = iJ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bJ = (byte) ediVar.j();
                    ediVar.L(1);
                    if (z) {
                        int i3 = bJ & 64;
                        byte[] bArr = eco.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    dzd dzdVar = new dzd();
                    dzdVar.d(str);
                    dzdVar.d = strY;
                    dzdVar.J = i;
                    dzdVar.p = listSingletonList;
                    arrayList.add(new dze(dzdVar));
                }
            }
            ediVar.K(iJ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private final iom o(maj majVar) {
        return new iom(n(majVar));
    }

    private final isy p(maj majVar) {
        return new isy(n(majVar));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, znp] */
    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.a;
        byte[] bArrBC = vxr.bC(j, i2);
        int length = bArrBC.length;
        ?? r2 = this.b;
        r2.e(bArrBC, 0, length);
        r2.e(bArr, 0, bArr.length);
        r2.e(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (r2 instanceof zoa) {
            ((zoa) r2).l(bArr3, 0, i2);
            return bArr3;
        }
        r2.a(bArr3, 0);
        return bArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final int e(int i) {
        int i2 = 0;
        while (true) {
            ?? r2 = this.b;
            if (i2 >= r2.size()) {
                return 0;
            }
            int i3 = ((lvd) ((lvh) r2.get(i2)).a.get(0)).b.m;
            if (i < i3 - 2000) {
                return i2;
            }
            i -= i3;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final int f(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ?? r3 = this.b;
            if (i3 >= r3.size()) {
                break;
            }
            i2 += ((lvd) ((lvh) r3.get(i3)).a.get(0)).b.m;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int g() {
        return this.b.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final lvh h(int i) {
        return (lvh) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final lvh i() {
        return (lvh) this.b.get(this.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fms j(int r5, defpackage.maj r6) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuw.j(int, maj):fms");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final zuw k(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int size = 0;
        while (true) {
            ?? r3 = this.b;
            if (i >= r3.size()) {
                return new zuw((List) arrayList, size);
            }
            lvh lvhVar = (lvh) r3.get(i);
            if (i == this.a) {
                size = arrayList.size();
                arrayList.add(lvhVar);
            } else {
                String str2 = lvhVar.e;
                if (TextUtils.isEmpty(str2) || ksg.a(str, str2) > 0) {
                    arrayList.add(lvhVar);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final zuw l() {
        ?? r0 = this.b;
        Iterator it = r0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            lcl lclVar = ((lvd) ((lvh) it.next()).a.get(0)).b;
            if (lclVar.m <= 0) {
                krd.f("Streams duration is zero: streamId = " + lclVar.n + ", itag = " + lclVar.c);
                if (r0.size() != 1) {
                    return new zuw(Collections.singletonList((lvh) r0.get(this.a)), 0);
                }
            }
        }
        return this;
    }

    public zuw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public zuw(int i, Object obj, byte[] bArr) {
        this.a = i;
        this.b = obj;
    }

    public zuw(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public zuw(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public zuw(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public zuw() {
        this.a = 1;
        this.b = new ArrayList();
    }

    protected zuw(zjb zjbVar, int i) {
        this.b = zut.b(zjbVar);
        this.a = i;
    }

    public zuw(byte[] bArr, byte[] bArr2) {
        this(0, ImmutableList.of());
    }

    public zuw(List list, int i) {
        list.getClass();
        this.b = list;
        this.a = i;
    }

    public zuw(nve nveVar, int i) {
        ocv.aF(nveVar);
        this.b = nveVar;
        this.a = i;
    }
}
