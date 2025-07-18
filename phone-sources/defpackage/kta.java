package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kta {
    public final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;

    public kta(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.a = i6;
        this.g = z;
    }

    public final Uri a(List list) {
        int i = this.f;
        return ktc.s(list, 4, i, (int) (i / 1.7777778f), 0.0f);
    }

    public final Uri b(List list) {
        int i = this.b;
        return ktc.s(list, 3, i, (int) (i / 0.6939625f), 0.0f);
    }

    public final Uri c(List list) {
        int i = this.c;
        int i2 = (int) (i / 2.39f);
        Uri uriS = ktc.s(list, 4, i, i2, 0.5f);
        return !uriS.equals(Uri.EMPTY) ? uriS : ktc.s(list, 2, i, i2, 0.5f);
    }

    public final Uri d(List list) {
        int i = this.e;
        return ktc.s(list, 2, i, (int) (i / 1.7777778f), 0.5f);
    }

    public final Uri e(List list) {
        return f(list).a;
    }

    public final kux f(List list) {
        int i;
        int i2 = this.d;
        int i3 = i2;
        Uri uriS = ktc.s(list, 1, i2, i3, 0.0f);
        float f = 1.0f;
        if (!Uri.EMPTY.equals(uriS)) {
            return kux.a(uriS, 1.0f);
        }
        xao xaoVarP = ktc.p(list, 3);
        if (xaoVarP == null || !xaoVarP.f) {
            return kux.a(Uri.EMPTY, 1.0f);
        }
        StringBuilder sb = new StringBuilder("k-v1-rwu");
        krf.m(i2, sb);
        krf.k(i3, sb);
        if (this.g) {
            krf.l(sb);
        } else {
            int i4 = xaoVarP.b;
            f = 0.6939625f;
            if ((i4 & 4) != 0 && (i4 & 2) != 0 && (i = xaoVarP.e) > 0) {
                f = xaoVarP.d / i;
            }
        }
        return kux.a(ksk.a(kuq.b(sb.toString(), xaoVarP.c)), f);
    }
}
