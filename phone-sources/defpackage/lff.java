package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lff implements idf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lff(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r3v7, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, ldv] */
    @Override // defpackage.idf
    public final Object b(Object obj) throws Throwable {
        boolean z;
        int i;
        ?? r18;
        int i2;
        int i3 = this.c;
        FileOutputStream fileOutputStream = null;
        if (i3 != 0) {
            int i4 = 1;
            if (i3 != 1) {
                if (i3 == 2) {
                    qza qzaVar = (qza) obj;
                    return ((ieg) krh.s(this.b, this.a).b(new lwy((String) qzaVar.d, ((Uri) qzaVar.b).toString(), null))).d(qzaVar, mnm.c);
                }
                if (i3 == 3) {
                    return (List) ((lxp) this.a).b.b(((lyi) this.b).b((lyf) obj).g);
                }
                if (i3 != 4) {
                    mmk mmkVar = (mmk) this.b;
                    kva kvaVar = (kva) mmkVar.l.a();
                    mmkVar.K.f(kvh.class);
                    return new mnc(kvaVar, (mmd) this.a, mmkVar.t.d(), mmkVar.h.cg()).b((kvf) obj);
                }
                ieg iegVarB = (ieg) obj;
                if (iegVarB.m()) {
                    iegVarB = ((lys) this.b).b((ksn) this.a, (ltz) iegVarB.g());
                }
                if (iegVarB.m()) {
                    return ieg.f(kvk.a);
                }
                iegVarB.p();
                return iegVarB;
            }
            mfp mfpVar = (mfp) obj;
            int i5 = kqf.a;
            ?? r2 = this.b;
            ?? r3 = this.a;
            if (!r2.df()) {
                return r3.b(mfpVar);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Object objB = r3.b(mfpVar);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - jElapsedRealtime);
            boolean zCj = r2.cj();
            StringBuilder sb = new StringBuilder("curl");
            Iterator it = mfpVar.e.entrySet().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String strConcat = (String) entry.getValue();
                if (!zCj && str.trim().toLowerCase().equals("authorization")) {
                    strConcat = String.valueOf(strConcat.substring(0, Math.min(6, strConcat.length()))).concat(" <redacted>");
                }
                sb.append(" -H '");
                sb.append(str.replace("'", "\\'"));
                sb.append(": ");
                sb.append(strConcat.replace("'", "\\'"));
                sb.append("'");
            }
            sb.append(" '");
            sb.append(mfpVar.c);
            sb.append("'");
            byte[] bArr = mfpVar.d;
            int length = bArr.length;
            if (length > 0) {
                StringBuilder sb2 = new StringBuilder();
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    byte b = bArr[i6];
                    boolean z2 = z;
                    if (b >= 32) {
                        char c = (char) b;
                        i2 = i4;
                        if (c != '\'') {
                            sb2.append(c);
                        }
                        i6++;
                        z = z2;
                        i4 = i2;
                    } else {
                        i2 = i4;
                    }
                    sb2.append("\\x");
                    int i8 = (b + 256) & 255;
                    if (i8 < 16) {
                        sb2.append('0');
                    }
                    sb2.append(Integer.toString(i8, 16));
                    i7 = i2;
                    i6++;
                    z = z2;
                    i4 = i2;
                }
                i = i4;
                r18 = z;
                sb.append(" -d '");
                if (i7 != 0) {
                    sb.append("$(printf '");
                    sb.append(sb2.toString());
                    sb.append("')");
                } else {
                    sb.append(sb2.toString());
                }
                sb.append("'");
            } else {
                i = 1;
                r18 = 0;
            }
            sb.append(" -X ");
            sb.append(mfpVar.b);
            krd.f(sb.toString());
            ieg iegVar = (ieg) objB;
            if (!iegVar.m()) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[i];
                objArr[r18] = Long.valueOf(seconds);
                krd.g(String.format(locale, "HTTP request failed | time spent = %ds", objArr), iegVar.i());
                return objB;
            }
            Locale locale2 = Locale.US;
            Integer numValueOf = Integer.valueOf(((mfq) iegVar.g()).a);
            Long lValueOf = Long.valueOf(seconds);
            Object[] objArr2 = new Object[2];
            objArr2[r18] = numValueOf;
            objArr2[i] = lValueOf;
            krd.f(String.format(locale2, "HTTP response code = %d | time spent = %ds", objArr2));
            return objB;
        }
        ieg iegVar2 = (ieg) this.a.b(obj);
        if (!iegVar2.m()) {
            return iegVar2;
        }
        Object obj2 = this.b;
        lfe lfeVar = new lfe(iegVar2.g(), System.currentTimeMillis());
        obj.getClass();
        lfa lfaVar = (lfa) obj2;
        lfb lfbVar = lfaVar.c;
        lfbVar.d();
        String strC = lfbVar.c(obj, lfaVar.b);
        File file = new File(lfbVar.a, strC);
        lev levVar = lfaVar.a;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    levVar.b(lfeVar, fileOutputStream2);
                    lfbVar.c.put(strC, "");
                    lfb.f(fileOutputStream2);
                    return iegVar2;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    krd.g("Error creating cache file.", e);
                    lfb.f(fileOutputStream);
                    return iegVar2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    lfb.f(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public /* synthetic */ lff(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
