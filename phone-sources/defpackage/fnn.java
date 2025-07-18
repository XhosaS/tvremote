package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnn {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c;
    public static final String d;
    public final int e;
    public final long f;
    public final fqy g;

    static {
        edt.Z(2);
        edt.Z(3);
        c = edt.Z(4);
        d = edt.Z(5);
    }

    private fnn(int i, long j, fqy fqyVar) {
        this.e = i;
        this.f = j;
        this.g = fqyVar;
    }

    public static fnn a(int i) {
        fqy fqyVar = new fqy(i, "no error message provided", Bundle.EMPTY);
        return new fnn(fqyVar.d, SystemClock.elapsedRealtime(), fqyVar);
    }
}
