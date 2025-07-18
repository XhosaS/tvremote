package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fra {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public final int e;
    public final Bundle f;
    public final long g;
    public final fqy h;

    public fra(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public fra(int i, Bundle bundle, long j, fqy fqyVar) {
        boolean z = true;
        if (fqyVar != null && i >= 0) {
            z = false;
        }
        a.H(z);
        this.e = i;
        this.f = new Bundle(bundle);
        this.g = j;
        if (fqyVar == null && i < 0) {
            fqyVar = new fqy(i);
        }
        this.h = fqyVar;
    }
}
