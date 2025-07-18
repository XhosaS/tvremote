package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgv extends ffr {
    private final edi a = new edi();
    private final edh b = new edh();
    private edo c;

    @Override // defpackage.ffr
    protected final ead b(ffq ffqVar, ByteBuffer byteBuffer) {
        eac fguVar;
        long j;
        edo edoVar = this.c;
        if (edoVar == null || ffqVar.g != edoVar.f()) {
            edo edoVar2 = new edo(ffqVar.e);
            this.c = edoVar2;
            edoVar2.a(ffqVar.e - ffqVar.g);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        edi ediVar = this.a;
        ediVar.I(bArrArray, iLimit);
        edh edhVar = this.b;
        edhVar.k(bArrArray, iLimit);
        edhVar.n(39);
        long jD = edhVar.d(1);
        long jD2 = edhVar.d(32);
        edhVar.n(20);
        int iD = edhVar.d(12);
        int iD2 = edhVar.d(8);
        ediVar.L(14);
        long j2 = (jD << 32) | jD2;
        if (iD2 == 0) {
            fguVar = new fgu();
        } else if (iD2 == 255) {
            int i = iD - 4;
            long jR = ediVar.r();
            ediVar.F(new byte[i], 0, i);
            fguVar = new fgt(jR, j2);
        } else if (iD2 == 4) {
            int iJ = ediVar.j();
            ArrayList arrayList = new ArrayList(iJ);
            for (int i2 = 0; i2 < iJ; i2++) {
                ediVar.r();
                int iJ2 = ediVar.j() & 128;
                ArrayList arrayList2 = new ArrayList();
                if (iJ2 == 0) {
                    int iJ3 = ediVar.j();
                    int i3 = iJ3 & 64;
                    int i4 = iJ3 & 32;
                    if (i3 != 0) {
                        ediVar.r();
                    } else {
                        int iJ4 = ediVar.j();
                        ArrayList arrayList3 = new ArrayList(iJ4);
                        for (int i5 = 0; i5 < iJ4; i5++) {
                            ediVar.j();
                            ediVar.r();
                            arrayList3.add(new fki());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (i4 != 0) {
                        ediVar.j();
                        ediVar.r();
                    }
                    ediVar.n();
                    ediVar.j();
                    ediVar.j();
                }
                arrayList.add(new fki(arrayList2));
            }
            fguVar = new fgu(arrayList);
        } else if (iD2 == 5) {
            edo edoVar3 = this.c;
            ediVar.r();
            int iJ5 = ediVar.j() & 128;
            List list = Collections.EMPTY_LIST;
            if (iJ5 == 0) {
                int iJ6 = ediVar.j();
                boolean z = (iJ6 & 64) != 0;
                int i6 = iJ6 & 32;
                boolean z2 = (iJ6 & 16) != 0;
                long jD3 = (!z || z2) ? -9223372036854775807L : fgx.d(ediVar, j2);
                if (!z) {
                    int iJ7 = ediVar.j();
                    ArrayList arrayList4 = new ArrayList(iJ7);
                    for (int i7 = 0; i7 < iJ7; i7++) {
                        ediVar.j();
                        edoVar3.b(!z2 ? fgx.d(ediVar, j2) : -9223372036854775807L);
                        arrayList4.add(new fki());
                    }
                    list = arrayList4;
                }
                if (i6 != 0) {
                    ediVar.j();
                    ediVar.r();
                }
                ediVar.n();
                ediVar.j();
                ediVar.j();
                j = jD3;
            } else {
                j = -9223372036854775807L;
            }
            fguVar = new fgw(j, edoVar3.b(j), list);
        } else if (iD2 != 6) {
            fguVar = null;
        } else {
            edo edoVar4 = this.c;
            long jD4 = fgx.d(ediVar, j2);
            fguVar = new fgx(jD4, edoVar4.b(jD4));
        }
        return fguVar == null ? new ead(new eac[0]) : new ead(fguVar);
    }
}
