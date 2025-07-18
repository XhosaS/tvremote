package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awy {
    public final Object a;
    public final Object b;

    public awy(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public static final boolean C(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener D(KeyListener keyListener) {
        if (C(keyListener) && !(keyListener instanceof uk)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new uk(keyListener);
            }
        }
        return keyListener;
    }

    public static final cxq a(boolean z, atc atcVar) {
        byg bygVarA;
        byg bygVarH;
        byg bygVar;
        clo cloVarO = cxq.a.o();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        cxq cxqVar = (cxq) cltVar;
        cxqVar.b |= 1;
        cxqVar.c = elapsedCpuTime;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        cxq cxqVar2 = (cxq) cloVarO.b;
        cxqVar2.b |= 2;
        cxqVar2.d = z;
        int iActiveCount = Thread.activeCount();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cxq cxqVar3 = (cxq) cloVarO.b;
        cxqVar3.b |= 4;
        cxqVar3.e = iActiveCount;
        int iMyPid = Process.myPid();
        int i = 0;
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(iMyPid));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    bygVarA = byg.g(randomAccessFile.readLine()).a(new ata(6));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                bygVarA = bxw.a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (bygVarA.f()) {
                int iIntValue = ((Integer) bygVarA.b()).intValue();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cxq cxqVar4 = (cxq) cloVarO.b;
                cxqVar4.b |= 16;
                cxqVar4.g = iIntValue;
            }
            if (atcVar.a) {
                Iterator<E> it = atcVar.a().iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        bygVarH = bxw.a;
                        break;
                    }
                    Object next = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                        bygVarH = byg.h(next);
                        break;
                    }
                }
                bygVar = (byg) bygVarH.a(new ata(i)).d(bxw.a);
            } else {
                bygVar = bxw.a;
            }
            if (bygVar.f()) {
                String strFlattenToString = ((ComponentName) bygVar.b()).flattenToString();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cxq cxqVar5 = (cxq) cloVarO.b;
                strFlattenToString.getClass();
                cxqVar5.b |= 32;
                cxqVar5.h = strFlattenToString;
            }
            return (cxq) cloVarO.i();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    public static awy c(long j) {
        return new awy(Long.TYPE, (Object) Long.valueOf(j));
    }

    public final void A() {
        ((SparseIntArray) this.a).clear();
    }

    public final void B(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, cu.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ul ulVar = (ul) ((awy) this.a).a;
            if (ulVar.a != z) {
                ulVar.a = z;
                if (z) {
                    synchronized (ue.a) {
                        ue ueVar = ue.b;
                        throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection E(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof uj) ? new uj((TextView) ((awy) this.a).b, inputConnection) : inputConnection;
    }

    public final void F(q qVar, Bundle bundle, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.F(qVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void G(q qVar, boolean z) {
        qVar.getClass();
        am amVar = (am) this.b;
        Context context = amVar.l.c;
        q qVar2 = amVar.n;
        if (qVar2 != null) {
            qVar2.k().w.G(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void H(q qVar, Bundle bundle, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.H(qVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void I(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.I(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void J(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.J(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void K(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.K(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void L(q qVar, boolean z) {
        qVar.getClass();
        am amVar = (am) this.b;
        Context context = amVar.l.c;
        q qVar2 = amVar.n;
        if (qVar2 != null) {
            qVar2.k().w.L(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void M(q qVar, Bundle bundle, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.M(qVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void N(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.N(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void O(q qVar, Bundle bundle, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.O(qVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void P(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.P(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void Q(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.Q(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void R(q qVar, View view, Bundle bundle, boolean z) {
        qVar.getClass();
        view.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.R(qVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void S(q qVar, boolean z) {
        qVar.getClass();
        q qVar2 = ((am) this.b).n;
        if (qVar2 != null) {
            qVar2.k().w.S(qVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final aoe b(List list) throws RemoteException {
        aoa aoaVar;
        byte[] bArr;
        aob aobVar;
        aoe aoeVar = new aoe();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                aoaVar = (aoa) ((cja) it.next()).get();
                Object obj = this.b;
                bArr = null;
                if (obj != null) {
                    try {
                        aod aodVar = aoaVar.c;
                        if (aodVar == null || (aobVar = aoaVar.b) == null) {
                            Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                        } else {
                            aco acoVar = aobVar.b;
                            int i = aodVar.a(acoVar).b;
                            anv anvVar = ((anr) obj).b;
                            if (i == 5) {
                                String str = aobVar.a;
                                Bundle bundleA = ((anu) anvVar).a();
                                bundleA.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((anu) anvVar).b.call("mark_fix_completed", null, bundleA);
                            } else {
                                aodVar.a(acoVar);
                                String str2 = aobVar.a;
                                Bundle bundleA2 = ((anu) anvVar).a();
                                bundleA2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((anu) anvVar).b.call("mark_fix_attempted", null, bundleA2);
                            }
                        }
                    } catch (RemoteException unused) {
                        aod aodVar2 = ((anr) obj).c;
                        clo cloVarO = adc.a.o();
                        aob aobVar2 = aoaVar.b;
                        aco acoVar2 = aobVar2.b;
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        ((adc) cloVarO.b).b = acoVar2.a();
                        String str3 = aobVar2.a;
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        Context context = aodVar2.b;
                        ant antVar = ((anr) obj).a;
                        adc adcVar = (adc) cloVarO.b;
                        str3.getClass();
                        adcVar.d = str3;
                        antVar.c(context, (adc) cloVarO.i(), aodVar2.a);
                    }
                }
                aoeVar.a |= aoaVar.b();
                aoeVar.b |= aoaVar.a();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
            if (aoaVar.a() && aoaVar.c != null) {
                Context context2 = aoaVar.c.b;
                synchronized (aog.class) {
                    Thread thread = aog.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    if (aog.b != null) {
                        Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                        aog.b.getClass();
                    } else {
                        Thread thread2 = new Thread(new ama(context2.getApplicationContext(), 2, bArr));
                        thread2.start();
                        aog.a = thread2;
                        aog.b = thread2;
                    }
                }
            } else if (aoaVar.b()) {
                synchronized (aog.class) {
                    Thread thread3 = aog.a;
                    if (thread3 == null || !thread3.isAlive()) {
                        Thread thread4 = new Thread(new om(4));
                        thread4.start();
                        aog.a = thread4;
                    } else {
                        Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                        aog.a.getClass();
                    }
                }
            } else {
                continue;
            }
        }
        return aoeVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    public final boolean d() {
        if (!bdq.b()) {
            return false;
        }
        Context context = (Context) this.b;
        String strA = bdq.a(context);
        if (strA == null) {
            return true;
        }
        ?? r3 = this.a;
        int size = r3.size();
        if (size == 0) {
            return strA.equals(context.getPackageName());
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String strA2 = ((bdr) biu.l(r3)).a();
        bdq.h(strA2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", strA2);
        return strA.equals(String.valueOf(context.getPackageName()).concat(String.valueOf(strA2)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [bco, java.lang.Object] */
    public final bcl e(String str, long j) {
        return new bcg((String) this.a, str, this.b, j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bco, java.lang.Object] */
    public final bcl f(String str, boolean z) {
        return new bcc((String) this.a, str, this.b, z);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [bco, java.lang.Object] */
    public final bcl g(String str, bcb bcbVar, String str2) {
        return new bce((String) this.a, str, this.b, bcbVar, str2);
    }

    public final boolean h(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object[] objArr;
        try {
            Class<?> cls = packageManager.getClass();
            Object obj = this.b;
            Object obj2 = this.a;
            Method method = cls.getMethod((String) obj, (Class[]) obj2);
            if (((Class[]) obj2).length == 2) {
                if (((Class[]) obj2)[0] == String.class && ((Class[]) obj2)[1] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, iPackageStatsObserver};
                    method.invoke(packageManager, objArr);
                    return true;
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
            }
            if (((Class[]) obj2)[0] == String.class && ((Class[]) obj2)[1] == Integer.TYPE && ((Class[]) obj2)[2] == IPackageStatsObserver.class) {
                objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                method.invoke(packageManager, objArr);
                return true;
            }
            throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
        } catch (Error e) {
            e = e;
            int i2 = aya.b;
            ((cbs) aqn.a.e().j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 123, "PackageStatsCapture.java")).A("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        } catch (NoSuchMethodException e2) {
            int i3 = aya.b;
            ((cbs) ((cbs) aqn.a.b().i(e2)).j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 117, "PackageStatsCapture.java")).p("PackageStats getter not found");
            return false;
        } catch (Exception e3) {
            e = e3;
            int i22 = aya.b;
            ((cbs) aqn.a.e().j("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsInvocation", "invoke", 123, "PackageStatsCapture.java")).A("%s for %s (%s) invocation", e.getClass().getSimpleName(), this.b, Arrays.asList((Object[]) this.a));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void i(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.b;
        synchronized (r0) {
            map = new HashMap((Map) r0);
        }
        ?? r2 = this.a;
        synchronized (r2) {
            map2 = new HashMap((Map) r2);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((adx) entry2.getKey()).g(new afy(status));
            }
        }
    }

    public final void j() {
        ((abn) this.b).a();
    }

    public final void k(Bundle bundle) {
        abn abnVar = (abn) this.b;
        if (!abnVar.c) {
            abnVar.a();
        }
        abk abkVar = abnVar.a;
        if (abkVar.m().a.a(xb.d)) {
            xb xbVar = abkVar.m().a;
            Objects.toString(xbVar);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(xbVar)));
        }
        if (abnVar.e) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleA = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleA = abh.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abnVar.d = bundleA;
        abnVar.e = true;
    }

    public final void l(Bundle bundle) {
        Bundle bundleD = mo.D((csa[]) Arrays.copyOf(new csa[0], 0));
        Object obj = this.b;
        abn abnVar = (abn) obj;
        Bundle bundle2 = abnVar.d;
        if (bundle2 != null) {
            bundleD.putAll(bundle2);
        }
        synchronized (abnVar.f) {
            for (Map.Entry entry : ((abn) obj).b.entrySet()) {
                abl.a(bundleD, (String) entry.getKey(), ((abj) entry.getValue()).a());
            }
        }
        if (bundleD.isEmpty()) {
            return;
        }
        abl.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleD);
    }

    public final void m(final Runnable runnable) {
        ((Choreographer) this.b).postFrameCallback(new Choreographer.FrameCallback() { // from class: tz
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void n(dln dlnVar) {
        if (dlnVar.a != 0) {
            this.b.execute(new om(0));
            return;
        }
        Object obj = dlnVar.b;
        this.b.execute(new bb((asv) this.a, (Typeface) obj, 12));
    }

    public final void o(ja jaVar) {
        mi miVar = (mi) this.b;
        kb kbVarA = (kb) miVar.get(jaVar);
        if (kbVarA == null) {
            kbVarA = kb.a();
            miVar.put(jaVar, kbVarA);
        }
        kbVarA.a |= 1;
    }

    public final void p(long j, ja jaVar) {
        ((mf) this.a).e(j, jaVar);
    }

    public final void q() {
        ((mi) this.b).clear();
        ((mf) this.a).d();
    }

    public final void r(ja jaVar) {
        kb kbVar = (kb) ((mi) this.b).get(jaVar);
        if (kbVar == null) {
            return;
        }
        kbVar.a &= -2;
    }

    public final void s(ja jaVar) {
        mf mfVar = (mf) this.a;
        int iA = mfVar.a();
        while (true) {
            iA--;
            if (iA < 0) {
                break;
            }
            if (jaVar == mfVar.c(iA)) {
                Object[] objArr = mfVar.c;
                Object obj = objArr[iA];
                Object obj2 = mg.a;
                if (obj != obj2) {
                    objArr[iA] = obj2;
                    mfVar.a = true;
                }
            }
        }
        kb kbVar = (kb) ((mi) this.b).remove(jaVar);
        if (kbVar != null) {
            kb.b(kbVar);
        }
    }

    public final boolean t(ja jaVar) {
        kb kbVar = (kb) ((mi) this.b).get(jaVar);
        return (kbVar == null || (kbVar.a & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ka] */
    public final View u(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int iD = r0.d();
        int iC = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            jz jzVar = (jz) this.a;
            jzVar.c(iD, iC, iB, iA);
            jzVar.b();
            jzVar.a(i3);
            if (jzVar.d()) {
                return viewE;
            }
            jzVar.b();
            jzVar.a(i4);
            int i6 = 1;
            if (true == jzVar.d()) {
                view = viewE;
            }
            if (i2 <= i) {
                i6 = -1;
            }
            i5 += i6;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ka] */
    public final boolean v(View view) {
        Object obj = this.a;
        ?? r1 = this.b;
        jz jzVar = (jz) obj;
        jzVar.c(r1.d(), r1.c(), r1.b(view), r1.a(view));
        jzVar.b();
        jzVar.a(24579);
        return jzVar.d();
    }

    public final pv w(ja jaVar, int i) {
        kb kbVar;
        pv pvVar;
        mi miVar = (mi) this.b;
        int iB = miVar.b(jaVar);
        if (iB >= 0 && (kbVar = (kb) miVar.f(iB)) != null) {
            int i2 = kbVar.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                kbVar.a = i3;
                if (i == 4) {
                    pvVar = kbVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pvVar = kbVar.d;
                }
                if ((i3 & 12) == 0) {
                    miVar.d(iB);
                    kb.b(kbVar);
                }
                return pvVar;
            }
        }
        return null;
    }

    public final void x(ja jaVar, pv pvVar) {
        mi miVar = (mi) this.b;
        kb kbVarA = (kb) miVar.get(jaVar);
        if (kbVarA == null) {
            kbVarA = kb.a();
            miVar.put(jaVar, kbVarA);
        }
        kbVarA.d = pvVar;
        kbVarA.a |= 8;
    }

    public final void y(ja jaVar, pv pvVar) {
        mi miVar = (mi) this.b;
        kb kbVarA = (kb) miVar.get(jaVar);
        if (kbVarA == null) {
            kbVarA = kb.a();
            miVar.put(jaVar, kbVarA);
        }
        kbVarA.c = pvVar;
        kbVarA.a |= 4;
    }

    public final void z() {
        ((SparseIntArray) this.b).clear();
    }

    public awy(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public awy(abn abnVar) {
        this.b = abnVar;
        this.a = new adx(abnVar);
    }

    public awy(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public awy(Class cls, Object obj) {
        this.b = cls;
        this.a = obj;
    }

    public awy(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public awy(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public awy(String str, Class[] clsArr) {
        this.b = str;
        this.a = clsArr;
    }

    public awy(ka kaVar) {
        this.b = kaVar;
        this.a = new jz();
    }

    public awy(am amVar) {
        this.b = amVar;
        this.a = new CopyOnWriteArrayList();
    }

    public awy(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public awy(Context context, Map map) {
        this.b = context;
        this.a = map.keySet();
    }

    public awy(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public awy(byte[] bArr, byte[] bArr2) {
        aof aofVar = new aof(1);
        this.a = new bzz();
        this.b = aofVar;
    }

    public awy(byte[] bArr, char[] cArr) {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }

    public awy(char[] cArr) {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public awy(char[] cArr, byte[] bArr) {
        this.b = new mi();
        this.a = new mf();
    }

    public awy(Context context, byte[] bArr) {
        bfv bfvVarC = sd.c(context);
        qr qrVar = akm.a;
        ExecutorService executorServiceG = qr.g(4);
        Pattern pattern = beq.a;
        bep bepVar = new bep(context);
        bepVar.c("app_doctor");
        bepVar.d("AppDoctor.pb");
        Uri uriA = bepVar.a();
        bfs bfsVarA = bft.a();
        bfsVarA.d(uriA);
        bfsVarA.c(aot.a);
        this.b = bfvVarC.a(bfsVarA.a());
        this.a = executorServiceG;
    }

    public awy(EditText editText, byte[] bArr) {
        this.b = editText;
        this.a = new awy(editText);
    }

    public awy(EditText editText) {
        this.b = editText;
        ul ulVar = new ul(editText);
        this.a = ulVar;
        editText.addTextChangedListener(ulVar);
        editText.setEditableFactory(ui.a());
    }

    public awy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public awy(Locale locale) {
        this.b = locale;
        this.a = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i = minimum; i <= maximum; i++) {
            strArr[i - minimum] = String.format("%02d", Integer.valueOf(i));
        }
    }

    public awy(anr anrVar) {
        this.a = new ArrayList();
        this.b = anrVar;
    }

    public awy() {
        this.a = new WeakHashMap();
        this.b = new asb(this);
    }

    public awy(Context context) {
        this.a = new atl();
        this.b = context;
    }

    public awy(crv crvVar, crv crvVar2) {
        this.a = crvVar;
        crvVar2.getClass();
        this.b = crvVar2;
    }
}
