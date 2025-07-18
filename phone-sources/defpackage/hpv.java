package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpv implements hqf {
    private final /* synthetic */ int a;
    private final Object b;

    public hpv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.hqf
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return hjs.b((Uri) obj);
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            Uri uri = (Uri) obj;
            return hjs.b(uri) && !hjs.d(uri);
        }
        if (i != 5) {
            return true;
        }
        Uri uri2 = (Uri) obj;
        return hjs.b(uri2) && hjs.d(uri2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hpt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [hpg, java.lang.Object] */
    @Override // defpackage.hqf
    public final /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        Uri uriC;
        Long l;
        int i3 = this.a;
        if (i3 == 0) {
            File file = (File) obj;
            return new cvi(new hwa(file), new hps(file, (hpt) this.b, 0));
        }
        if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new cvi(new hwa(bArr), new hph(bArr, this.b));
        }
        if (i3 == 2) {
            Uri uri = (Uri) obj;
            return new cvi(new hwa(uri), new hqb((Context) this.b, uri));
        }
        if (i3 == 3) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                uriC = null;
            } else if (str.charAt(0) == '/') {
                uriC = c(str);
            } else {
                Uri uri2 = Uri.parse(str);
                uriC = uri2.getScheme() == null ? c(str) : uri2;
            }
            if (uriC != null) {
                ?? r0 = this.b;
                if (r0.a(uriC)) {
                    return r0.e(uriC, i, i2, hllVar);
                }
            }
            return null;
        }
        if (i3 == 4) {
            Uri uri3 = (Uri) obj;
            if (!hjs.c(i, i2)) {
                return null;
            }
            hwa hwaVar = new hwa(uri3);
            Context context = (Context) this.b;
            return new cvi(hwaVar, hps.b(context, uri3, new hml(context.getContentResolver())));
        }
        if (i3 != 5) {
            return this.b.e(new hpw((URL) obj), i, i2, hllVar);
        }
        Uri uri4 = (Uri) obj;
        if (!hjs.c(i, i2) || (l = (Long) hllVar.b(hsw.a)) == null || l.longValue() != -1) {
            return null;
        }
        hwa hwaVar2 = new hwa(uri4);
        Context context2 = (Context) this.b;
        return new cvi(hwaVar2, hps.b(context2, uri4, new hmm(context2.getContentResolver())));
    }

    public hpv(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    public hpv(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
