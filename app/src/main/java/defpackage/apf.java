package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apf implements apg {
    private final NativeSharedCounter b;
    private final long c;

    public apf(NativeSharedCounter nativeSharedCounter, long j) {
        this.b = nativeSharedCounter;
        this.c = j;
    }

    @Override // defpackage.apg
    public final int a() {
        return this.b.nativeGetCounterValue(this.c);
    }

    @Override // defpackage.apg
    public final int b() {
        return this.b.nativeIncrementAndGetCounterValue(this.c);
    }
}
