package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zeh extends zei {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public zeh(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.zei
    public final int a() {
        return this.d;
    }

    @Override // defpackage.zei
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.zei
    public final String c() {
        return f();
    }

    @Override // defpackage.zei
    public final String d() {
        return this.e;
    }

    @Override // defpackage.zei
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zeh) {
            zeh zehVar = (zeh) obj;
            if (this.c.equals(zehVar.c) && this.d == zehVar.d) {
                String str = this.b;
                String str2 = zehVar.b;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            char cCharAt2 = str2.charAt(i);
                            if (cCharAt == cCharAt2 || ((cCharAt & 65534) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
