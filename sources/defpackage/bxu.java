package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxu extends byu {
    @Override // defpackage.byu
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
