package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class mvm implements View.OnTouchListener {
    final /* synthetic */ View a;
    final /* synthetic */ mvo b;

    public mvm(mvo mvoVar, View view) {
        this.a = view;
        this.b = mvoVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.b.e();
        this.a.setOnTouchListener(null);
        return false;
    }
}
