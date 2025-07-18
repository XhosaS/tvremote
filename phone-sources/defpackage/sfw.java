package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfw extends sfj {
    private int a;
    private int b;

    public sfw() {
        super(R.layout.replaydialog_padding);
        this.a = -1;
    }

    @Override // defpackage.sfj
    protected final void a(Context context, View view) {
        if (this.a == -1) {
            if (this.b != 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = context.getResources().getDimensionPixelSize(this.b);
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (this.b == 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = this.a;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final void b() {
        this.a = -1;
        this.b = R.dimen.chooser_dialog_vertical_padding;
    }
}
