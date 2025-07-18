package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgd extends mge {
    private final tfz b;
    private final TextView c;
    private final int d;
    private lwq e;

    public mgd(tfz tfzVar, TextView textView, int i) {
        super(textView);
        this.b = tfzVar;
        this.c = textView;
        this.d = i;
    }

    private static void f(TextView textView, lws lwsVar) {
        textView.setBackgroundResource(R.drawable.actor_default_image_background);
        textView.setText(lwsVar.c.subSequence(0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.mge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.graphics.Bitmap a(android.graphics.Bitmap r24) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgd.a(android.graphics.Bitmap):android.graphics.Bitmap");
    }

    @Override // defpackage.mge
    public final void b(lwq lwqVar, idf idfVar, Executor executor) {
        this.e = lwqVar;
        if (lwqVar.e != null) {
            super.b(lwqVar, idfVar, executor);
            return;
        }
        TextView textView = this.c;
        f(textView, (lws) lwqVar);
        textView.setVisibility(0);
    }

    @Override // defpackage.mge
    protected final void c(Bitmap bitmap) {
        if (bitmap == null) {
            f(this.c, (lws) this.e);
            return;
        }
        TextView textView = this.c;
        textView.setText("");
        textView.setBackground(new BitmapDrawable(textView.getResources(), bitmap));
    }
}
