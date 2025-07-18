package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ByteStore {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ByteStore {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        public static native ByteStore create(ByteStoreConfig byteStoreConfig, ExecutorRegistry executorRegistry);

        public static native ByteStore createWithQueues(ByteStoreConfig byteStoreConfig, TaskQueue taskQueue, TaskQueue taskQueue2, TaskQueue taskQueue3);

        public static native void nativeDestroy(long j);

        private native void native_clear(long j);

        private native Transaction native_createTransaction(long j);

        private native Transaction native_createTransactionWithContext(long j, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);

        private native ByteStoreDebugStats native_debugStats(long j);

        private native byte[] native_get(long j, String str);

        private native void native_legacySet(long j, String str, byte[] bArr);

        private native void native_set(long j, String str, byte[] bArr);

        private native void native_setWithMetadata(long j, String str, byte[] bArr, byte[] bArr2);

        private native Snapshot native_snapshot(long j);

        private native Subscription native_subscribe(long j, String str, Observer observer);

        private native ArrayList native_subscribeList(long j, ArrayList arrayList, Observer observer);

        private native Subscription native_subscribeOnQueue(long j, String str, TaskQueue taskQueue, Observer observer);

        private native FaultSubscription native_subscribeToFaults(long j, FaultObserver faultObserver);

        private native Subscription native_subscribeWithContext(long j, String str, ContextObserver contextObserver);

        private native Subscription native_subscribeWithPriority(long j, String str, Observer observer, int i);

        private native void native_transact(long j, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionClosure transactionClosure, TransactionCallback transactionCallback, TransactionCallback transactionCallback2);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Transaction createTransaction() {
            return native_createTransaction(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Transaction createTransactionWithContext(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
            return native_createTransactionWithContext(this.nativeRef, transactionContextOuterClass$TransactionContext);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public ByteStoreDebugStats debugStats() {
            return native_debugStats(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public byte[] get(String str) {
            return native_get(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void legacySet(String str, byte[] bArr) {
            native_legacySet(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void set(String str, byte[] bArr) {
            native_set(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void setWithMetadata(String str, byte[] bArr, byte[] bArr2) {
            native_setWithMetadata(this.nativeRef, str, bArr, bArr2);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Snapshot snapshot() {
            return native_snapshot(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Subscription subscribe(String str, Observer observer) {
            return native_subscribe(this.nativeRef, str, observer);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public ArrayList subscribeList(ArrayList arrayList, Observer observer) {
            return native_subscribeList(this.nativeRef, arrayList, observer);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Subscription subscribeOnQueue(String str, TaskQueue taskQueue, Observer observer) {
            return native_subscribeOnQueue(this.nativeRef, str, taskQueue, observer);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public FaultSubscription subscribeToFaults(FaultObserver faultObserver) {
            return native_subscribeToFaults(this.nativeRef, faultObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Subscription subscribeWithContext(String str, ContextObserver contextObserver) {
            return native_subscribeWithContext(this.nativeRef, str, contextObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public Subscription subscribeWithPriority(String str, Observer observer, int i) {
            return native_subscribeWithPriority(this.nativeRef, str, observer, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.ByteStore
        public void transact(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionClosure transactionClosure, TransactionCallback transactionCallback, TransactionCallback transactionCallback2) {
            native_transact(this.nativeRef, transactionContextOuterClass$TransactionContext, transactionClosure, transactionCallback, transactionCallback2);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            this.registeredWithNativeObjectManager = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static ByteStore create(ByteStoreConfig byteStoreConfig, ExecutorRegistry executorRegistry) {
        return CppProxy.create(byteStoreConfig, executorRegistry);
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j);
        proxyMap.b(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    public static ByteStore createWithQueues(ByteStoreConfig byteStoreConfig, TaskQueue taskQueue, TaskQueue taskQueue2, TaskQueue taskQueue3) {
        return CppProxy.createWithQueues(byteStoreConfig, taskQueue, taskQueue2, taskQueue3);
    }

    private static CppProxy getExistingProxy(long j) {
        wu wuVar = proxyMap;
        WeakReference weakReference = (WeakReference) wuVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        wuVar.c(j);
        return null;
    }

    public abstract void clear();

    public abstract Transaction createTransaction();

    public abstract Transaction createTransactionWithContext(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);

    public abstract ByteStoreDebugStats debugStats();

    public abstract byte[] get(String str);

    public abstract void legacySet(String str, byte[] bArr);

    public abstract void set(String str, byte[] bArr);

    public abstract void setWithMetadata(String str, byte[] bArr, byte[] bArr2);

    public abstract Snapshot snapshot();

    public abstract Subscription subscribe(String str, Observer observer);

    public abstract ArrayList subscribeList(ArrayList arrayList, Observer observer);

    public abstract Subscription subscribeOnQueue(String str, TaskQueue taskQueue, Observer observer);

    public abstract FaultSubscription subscribeToFaults(FaultObserver faultObserver);

    public abstract Subscription subscribeWithContext(String str, ContextObserver contextObserver);

    public abstract Subscription subscribeWithPriority(String str, Observer observer, int i);

    public abstract void transact(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, TransactionClosure transactionClosure, TransactionCallback transactionCallback, TransactionCallback transactionCallback2);
}
