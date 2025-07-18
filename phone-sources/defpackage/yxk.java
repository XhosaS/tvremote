package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxk<T> {
    public volatile AtomicReferenceArray<T> array;

    public yxk(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final Object a(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void b(int i, Object obj) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(ykn.j(i + 1, length + length));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
