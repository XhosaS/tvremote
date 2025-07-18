package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbe {
    public static final int[] a = new int[3];
    public static final float[] b = {0.0f, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public int h;
    public int i;
    public int j;
    public final Path k;
    public final Paint l;

    public vbe() {
        throw null;
    }

    public vbe(byte[] bArr) {
        this.k = new Path();
        Paint paint = new Paint();
        this.l = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.h = acr.f(-16777216, 68);
        this.i = acr.f(-16777216, 20);
        this.j = acr.f(-16777216, 0);
        paint2.setColor(this.h);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.g = new Paint(paint3);
    }
}
