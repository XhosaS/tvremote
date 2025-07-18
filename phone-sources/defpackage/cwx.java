package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cwx implements cum {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cwx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cum
    public final Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? ((qwn) this.a).b.a() : Integer.valueOf(((ViewConfiguration) this.a).getScaledMaximumFlingVelocity()) : Integer.valueOf(((ViewConfiguration) this.a).getScaledMinimumFlingVelocity());
    }
}
