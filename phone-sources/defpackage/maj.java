package defpackage;

import android.support.v7.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class maj {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public maj(int i, String str, int i2, List list, byte[] bArr) {
        this.b = i;
        this.d = str;
        this.a = i2;
        this.e = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.c = bArr;
    }

    public final int a() {
        int i = this.a;
        return i != 2 ? i != 3 ? 0 : 512 : RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public maj(String str, lck lckVar, int i, int i2) {
        this.c = str;
        this.d = lckVar;
        this.a = i;
        this.b = i2;
        int i3 = ((((((((((((lckVar.f + 31) * 31) + lckVar.d) * 31) + lckVar.c) * 31) + lckVar.e) * 31) + lckVar.i) * 31) + lckVar.h) * 31) + lckVar.g;
        long j = lckVar.k;
        this.e = str + ".1." + i + "." + ((i3 * 31) + ((int) (j ^ (j >>> 32)))) + ".stbim";
    }
}
