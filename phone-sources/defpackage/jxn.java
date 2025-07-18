package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxn implements soe {
    private final FrameLayout a;
    private final iea b;
    private boolean c;
    private boolean d;

    public jxn(FrameLayout frameLayout, iea ieaVar) {
        frameLayout.getClass();
        ieaVar.getClass();
        this.a = frameLayout;
        this.b = ieaVar;
        ieaVar.ea(new itm(this, 13));
    }

    public final void a() {
        if (this.c && !this.d && ((Boolean) this.b.a()).booleanValue()) {
            Drawable background = this.a.getBackground();
            background.getClass();
            ((TransitionDrawable) background).startTransition(500);
            this.d = true;
        }
        if (!this.c && this.d && ((Boolean) this.b.a()).booleanValue()) {
            Drawable background2 = this.a.getBackground();
            background2.getClass();
            ((TransitionDrawable) background2).reverseTransition(500);
            this.d = false;
        }
    }

    @Override // defpackage.sob
    public final void b(int i) {
        this.c = i != 0;
        a();
    }
}
