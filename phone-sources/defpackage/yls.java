package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yls extends ylx {
    @Override // defpackage.ylx
    public final long a() {
        return b().nextLong();
    }

    public abstract Random b();

    @Override // defpackage.ylx
    public final int c() {
        return b().nextInt(2147418112);
    }
}
