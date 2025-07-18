package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu implements bcj {
    private final bby[] a;

    public bbu(bby[] bbyVarArr) {
        this.a = bbyVarArr;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        bby[] bbyVarArr;
        new HashMap();
        int i = 0;
        while (true) {
            bbyVarArr = this.a;
            if (i >= bbyVarArr.length) {
                break;
            }
            bbyVarArr[i].a();
            i++;
        }
        for (bby bbyVar : bbyVarArr) {
            bbyVar.a();
        }
    }
}
