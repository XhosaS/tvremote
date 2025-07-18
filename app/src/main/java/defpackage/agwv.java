package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwv extends agwp {
    @Override // defpackage.agwp
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // defpackage.agwu
    public final long d() {
        return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    }

    @Override // defpackage.agwu
    public final long fk() {
        return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE);
    }
}
