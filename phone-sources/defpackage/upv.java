package defpackage;

import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class upv implements ukj {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ upv(String str, Object obj, int i) {
        this.c = i;
        this.a = str;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ups] */
    @Override // defpackage.ukj
    public final Object a(uki ukiVar) {
        if (this.c != 0) {
            return new upr(this.a, this.b.a((Context) ukiVar.e(Context.class)));
        }
        Object obj = this.b;
        try {
            Trace.beginSection(this.a);
            return ((ukh) obj).f.a(ukiVar);
        } finally {
            Trace.endSection();
        }
    }
}
