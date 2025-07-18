package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czg {
    public final String a;
    public final long[] b;
    public File[] c;
    public File[] d;
    public boolean e;
    public czf f;
    final /* synthetic */ czi g;

    public czg(czi cziVar, String str) {
        this.g = cziVar;
        this.a = str;
        int i = cziVar.d;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < cziVar.d; i2 = 1) {
            sb.append(0);
            this.c[0] = new File(cziVar.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(cziVar.a, sb.toString());
            sb.setLength(length);
        }
    }

    public final IOException a(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return sb.toString();
            }
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
            i = 1;
        }
    }
}
