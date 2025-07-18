package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tkm implements Comparable {
    tkm c;

    public abstract Uri a();

    public abstract CharSequence b();

    public abstract String c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a().compareTo(((tkm) obj).a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tkm) {
            return Objects.equals(a(), ((tkm) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(a());
    }

    public final String toString() {
        return String.format("%s (%s)", b().toString(), a());
    }
}
