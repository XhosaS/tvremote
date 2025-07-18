package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjl extends ciy {
    public final cxe f;

    public cjl(cxe cxeVar) {
        this.f = cxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjl) && yks.e(this.f, ((cjl) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ')';
    }
}
