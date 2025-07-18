package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import defpackage.as;
import defpackage.ctn;
import defpackage.fm$$ExternalSyntheticApiModelOutline0;
import defpackage.is;
import defpackage.it;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "android.support.v7.app.AppLocalesMetadataHolderService";
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final String TAG = "AppCompatDelegate";
    static SerialExecutor sSerialExecutorForLocalesStorage = new SerialExecutor(new ThreadPerTaskExecutor());
    private static int sDefaultNightMode = -100;
    private static ctn sRequestedAppLocales = null;
    private static ctn sStoredAppLocales = null;
    private static Boolean sIsAutoStoreLocalesOptedIn = null;
    static final boolean DEBUG = false;
    private static boolean sIsFrameworkSyncChecked = DEBUG;
    private static final it<WeakReference<AppCompatDelegate>> sActivityDelegates = new it<>();
    private static final Object sActivityDelegatesLock = new Object();
    private static final Object sAppLocalesStorageSyncLock = new Object();

    /* compiled from: PG */
    class Api24Impl {
        private Api24Impl() {
        }

        static LocaleList localeListForLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: PG */
    class Api33Impl {
        private Api33Impl() {
        }

        static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return fm$$ExternalSyntheticApiModelOutline0.m(obj).getApplicationLocales();
        }

        static void localeManagerSetApplicationLocales(Object obj, LocaleList localeList) {
            fm$$ExternalSyntheticApiModelOutline0.m(obj).setApplicationLocales(localeList);
        }
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    /* compiled from: PG */
    class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue<Runnable> mTasks = new ArrayDeque();

        public SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.mLock) {
                this.mTasks.add(new Runnable() { // from class: android.support.v7.app.AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m63xdfed17bf(runnable);
                    }
                });
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* renamed from: lambda$execute$0$android-support-v7-app-AppCompatDelegate$SerialExecutor, reason: not valid java name */
        public /* synthetic */ void m63xdfed17bf(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                Runnable runnablePoll = this.mTasks.poll();
                this.mActive = runnablePoll;
                if (runnablePoll != null) {
                    this.mExecutor.execute(runnablePoll);
                }
            }
        }
    }

    /* compiled from: PG */
    class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static void addActiveDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
            sActivityDelegates.add(new WeakReference<>(appCompatDelegate));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void applyDayNightToActiveDelegates() {
        synchronized (sActivityDelegatesLock) {
            is isVar = new is(sActivityDelegates);
            while (isVar.hasNext()) {
                AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) isVar.next()).get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void applyLocalesToActiveDelegates() {
        is isVar = new is(sActivityDelegates);
        while (isVar.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) isVar.next()).get();
            if (appCompatDelegate != null) {
                appCompatDelegate.applyAppLocales();
            }
        }
    }

    public static AppCompatDelegate create(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static ctn getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                return ctn.d(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
        } else {
            ctn ctnVar = sRequestedAppLocales;
            if (ctnVar != null) {
                return ctnVar;
            }
        }
        return ctn.a;
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Object getLocaleManagerForApplication() {
        Context contextForDelegate;
        is isVar = new is(sActivityDelegates);
        while (isVar.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) isVar.next()).get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    static ctn getRequestedAppLocales() {
        return sRequestedAppLocales;
    }

    static ctn getStoredAppLocales() {
        return sStoredAppLocales;
    }

    static boolean isAutoStorageOptedIn(Context context) {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                ServiceInfo serviceInfo = AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                sIsAutoStoreLocalesOptedIn = Boolean.valueOf(DEBUG);
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(Context context) {
        syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    static void removeActivityDelegate(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(appCompatDelegate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void removeDelegateFromActives(AppCompatDelegate appCompatDelegate) {
        synchronized (sActivityDelegatesLock) {
            is isVar = new is(sActivityDelegates);
            while (isVar.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) isVar.next()).get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    isVar.remove();
                }
            }
        }
    }

    static void resetStaticRequestedAndStoredLocales() {
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    public static void setApplicationLocales(ctn ctnVar) {
        ctnVar.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication();
            if (localeManagerForApplication != null) {
                Api33Impl.localeManagerSetApplicationLocales(localeManagerForApplication, Api24Impl.localeListForLanguageTags(ctnVar.e()));
                return;
            }
            return;
        }
        if (ctnVar.equals(sRequestedAppLocales)) {
            return;
        }
        synchronized (sActivityDelegatesLock) {
            sRequestedAppLocales = ctnVar;
            applyLocalesToActiveDelegates();
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static void setDefaultNightMode(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && sDefaultNightMode != i) {
            sDefaultNightMode = i;
            applyDayNightToActiveDelegates();
        }
    }

    static void setIsAutoStoreLocalesOptedIn(boolean z) {
        sIsAutoStoreLocalesOptedIn = Boolean.valueOf(z);
    }

    static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (getApplicationLocales().g()) {
                    String strA = as.a(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        Api33Impl.localeManagerSetApplicationLocales(systemService, Api24Impl.localeListForLanguageTags(strA));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.xmlpull.v1.XmlSerializer] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [ctn] */
    public static void syncRequestedAndStoredLocales(final Context context) {
        if (isAutoStorageOptedIn(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (sIsFrameworkSyncChecked) {
                    return;
                }
                sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: android.support.v7.app.AppCompatDelegate$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                    }
                });
                return;
            }
            synchronized (sAppLocalesStorageSyncLock) {
                ctn ctnVar = sRequestedAppLocales;
                if (ctnVar == null) {
                    if (sStoredAppLocales == null) {
                        sStoredAppLocales = ctn.c(as.a(context));
                    }
                    if (sStoredAppLocales.g()) {
                        return;
                    }
                    context = sStoredAppLocales;
                    sRequestedAppLocales = context;
                } else if (!ctnVar.equals(sStoredAppLocales)) {
                    ctn ctnVar2 = sRequestedAppLocales;
                    sStoredAppLocales = ctnVar2;
                    String strE = ctnVar2.e();
                    synchronized (as.a) {
                        if (strE.equals("")) {
                            context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                        } else {
                            try {
                                context = context.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                ?? NewSerializer = Xml.newSerializer();
                                try {
                                    try {
                                        NewSerializer.setOutput(context, null);
                                        NewSerializer.startDocument("UTF-8", true);
                                        NewSerializer.startTag(null, "locales");
                                        NewSerializer.attribute(null, "application_locales", strE);
                                        NewSerializer.endTag(null, "locales");
                                        NewSerializer.endDocument();
                                    } catch (Exception e) {
                                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                        if (context != 0) {
                                        }
                                    }
                                    if (context != 0) {
                                        try {
                                            context.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (context != 0) {
                                        try {
                                            context.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (FileNotFoundException unused3) {
                                context = "AppLocalesStorageHelper";
                                Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file"));
                            }
                        }
                    }
                }
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public boolean applyAppLocales() {
        return DEBUG;
    }

    public abstract boolean applyDayNight();

    public void asyncExecuteSyncRequestedAndStoredLocales(final Context context) {
        sSerialExecutorForLocalesStorage.execute(new Runnable() { // from class: android.support.v7.app.AppCompatDelegate$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AppCompatDelegate.syncRequestedAndStoredLocales(context);
            }
        });
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i);

    public Context getContextForDelegate() {
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTitle(CharSequence charSequence);

    public abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static AppCompatDelegate create(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, activity, appCompatCallback);
    }

    public static AppCompatDelegate create(Context context, Window window, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void setTheme(int i) {
    }
}
