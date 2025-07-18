package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mju implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mju(Object obj, int i, boolean z, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = i;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            eje ejeVar = (eje) this.c;
            ekg[] ekgVarArr = ejeVar.a;
            final int i = this.a;
            final int iB = ekgVarArr[i].b();
            ele eleVar = ejeVar.m;
            final boolean z = this.b;
            final ekl eklVarK = eleVar.K();
            eleVar.N(eklVarK, 1033, new ecw() { // from class: ekv
                @Override // defpackage.ecw
                public final void a(Object obj) {
                    ((ekm) obj).A(eklVarK, i, iB, z);
                }
            });
            return;
        }
        int i2 = this.a;
        mjw mjwVar = (mjw) this.c;
        mjwVar.c = i2;
        krd.c(String.valueOf(mjwVar.e()).concat(true != this.b ? " - no retry" : " - retry offered"));
        ArrayList arrayList = mjwVar.b;
        mjx[] mjxVarArr = (mjx[]) arrayList.toArray(new mjx[arrayList.size()]);
        int length = mjxVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            } else {
                mjxVarArr[length].x();
            }
        }
    }
}
