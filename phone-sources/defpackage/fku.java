package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fku implements fji {
    private final edi a = new edi();

    @Override // defpackage.fji
    public final int a() {
        return 2;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    @Override // defpackage.fji
    public final void c(byte[] bArr, int i, int i2, fjh fjhVar, ecq ecqVar) {
        eca ecaVarA;
        edi ediVar = this.a;
        ediVar.I(bArr, i2 + i);
        ediVar.K(i);
        ArrayList arrayList = new ArrayList();
        while (ediVar.a() > 0) {
            eci.a(ediVar.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iE = ediVar.e() - 8;
            if (ediVar.e() == 1987343459) {
                CharSequence charSequenceA = null;
                ebz ebzVarA = null;
                while (iE > 0) {
                    eci.a(iE >= 8, "Incomplete vtt cue box header found.");
                    int iE2 = ediVar.e();
                    int iE3 = ediVar.e();
                    int i3 = iE - 8;
                    int i4 = iE2 - 8;
                    String strT = edt.T(ediVar.a, ediVar.b, i4);
                    ediVar.L(i4);
                    if (iE3 == 1937011815) {
                        Pattern pattern = flb.a;
                        fla flaVar = new fla();
                        flb.c(strT, flaVar);
                        ebzVarA = flaVar.a();
                    } else if (iE3 == 1885436268) {
                        charSequenceA = flb.a(null, strT.trim(), Collections.EMPTY_LIST);
                    }
                    iE = i3 - i4;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (ebzVarA != null) {
                    ebzVarA.e(charSequenceA);
                    ecaVarA = ebzVarA.a();
                } else {
                    Pattern pattern2 = flb.a;
                    fla flaVar2 = new fla();
                    flaVar2.c = charSequenceA;
                    ecaVarA = flaVar2.a().a();
                }
                arrayList.add(ecaVarA);
            } else {
                ediVar.L(iE);
            }
        }
        ecqVar.a(new fit(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
