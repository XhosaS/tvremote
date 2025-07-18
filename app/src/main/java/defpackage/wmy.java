package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmy {
    private final Context a;
    private Context b;

    public wmy(Context context) {
        this.a = context;
    }

    private final synchronized Context d() {
        if (this.b == null) {
            Context context = this.a;
            Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            if (contextCreateDeviceProtectedStorageContext != null) {
                this.b = contextCreateDeviceProtectedStorageContext;
            } else {
                this.b = context;
            }
        }
        return this.b;
    }

    public final yzq a() {
        return yzq.s(b(1, 2), b(1, 1), b(2, 2), b(2, 1));
    }

    public final File b(int i, int i2) {
        Context contextD = i2 == 1 ? d() : this.a;
        return i + (-1) != 0 ? contextD.getCacheDir() : contextD.getFilesDir();
    }

    public final Uri c(wna wnaVar, String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        int i = ((wmx) wnaVar).a;
        Uri.Builder builderAuthority = new Uri.Builder().scheme("android").authority(this.a.getPackageName());
        StringBuilder sb = new StringBuilder("/");
        sb.append((i == 1 ? "directboot-" : "").concat("files"));
        sb.append("/");
        sb.append(str);
        return builderAuthority.path(sb.toString()).build();
    }
}
