package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhc extends ygp implements RandomAccess {
    public static final wcq c = new wcq();
    public final zgn[] a;
    public final int[] b;

    public zhc(zgn[] zgnVarArr, int[] iArr) {
        this.a = zgnVarArr;
        this.b = iArr;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof zgn) {
            return super.contains((zgn) obj);
        }
        return false;
    }

    @Override // defpackage.ygp, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.ygp, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof zgn) {
            return super.indexOf((zgn) obj);
        }
        return -1;
    }

    @Override // defpackage.ygp, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof zgn) {
            return super.lastIndexOf((zgn) obj);
        }
        return -1;
    }
}
