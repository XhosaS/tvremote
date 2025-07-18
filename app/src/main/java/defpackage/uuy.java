package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuy extends uvq {
    public static final zdy a = zdy.h("com/google/android/libraries/tv/widgets/scrim/GlideScrimDrawable");
    public final List b = new ArrayList();
    public int c = 255;
    public ColorFilter d;
    private final uvo e;

    public uuy(uvo uvoVar) {
        this.e = uvoVar;
    }

    private static void a(List list) {
        Collection.EL.stream(list).forEach(new Consumer() { // from class: uuw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                uux uuxVar = (uux) obj;
                uuxVar.a.k(uuxVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        list.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(final Canvas canvas) {
        if (!(getCallback() instanceof View) || getBounds().width() <= 0 || getBounds().height() <= 0) {
            a(this.b);
            return;
        }
        if (this.c == 0) {
            return;
        }
        List list = this.b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (list.isEmpty()) {
            list.add(new uux(this, this.e));
        }
        boolean zJ = false;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            uux uuxVar = (uux) list.get(i2);
            zJ |= uuxVar.j();
            if (!uuxVar.j() || uuxVar.i(jElapsedRealtime)) {
                if (i2 > 0) {
                    break;
                }
            } else {
                i = i2;
            }
        }
        if (i > 0) {
            a(list.subList(0, i));
        }
        if (zJ) {
            Collection.EL.stream(list).forEach(new Consumer() { // from class: uuv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    uux uuxVar2 = (uux) obj;
                    if (uuxVar2.j()) {
                        long j = jElapsedRealtime;
                        Drawable drawable = uuxVar2.b;
                        uuy uuyVar = uuxVar2.f;
                        drawable.setBounds(uuyVar.getBounds());
                        uuxVar2.b.setColorFilter(uuyVar.d);
                        int i3 = uuyVar.c;
                        if (uuxVar2.i(j)) {
                            uuxVar2.b.setAlpha((int) ((i3 * (j - uuxVar2.d)) / uuxVar2.e));
                            uuyVar.invalidateSelf();
                        } else {
                            uuxVar2.b.setAlpha(i3);
                        }
                        uuxVar2.b.draw(canvas);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            this.e.j(canvas, this.d);
            canvas.drawPaint(uvg.g(((View) getCallback()).getResources()).a(this.d));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d = colorFilter;
        invalidateSelf();
    }
}
