package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abvt;
import defpackage.abxs;
import defpackage.abza;
import defpackage.acjd;
import defpackage.acje;
import defpackage.acjf;
import defpackage.acjg;
import defpackage.agow;
import defpackage.ahup;
import defpackage.ahuv;
import defpackage.qps;
import defpackage.qwd;
import defpackage.qwi;
import defpackage.qwp;
import defpackage.zdv;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeCrashHandlerImpl implements qwp {
    final CountDownLatch a = new CountDownLatch(1);
    private boolean b;
    private final agow c;

    public NativeCrashHandlerImpl(agow agowVar) {
        new CountDownLatch(1);
        this.c = agowVar;
    }

    private static native Pair awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    @Override // defpackage.qwp
    public final synchronized void a(final qwd qwdVar) {
        if (this.b) {
            return;
        }
        this.b = true;
        Thread thread = new Thread(new Runnable() { // from class: qwq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(qwdVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    public final /* synthetic */ void b(qwd qwdVar) {
        acjd acjdVar;
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(false)) {
                ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 76, "NativeCrashHandlerImpl.java")).u("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                Pair pairAwaitSignal = awaitSignal();
                if (pairAwaitSignal != null) {
                    try {
                        acjg acjgVar = acjg.a;
                        acjdVar = new acjd();
                        abvt abvtVarQ = abvt.Q((ByteBuffer) pairAwaitSignal.first);
                        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                        abza abzaVar = abza.a;
                        acjdVar.n(abvtVarQ, ExtensionRegistryLite.a);
                    } catch (Throwable unused) {
                        acjdVar = null;
                    }
                    try {
                        Thread thread = (Thread) pairAwaitSignal.second;
                        if (acjdVar != null && thread != null) {
                            String name = thread.getName();
                            if ((acjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acjdVar.y();
                            }
                            acjg acjgVar2 = (acjg) acjdVar.b;
                            acjg acjgVar3 = acjg.a;
                            name.getClass();
                            acjgVar2.b |= 32;
                            acjgVar2.d = name;
                            long id = thread.getId();
                            if ((acjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acjdVar.y();
                            }
                            acjg acjgVar4 = (acjg) acjdVar.b;
                            acjgVar4.b |= 16;
                            acjgVar4.c = id;
                            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                acjf acjfVar = acjf.a;
                                acje acjeVar = new acje();
                                String className = stackTraceElement.getClassName();
                                if ((acjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acjeVar.y();
                                }
                                acjf acjfVar2 = (acjf) acjeVar.b;
                                className.getClass();
                                acjfVar2.b |= 1;
                                acjfVar2.c = className;
                                String methodName = stackTraceElement.getMethodName();
                                if ((acjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acjeVar.y();
                                }
                                acjf acjfVar3 = (acjf) acjeVar.b;
                                methodName.getClass();
                                acjfVar3.b |= 2;
                                acjfVar3.d = methodName;
                                int lineNumber = stackTraceElement.getLineNumber();
                                if ((acjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acjeVar.y();
                                }
                                acjf acjfVar4 = (acjf) acjeVar.b;
                                acjfVar4.b |= 8;
                                acjfVar4.f = lineNumber;
                                String fileName = stackTraceElement.getFileName();
                                if (fileName != null) {
                                    if ((acjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acjeVar.y();
                                    }
                                    acjf acjfVar5 = (acjf) acjeVar.b;
                                    acjfVar5.b |= 4;
                                    acjfVar5.e = fileName;
                                }
                                if ((acjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acjdVar.y();
                                }
                                acjg acjgVar5 = (acjg) acjdVar.b;
                                acjf acjfVar6 = (acjf) acjeVar.v();
                                acjfVar6.getClass();
                                abxs abxsVar = acjgVar5.e;
                                if (!abxsVar.c()) {
                                    int size = abxsVar.size();
                                    acjgVar5.e = abxsVar.d(size + size);
                                }
                                acjgVar5.e.add(acjfVar6);
                            }
                        }
                    } catch (Throwable th) {
                        ((zdv) ((zdv) ((zdv) qps.a.d()).p(th)).q("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 111, "NativeCrashHandlerImpl.java")).u("unable to populate java stack frames");
                    }
                } else {
                    acjdVar = null;
                }
                if (((Boolean) this.c.a()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                acjg acjgVar6 = acjdVar != null ? (acjg) acjdVar.v() : null;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                ahup ahupVarA = ((qwi) qwdVar).g.a(((qwi) qwdVar).a);
                if ((ahupVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahupVarA.y();
                }
                ahuv ahuvVar = (ahuv) ahupVarA.b;
                ahuv ahuvVar2 = ahuv.a;
                ahuvVar.g = 5;
                ahuvVar.b |= 16;
                if (acjgVar6 != null) {
                    if ((ahupVarA.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ahupVarA.y();
                    }
                    ahuv ahuvVar3 = (ahuv) ahupVarA.b;
                    ahuvVar3.j = acjgVar6;
                    ahuvVar3.b |= 512;
                }
                ((qwi) qwdVar).m((ahuv) ahupVarA.v(), null);
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'H', "NativeCrashHandlerImpl.java")).u("unable to load native_crash_handler_jni");
        }
    }
}
