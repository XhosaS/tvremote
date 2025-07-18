package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksz {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    public ksz(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.a = i5;
        this.g = i6;
        this.b = i7;
        this.h = z;
    }

    public static Uri a(ImmutableList immutableList, kuu kuuVar, int i, int i2, float f) {
        tst tstVarH = h(immutableList, kuuVar, i, i2, f);
        if (tstVarH.g()) {
            kuv kuvVar = (kuv) tstVarH.c();
            if (kuvVar.a()) {
                if (!kuvVar.c || i <= 0 || i2 <= 0) {
                    return kuvVar.a;
                }
                StringBuilder sb = new StringBuilder("k-v1-rwu");
                if (i / i2 >= ((Float) kuvVar.d.e(Float.valueOf(0.0f))).floatValue()) {
                    krf.m(i, sb);
                } else {
                    krf.k(i2, sb);
                }
                return kuq.a(sb.toString(), kuvVar.a);
            }
        }
        return Uri.EMPTY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static tst h(ImmutableList immutableList, kuu kuuVar, int i, int i2, float f) {
        if (!immutableList.isEmpty()) {
            boolean z = i > 0 && i2 > 0;
            boolean z2 = z && f > 0.0f;
            int iSignum = z ? Integer.signum(i - i2) : 0;
            UnmodifiableIterator it = immutableList.iterator();
            while (it.hasNext()) {
                kuv kuvVar = (kuv) it.next();
                if (kuvVar.a() && kuuVar.equals(kuvVar.b)) {
                    int iIntValue = ((Integer) kuvVar.e.e(0)).intValue();
                    int iIntValue2 = ((Integer) kuvVar.f.e(0)).intValue();
                    if (!z2 || (iIntValue / i >= f && iIntValue2 / i2 >= f)) {
                        if (iSignum == 0 || iSignum == Integer.signum(iIntValue - iIntValue2)) {
                            return tst.i(kuvVar);
                        }
                    }
                }
            }
        }
        return trk.a;
    }

    public final Uri b(ImmutableList immutableList) {
        kuu kuuVar = kuu.TYPE_ICON;
        int i = this.g;
        Uri uriA = a(immutableList, kuuVar, i, i, 0.0f);
        return !Uri.EMPTY.equals(uriA) ? uriA : a(immutableList, kuu.TYPE_LOGO, i, i, 0.0f);
    }

    public final Uri c(ImmutableList immutableList) {
        kuu kuuVar = kuu.TYPE_POSTER;
        int i = this.c;
        return a(immutableList, kuuVar, i, (int) (i / 0.6939625f), 0.0f);
    }

    public final Uri d(ImmutableList immutableList) {
        kuu kuuVar = kuu.TYPE_SCREEN_SHOT;
        int i = this.d;
        int i2 = (int) (i / 2.39f);
        Uri uriA = a(immutableList, kuuVar, i, i2, 0.5f);
        return !uriA.equals(Uri.EMPTY) ? uriA : a(immutableList, kuu.TYPE_BANNER, i, i2, 0.5f);
    }

    public final Uri e(ImmutableList immutableList) {
        kuu kuuVar = kuu.TYPE_BANNER;
        int i = this.f;
        return a(immutableList, kuuVar, i, (int) (i / 1.7777778f), 0.5f);
    }

    public final /* synthetic */ Uri f(ImmutableList immutableList) {
        return g(immutableList).a;
    }

    public final kux g(ImmutableList immutableList) {
        kuu kuuVar = kuu.TYPE_LOGO;
        int i = this.e;
        int i2 = i;
        Uri uriA = a(immutableList, kuuVar, i, i2, 0.0f);
        float fIntValue = 1.0f;
        if (!Uri.EMPTY.equals(uriA)) {
            return kux.a(uriA, 1.0f);
        }
        tst tstVarH = h(immutableList, kuu.TYPE_POSTER, 0, 0, 0.0f);
        if (!tstVarH.g() || !((kuv) tstVarH.c()).c) {
            return kux.a(Uri.EMPTY, 1.0f);
        }
        Object objC = tstVarH.c();
        StringBuilder sb = new StringBuilder("k-v1-rwu");
        krf.m(i, sb);
        krf.k(i2, sb);
        if (this.h) {
            krf.l(sb);
        } else {
            fIntValue = ((Integer) ((kuv) objC).f.e(0)).intValue() > 0 ? ((Integer) r1.e.e(0)).intValue() / ((Integer) r2.e(0)).intValue() : 0.6939625f;
        }
        return kux.a(kuq.a(sb.toString(), ((kuv) objC).a), fIntValue);
    }
}
