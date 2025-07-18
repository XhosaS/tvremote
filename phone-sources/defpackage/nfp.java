package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfp extends nez {
    private final Context a;
    private int c = 0;

    public nfp(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("conn");
    }

    @Override // defpackage.nez
    public final void u(ekl eklVar, boolean z) {
        int i;
        switch (nxo.l(this.a).b()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
            case 8:
            default:
                i = 1;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
        }
        if (i != this.c) {
            nfa nfaVar = this.b;
            StringBuilder sbE = nfaVar.e(eklVar.a);
            sbE.append(i);
            nfaVar.f("conn", sbE.toString());
            this.c = i;
        }
    }
}
