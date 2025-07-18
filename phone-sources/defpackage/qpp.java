package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpp implements qpl {
    public static final tvn a = tvn.n("GnpSdk");
    public final sgr b;
    private final qgt c;
    private final uhs d;
    private final uhs e;
    private final ntp f;
    private final cb g;

    public qpp(qgt qgtVar, ntp ntpVar, uhs uhsVar, sgr sgrVar, rbi rbiVar) {
        this.c = qgtVar;
        this.f = ntpVar;
        this.d = uhsVar;
        this.e = sfy.v(new qhz(rbiVar, new Handler(Looper.getMainLooper())));
        this.b = sgrVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sgrVar.c().exists()) {
            ArrayList arrayList = new ArrayList();
            sgrVar.f(sgrVar.c(), arrayList);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    sgq sgqVar = new sgq((File) arrayList.get(i));
                    sgqVar.d = jCurrentTimeMillis - sgqVar.b < 1800000;
                    j += sgqVar.c;
                    arrayList2.add(sgqVar);
                }
                long jA = sgrVar.a();
                if (j > jA) {
                    Collections.sort(arrayList2);
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2 && j > jA; i2++) {
                        sgq sgqVar2 = (sgq) arrayList2.get(i2);
                        if (sgqVar2.a.delete()) {
                            j -= sgqVar2.c;
                        }
                    }
                }
            }
        }
        this.g = new cb((byte[]) null, (short[]) null);
    }

    private final uhp e(qpk qpkVar) {
        if (this.g.F(qpkVar)) {
            try {
                f(qpkVar);
            } finally {
                this.g.E(qpkVar);
            }
        }
        return uhl.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0321 A[Catch: Exception -> 0x04f4, OutOfMemoryError -> 0x0508, TryCatch #5 {OutOfMemoryError -> 0x0508, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0028, B:8:0x0032, B:153:0x0375, B:156:0x039f, B:158:0x03a5, B:160:0x03ab, B:163:0x03d5, B:164:0x03f0, B:166:0x040b, B:167:0x042e, B:169:0x0451, B:170:0x0455, B:172:0x045b, B:174:0x046f, B:175:0x0483, B:176:0x0493, B:192:0x04e0, B:179:0x0498, B:181:0x04a1, B:183:0x04b0, B:189:0x04d5, B:191:0x04d9, B:188:0x04ce, B:186:0x04b5, B:187:0x04cd, B:13:0x0046, B:17:0x0050, B:22:0x005b, B:23:0x0081, B:24:0x0085, B:28:0x0098, B:30:0x00a9, B:34:0x00b2, B:37:0x00cf, B:40:0x00d8, B:42:0x00de, B:49:0x00f0, B:50:0x00f3, B:53:0x00fa, B:75:0x0162, B:77:0x016a, B:107:0x02cc, B:109:0x02d2, B:111:0x02dc, B:113:0x02e2, B:79:0x0177, B:80:0x0181, B:82:0x018f, B:83:0x0192, B:85:0x0198, B:87:0x01a2, B:88:0x01a5, B:101:0x02a5, B:102:0x02c2, B:89:0x01a9, B:100:0x0295, B:90:0x01d1, B:91:0x01fd, B:92:0x0212, B:93:0x0227, B:94:0x023b, B:96:0x0259, B:98:0x027b, B:99:0x0290, B:103:0x02c3, B:66:0x0141, B:68:0x014f, B:121:0x0300, B:122:0x0305, B:128:0x030d, B:54:0x0104, B:56:0x0114, B:57:0x011d, B:58:0x0129, B:115:0x02f3, B:116:0x02fa, B:129:0x0321, B:136:0x0333, B:143:0x034d, B:144:0x0352, B:152:0x0371), top: B:206:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040b A[Catch: Exception -> 0x04f4, OutOfMemoryError -> 0x0508, TryCatch #5 {OutOfMemoryError -> 0x0508, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0028, B:8:0x0032, B:153:0x0375, B:156:0x039f, B:158:0x03a5, B:160:0x03ab, B:163:0x03d5, B:164:0x03f0, B:166:0x040b, B:167:0x042e, B:169:0x0451, B:170:0x0455, B:172:0x045b, B:174:0x046f, B:175:0x0483, B:176:0x0493, B:192:0x04e0, B:179:0x0498, B:181:0x04a1, B:183:0x04b0, B:189:0x04d5, B:191:0x04d9, B:188:0x04ce, B:186:0x04b5, B:187:0x04cd, B:13:0x0046, B:17:0x0050, B:22:0x005b, B:23:0x0081, B:24:0x0085, B:28:0x0098, B:30:0x00a9, B:34:0x00b2, B:37:0x00cf, B:40:0x00d8, B:42:0x00de, B:49:0x00f0, B:50:0x00f3, B:53:0x00fa, B:75:0x0162, B:77:0x016a, B:107:0x02cc, B:109:0x02d2, B:111:0x02dc, B:113:0x02e2, B:79:0x0177, B:80:0x0181, B:82:0x018f, B:83:0x0192, B:85:0x0198, B:87:0x01a2, B:88:0x01a5, B:101:0x02a5, B:102:0x02c2, B:89:0x01a9, B:100:0x0295, B:90:0x01d1, B:91:0x01fd, B:92:0x0212, B:93:0x0227, B:94:0x023b, B:96:0x0259, B:98:0x027b, B:99:0x0290, B:103:0x02c3, B:66:0x0141, B:68:0x014f, B:121:0x0300, B:122:0x0305, B:128:0x030d, B:54:0x0104, B:56:0x0114, B:57:0x011d, B:58:0x0129, B:115:0x02f3, B:116:0x02fa, B:129:0x0321, B:136:0x0333, B:143:0x034d, B:144:0x0352, B:152:0x0371), top: B:206:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x042e A[Catch: Exception -> 0x04f4, OutOfMemoryError -> 0x0508, TryCatch #5 {OutOfMemoryError -> 0x0508, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0028, B:8:0x0032, B:153:0x0375, B:156:0x039f, B:158:0x03a5, B:160:0x03ab, B:163:0x03d5, B:164:0x03f0, B:166:0x040b, B:167:0x042e, B:169:0x0451, B:170:0x0455, B:172:0x045b, B:174:0x046f, B:175:0x0483, B:176:0x0493, B:192:0x04e0, B:179:0x0498, B:181:0x04a1, B:183:0x04b0, B:189:0x04d5, B:191:0x04d9, B:188:0x04ce, B:186:0x04b5, B:187:0x04cd, B:13:0x0046, B:17:0x0050, B:22:0x005b, B:23:0x0081, B:24:0x0085, B:28:0x0098, B:30:0x00a9, B:34:0x00b2, B:37:0x00cf, B:40:0x00d8, B:42:0x00de, B:49:0x00f0, B:50:0x00f3, B:53:0x00fa, B:75:0x0162, B:77:0x016a, B:107:0x02cc, B:109:0x02d2, B:111:0x02dc, B:113:0x02e2, B:79:0x0177, B:80:0x0181, B:82:0x018f, B:83:0x0192, B:85:0x0198, B:87:0x01a2, B:88:0x01a5, B:101:0x02a5, B:102:0x02c2, B:89:0x01a9, B:100:0x0295, B:90:0x01d1, B:91:0x01fd, B:92:0x0212, B:93:0x0227, B:94:0x023b, B:96:0x0259, B:98:0x027b, B:99:0x0290, B:103:0x02c3, B:66:0x0141, B:68:0x014f, B:121:0x0300, B:122:0x0305, B:128:0x030d, B:54:0x0104, B:56:0x0114, B:57:0x011d, B:58:0x0129, B:115:0x02f3, B:116:0x02fa, B:129:0x0321, B:136:0x0333, B:143:0x034d, B:144:0x0352, B:152:0x0371), top: B:206:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: Exception -> 0x04f4, OutOfMemoryError -> 0x0508, TRY_LEAVE, TryCatch #5 {OutOfMemoryError -> 0x0508, blocks: (B:3:0x0014, B:5:0x001c, B:7:0x0028, B:8:0x0032, B:153:0x0375, B:156:0x039f, B:158:0x03a5, B:160:0x03ab, B:163:0x03d5, B:164:0x03f0, B:166:0x040b, B:167:0x042e, B:169:0x0451, B:170:0x0455, B:172:0x045b, B:174:0x046f, B:175:0x0483, B:176:0x0493, B:192:0x04e0, B:179:0x0498, B:181:0x04a1, B:183:0x04b0, B:189:0x04d5, B:191:0x04d9, B:188:0x04ce, B:186:0x04b5, B:187:0x04cd, B:13:0x0046, B:17:0x0050, B:22:0x005b, B:23:0x0081, B:24:0x0085, B:28:0x0098, B:30:0x00a9, B:34:0x00b2, B:37:0x00cf, B:40:0x00d8, B:42:0x00de, B:49:0x00f0, B:50:0x00f3, B:53:0x00fa, B:75:0x0162, B:77:0x016a, B:107:0x02cc, B:109:0x02d2, B:111:0x02dc, B:113:0x02e2, B:79:0x0177, B:80:0x0181, B:82:0x018f, B:83:0x0192, B:85:0x0198, B:87:0x01a2, B:88:0x01a5, B:101:0x02a5, B:102:0x02c2, B:89:0x01a9, B:100:0x0295, B:90:0x01d1, B:91:0x01fd, B:92:0x0212, B:93:0x0227, B:94:0x023b, B:96:0x0259, B:98:0x027b, B:99:0x0290, B:103:0x02c3, B:66:0x0141, B:68:0x014f, B:121:0x0300, B:122:0x0305, B:128:0x030d, B:54:0x0104, B:56:0x0114, B:57:0x011d, B:58:0x0129, B:115:0x02f3, B:116:0x02fa, B:129:0x0321, B:136:0x0333, B:143:0x034d, B:144:0x0352, B:152:0x0371), top: B:206:0x0014 }] */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.Object, qja] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.qpk r32) throws defpackage.vrw, defpackage.owu {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpp.f(qpk):void");
    }

    @Override // defpackage.qpl
    public final uhp a(String str, String str2, int i, int i2) {
        qpj qpjVarB = qpk.b();
        qpjVarB.a = str;
        qpjVarB.e(str2);
        qpjVarB.f(i);
        qpjVarB.b(i2);
        qpjVarB.d(true);
        qpjVarB.c(true);
        qpk qpkVarA = qpjVarB.a();
        return ufn.i(e(qpkVarA), new nbb(this, qpkVarA, 5), this.d);
    }

    @Override // defpackage.qpl
    public final void b(ImageView imageView, String str, int i, int i2) {
        if (imageView == null) {
            return;
        }
        qpj qpjVarB = qpk.b();
        qpjVarB.a = null;
        qpjVarB.e(str);
        qpjVarB.f(i);
        qpjVarB.b(i2);
        qpjVarB.d(false);
        qpjVarB.c(false);
        sfy.K(this.d.submit(new hbn(this, qpjVarB.a(), str, 12, (short[]) null)), new qpo(imageView, str), this.e);
    }

    @Override // defpackage.qpl
    public final uhp c() {
        return uhl.a;
    }

    @Override // defpackage.qpl
    public final uhp d(String str, int i, int i2) {
        qpj qpjVarB = qpk.b();
        qpjVarB.a = null;
        qpjVarB.e(str);
        qpjVarB.f(i);
        qpjVarB.b(i2);
        return e(qpjVarB.a());
    }
}
