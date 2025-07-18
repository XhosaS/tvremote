package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzk {
    public static final String a = edt.Z(0);
    public final Uri b;
    public final Object c = null;

    public dzk(dxc dxcVar) {
        this.b = (Uri) dxcVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzk)) {
            return false;
        }
        dzk dzkVar = (dzk) obj;
        if (this.b.equals(dzkVar.b)) {
            Object obj2 = dzkVar.c;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
