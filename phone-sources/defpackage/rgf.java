package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgf extends FrameLayout implements rji {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final xrk d;
    private final Button e;
    private final boolean f;
    private boolean g;

    public rgf(Context context, boolean z) {
        super(context);
        inflate(context, R.layout.critical_alert_view, this);
        this.a = (TextView) findViewById(R.id.og_critical_alert_title);
        this.b = (TextView) findViewById(R.id.og_critical_alert_subtitle);
        Button button = (Button) findViewById(R.id.og_critical_alert_action_button);
        this.e = button;
        this.c = findViewById(R.id.og_critical_alert_card_view);
        this.d = new xrk(button);
        setFocusable(false);
        int[] iArr = cww.a;
        setImportantForAccessibility(4);
        this.f = z;
    }

    public static int a(boolean z) {
        return z ? 109340 : 109736;
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        rjgVar.c(this.c, a(this.f));
        rjgVar.c(this.e, 109339);
        this.g = true;
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        if (this.g) {
            rjgVar.e(this.e);
            rjgVar.e(this.c);
            this.g = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.d.k(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        super.setOnClickListener(new phn(this, 6));
    }
}
