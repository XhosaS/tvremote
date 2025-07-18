package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awl implements yjk {
    private final /* synthetic */ int a;

    public /* synthetic */ awl(int i) {
        this.a = i;
    }

    @Override // defpackage.yjk
    public final Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new cma(0.0f);
            case 1:
                return new auq(bArr);
            case 2:
                return baa.a;
            case 3:
                chc chcVar = azz.a;
                chc chcVar2 = azz.d;
                chc chcVar3 = azz.e;
                chc chcVar4 = azz.f;
                chc chcVar5 = azz.g;
                chc chcVar6 = azz.h;
                chc chcVar7 = azz.i;
                chc chcVar8 = azz.m;
                chc chcVar9 = azz.n;
                chc chcVar10 = azz.o;
                chc chcVar11 = azz.a;
                chc chcVar12 = azz.b;
                chc chcVar13 = azz.c;
                chc chcVar14 = azz.j;
                chc chcVar15 = azz.k;
                chc chcVar16 = azz.l;
                return new axg(chcVar2, chcVar3, chcVar4, chcVar5, chcVar6, chcVar7, chcVar8, chcVar9, chcVar10, chcVar11, chcVar12, chcVar13, chcVar14, chcVar15, chcVar16, chcVar2, chcVar3, chcVar4, chcVar5, chcVar6, chcVar7, chcVar8, chcVar9, chcVar10, chcVar11, chcVar12, chcVar13, chcVar14, chcVar15, chcVar16);
            case 4:
                bau.g("Unexpected call to default provider");
                throw new yfs();
            case 5:
                return new bid(bArr);
            case 6:
            case 7:
            case 8:
                return null;
            case 9:
                return cgt.d;
            case 10:
                throw new IllegalStateException("No default size");
            case 11:
                throw new IllegalStateException("No default context");
            case 12:
                return null;
            case 13:
                throw new IllegalStateException("No default glance id");
            case 14:
                return drl.c;
            case 15:
                return new Bundle();
            case 16:
                return Long.valueOf(System.nanoTime());
            case 17:
                bcp bcpVar = dxf.a;
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 18:
                return null;
            case 19:
                return new dwq();
            default:
                return ygi.a;
        }
    }
}
