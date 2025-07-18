package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class prh {
    public final String a;
    public final String b;

    public prh() {
        throw null;
    }

    public static prh a(Context context, String str) {
        return new prh(context.getPackageName(), str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof prh) {
            prh prhVar = (prh) obj;
            if (this.a.equals(prhVar.a) && this.b.equals(prhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 583896283) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=null, moduleName=null, instanceId=" + this.b + "}";
    }

    public prh(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = str2;
    }
}
