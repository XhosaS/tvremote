package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyh {
    public final String a;
    public final String b;
    public final Locale c;
    public final List d;

    public lyh(String str, String str2, Locale locale, List list) {
        this.a = str;
        this.b = str2;
        this.c = locale;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lyh lyhVar = (lyh) obj;
        if (this.a.equals(lyhVar.a) && this.b.equals(lyhVar.b) && this.c.equals(lyhVar.c)) {
            return this.d.equals(lyhVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
