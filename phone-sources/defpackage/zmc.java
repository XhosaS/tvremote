package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmc {
    private final String a;
    private final char b;
    private int c;

    public zmc(String str, char c) {
        str.getClass();
        this.a = str;
        this.b = c;
        this.c = str.length() <= 0 ? 0 : -1;
    }

    public final String a() {
        char cCharAt;
        String str = this.a;
        int i = this.c;
        if (i >= str.length()) {
            return null;
        }
        int i2 = i + 1;
        do {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= str.length()) {
                    if (z || z2) {
                        throw new IllegalArgumentException("badly formatted directory string");
                    }
                    return str.substring(i2, i3);
                }
                cCharAt = str.charAt(i3);
                if (!z) {
                    if (cCharAt != '\"') {
                        if (!z2) {
                            if (cCharAt != '\\') {
                                break;
                            }
                            z = true;
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = !z2;
                    }
                }
                z = false;
            }
        } while (cCharAt != this.b);
        return str.substring(i2, this.c);
    }

    public final boolean b() {
        return this.c < this.a.length();
    }
}
