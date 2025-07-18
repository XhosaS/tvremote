package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.katniss.R;
import com.google.android.libraries.speech.transcription.ui.DrawSoundLevelsView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uah {
    public final ProgressBar a;
    public final DrawSoundLevelsView b;
    public final ImageView c;
    public final ImageView d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;
    private final FrameLayout h;

    public uah(View view) {
        this.h = (FrameLayout) view.findViewById(R.id.transcription_mic_container);
        this.b = (DrawSoundLevelsView) view.findViewById(R.id.transcription_sound_levels);
        this.c = (ImageView) view.findViewById(R.id.transcription_mic_image_indicator);
        this.d = (ImageView) view.findViewById(R.id.transcription_mic_image_indicator_background);
        this.a = (ProgressBar) view.findViewById(R.id.transcription_waiting_for_results);
        Context context = view.getContext();
        Drawable drawableC = ra.e().c(context, R.drawable.quantum_ic_keyboard_voice_googblue_36);
        drawableC.getClass();
        Drawable drawableMutate = drawableC.mutate();
        this.e = drawableMutate;
        drawableMutate.setTint(context.getColor(R.color.agsa_color_primary));
        Drawable drawableC2 = ra.e().c(context, R.drawable.quantum_ic_keyboard_voice_white_36);
        drawableC2.getClass();
        Drawable drawableMutate2 = drawableC2.mutate();
        this.f = drawableMutate2;
        drawableMutate2.setTint(context.getColor(R.color.agsa_color_on_primary));
        Drawable drawableC3 = ra.e().c(context, R.drawable.quantum_ic_done_green500_36);
        drawableC3.getClass();
        this.g = drawableC3.mutate();
    }

    public final void a(View.OnClickListener onClickListener, String str) {
        FrameLayout frameLayout = this.h;
        frameLayout.setOnClickListener(onClickListener);
        frameLayout.setContentDescription(str);
        if (str == null) {
            frameLayout.setFocusable(false);
        } else {
            frameLayout.setFocusable(true);
        }
    }
}
