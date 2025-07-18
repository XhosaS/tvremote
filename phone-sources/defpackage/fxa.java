package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxa implements Comparable {
    public final fxb a;
    public final Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;

    public fxa(fxb fxbVar, Bundle bundle, boolean z, int i, boolean z2) {
        this.a = fxbVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fxa fxaVar) {
        fxaVar.getClass();
        if (this.c) {
            if (!fxaVar.c) {
                return 1;
            }
        } else if (fxaVar.c) {
            return -1;
        }
        int i = this.d - fxaVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = this.b;
        if (bundle != null && fxaVar.b == null) {
            return 1;
        }
        if (bundle == null && fxaVar.b != null) {
            return -1;
        }
        if (bundle != null) {
            Bundle bundle2 = fxaVar.b;
            int size = bundle.size();
            bundle2.getClass();
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z = this.e;
        boolean z2 = fxaVar.e;
        return z ? !z2 ? 1 : 0 : z2 ? -1 : 0;
    }
}
