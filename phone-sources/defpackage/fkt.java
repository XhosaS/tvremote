package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkt implements fji {
    private final edi a = new edi();
    private final edi b = new edi();
    private final fks c;
    private Inflater d;

    public fkt(List list) throws NumberFormatException {
        int i;
        fks fksVar = new fks();
        this.c = fksVar;
        for (String str : edt.at(new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim(), "\\r?\\n")) {
            if (str.startsWith("palette: ")) {
                String[] strArrAt = edt.at(str.substring(9), ",");
                fksVar.d = new int[strArrAt.length];
                for (int i2 = 0; i2 < strArrAt.length; i2++) {
                    int[] iArr = fksVar.d;
                    try {
                        i = Integer.parseInt(strArrAt[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrAt2 = edt.at(str.substring(6).trim(), "x");
                if (strArrAt2.length == 2) {
                    try {
                        fksVar.e = Integer.parseInt(strArrAt2[0]);
                        fksVar.f = Integer.parseInt(strArrAt2[1]);
                        fksVar.b = true;
                    } catch (RuntimeException e) {
                        edb.f("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.fji
    public final int a() {
        return 2;
    }

    @Override // defpackage.fji
    public final /* synthetic */ fix b(byte[] bArr, int i, int i2) {
        return fki.a(this, bArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    @Override // defpackage.fji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r18, int r19, int r20, defpackage.fjh r21, defpackage.ecq r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkt.c(byte[], int, int, fjh, ecq):void");
    }

    @Override // defpackage.fji
    public final /* synthetic */ void d() {
    }
}
