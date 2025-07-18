package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsf {
    public fsg a;

    public fsf(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new fsg(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final int a() {
        return this.a.b;
    }

    public final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fsf) {
            return this.a.equals(((fsf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public fsf(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                this.a = new fsg(str, i, i2);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
