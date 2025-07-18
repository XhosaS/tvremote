package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wil extends wik implements wgr, wip {
    public static final /* synthetic */ int f = 0;
    public wxc d;
    public agow e;

    static {
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.wgr
    public final long F() {
        return Process.getStartElapsedRealtime();
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        ClassLoader classLoader;
        if (Process.isIsolated()) {
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
        Set set = w.a;
        Log.i("MultiDex", "Installing application");
        if (w.b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        IOException e = null;
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            File file = new File(applicationInfo.sourceDir);
            File file2 = new File(applicationInfo.dataDir);
            Set set2 = w.a;
            synchronized (set2) {
                if (!set2.contains(file)) {
                    set2.add(file);
                    Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                    try {
                        classLoader = getClassLoader();
                    } catch (RuntimeException e3) {
                        Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                    }
                    if (!(classLoader instanceof BaseDexClassLoader)) {
                        Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                        classLoader = null;
                    }
                    if (classLoader != null) {
                        try {
                            File file3 = new File(getFilesDir(), "secondary-dexes");
                            if (file3.isDirectory()) {
                                Log.i("MultiDex", "Clearing old secondary dex dir (" + file3.getPath() + ").");
                                File[] fileArrListFiles = file3.listFiles();
                                if (fileArrListFiles == null) {
                                    Log.w("MultiDex", "Failed to list secondary dex dir content (" + file3.getPath() + ").");
                                } else {
                                    for (File file4 : fileArrListFiles) {
                                        Log.i("MultiDex", "Trying to delete old file " + file4.getPath() + " of size " + file4.length());
                                        if (file4.delete()) {
                                            Log.i("MultiDex", "Deleted old file ".concat(String.valueOf(file4.getPath())));
                                        } else {
                                            Log.w("MultiDex", "Failed to delete old file ".concat(String.valueOf(file4.getPath())));
                                        }
                                    }
                                    if (file3.delete()) {
                                        Log.i("MultiDex", "Deleted old secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                    } else {
                                        Log.w("MultiDex", "Failed to delete secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                        }
                        File file5 = new File(file2, "code_cache");
                        try {
                            w.c(file5);
                        } catch (IOException unused) {
                            file5 = new File(getFilesDir(), "code_cache");
                            w.c(file5);
                        }
                        File file6 = new File(file5, "secondary-dexes");
                        w.c(file6);
                        z zVar = new z(file, file6);
                        try {
                            try {
                                w.b(classLoader, file6, zVar.a(this, false));
                            } catch (IOException e4) {
                                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e4);
                                w.b(classLoader, file6, zVar.a(this, true));
                            }
                            try {
                            } catch (IOException e5) {
                                e = e5;
                            }
                            if (e != null) {
                                throw e;
                            }
                        } finally {
                            try {
                                zVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            }
            Log.i("MultiDex", "install done");
        } catch (Exception e6) {
            Log.e("MultiDex", "MultiDex installation failure", e6);
            throw new RuntimeException("MultiDex installation failed (" + e6.getMessage() + ").");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean f() {
        /*
            r5 = this;
            java.lang.Boolean r0 = defpackage.roa.b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L6f
            boolean r0 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m138m()
            if (r0 == 0) goto Le
        Lc:
            r0 = r2
            goto L69
        Le:
            java.lang.String r0 = defpackage.roa.a
            if (r0 != 0) goto L30
            java.lang.String r0 = defpackage.rnu.b()
            if (r0 != 0) goto L1a
            r0 = 0
            goto L30
        L1a:
            r3 = 58
            int r3 = r0.indexOf(r3)
            r4 = -1
            if (r3 != r4) goto L28
            java.lang.String r0 = ""
            defpackage.roa.a = r0
            goto L2e
        L28:
            java.lang.String r0 = r0.substring(r3)
            defpackage.roa.a = r0
        L2e:
            java.lang.String r0 = defpackage.roa.a
        L30:
            if (r0 != 0) goto L34
        L32:
            r0 = r1
            goto L69
        L34:
            int r3 = r0.hashCode()
            switch(r3) {
                case -737791795: goto L57;
                case -733923188: goto L4e;
                case 1771111950: goto L45;
                case 1892872565: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L60
        L3c:
            java.lang.String r3 = ":leakcanary"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
            goto L5f
        L45:
            java.lang.String r3 = ":train"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
            goto L5f
        L4e:
            java.lang.String r3 = ":learning_bg"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
            goto L5f
        L57:
            java.lang.String r3 = ":primes_lifeboat"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
        L5f:
            goto Lc
        L60:
            java.lang.String r3 = ":privileged_process"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L32
            goto Lc
        L69:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.roa.b = r0
        L6f:
            java.lang.Boolean r0 = defpackage.roa.b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L78
            return r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wil.f():boolean");
    }

    @Override // android.app.Application
    public void onCreate() {
        wvx wvxVarF;
        if (!f()) {
            super.onCreate();
            return;
        }
        if (wum.t()) {
            ((rnz) this.e.a()).a();
            super.onCreate();
            return;
        }
        long jB = win.b();
        long jA = win.a(jB);
        wyt wytVarC = wyt.c();
        if (wytVarC.e()) {
            wvl wvlVarC = this.d.c("com/google/apps/tiktok/inject/baseclasses/TikTokApplication", "onCreate", 73, jA, jB * 1000000);
            try {
                wum.o();
                wvxVarF = wzg.f("Application.onCreate", wwb.a, true);
                try {
                    ((rnz) this.e.a()).a();
                    super.onCreate();
                    wvxVarF.close();
                    wvlVarC.close();
                } finally {
                }
            } finally {
            }
        } else {
            wwt wwtVarA = wytVarC.a();
            try {
                wwc wwcVar = wwb.a;
                wvxVarF = wzg.f("Application creation", wwcVar, true);
                try {
                    wvx wvxVarF2 = wzg.f("Application.onCreate", wwcVar, true);
                    try {
                        ((rnz) this.e.a()).a();
                        super.onCreate();
                        wvxVarF2.close();
                        wvxVarF.close();
                        wum.g(wum.c(), ((wys) wwtVarA).a);
                    } finally {
                    }
                } finally {
                    try {
                        wvxVarF.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        }
    }
}
