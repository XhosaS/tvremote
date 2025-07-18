package defpackage;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yxx extends yws {
    public static final yxx a = new yxx();
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    private yxx() {
    }

    @Override // defpackage.yws
    public final yjv a(Class cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            yjv yjvVar = (yjv) c.get(cls);
            if (yjvVar != null) {
                return yjvVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = c;
                yjv yjvVar2 = (yjv) weakHashMap.get(cls);
                if (yjvVar2 != null) {
                    return yjvVar2;
                }
                yjv yjvVarB = ywx.b(cls);
                weakHashMap.put(cls, yjvVarB);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return yjvVarB;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
