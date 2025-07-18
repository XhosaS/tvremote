package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cba extends ykt implements yjv {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cba(int i, int i2) {
        super(1);
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return Boolean.valueOf(((bmr) obj).g(this.a));
        }
        if (i != 1) {
            return Boolean.valueOf(((View) obj).getId() == this.a);
        }
        return Boolean.valueOf(((bmr) obj).g(this.a));
    }
}
