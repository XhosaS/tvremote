package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
@yfp
/* loaded from: classes.dex */
public final class ckm {
    public final View a;
    public final bfz b;
    public Runnable c;
    public final ckb d;
    private final Executor e;

    public ckm(View view) {
        ckb ckbVar = new ckb(view);
        emk emkVar = new emk(Choreographer.getInstance(), 1);
        this.a = view;
        this.d = ckbVar;
        this.e = emkVar;
        new ckj(new cfy(""), chb.a);
        int i = cka.g;
        new ArrayList();
        ybn.g(3, new cdq(this, 4));
        new CursorAnchorInfo.Builder();
        boa.e();
        new Matrix();
        this.b = new bfz(new ckl[16], 0);
    }

    public final void a() {
        ckb ckbVar = this.d;
        ((InputMethodManager) ckbVar.b.a()).restartInput(ckbVar.a);
    }

    public final void b(ckl cklVar) {
        this.b.o(cklVar);
        if (this.c == null) {
            caw cawVar = new caw(this, 4);
            this.e.execute(cawVar);
            this.c = cawVar;
        }
    }
}
