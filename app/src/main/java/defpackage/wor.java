package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wor {
    public static final zdy a = zdy.h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final Context c;
    public final zyg d;
    private final boolean g;
    private final rnw h;
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;

    public wor(Context context, zyg zygVar, yqt yqtVar, rnw rnwVar) {
        Boolean bool = false;
        bool.getClass();
        this.g = ((Boolean) ((yqz) yqtVar).a).booleanValue();
        this.h = rnwVar;
        this.c = context;
        this.d = zygVar;
    }

    static File e(Context context) {
        return new File(context.getFilesDir().getPath(), "103795117");
    }

    static File f(Context context) {
        return new File(context.getFilesDir(), "103795117_".concat(String.valueOf(rnu.b().replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
    }

    private final File i() {
        return this.g ? f(this.c) : e(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[Catch: RuntimeException -> 0x0096, all -> 0x0163, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0096, blocks: (B:12:0x0041, B:14:0x004d, B:17:0x005b, B:19:0x0065, B:20:0x007a, B:22:0x0080), top: B:89:0x0041, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wsi a() throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.a():wsi");
    }

    public final zyd b() {
        return zuz.g(c(), wyo.a(new yqi() { // from class: wok
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                we weVar = new we();
                wsi wsiVar = wsi.a;
                wor worVar = this.a;
                try {
                    for (wsg wsgVar : worVar.a().d) {
                        long jLongValue = wsgVar.e;
                        wsm wsmVar = wsgVar.c;
                        if (wsmVar == null) {
                            wsmVar = wsm.a;
                        }
                        wqc wqcVar = new wqc(wsmVar);
                        if (jLongValue <= 0) {
                            jLongValue = l.longValue();
                        }
                        weVar.put(wqcVar, Long.valueOf(jLongValue));
                    }
                    return weVar;
                } catch (IOException e) {
                    worVar.h(e);
                    return weVar;
                }
            }
        }), this.d);
    }

    final zyd c() {
        return this.e.get() ? zxn.h(Long.valueOf(this.f)) : this.d.submit(wyo.i(new Callable() { // from class: woq
            /* JADX WARN: Finally extract failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long epochMilli;
                wsh wshVar;
                Long lValueOf;
                wor worVar = this.a;
                worVar.b.writeLock().lock();
                try {
                    if (worVar.e.get()) {
                        lValueOf = Long.valueOf(worVar.f);
                    } else {
                        try {
                            wsi wsiVarA = worVar.a();
                            epochMilli = wsiVarA.c;
                            wshVar = new wsh();
                            wshVar.B(wsiVarA);
                        } catch (IOException e) {
                            worVar.h(e);
                            epochMilli = Instant.now().toEpochMilli();
                            wsi wsiVar = wsi.a;
                            wshVar = new wsh();
                        }
                        if (epochMilli > 0) {
                            worVar.f = epochMilli;
                            worVar.e.set(true);
                            lValueOf = Long.valueOf(worVar.f);
                        } else {
                            long epochMilli2 = Instant.now().toEpochMilli();
                            worVar.f = epochMilli2;
                            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                wshVar.y();
                            }
                            wsi wsiVar2 = (wsi) wshVar.b;
                            wsiVar2.b |= 1;
                            wsiVar2.c = epochMilli2;
                            try {
                                try {
                                    worVar.g((wsi) wshVar.v());
                                    worVar.e.set(true);
                                } catch (IOException e2) {
                                    ((zdv) ((zdv) ((zdv) wor.a.d()).p(e2)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getSyncEpoch", 148, "SyncManagerDataStore.java")).u("Could not write sync epoch. Using current time but future runs may be delayed.");
                                    worVar.e.set(false);
                                }
                                lValueOf = Long.valueOf(worVar.f);
                            } catch (Throwable th) {
                                worVar.e.set(true);
                                throw th;
                            }
                        }
                    }
                    return lValueOf;
                } finally {
                    worVar.b.writeLock().unlock();
                }
            }
        }));
    }

    final zyd d(final wqc wqcVar, final long j, final boolean z) {
        return this.d.submit(new Callable() { // from class: woo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wqc wqcVar2;
                wor worVar = this.a;
                worVar.b.writeLock().lock();
                long j2 = j;
                try {
                    wsi wsiVarA = wsi.a;
                    try {
                        wsiVarA = worVar.a();
                    } catch (IOException e) {
                        if (!worVar.h(e)) {
                            ((zdv) ((zdv) ((zdv) wor.a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 363, "SyncManagerDataStore.java")).u("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                        }
                    }
                    wsh wshVar = new wsh();
                    wshVar.B(wsiVarA);
                    int i = Integer.MIN_VALUE;
                    if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        wshVar.y();
                    }
                    ((wsi) wshVar.b).d = abzb.b;
                    Iterator it = wsiVarA.d.iterator();
                    wsg wsgVar = null;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        wqcVar2 = wqcVar;
                        if (!zHasNext) {
                            break;
                        }
                        wsg wsgVar2 = (wsg) it.next();
                        wsm wsmVar = wsgVar2.c;
                        if (wsmVar == null) {
                            wsmVar = wsm.a;
                        }
                        int i2 = i;
                        if (wqcVar2.equals(new wqc(wsmVar))) {
                            wsgVar = wsgVar2;
                        } else {
                            wshVar.a(wsgVar2);
                        }
                        i = i2;
                    }
                    int i3 = i;
                    if (wsgVar != null) {
                        if (wsiVarA.c < 0) {
                            long epochMilli = worVar.f;
                            if (epochMilli < 0) {
                                epochMilli = Instant.now().toEpochMilli();
                                worVar.f = epochMilli;
                            }
                            if ((wshVar.b.memoizedSerializedSize & i3) == 0) {
                                wshVar.y();
                            }
                            wsi wsiVar = (wsi) wshVar.b;
                            wsiVar.b |= 1;
                            wsiVar.c = epochMilli;
                        }
                        wsf wsfVar = new wsf();
                        wsm wsmVar2 = wqcVar2.a;
                        if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                            wsfVar.y();
                        }
                        wsg wsgVar3 = (wsg) wsfVar.b;
                        wsmVar2.getClass();
                        wsgVar3.c = wsmVar2;
                        wsgVar3.b |= 1;
                        if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                            wsfVar.y();
                        }
                        wsg wsgVar4 = (wsg) wsfVar.b;
                        wsgVar4.b |= 4;
                        wsgVar4.e = j2;
                        if (z) {
                            if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                                wsfVar.y();
                            }
                            wsg wsgVar5 = (wsg) wsfVar.b;
                            wsgVar5.b |= 2;
                            wsgVar5.d = j2;
                            if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                                wsfVar.y();
                            }
                            wsg wsgVar6 = (wsg) wsfVar.b;
                            wsgVar6.b |= 8;
                            wsgVar6.f = 0;
                        } else {
                            long j3 = wsgVar.d;
                            if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                                wsfVar.y();
                            }
                            wsg wsgVar7 = (wsg) wsfVar.b;
                            wsgVar7.b |= 2;
                            wsgVar7.d = j3;
                            int i4 = wsgVar.f + 1;
                            if ((wsfVar.b.memoizedSerializedSize & i3) == 0) {
                                wsfVar.y();
                            }
                            wsg wsgVar8 = (wsg) wsfVar.b;
                            wsgVar8.b |= 8;
                            wsgVar8.f = i4;
                        }
                        wshVar.a((wsg) wsfVar.v());
                        try {
                            worVar.g((wsi) wshVar.v());
                        } catch (IOException e2) {
                            ((zdv) ((zdv) ((zdv) wor.a.c()).p(e2)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 423, "SyncManagerDataStore.java")).u("Error writing sync data file after sync. Sync may run too frequently.");
                        }
                    }
                    return null;
                } finally {
                    worVar.b.writeLock().unlock();
                }
            }
        });
    }

    public final void g(wsi wsiVar) throws Throwable {
        FileOutputStream fileOutputStream;
        int iA;
        try {
            fileOutputStream = new FileOutputStream(i());
            try {
                int i = wsiVar.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(wsiVar.getClass()).a(wsiVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(wsiVar.getClass()).a(wsiVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        wsiVar.memoizedSerializedSize = (Integer.MIN_VALUE & wsiVar.memoizedSerializedSize) | iA;
                    }
                }
                abvy abvyVar = new abvy(fileOutputStream, abvz.F(abvz.H(iA) + iA));
                abvyVar.x(iA);
                abza.a.a(wsiVar.getClass()).m(wsiVar, abwa.a(abvyVar));
                abvyVar.O();
                fileOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean h(Throwable th) {
        ((zdv) ((zdv) ((zdv) a.d()).p(th)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 624, "SyncManagerDataStore.java")).u("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.e.set(false);
            long epochMilli = this.f;
            if (epochMilli <= 0) {
                epochMilli = Instant.now().toEpochMilli();
            }
            wsi wsiVar = wsi.a;
            wsh wshVar = new wsh();
            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                wshVar.y();
            }
            wsi wsiVar2 = (wsi) wshVar.b;
            wsiVar2.b |= 1;
            wsiVar2.c = epochMilli;
            try {
                try {
                    g((wsi) wshVar.v());
                    this.e.set(true);
                    z = true;
                } catch (IOException e) {
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", 644, "SyncManagerDataStore.java")).u("Could not write to datastore to clear store.");
                    this.e.set(false);
                }
                return z;
            } finally {
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
