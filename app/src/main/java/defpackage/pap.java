package defpackage;

import android.util.Base64;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pap {
    @Deprecated
    public static zpp a(String str) {
        zpp zppVar = zpp.a;
        zpo zpoVar = new zpo();
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            int i = abvt.g;
            abvt abvtVarL = abvt.L(bArrDecode, 0, bArrDecode.length, false);
            long jI = ((abvp) abvtVarL).i() & 4294967295L;
            long j = ((abvp) abvtVarL).j();
            int iJ = ((abvp) abvtVarL).j();
            int i2 = iJ >> 24;
            int i3 = iJ & 16777215;
            int i4 = (i2 + 10) & 255;
            int iJ2 = ((abvp) abvtVarL).j();
            if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpoVar.y();
            }
            zpp zppVar2 = (zpp) zpoVar.b;
            zppVar2.b |= 1;
            zppVar2.c = (jI * 1000000) + j;
            if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpoVar.y();
            }
            zpp zppVar3 = (zpp) zpoVar.b;
            zppVar3.b |= 2;
            zppVar3.d = (i4 << 24) | i3;
            if ((zpoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                zpoVar.y();
            }
            zpp zppVar4 = (zpp) zpoVar.b;
            zppVar4.b |= 4;
            zppVar4.e = iJ2;
            return (zpp) zpoVar.v();
        } catch (IOException e) {
            throw new IOException("Bad encoded data inside an EI", e);
        }
    }
}
