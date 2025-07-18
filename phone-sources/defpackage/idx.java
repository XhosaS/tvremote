package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idx implements idw {
    private final idw[] a;

    public idx(idw[] idwVarArr) {
        idwVarArr.getClass();
        this.a = idwVarArr;
    }

    @Override // defpackage.idw
    public final boolean b(Object obj) {
        int i = 0;
        while (true) {
            idw[] idwVarArr = this.a;
            if (i >= idwVarArr.length) {
                return true;
            }
            if (!idwVarArr[i].b(obj)) {
                return false;
            }
            i++;
        }
    }
}
