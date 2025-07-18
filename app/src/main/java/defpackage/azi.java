package defpackage;

import android.graphics.Color;
import androidx.leanback.widget.PagingIndicator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azi {
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h = 1.0f;
    public float i;
    public final /* synthetic */ PagingIndicator j;

    public azi(PagingIndicator pagingIndicator) {
        this.j = pagingIndicator;
        this.i = true != pagingIndicator.a ? -1.0f : 1.0f;
    }

    public final void a() {
        float f = this.a * 255.0f;
        PagingIndicator pagingIndicator = this.j;
        this.b = Color.argb(Math.round(f), Color.red(pagingIndicator.g), Color.green(pagingIndicator.g), Color.blue(pagingIndicator.g));
    }

    public final void b() {
        this.c = 0.0f;
        this.d = 0.0f;
        PagingIndicator pagingIndicator = this.j;
        this.e = pagingIndicator.b;
        float f = pagingIndicator.c;
        this.f = f;
        this.g = f * pagingIndicator.m;
        this.a = 0.0f;
        a();
    }
}
