package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htv {
    public final int a;
    public final int b;
    public final float c;
    public final Typeface d;
    public final int e;
    public final int f;

    public htv(Context context) {
        Typeface typefaceA;
        context.getClass();
        this.a = context.getResources().getColor(R.color.G50, null);
        this.b = context.getResources().getDimensionPixelOffset(R.dimen.h6_text_height);
        this.c = context.getResources().getDimension(R.dimen.h6_text_size);
        try {
            typefaceA = aco.a(context, R.font.google_sans);
            typefaceA = typefaceA == null ? Typeface.DEFAULT : typefaceA;
            typefaceA.getClass();
        } catch (Resources.NotFoundException unused) {
            typefaceA = Typeface.DEFAULT;
            typefaceA.getClass();
        }
        this.d = typefaceA;
        this.e = context.getResources().getDimensionPixelOffset(R.dimen.h6_logo_size);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.space_light_purple);
    }
}
