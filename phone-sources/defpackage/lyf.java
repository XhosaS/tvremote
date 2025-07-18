package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyf {
    public final ieg a;
    public final String b;
    public final Locale c;
    public final long d;
    public final long e;
    public final long f;
    public final ImmutableList g;

    public lyf() {
        throw null;
    }

    public static lyf a(ieg iegVar, String str, Locale locale, long j, long j2, long j3, List list) {
        return new lyf(iegVar, str, locale, j, j2, j3, ImmutableList.copyOf((Collection) list));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyf) {
            lyf lyfVar = (lyf) obj;
            if (this.a.equals(lyfVar.a) && this.b.equals(lyfVar.b) && this.c.equals(lyfVar.c) && this.d == lyfVar.d && this.e == lyfVar.e && this.f == lyfVar.f && this.g.equals(lyfVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.f;
        ImmutableList immutableList = this.g;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        long j4 = j3 ^ (j3 >>> 32);
        long j5 = this.d;
        return (((((((iHashCode * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) j4)) * 1000003) ^ ((int) j2)) * 1000003) ^ immutableList.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.g;
        Locale locale = this.c;
        return "CacheLoadRequest{account=" + this.a.toString() + ", country=" + this.b + ", locale=" + locale.toString() + ", refreshIfUpdatedBeforeSec=" + this.d + ", discardIfUpdatedBeforeSec=" + this.e + ", discardIfExpireBeforeSec=" + this.f + ", keys=" + immutableList.toString() + "}";
    }

    public lyf(ieg iegVar, String str, Locale locale, long j, long j2, long j3, ImmutableList immutableList) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = iegVar;
        if (str == null) {
            throw new NullPointerException("Null country");
        }
        this.b = str;
        if (locale == null) {
            throw new NullPointerException("Null locale");
        }
        this.c = locale;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (immutableList == null) {
            throw new NullPointerException("Null keys");
        }
        this.g = immutableList;
    }
}
