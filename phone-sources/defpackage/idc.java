package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idc implements idb {
    private final idb[] a;
    private final boolean b;

    public idc(idb[] idbVarArr, boolean z) {
        this.b = z;
        idbVarArr.getClass();
        this.a = idbVarArr;
    }

    @Override // defpackage.idb
    public final boolean a() {
        int i = 0;
        while (true) {
            idb[] idbVarArr = this.a;
            if (i >= idbVarArr.length) {
                return !this.b;
            }
            boolean zA = idbVarArr[i].a();
            boolean z = this.b;
            if (zA == z) {
                return z;
            }
            i++;
        }
    }
}
