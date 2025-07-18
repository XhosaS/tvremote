package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
class muu extends or {
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muu(Context context, float f) {
        super(context);
        this.f = f;
    }

    @Override // defpackage.or
    protected final int d(int i) {
        return (int) (this.f * 1000.0f);
    }
}
