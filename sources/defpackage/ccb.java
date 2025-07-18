package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccb extends ccc {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public ccb(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.ccc
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.ccc
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ccc
    public final String c() {
        String str = this.e;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.ccc
    public final String d() {
        return this.c;
    }

    @Override // defpackage.ccc
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ccb) {
            ccb ccbVar = (ccb) obj;
            if (this.c.equals(ccbVar.c) && this.d == ccbVar.d) {
                String str = this.b;
                String str2 = ccbVar.b;
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
