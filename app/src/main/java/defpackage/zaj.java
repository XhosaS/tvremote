package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zaj extends zdj {
    final /* synthetic */ yqi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaj(Iterator it, yqi yqiVar) {
        super(it);
        this.a = yqiVar;
    }

    @Override // defpackage.zdj
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
