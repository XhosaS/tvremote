package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqx implements fdp {
    private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern b = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String c;
    private final edo d;
    private final fjg f;
    private final boolean g;
    private fdr h;
    private int j;
    private final edi e = new edi();
    private byte[] i = new byte[1024];

    public eqx(String str, edo edoVar, fjg fjgVar, boolean z) {
        this.c = str;
        this.d = edoVar;
        this.f = fjgVar;
        this.g = z;
    }

    private final fel h(long j) {
        fel felVarDq = this.h.dq(0, 3);
        dzd dzdVar = new dzd();
        dzdVar.d("text/vtt");
        dzdVar.d = this.c;
        dzdVar.r = j;
        felVarDq.b(new dze(dzdVar));
        this.h.j();
        return felVarDq;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        fdqVar.n(this.i, 0, 6, false);
        edi ediVar = this.e;
        ediVar.I(this.i, 6);
        if (fld.d(ediVar)) {
            return true;
        }
        fdqVar.n(this.i, 6, 3, false);
        ediVar.I(this.i, 9);
        return fld.d(ediVar);
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) throws eaf {
        String strU;
        this.h.getClass();
        int i = this.j;
        byte[] bArr = this.i;
        int length = bArr.length;
        int i2 = (int) ((fdi) fdqVar).a;
        if (i == length) {
            if (i2 != -1) {
                length = i2;
            } else {
                i2 = -1;
            }
            this.i = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.i;
        int i3 = this.j;
        int iA = fdqVar.a(bArr2, i3, bArr2.length - i3);
        if (iA != -1) {
            int i4 = this.j + iA;
            this.j = i4;
            if (i2 == -1 || i4 != i2) {
                return 0;
            }
        }
        edi ediVar = new edi(this.i);
        fld.c(ediVar);
        String strU2 = ediVar.u();
        long jG = 0;
        long jB = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strU2)) {
                while (true) {
                    String strU3 = ediVar.u();
                    if (strU3 == null) {
                        break;
                    }
                    if (fld.a.matcher(strU3).matches()) {
                        do {
                            strU = ediVar.u();
                            if (strU != null) {
                            }
                        } while (!strU.isEmpty());
                    } else {
                        Matcher matcher2 = flb.a.matcher(strU3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    h(0L);
                } else {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    edo edoVar = this.d;
                    long jB2 = fld.b(strGroup);
                    long jB3 = edoVar.b(edo.h((jG + jB2) - jB) % 8589934592L);
                    fel felVarH = h(jB3 - jB2);
                    edi ediVar2 = this.e;
                    ediVar2.I(this.i, this.j);
                    felVarH.c(ediVar2, this.j);
                    felVarH.e(jB3, 1, this.j, 0, null);
                }
                return -1;
            }
            if (strU2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = a.matcher(strU2);
                if (!matcher3.find()) {
                    throw new eaf("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(String.valueOf(strU2)), null, true, 1);
                }
                Matcher matcher4 = b.matcher(strU2);
                if (!matcher4.find()) {
                    throw new eaf("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(String.valueOf(strU2)), null, true, 1);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jB = fld.b(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                jG = edo.g(Long.parseLong(strGroup3));
            }
            strU2 = ediVar.u();
        }
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        if (this.g) {
            fdrVar = new fjj(fdrVar, this.f);
        }
        this.h = fdrVar;
        fdrVar.r(new fee(-9223372036854775807L));
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
