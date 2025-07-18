package defpackage;

import android.os.Process;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slj {
    public final AtomicLong a;
    private final Random b;

    public slj(mcw mcwVar) {
        mcwVar.getClass();
        this.b = new Random();
        this.a = new AtomicLong((Process.myPid() << 40) + SystemClock.elapsedRealtime());
    }

    public final int a() {
        return this.b.nextInt(Integer.MAX_VALUE);
    }
}
