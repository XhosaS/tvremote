package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyh {
    private String a;
    private int b;
    private int c;

    public dyh(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyh)) {
            return false;
        }
        dyh dyhVar = (dyh) obj;
        return (this.b < 0 || dyhVar.b < 0) ? TextUtils.equals(this.a, dyhVar.a) && this.c == dyhVar.c : TextUtils.equals(this.a, dyhVar.a) && this.b == dyhVar.b && this.c == dyhVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }

    public dyh(String str, int i, int i2, byte[] bArr) {
        this(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
