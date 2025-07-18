package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agwp extends agwu {
    @Override // defpackage.agwu
    public final long a() {
        return b().nextLong();
    }

    public abstract Random b();

    @Override // defpackage.agwu
    public final int c() {
        return b().nextInt(2147418112);
    }
}
