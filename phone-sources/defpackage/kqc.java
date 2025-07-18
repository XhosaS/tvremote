package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.apps.play.movies.common.VideosGlobals;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kqc extends Application implements xce, kqa {
    public static final /* synthetic */ int i = 0;
    private static boolean j;
    public xcd a;
    public lfn b;
    public lie c;
    public mef d;
    public kqy e;
    public xbw f;
    public volatile boolean g = true;
    public mma h;

    static {
        rtx.a.d();
    }

    private final synchronized void a() {
        if (this.b.cY() || this.b.cX()) {
            kfw.S(this, this.b, this.c);
        }
    }

    @Override // defpackage.xce
    public final /* synthetic */ xby androidInjector() {
        return this.a;
    }

    public abstract kpz b();

    public abstract VideosGlobals c();

    protected abstract xby d();

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lfn] */
    @Override // android.app.Application
    public void onCreate() throws IOException {
        ujf ujfVarA;
        super.onCreate();
        lig ligVarA = lig.a();
        ligVarA.e = 2;
        ligVarA.a = new ArrayList();
        ligVarA.b = new HashSet();
        ligVarA.c = 0L;
        ligVarA.d = 0L;
        ligVarA.a.clear();
        ligVarA.b.clear();
        lig.a().b(xbu.APPLICATION_VIDEOS);
        rxa.f(this);
        rtx.a.a(this);
        if (getApplicationInfo().enabled && this.g) {
            synchronized (this) {
                if (this.g) {
                    d().a(this);
                    if (this.g) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the VideosApplication");
                    }
                }
            }
        }
        if (j) {
            return;
        }
        j = true;
        meb mebVar = meb.a;
        krf.b();
        meb mebVar2 = meb.a;
        a.ab(!mebVar2.b);
        mebVar2.b = true;
        registerActivityLifecycleCallbacks(mebVar2);
        if (getApplicationInfo().enabled) {
            a();
            this.f.b();
            kqy kqyVar = this.e;
            lig.a().b(xbu.VIDEO_INITIALIZER_START);
            Object obj = kqyVar.b;
            ?? r5 = kqyVar.c;
            r5.getClass();
            if (r5.cM()) {
                uje ujeVar = new uje();
                ujeVar.b("AIzaSyClFtqEEBlklRPkfZN9FgKyh6RvSr8NAYM");
                ujeVar.c("1:68971793635:android:739ea3b3fe8d5f2a");
                ujeVar.c = "https://com-api-project-68971793635.firebaseio.com";
                ujeVar.d = "68971793635";
                ujeVar.e = "google.com:api-project-68971793635";
                ujfVarA = ujeVar.a();
            } else {
                uje ujeVar2 = new uje();
                ujeVar2.b("AIzaSyDiZ_kiPNv0UejLYrogztWJESZyHh5chmM");
                ujeVar2.c("1:316244322451:android:739ea3b3fe8d5f2a");
                ujeVar2.c = "https://com-api-project-316244322451.firebaseio.com";
                ujeVar2.d = "316244322451";
                ujeVar2.e = "google.com:api-project-316244322451";
                ujfVarA = ujeVar2.a();
            }
            Context context = (Context) obj;
            uiz.c(context, ujfVarA, "[DEFAULT]");
            mebVar2.c.b(new jlr(kqyVar, 9));
            Object obj2 = kqyVar.e;
            obj2.getClass();
            mebVar2.c(new jlr(obj2, 10));
            obj2.getClass();
            mebVar2.b(new jlr(obj2, 11));
            mebVar2.b(new jlr(kqyVar, 12));
            mebVar2.b(new jlr(kqyVar, 13));
            System.setProperty("org.joda.time.DateTimeZone.Provider", ota.class.getName());
            otb.a = false;
            otb.a(context);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gli.D("worker_name_key", "AppUpdateWorker", linkedHashMap);
            gox goxVarY = gli.y(linkedHashMap);
            Object obj3 = kqyVar.p;
            gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
            gpoVar.e(goxVarY);
            gpoVar.b("app_update_task_tag");
            gpz gpzVar = (gpz) obj3;
            gpzVar.g("app_update_task_tag", 2, gpoVar.f());
            ContentResolver contentResolver = (ContentResolver) ((kwy) kqyVar.t).a;
            if (kwy.m(contentResolver, "cancel_deprecated_work", true)) {
                gpzVar.c("refresh_license_forced");
                gpzVar.c("upload_wishlist");
                gpzVar.c("upload_last_playback");
            }
            if (kwy.m(contentResolver, "enable_log_buffer", true)) {
                try {
                    File file = new File(context.getCacheDir(), "applogcat");
                    if (!file.exists() && !file.mkdir()) {
                        throw new IOException("Could not create logging directory.");
                    }
                    krd.c = new kre(file);
                    krd.a = new HandlerThread("movies_logging", 10);
                    krd.a.start();
                    krd.b = new Handler(krd.a.getLooper());
                } catch (IOException e) {
                    Log.e("PlayMovies", "Could not initialize log cache.", e);
                }
            }
            krd.f("Installer Package: ".concat(String.valueOf(((Context) kqyVar.b).getPackageManager().getInstallerPackageName("com.google.android.videos"))));
            if (kqyVar.c.ck() || ksk.t()) {
                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
            }
            kqyVar.i.execute(new jlr(kqyVar, 14));
            lig.a().b(xbu.VIDEO_INITIALIZER_POST_DELAY);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (getApplicationInfo().enabled) {
            synchronized (this) {
                if (i2 >= 20 && i2 < 40) {
                    return;
                }
                this.d.c();
                mma mmaVar = this.h;
                if (mmaVar != null) {
                    mmaVar.e();
                }
            }
        }
        hjr.b(this).f(i2);
        super.onTrimMemory(i2);
    }
}
