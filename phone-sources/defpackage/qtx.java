package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.widget.ImageView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtx {
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qtx(bzz bzzVar) {
        this.c = bzzVar;
        this.d = new bfz(new bxo[16], 0);
        this.a = new bfz(new kw[16], 0);
        this.e = new bfz(new bys[16], 0);
        this.f = new bfz(new kw[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void g(bko bkoVar, kw kwVar, Set set) {
        if (!bkoVar.E().A) {
            bty.c("visitSubtreeIf called on an unattached node");
        }
        bfz bfzVar = new bfz(new bko[16], 0);
        bko bkoVar2 = bkoVar.E().u;
        if (bkoVar2 == null) {
            fh.O(bfzVar, bkoVar.E());
        } else {
            bfzVar.o(bkoVar2);
        }
        while (true) {
            int i = bfzVar.b;
            if (i == 0) {
                return;
            }
            bko bkoVar3 = (bko) bfzVar.d(i - 1);
            if ((bkoVar3.s & 32) != 0) {
                for (bko bkoVar4 = bkoVar3; bkoVar4 != null; bkoVar4 = bkoVar4.u) {
                    if ((bkoVar4.r & 32) != 0) {
                        bxw bxwVarF = bkoVar4;
                        ?? bfzVar2 = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof bxh) {
                                bxh bxhVar = (bxh) bxwVarF;
                                if (bxhVar instanceof bxo) {
                                    bxo bxoVar = (bxo) bxhVar;
                                    if ((bxoVar.a instanceof bxf) && bxoVar.c.contains(kwVar)) {
                                        set.add(bxhVar);
                                    }
                                }
                                if (bxhVar.i().b(kwVar)) {
                                    break;
                                }
                            } else if ((bxwVarF.r & 32) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar5 = bxwVarF.C;
                                int i2 = 0;
                                bxwVarF = bxwVarF;
                                bfzVar2 = bfzVar2;
                                while (bkoVar5 != null) {
                                    if ((bkoVar5.r & 32) != 0) {
                                        i2++;
                                        bfzVar2 = bfzVar2;
                                        if (i2 == 1) {
                                            bxwVarF = bkoVar5;
                                        } else {
                                            if (bfzVar2 == 0) {
                                                bfzVar2 = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar2.o(bxwVarF);
                                            }
                                            bfzVar2.o(bkoVar5);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar5 = bkoVar5.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar2 = bfzVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar2);
                        }
                    }
                }
            }
            fh.O(bfzVar, bkoVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ImmutableList immutableList = ((rif) this.d).c;
        if (immutableList != null && !immutableList.isEmpty()) {
            UnmodifiableIterator it = immutableList.iterator();
            while (it.hasNext()) {
                if (((rie) it.next()).ordinal() == 0) {
                    Map map = qty.a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int iMin = Math.min(width, height);
                    int i = iMin - width;
                    int i2 = iMin - height;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = iMin / 2;
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, i / 2, i2 / 2, paint);
                    bitmap = bitmapCreateBitmap;
                }
            }
        }
        return bitmap;
    }

    public final void b(Context context) {
        Drawable drawable = AppCompatResources.getDrawable(context, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
        rrx.am(drawable, rrx.ai(context) ? rrx.at(context, R.attr.colorPrimaryGoogle) : ric.b(context).a(ria.BLUE));
        e(drawable, true);
    }

    public final void c() {
        sjl.c();
        ImageView imageView = (ImageView) ((WeakReference) this.c).get();
        if (this.b || imageView == null) {
            return;
        }
        qty.b(imageView, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(Runnable runnable) {
        if (sjl.g()) {
            this.e.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void e(Drawable drawable, boolean z) {
        ImageView imageView = (ImageView) ((WeakReference) this.c).get();
        if (this.b || imageView == null) {
            return;
        }
        qtw qtwVar = new qtw(this, drawable, z);
        imageView.addOnAttachStateChangeListener(qtwVar);
        int[] iArr = cww.a;
        if (imageView.isAttachedToWindow()) {
            imageView.post(new qto(qtwVar, imageView, 4));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bzz, java.lang.Object] */
    public final void f() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.x(new bms(this, 7));
    }

    public qtx(Context context, pku pkuVar, hii hiiVar) {
        this.d = context;
        this.c = pkuVar;
        this.f = hiiVar;
        this.a = new hhy(this, true);
        this.e = new hhy(this, false);
        ImmutableSet immutableSet = hiw.b;
        hiw hiwVar = hiv.a;
    }

    public qtx(Object obj, rif rifVar, ImageView imageView, Executor executor, qth qthVar) {
        imageView.getClass();
        this.c = new WeakReference(imageView);
        this.d = rifVar;
        this.a = obj;
        this.e = executor;
        this.f = qthVar;
    }
}
