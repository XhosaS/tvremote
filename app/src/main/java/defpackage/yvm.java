package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yvm extends zbr {
    public final /* synthetic */ yvo a;

    public yvm(yvo yvoVar) {
        this.a = yvoVar;
    }

    @Override // defpackage.zbr
    public final zbp a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.e();
    }
}
