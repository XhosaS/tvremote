package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0035i;
import j$.nio.file.Path;
import j$.nio.file.Q;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i extends AbstractC0035i {
    public final String a;
    public final String b;
    public final m c;

    public i(m mVar, String str, String str2) {
        this.c = mVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.AbstractC0035i
    public final Iterable a() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.AbstractC0035i
    public final Path b(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.a, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x011e, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0134, code lost:
    
        if (r7 != ']') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0136, code lost:
    
        r1.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0145, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r0, r4 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    @Override // j$.nio.file.AbstractC0035i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.nio.file.y c(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.i.c(java.lang.String):j$.nio.file.y");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0035i
    public final Iterable d() {
        return g.C(new Object[]{new o(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.AbstractC0035i
    public final String e() {
        return "/";
    }

    @Override // j$.nio.file.AbstractC0035i
    public final g f() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0035i
    public final boolean g() {
        return false;
    }

    @Override // j$.nio.file.AbstractC0035i
    public final Q h() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0035i
    public final j$.nio.file.spi.c i() {
        return this.c;
    }

    @Override // j$.nio.file.AbstractC0035i
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.AbstractC0035i
    public final Set j() {
        return g.D(new Object[]{"basic"});
    }
}
