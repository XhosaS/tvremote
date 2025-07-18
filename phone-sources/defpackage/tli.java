package defpackage;

import java.net.Inet4Address;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tli {
    public final Inet4Address a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;

    public tli(String str, Inet4Address inet4Address, String str2, int i, List list) {
        this.b = str;
        this.a = inet4Address;
        this.c = str2;
        this.d = i;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Inet4Address inet4Address;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tli)) {
            return false;
        }
        tli tliVar = (tli) obj;
        Inet4Address inet4Address2 = this.a;
        if (inet4Address2 != null && (inet4Address = tliVar.a) != null && !inet4Address2.equals(inet4Address)) {
            return false;
        }
        String str3 = this.b;
        if (str3 != null && (str2 = tliVar.b) != null && !str3.equals(str2)) {
            return false;
        }
        String str4 = this.c;
        return (str4 == null || (str = tliVar.c) == null || str4.equals(str)) && this.d == tliVar.d;
    }

    public final int hashCode() {
        Inet4Address inet4Address = this.a;
        return (inet4Address != null ? inet4Address.hashCode() : 0) ^ this.d;
    }

    public final String toString() {
        return String.format("\"%s\"", this.c);
    }
}
