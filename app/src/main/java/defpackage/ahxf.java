package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxf extends agqd implements RandomAccess {
    public static final ahxe b = new ahxe();
    public final ahxb[] c;
    public final int[] d;

    public ahxf(ahxb[] ahxbVarArr, int[] iArr) {
        this.c = ahxbVarArr;
        this.d = iArr;
    }

    @Override // defpackage.agpx
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.agpx, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof ahxb) {
            return super.contains((ahxb) obj);
        }
        return false;
    }

    @Override // defpackage.agqd, java.util.List
    public final /* synthetic */ Object get(int i) {
        return this.c[i];
    }

    @Override // defpackage.agqd, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof ahxb) {
            return super.indexOf((ahxb) obj);
        }
        return -1;
    }

    @Override // defpackage.agqd, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof ahxb) {
            return super.lastIndexOf((ahxb) obj);
        }
        return -1;
    }
}
