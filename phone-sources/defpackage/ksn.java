package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksn implements Parcelable {
    public final String a;

    public ksn() {
        throw null;
    }

    public static ieg a(String str) {
        return TextUtils.isEmpty(str) ? ieg.a : ieg.f(b(str));
    }

    public static ksn b(String str) {
        krf.c(str);
        return new ktf(str);
    }

    public static String c(ieg iegVar) {
        return iegVar.m() ? ((ksn) iegVar.g()).a : "";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksn) {
            return this.a.equals(((ksn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return krh.e(this.a);
    }

    public ksn(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }
}
