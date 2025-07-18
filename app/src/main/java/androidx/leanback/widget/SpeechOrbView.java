package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.katniss.R;
import defpackage.bal;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {
    private final float d;
    private bal e;
    private bal f;
    private int g;
    private boolean h;

    public SpeechOrbView(Context context) {
        this(context, null);
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public final int a() {
        return R.layout.lb_speech_orb;
    }

    public final void i() {
        d(this.e);
        e(getResources().getDrawable(R.drawable.lb_ic_search_mic));
        b(true);
        this.c = false;
        super.h();
        c(1.0f);
        this.g = 0;
        this.h = true;
    }

    public final void j() {
        d(this.f);
        e(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        b(hasFocus());
        c(1.0f);
        this.h = false;
    }

    public void setSoundLevel(int i) {
        if (this.h) {
            int i2 = this.g;
            int i3 = i > i2 ? i2 + ((i - i2) / 2) : (int) (i2 * 0.7f);
            this.g = i3;
            c((((this.d - this.b) * i3) / 100.0f) + 1.0f);
        }
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.h = false;
        Resources resources = context.getResources();
        this.d = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f = new bal(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.e = new bal(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        j();
    }
}
