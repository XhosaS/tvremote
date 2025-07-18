package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzu {
    public static final dzu a = new dzu(new kvw((char[]) null));
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public final Uri e;
    public final String f;
    public final Bundle g;

    public dzu(kvw kvwVar) {
        this.e = (Uri) kvwVar.a;
        this.f = (String) kvwVar.c;
        this.g = (Bundle) kvwVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzu)) {
            return false;
        }
        dzu dzuVar = (dzu) obj;
        if (Objects.equals(this.e, dzuVar.e) && Objects.equals(this.f, dzuVar.f)) {
            if ((this.g == null) == (dzuVar.g == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.e;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        String str = this.f;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.g != null ? 1 : 0);
    }
}
