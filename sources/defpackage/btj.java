package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.ArraySet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btj {
    private static final cbt b = cbt.k("com/google/android/tv/remote/service/features/UserSetupCompleteObserver");
    public boolean a;
    private final ArraySet c = new ArraySet();

    public btj(buf bufVar) {
        ContentResolver contentResolver = bufVar.getContentResolver();
        bti btiVar = new bti(this, bufVar);
        contentResolver.registerContentObserver(Settings.Secure.getUriFor("user_setup_complete"), false, btiVar);
        byte[] bArr = null;
        Uri uriFor = Build.VERSION.SDK_INT < 26 ? null : Settings.Secure.getUriFor("tv_user_setup_complete");
        if (uriFor != null) {
            contentResolver.registerContentObserver(uriFor, false, btiVar);
        }
        bufVar.k(new bsp(contentResolver, btiVar, 3, bArr));
        this.a = atg.o(bufVar);
        ((cbs) b.c().j("com/google/android/tv/remote/service/features/UserSetupCompleteObserver", "<init>", 46, "UserSetupCompleteObserver.java")).t("User setup is %s", true != this.a ? "in-progress" : "complete");
    }

    public final synchronized void a(boolean z) {
        if (this.a != z) {
            ((cbs) b.e().j("com/google/android/tv/remote/service/features/UserSetupCompleteObserver", "announce", 51, "UserSetupCompleteObserver.java")).t("User Setup is now %s", true != z ? "in-progress" : "complete");
            this.a = z;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((brn) it.next()).b();
            }
        }
    }

    public final synchronized void b(brn brnVar) {
        this.c.remove(brnVar);
    }

    public final synchronized void c(brn brnVar) {
        this.c.add(brnVar);
    }
}
