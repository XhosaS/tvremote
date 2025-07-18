package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orj {
    public static volatile boolean a = false;
    public static final orj b = new orj();
    public final ReentrantLock c;
    public final Condition d;
    public final orh e;

    public orj() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.e = new orh(org.a, new nur(this, 13, null));
    }
}
