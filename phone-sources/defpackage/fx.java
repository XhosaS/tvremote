package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fx {
    public final Object a;
    public Object b;

    public fx(cfy cfyVar) {
        this.a = cfyVar;
        this.b = cfyVar;
    }

    public final void a(fv fvVar) {
        fyx.e((fyx) this.b, fvVar.e());
    }

    public final void b(dvk dvkVar, fv fvVar) {
        dvkVar.getClass();
        fvVar.getClass();
        dve lifecycle = dvkVar.getLifecycle();
        if (lifecycle.a() == dvd.a) {
            return;
        }
        fw fwVar = new fw(fvVar, this, lifecycle);
        lifecycle.c(fwVar);
        fvVar.c.add(fwVar);
    }

    public final void c() {
        ((fyx) this.b).c();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        fzb fzbVar = new fzb((fyx) this.b);
        fzbVar.b = onBackInvokedDispatcher;
        fzbVar.a.e = new ddd(fzbVar, 18);
        fzbVar.a();
    }

    public final bhi e() {
        Intent intent = (Intent) this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setShareIdentityEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Object obj = this.b;
        return new bhi(intent, obj != null ? ((ActivityOptions) obj).toBundle() : null);
    }

    public fx() {
        this((Runnable) null);
    }

    public fx(Runnable runnable) {
        this.a = runnable;
        this.b = new fyx(new fg(this, 3), new ga(1));
    }

    public fx(byte[] bArr) {
        this.a = new Intent("android.intent.action.VIEW");
    }
}
