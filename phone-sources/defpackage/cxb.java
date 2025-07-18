package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxb implements ymw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cxb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ymw
    public final Iterator a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new ynf(this.a) : this.a : ykr.e(this.a) : this.a.iterator() : new cxa((ViewGroup) this.a) : new cwa(new cxb(this.a, 1).a(), abo.c);
    }
}
