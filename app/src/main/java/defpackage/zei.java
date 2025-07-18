package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zei implements zej {
    public static final zei a = new zeg();

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public String d() {
        return null;
    }

    public abstract String e();

    protected final String f() {
        String strD = d();
        if (strD == null) {
            return null;
        }
        return strD.substring(strD.lastIndexOf(File.separatorChar) + 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(b());
        sb.append(", method=");
        sb.append(e());
        sb.append(", line=");
        sb.append(a());
        if (c() != null) {
            sb.append(", file=");
            sb.append(c());
        }
        if (d() != null) {
            sb.append(", filePath=");
            sb.append(d());
        }
        sb.append(" }");
        return sb.toString();
    }
}
