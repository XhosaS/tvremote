package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgr {
    private final Context a;
    private final String b = "gnp_media_cache";
    private File c;
    private String d;
    private long e;

    public sgr(Context context) {
        this.a = context;
    }

    public static StatFs b() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }

    private final long g(File file) {
        File[] fileArrListFiles = file.listFiles();
        long jG = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jG += file2.isDirectory() ? g(file2) : file2.length();
            }
        }
        return jG;
    }

    private final String h() {
        if (this.d == null) {
            this.d = c().getPath();
        }
        return this.d;
    }

    public final synchronized long a() {
        long jG;
        jG = this.e;
        if (jG == 0) {
            float totalBytes = b().getTotalBytes() * 0.1f;
            jG = totalBytes < 5242880.0f ? (long) totalBytes : 5242880L;
            if (jG < 0) {
                jG = 0;
            }
            if (jG >= b().getFreeBytes() * 0.05f) {
                jG = (long) ((r4 + (c().exists() ? g(c()) : 0L)) * 0.05f);
            }
            this.e = jG;
        }
        return jG;
    }

    public final File c() {
        if (this.c == null) {
            Context context = this.a;
            this.c = new File(context.getCacheDir(), this.b);
        }
        return this.c;
    }

    public final File d(String str) {
        File file = new File(e(str));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String e(String str) {
        StringBuilder sb = new StringBuilder(h().length() + str.length() + 3);
        sb.append(h());
        sb.append(File.separatorChar);
        sb.append(str.charAt(0));
        sb.append(File.separatorChar);
        sb.append(str);
        return sb.toString();
    }

    public final void f(File file, ArrayList arrayList) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    f(file2, arrayList);
                } else {
                    arrayList.add(file2);
                }
            }
        }
    }
}
