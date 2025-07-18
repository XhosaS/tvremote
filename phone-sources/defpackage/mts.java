package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mts implements kum {
    public final String a;
    private final int b;
    private final String c;

    public mts(String str) {
        str.getClass();
        this.a = str;
        this.b = 0;
        this.c = str + 0;
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mts)) {
            return false;
        }
        mts mtsVar = (mts) obj;
        if (!this.a.equals(mtsVar.a)) {
            return false;
        }
        int i = mtsVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
