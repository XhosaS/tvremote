package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fio extends fiq {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] o = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean p;

    public static boolean d(edi ediVar, byte[] bArr) {
        if (ediVar.a() < 8) {
            return false;
        }
        int i = ediVar.b;
        byte[] bArr2 = new byte[8];
        ediVar.F(bArr2, 0, 8);
        ediVar.K(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.fiq
    protected final long a(edi ediVar) {
        byte[] bArr = ediVar.a;
        return f(fki.O(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0));
    }

    @Override // defpackage.fiq
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.p = false;
        }
    }

    @Override // defpackage.fiq
    protected final boolean c(edi ediVar, long j, hig higVar) {
        if (d(ediVar, a)) {
            byte[] bArrCopyOf = Arrays.copyOf(ediVar.a, ediVar.c);
            int i = bArrCopyOf[9] & 255;
            List listP = fki.P(bArrCopyOf);
            if (higVar.a == null) {
                dzd dzdVar = new dzd();
                dzdVar.a("audio/ogg");
                dzdVar.d("audio/opus");
                dzdVar.E = i;
                dzdVar.F = 48000;
                dzdVar.p = listP;
                higVar.a = new dze(dzdVar);
                return true;
            }
        } else {
            if (!d(ediVar, o)) {
                eci.e(higVar.a);
                return false;
            }
            eci.e(higVar.a);
            if (!this.p) {
                this.p = true;
                ediVar.L(8);
                ead eadVarI = fki.I(ImmutableList.copyOf((Object[]) fki.ai(ediVar, false, false).a));
                if (eadVarI != null) {
                    dze dzeVar = (dze) higVar.a;
                    dzd dzdVar2 = new dzd(dzeVar);
                    dzdVar2.k = eadVarI.d(dzeVar.V);
                    higVar.a = new dze(dzdVar2);
                }
            }
        }
        return true;
    }
}
