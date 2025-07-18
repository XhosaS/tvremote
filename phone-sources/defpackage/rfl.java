package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfl {
    public int a;
    public Drawable b;
    public int c;
    public int d;
    public View.OnClickListener e;
    public dvv f;
    public byte g;
    private String h;
    private tst i;

    public rfl() {
        throw null;
    }

    public final rfm a() {
        String str;
        View.OnClickListener onClickListener;
        dvv dvvVar;
        if (this.g == 7 && (str = this.h) != null && (onClickListener = this.e) != null && (dvvVar = this.f) != null) {
            rfm rfmVar = new rfm(this.a, this.b, this.c, str, this.d, onClickListener, dvvVar, this.i);
            int i = rfmVar.b;
            sij.x((i != -1) ^ (rfmVar.a != null), "Either icon id or icon drawable must be specified");
            return rfmVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" id");
        }
        if ((this.g & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.h == null) {
            sb.append(" label");
        }
        if ((this.g & 4) == 0) {
            sb.append(" veId");
        }
        if (this.e == null) {
            sb.append(" onClickListener");
        }
        if (this.f == null) {
            sb.append(" trailingTextLiveData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.h = str;
    }

    public rfl(byte[] bArr) {
        this.i = trk.a;
    }
}
