package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgq implements xcm {
    private final /* synthetic */ int a;
    private final Object b;

    public rgq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static Context c(kqf kqfVar) {
        Context context = kqfVar.b;
        context.getClass();
        return context;
    }

    public final Context a() {
        int i = this.a;
        return i != 0 ? i != 1 ? (Context) ((ulp) this.b).a : c((kqf) this.b) : ((rgq) this.b).a();
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.a;
        return i != 0 ? i != 1 ? a() : a() : a();
    }
}
