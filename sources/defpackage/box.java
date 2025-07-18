package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.Message;
import com.google.android.tv.remote.service.RemoteService;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class box {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/OnscreenRemoteService");
    public bow b;
    public RemoteService c;
    public final ali d = new ali(this, 3);

    public final void a(int i, int i2) {
        int callingUid = Binder.getCallingUid();
        Context applicationContext = this.c.getApplicationContext();
        String nameForUid = this.c.getApplicationContext().getPackageManager().getNameForUid(Binder.getCallingUid());
        cbt cbtVar = a;
        ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/OnscreenRemoteService", "isTrustedCallingPackage", 69, "OnscreenRemoteService.java")).t("Calling package name: %s", nameForUid);
        if (!afq.b(applicationContext).c(callingUid)) {
            ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/OnscreenRemoteService", "isTrustedCallingPackage", 71, "OnscreenRemoteService.java")).t("Non-Google app %s is trying to get access to OnScreenRemoteService API", nameForUid);
        } else {
            if (Objects.equals(nameForUid, "com.google.android.inputmethod.latin")) {
                Message messageObtain = Message.obtain((Handler) null, i);
                messageObtain.arg1 = i2;
                this.b.sendMessage(messageObtain);
                return;
            }
            ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/OnscreenRemoteService", "isTrustedCallingPackage", 77, "OnscreenRemoteService.java")).t("%s is not allowed to access OnScreenRemoteService API", nameForUid);
        }
        throw new SecurityException("API access is not allowed");
    }
}
