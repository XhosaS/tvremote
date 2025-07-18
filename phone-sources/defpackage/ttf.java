package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ttf implements ttj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ttj
    public final Iterator a(uof uofVar, CharSequence charSequence) {
        return this.b != 0 ? new tth(uofVar, charSequence, (String) this.a) : new ttg(uofVar, charSequence, (tsa) this.a);
    }
}
