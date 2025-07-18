package defpackage;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.katniss.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ext {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate");
    public final jrs a;
    private final ContentResolver c;
    private final Context d;
    private final gkt e;
    private final gtu f;
    private final ftl g;
    private final PackageManager h;

    public ext(ContentResolver contentResolver, Context context, jrs jrsVar, gkt gktVar, gtu gtuVar, ftl ftlVar, PackageManager packageManager) {
        context.getClass();
        gtuVar.getClass();
        ftlVar.getClass();
        this.c = contentResolver;
        this.d = context;
        this.a = jrsVar;
        this.e = gktVar;
        this.f = gtuVar;
        this.g = ftlVar;
        this.h = packageManager;
    }

    private final void c() {
        if (Looper.getMainLooper().isCurrentThread()) {
            this.a.c(R.string.assistant_internal_error);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exq
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.c(R.string.assistant_internal_error);
                }
            });
        }
    }

    private final boolean d(String str) {
        if (str == null) {
            return false;
        }
        gtu gtuVar = this.f;
        if (gtuVar.a() == null) {
            return false;
        }
        ftl ftlVar = this.g;
        Account accountC = gtuVar.c();
        String str2 = accountC != null ? accountC.name : null;
        Map map = ftlVar.b;
        if (str2 == null) {
            str2 = "";
        }
        List list = (List) map.get(str2);
        if (list == null) {
            list = agrd.a;
        }
        return list.contains(str);
    }

    private final boolean e(Intent intent, String str, boolean z) throws exi {
        try {
            boolean booleanExtra = intent.getBooleanExtra("is_broadcast_intent", false);
            if (str != null && z) {
                Bundle bundle = new Bundle();
                bundle.putString("PACKAGE_KEY", str);
                bundle.putParcelable("INTENT_KEY", intent);
                if (this.c.call(new Uri.Builder().scheme("content").authority("com.google.android.apps.tv.launcherx.profile.contentprovider.AppAccessContentProvider").build(), "launchApp", (String) null, bundle) != null) {
                    return true;
                }
                throw new exi(str);
            }
            if (booleanExtra) {
                ((gky) this.e).b(intent, "broadcast");
                this.d.sendBroadcast(intent);
                return true;
            }
            ((gky) this.e).b(intent, "start-activity");
            this.d.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 201, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (exi e2) {
            ((zdv) ((zdv) b.d()).p(e2).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 203, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (IllegalArgumentException e3) {
            ((zdv) ((zdv) b.d()).p(e3).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 207, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (InterruptedException e4) {
            ((zdv) ((zdv) b.d()).p(e4).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 209, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (SecurityException e5) {
            ((zdv) ((zdv) b.d()).p(e5).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 211, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (UnsupportedOperationException e6) {
            ((zdv) ((zdv) b.d()).p(e6).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 213, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        } catch (ExecutionException e7) {
            ((zdv) ((zdv) b.d()).p(e7).q("com/google/android/apps/tvsearch/app/intentstarter/IntentStarterDelegate", "startActivityTask", 205, "IntentStarterDelegate.kt")).x("Fail to start activity intent: %s", intent);
            return false;
        }
    }

    public final void a(Intent intent, final exm exmVar, final exu exuVar) {
        intent.putExtra("intent_started_by_katniss", true);
        intent.addFlags(268435456);
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.h);
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        if (e(intent, packageName, d(packageName))) {
            if (!Looper.getMainLooper().isCurrentThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exr
                    @Override // java.lang.Runnable
                    public final void run() {
                        exuVar.e();
                        exm exmVar2 = exmVar;
                        if (exmVar2 != null) {
                            exmVar2.b();
                        }
                    }
                });
                return;
            }
            exuVar.e();
            if (exmVar != null) {
                exmVar.b();
                return;
            }
            return;
        }
        c();
        if (exmVar != null) {
            if (Looper.getMainLooper().isCurrentThread()) {
                exmVar.a();
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exs
                    @Override // java.lang.Runnable
                    public final void run() {
                        exmVar.a();
                    }
                });
            }
        }
    }

    public final boolean b(final Intent intent, final exm exmVar, final exu exuVar, exj exjVar, exk exkVar, int i) {
        PackageManager packageManager = this.h;
        boolean booleanExtra = intent.getBooleanExtra("is_broadcast_intent", false);
        ComponentName componentNameResolveActivity = intent.resolveActivity(packageManager);
        if (!booleanExtra && componentNameResolveActivity == null) {
            int i2 = i - 1;
            final gky gkyVar = (gky) this.e;
            if (gkyVar.b.i(icg.e, false)) {
                ((zdv) gky.a.d().q("com/google/android/apps/tvsearch/logging/intentlogger/IntentLoggerImpl", "logInvalidIntentForActivity", 41, "IntentLoggerImpl.kt")).x("Failed to start activity with invalid intent:\n%s", new zea() { // from class: gkx
                    @Override // defpackage.zea
                    public final Object a() {
                        return gkyVar.a(intent, "start-activity");
                    }
                });
            }
            if (i2 != 0) {
                c();
            }
            if (exmVar != null) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    exmVar.a();
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exn
                        @Override // java.lang.Runnable
                        public final void run() {
                            exmVar.a();
                        }
                    });
                }
            }
            return false;
        }
        String packageName = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null;
        boolean zD = d(packageName);
        intent.putExtra("intent_started_by_katniss", true);
        intent.putExtra("android.intent.extra.REFERRER", "android-app://".concat(String.valueOf(this.d.getPackageName())));
        intent.addFlags(335544320);
        agpi agpiVar = agvy.c(intent.getAction(), "android.intent.action.ASSIST") ? new agpi(exj.c, exk.a) : new agpi(exjVar, exkVar);
        Object obj = agpiVar.b;
        final exj exjVar2 = (exj) agpiVar.a;
        final exk exkVar2 = (exk) obj;
        if (e(intent, packageName, zD)) {
            if (!Looper.getMainLooper().isCurrentThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exo
                    @Override // java.lang.Runnable
                    public final void run() {
                        exuVar.d(exjVar2, exkVar2);
                        exm exmVar2 = exmVar;
                        if (exmVar2 != null) {
                            exmVar2.b();
                        }
                    }
                });
                return true;
            }
            exuVar.d(exjVar2, exkVar2);
            if (exmVar == null) {
                return true;
            }
            exmVar.b();
            return true;
        }
        if (i - 1 != 0) {
            c();
        }
        if (exmVar != null) {
            if (Looper.getMainLooper().isCurrentThread()) {
                exmVar.a();
                return false;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: exp
                @Override // java.lang.Runnable
                public final void run() {
                    exmVar.a();
                }
            });
        }
        return false;
    }
}
