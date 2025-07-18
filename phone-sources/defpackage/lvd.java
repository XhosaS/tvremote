package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvd {
    public final Uri a;
    public final lcl b;
    public final kuy c;
    public final boolean d;

    public lvd(Uri uri, kuy kuyVar, lcl lclVar) {
        uri.getClass();
        this.a = uri;
        this.c = kuyVar;
        lclVar.getClass();
        this.b = lclVar;
        this.d = "file".equals(uri.getScheme());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lvd) {
            return this.a.equals(((lvd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        lcl lclVar = this.b;
        return "[uri=" + string + ", itag=" + lclVar.c + ", sizeInBytes=" + lclVar.d + ", lastModifiedTimestamp=" + lclVar.f + ", itagInfo=" + this.c.toString() + ", isOffline=" + this.d + "]";
    }
}
