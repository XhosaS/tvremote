package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.ArraySet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btf {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/features/AssistantPackageObserver");
    public String b;
    private final ArraySet c = new ArraySet();

    public btf(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            this.b = "com.google.android.katniss";
            ((cbs) a.c().j("com/google/android/tv/remote/service/features/AssistantPackageObserver", "<init>", 49, "AssistantPackageObserver.java")).t("Implied assistant package name is %s", this.b);
        } else {
            context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("assistant"), false, new btd(this, context));
            this.b = atg.n(context);
            ((cbs) a.c().j("com/google/android/tv/remote/service/features/AssistantPackageObserver", "<init>", 45, "AssistantPackageObserver.java")).t("Assistant package name is %s", this.b);
        }
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bte) it.next()).a(this.b);
        }
    }

    public final synchronized void b(bte bteVar) {
        this.c.remove(bteVar);
    }

    public final synchronized void c(bte bteVar) {
        this.c.add(bteVar);
        bteVar.a(this.b);
    }
}
