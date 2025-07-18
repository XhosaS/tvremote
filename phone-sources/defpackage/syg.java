package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syg extends syi {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ syi c;
    final /* synthetic */ syh d;

    public syg(syh syhVar, Context context, TextPaint textPaint, syi syiVar) {
        this.a = context;
        this.b = textPaint;
        this.c = syiVar;
        this.d = syhVar;
    }

    @Override // defpackage.syi
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.syi
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
