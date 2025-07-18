package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqj {
    public static final zdy a = zdy.h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
    public static final zyu b;
    public final AtomicLong c = new AtomicLong(0);
    public final Object d = new Object();
    public final ConcurrentHashMap e = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final UUID h = UUID.randomUUID();

    static {
        zyu zyuVar = new zyu();
        b = zyuVar;
        zyuVar.p(new Object());
    }
}
