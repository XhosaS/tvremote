package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.appcompat.R;
import android.widget.ImageView;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qty implements qtr {
    public static final Map a = DesugarCollections.synchronizedMap(new ir());
    public static final Map b = DesugarCollections.synchronizedMap(new ir());
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new qtt();
    private final Executor e;
    private final rif f;
    private final qth g;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rih] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, rih] */
    public qty(Context context, ExecutorService executorService, final qth qthVar, rih rihVar) {
        ?? r0;
        Object obj;
        final cb cbVar = new cb((Object) context);
        uie uieVar = new uie(null);
        uieVar.e(new rie[0]);
        uieVar.c = rihVar;
        uieVar.b = new rrx();
        uieVar.d = new rih() { // from class: qts
            @Override // defpackage.rih
            public final void a(Object obj2, int i, rig rigVar) {
                boolean z = i >= 0;
                qth qthVar2 = qthVar;
                Map map = qty.a;
                rii riiVarA = rii.a(obj2, qthVar2);
                sij.o(z, "Size must be bigger or equal to 0");
                sij.o(cb.z(riiVarA), "handles(key) must be true");
                ArrayList arrayList = new ArrayList();
                String str = riiVarA.b;
                cb cbVar2 = cbVar;
                if (str != null) {
                    arrayList.add(str);
                }
                if (i == 0) {
                    i = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                }
                String str2 = riiVarA.a;
                arrayList.add(str2);
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                sno snoVar = new sno(new snp(((Context) cbVar2.a).getApplicationContext(), new ugl()));
                int[] iArr = snn.a;
                sno snoVar2 = new sno(snoVar);
                sgs sgsVar = snq.a;
                snoVar2.b(null);
                sno.a(null);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                int iA = sno.a(str2);
                CharSequence charSequenceB = snoVar2.b(new zft(strArr));
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int height = bitmapCreateBitmap.getHeight();
                int width = bitmapCreateBitmap.getWidth();
                sgs sgsVar2 = snq.a;
                Paint paint = (Paint) sgsVar2.a();
                synchronized (sgsVar2) {
                    paint.setColor(iA);
                    int height2 = canvas.getHeight();
                    int width2 = canvas.getWidth();
                    canvas.drawCircle(width2 / 2, height2 / 2, Math.min(width2, height2) / 2, paint);
                    if (charSequenceB != null) {
                        paint.setColor(-1);
                        paint.setTextSize(Math.min(height, width) * 0.47f);
                        String string = charSequenceB.toString();
                        int length = charSequenceB.length();
                        Rect rect = snq.b;
                        paint.getTextBounds(string, 0, length, rect);
                        canvas.drawText(charSequenceB, 0, charSequenceB.length(), width / 2, (height / 2) - rect.exactCenterY(), paint);
                    }
                }
                rigVar.a(bitmapCreateBitmap);
            }
        };
        uieVar.e(rie.a);
        ?? r7 = uieVar.c;
        if (r7 != 0 && (r0 = uieVar.d) != 0 && (obj = uieVar.b) != null) {
            rif rifVar = new rif(r7, r0, (rrx) obj, (ImmutableList) uieVar.a);
            this.e = executorService;
            this.f = rifVar;
            this.g = qthVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (uieVar.c == null) {
            sb.append(" imageRetriever");
        }
        if (uieVar.d == null) {
            sb.append(" secondaryImageRetriever");
        }
        if (uieVar.b == null) {
            sb.append(" defaultImageRetriever");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static void b(ImageView imageView, qtx qtxVar) {
        sjl.c();
        qtx qtxVar2 = (qtx) imageView.getTag(com.google.android.videos.R.id.tag_account_image_request);
        if (qtxVar2 != null) {
            qtxVar2.b = true;
        }
        imageView.setTag(com.google.android.videos.R.id.tag_account_image_request, qtxVar);
    }

    @Override // defpackage.qtr
    public final void a(Object obj, ImageView imageView) {
        sjl.c();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        rif rifVar = this.f;
        Executor executor = this.e;
        qtx qtxVar = new qtx(obj, rifVar, imageView, executor, this.g);
        b(imageView, qtxVar);
        executor.execute(new pqi(qtxVar, 13));
    }
}
