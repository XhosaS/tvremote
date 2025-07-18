package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ukl implements unj {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ukl(Context context, String str, int i) {
        this.c = i;
        this.b = context;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uki] */
    @Override // defpackage.unj
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            ukh ukhVar = (ukh) this.b;
            return ukhVar.f.a(new uld(ukhVar, this.a));
        }
        if (i != 1) {
            return new ulp((Context) this.b, (String) this.a);
        }
        uiz uizVar = (uiz) this.a;
        uko ukoVar = uizVar.c;
        String strG = uizVar.g();
        return new uof((Context) this.b, strG);
    }

    public /* synthetic */ ukl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
