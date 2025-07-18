package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class xch extends bv implements xce {
    public xcd<Object> androidInjector;

    public xch() {
    }

    @Override // defpackage.xce
    public xby<Object> androidInjector() {
        return this.androidInjector;
    }

    @Override // defpackage.bv
    public void onAttach(Context context) {
        wae.x(this);
        super.onAttach(context);
    }

    public xch(int i) {
        super(i);
    }
}
