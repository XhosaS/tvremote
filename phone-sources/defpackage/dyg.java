package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dyg {
    dyh a;

    public dyg(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new dyh(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dyg) {
            return this.a.equals(((dyg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public dyg(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                this.a = Build.VERSION.SDK_INT >= 28 ? new dyh(str, i, i2, null) : new dyh(str, i, i2);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
