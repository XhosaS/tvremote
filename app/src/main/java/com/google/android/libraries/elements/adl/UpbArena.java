package com.google.android.libraries.elements.adl;

import dalvik.annotation.optimization.CriticalNative;
import dalvik.annotation.optimization.FastNative;
import defpackage.mio;
import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpbArena {
    public final long a;
    private final UpbAlloc alloc;

    public UpbArena() {
        throw null;
    }

    @CriticalNative
    private static native long jniDebugGetRefCount(long j);

    @CriticalNative
    public static native void jniDecrementReferenceCount(long j);

    public static native void jniEnableDirectByteBufferAllocator();

    @CriticalNative
    private static native void jniFuse(long j, long j2);

    @CriticalNative
    public static native long jniGetHostTid();

    @FastNative
    private static native UpbAlloc jniGetUpbAlloc(long j);

    @CriticalNative
    public static native boolean jniIncrementReferenceCount(long j);

    @CriticalNative
    public static native long jniNewInstance();

    public UpbArena(long j) {
        Object obj;
        Object obj2;
        this.a = j;
        this.alloc = jniGetUpbAlloc(j);
        mio mioVar = new mio(this, j, mio.a);
        loop0: while (true) {
            AtomicReference atomicReference = mio.c;
            obj = atomicReference.get();
            obj2 = mio.b;
            mioVar.f = obj == obj2 ? null : (mio) obj;
            while (!atomicReference.compareAndSet(obj, mioVar)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
        }
        Reference.reachabilityFence(this);
        if (obj == obj2) {
            mio.a();
        }
    }
}
