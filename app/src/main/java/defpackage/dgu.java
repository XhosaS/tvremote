package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgu {
    public final String a;

    public dgu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dgu) {
            return this.a.equals(((dgu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
